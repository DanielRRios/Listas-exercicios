package com.example.aula0403;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicController {

    private List<Musica> musicas;
    public MusicController(){
        this.musicas = new ArrayList<>();
        this.musicas.add( new Musica( "Camisa 10", "Turma do pagode",
                LocalDate.of(2024, 05, 12)));
    }

    @GetMapping
    public ResponseEntity<List<Musica>> listar(){
        if(this.musicas.isEmpty()){
            return ResponseEntity.status(204).build(); 
        }

        return ResponseEntity.status(200).body(this.musicas);
    }

    @PostMapping
    public ResponseEntity<Musica> cadastro(@RequestBody Musica novaMusica){
        this.musicas.add(novaMusica);
        return ResponseEntity.status(201).body(novaMusica); 
    }

    @DeleteMapping("/{indice}")
    public  ResponseEntity<Void> deletar(@PathVariable int indice){
        if(isIndiceValido(indice)){
            musicas.remove(indice);
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{indice}")
    public ResponseEntity<Musica> atualizarMusica(@RequestBody Musica musicaAtt, @PathVariable int indice){
        if(isIndiceValido(indice)){
            this.musicas.set(indice, musicaAtt);
            return ResponseEntity.status(200).body(musicaAtt);
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/filtro")
    public ResponseEntity<List<Musica>> buscarArtista(@RequestParam String artista){

        List<Musica> musicasArt = new ArrayList<>(); 

        for (int i = 0; i < musicas.size(); i++) {
            if(musicas.get(i).getArtista().toLowerCase().equals(artista.toLowerCase())){
                musicasArt.add(musicas.get((i)));
            }
        }

        if(musicasArt.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(musicasArt);
    }

    // @RequestParam -> filmes?nome=titanic
    // @PathVariables -> filmes/nome

    private boolean isIndiceValido(int indice){
        return indice  >= 0 && indice < musicas.size();
    }

}

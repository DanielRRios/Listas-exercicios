public class Bebida {
    private int id;
    private String nome;
    private String tipo;

    public Bebida(int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    //public String toString() {
    //    return "Bebida [ID=" + id + ", Nome=" + nome + ", Tipo=" + tipo + "]";
    //}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

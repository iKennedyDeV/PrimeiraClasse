
public class Pet {
    private String nome;
    private int idade;
    private Pessoa dono;
    public Pet(String nome, int idade, Pessoa dono){
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
}

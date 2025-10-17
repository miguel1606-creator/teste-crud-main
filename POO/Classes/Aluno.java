package Classes;

public class Aluno {

    private int Prontuario;
    private String nome;

    public void estudar() {
        System.out.println("estudando...");
    }

    public int getProntuario() {
        return Prontuario;
    }

    public void setProntuario(int Prontuario) {
        this.Prontuario = Prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

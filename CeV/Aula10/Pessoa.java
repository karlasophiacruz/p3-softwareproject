package Aula10;

public abstract class Pessoa {
    private String nome, sexo;
    private int idade;

    public void fazerAniv(){
        setIdade(getIdade() + 1);
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

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "Idade: " + this.getIdade() +
                "Sexo: " + this.getSexo();
    }
}

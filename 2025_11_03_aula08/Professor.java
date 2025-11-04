public class Professor extends Pessoa implements CalcularSalario {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public double getSalario(){
        return salario;
    }

    @Override
    public void calsalario() {
        System.out.println("Calcualr salario");
    }
}
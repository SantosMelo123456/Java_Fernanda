import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa a = new Aluno();
        Pessoa b = new Aluno();
        Pessoa p = new Professor();


        System.out.print("Digite seu nome: ");
        a.setNome( scanner .nextLine());

        System.out.print("Digite sua idade: ");
        a.setIdade( scanner.nextInt());

        System.out.print("Digite sua matricula: ");
        ((Aluno) a).setMatricula( scanner.nextInt());

        System.out.println("\n===Preencher dados ===");
        System.out.println("Matríula: " + ((Aluno) a).getMatricula());
        System.out.println("Nome completo:" + a.getNome());
        System.out.println("Idade:"  + ((Aluno) a).getIdade());
    }
}
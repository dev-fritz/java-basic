import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msgPergunta = """
                Qual nota de 1 a 10 você daria para o filme %s?
                """;
        String msgFinal = """
                O Filme: %s. Possui uma avaliação de %.1f
                """;
        String name;

        double nota;
        double aval = 0;
        int qntd;

        System.out.println("Qual o nome do filme a ser avaliado?");name = input.nextLine();
        System.out.println("Qual a quantidade de pessoas que vão avaliar?");qntd = input.nextInt();

        for (int i = 0; i<qntd; i++) {
            System.out.printf(msgPergunta,name);
            nota = input.nextDouble();
            aval += nota;
            if (i== qntd-1) {
                aval = aval/qntd;
                System.out.printf(msgFinal,name,aval);
            }
        }
    }
}

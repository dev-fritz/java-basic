import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        double filme = input.nextDouble();
        System.out.printf("%.2f",filme);

    }
}

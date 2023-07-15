import java.util.Random;
import java.util.Scanner;

public class SortGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randNumber = new Random().nextInt(100);
        int tried = 0;
        int userNum;

        String msg = """
                                        ADIVINHE O NUMERO!
                O jogo funcionará da seguinte maneira, você terá 5 tentativas para acertar
                  qual numero randôico foi gerado, em cada tentativa será informado se o
                     número sorteado é maior ou menor que o número inserido.""";

        System.out.println(msg);

        while (true){
            tried += 1;
            if (tried>5){
                System.out.println("GAME OVER!");
                System.out.println("O número correto era: " + randNumber);
                break;
            }
            System.out.printf("Insira sua %d tentativa: ", tried);
            userNum = input.nextInt();
            if (userNum == randNumber){
                System.out.printf("Você acertou o número na %d tentativa, parabens!\n", tried);
                break;
            }
            else if(userNum<randNumber) System.out.printf("O número sorteado é maior que %d!\n", userNum);

            else if (userNum>randNumber) System.out.printf("O número sorteado é menor que %d!\n", userNum);
        }
    }
}

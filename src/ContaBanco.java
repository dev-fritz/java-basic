
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String accountType;
        String name;
        String msg = """
                =====================================================
                Nome: %s
                
                Tipo de Conta: %s
                
                                                 Saldo: R$%.2f
                =====================================================
                """;
        String msgCond = """
                -------------------
                1 = Pix
                2 = Transferencia
                3 = Sair
                -------------------""";

        int Type;
        int cond = 0;
        int pix;
        int enviar;

        double saldo = 0;

        System.out.println("Qual o seu nome?");
        name = input.nextLine();

        System.out.println("Qual seu tipo de conta? (Corrente -> 1, Poupança -> 2)");
        Type = input.nextInt();

        System.out.println("Qual o saldo?");
        saldo += input.nextDouble();

        accountType = switch (Type) {
            case 1 -> "Corrente";
            case 2 -> "Poupança";
            default -> "Conta não registrada";
        };

        while (cond != 3){
            System.out.printf(msg, name, accountType, saldo);
            System.out.println(msgCond);
            cond = input.nextInt();


            switch (cond) {
                case 1 -> {
                    System.out.println("""
                            -------------------
                            1 = Enviar
                            2 = Receber
                            -------------------""");
                    pix = input.nextInt();
                    if (pix == 1) {
                        System.out.println("Qual valor você deseja enviar?");
                        enviar = input.nextInt();
                        if (enviar > saldo) {
                            System.out.printf("Não é possivel enviar um valor maior que seu próprio saldo que é de R$%.2f%n", saldo);
                            break;
                        }
                        saldo -= enviar;
                    } else if (pix == 2) {
                        System.out.println("Qual valor você irá receber?");
                        saldo += input.nextDouble();
                    } else {
                        System.out.println("Operação cancelada!");
                    }
                }
                case 2 -> {
                    System.out.println("""
                            -------------------
                            1 = DOC
                            2 = TED
                            -------------------""");
                    pix = input.nextInt();
                    if (pix == 1 || pix == 2) {
                        System.out.println("Qual valor você deseja enviar?");
                        enviar = input.nextInt();
                        if (enviar > saldo) {
                            System.out.printf("Não é possivel enviar um valor maior que seu próprio saldo que é de R$%.2f%n", saldo);
                            break;
                        }
                        saldo -= enviar;
                    } else {
                        System.out.println("Operação cancelada!");
                    }
                }
                case 3 -> {}
                default -> System.out.println("Esta não é uma opção válida!");
            }
            if (cond == 3){
                System.out.println("""
                        Encerrando sistema...
                        Muito obrigado pela preferência.""");
                break;
            }
        }
    }
}

public class NoMain {
    public static void main(String[] args) {
        String filme = "Filme: Espetacular Homem Aranha";
        String msg = """
                O %s é um dos %s!
                Com uma nota de %.2f!
                """;

        boolean incluidoNoPlano = true;

        int ano = 2023;
        double media = (9.8 + 6.3 + 8.0) / 3;

        if (media>7){
            System.out.printf(msg,filme,"preferidos",media);
        }
        else if (media==7) {
            System.out.printf(msg,filme,"mais razoaveis",media);
        }
        else {
            System.out.printf(msg,filme,"piorzinhos que ta tendo", media);
        }
    }
}

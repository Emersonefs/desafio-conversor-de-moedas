import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double moeda;
        Metodos metodos = new Metodos();

        String menu = """
                ========================================
                Esccolha a opção para conversão de moeda
                ========================================
                1 - Dola => Real
                2 - Real => Dolar
                3 - Dolar => Peso Argentino
                4 - Real => Peso Argentino
                5 - Peso Argentino => Peso Chileno
                6 - Dolar =>Boliviano
                7 - Real => Peso Colombiano
                8 - Sair
                ========================================
                """;

        String sair = " ";

        while (!sair.equalsIgnoreCase("sair")) {

            System.out.println(menu);
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Dolar => Real");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " dolar é equivalente a " + metodos.dolarParaReal(moeda) + " em reais");
                }
                case 2 -> {
                    System.out.println("Real => Dolar");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " reais é equivalente a " + metodos.realParaDolar(moeda) + " em dolar");

                }
                case 3 -> {
                    System.out.println("Dolar => Peso Argentino");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " dolar é equivalente a " + metodos.dolarParaPesoArg(moeda) + " em peso Argentino");

                }
                case 4 -> {
                    System.out.println("Real => Peso Argentino");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " reais é equivalente a " + metodos.realParaPesoArg(moeda) + " em peso Argentino");

                }
                case 5 -> {
                    System.out.println("Peso Argentino => Peso Chileno");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " peso Argentino é equivalente a " + metodos.pesoArgParaPesoChi(moeda) + " em peso chileno");

                }
                case 6 -> {
                    System.out.println("Dolar => Peso Boliviano");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " dolar é equivalente a " + metodos.dolarParaPesoBoli(moeda) + " em peso boliviano");

                }
                case 7 -> {
                    System.out.println("Real => Peso Colombiano");
                    moeda = leitor.nextDouble();
                    System.out.println("O valor de " + moeda + " real é equivalente a " + metodos.realParaPesoCol(moeda) + " em peso colombiano");

                }
                case 8 -> {
                    sair = "Sair";

                }

                default -> System.out.println("Opção invalida. Digite uma opção do Menu.");

            }


        }


    }
}
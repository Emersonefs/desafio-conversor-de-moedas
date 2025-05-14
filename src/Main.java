public class Main {
    public static void main(String[] args) {

        ApiExangeRate conversor = new ApiExangeRate();

        Moeda tipoMoeda = conversor.conversor("EUR");


        System.out.println(tipoMoeda.conversion_rates());



    }
}
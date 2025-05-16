public class Metodos {


    ApiExangeRate conversor = new ApiExangeRate();


    public double dolarParaReal(double dolar) {
        Moeda tipoMoeda = conversor.conversor("USD");
        return dolar * tipoMoeda.conversion_rates().BRL();

    }


    public double realParaDolar(double real) {
        Moeda tipoMoeda = conversor.conversor("BRL");
        return real * tipoMoeda.conversion_rates().USD();
    }


    public double dolarParaPesoArg(double dolar) {
        Moeda tipoMoeda = conversor.conversor("USD");
        return dolar * tipoMoeda.conversion_rates().ARS();
    }


    public double realParaPesoArg(double real) {
        Moeda tipoMoeda = conversor.conversor("BRL");
        return real * tipoMoeda.conversion_rates().ARS();
    }


    public double pesoArgParaPesoChi(double pesoArg) {
        Moeda tipoMoeda = conversor.conversor("ARS");
        return pesoArg * tipoMoeda.conversion_rates().CLP();
    }


    public double dolarParaPesoBoli(double dolar) {
        Moeda tipoMoeda = conversor.conversor("USD");
        return dolar * tipoMoeda.conversion_rates().BOB();
    }


    public double realParaPesoCol(double real) {
        Moeda tipoMoeda = conversor.conversor("BRL");
        return real * tipoMoeda.conversion_rates().COP();
    }


}

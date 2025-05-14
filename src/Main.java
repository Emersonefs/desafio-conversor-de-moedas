import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.sun.jdi.event.MonitorContendedEnteredEvent;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ApiExangeRate conversor = new ApiExangeRate();

        Moeda tipoMoeda = conversor.conversor("EUR");


        System.out.println(tipoMoeda.conversion_rates());



    }
}
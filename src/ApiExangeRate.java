import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ApiExangeRate {

    public Moeda conversor(String moeda) {

        String tipoMoeda = moeda;

        tipoMoeda = URLEncoder.encode(tipoMoeda, StandardCharsets.UTF_8);
        URI endereco = URI.create(("https://v6.exchangerate-api.com/v6/6446bc677e0823590980ecdd/latest/" + tipoMoeda));


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        HttpResponse<String> response;

        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não consegui obter cotação a partir da moeda informada");

        }

        Gson gson = new Gson();


        return gson.fromJson(response.body(), Moeda.class);

    }


}

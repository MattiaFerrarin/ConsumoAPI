import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {
    private final String urlBase = "https://pokeapi.co/api/v2/";
    private HttpClient client;

    public API(){
        client = HttpClient.newHttpClient();
    }

    public Pokemon getPokemonByName(String name) throws IOException, InterruptedException {
        HttpRequest req = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(urlBase + "pokemon/" + name))
                .build();
        HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());

        if(response.statusCode() != 200) {
            throw new IOException("Error " + response.statusCode());
        }
        Gson gson = new Gson();
        return gson.fromJson(response.body(), Pokemon.class);
    }
}


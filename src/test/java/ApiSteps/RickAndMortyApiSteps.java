package ApiSteps;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RickAndMortyApiSteps {

    public static JSONObject namePerson;
    public static String expectedSpecies;
    public static String expectedLocation;

    public static void gettingParams(String nameParams) {
        Response response = getResponse(nameParams);
        extractDataFromResponse(response);
    }

    public static Response getResponse(String nameParams) {
        return given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/?name=" + nameParams)
                .then()
                .statusCode(200)
                .log().all()
                .extract()
                .response();

    }

    public static void speciesAndLocation(String[] args) {
        Response response = getResponse(String.valueOf(namePerson));
        expectedSpecies = response.path("results[0].species");
        expectedLocation = response.path("results[0].location.name");

    }


    public static void extractDataFromResponse(Response response) {
        namePerson = new JSONObject(response.getBody().asString());
        JSONArray results = namePerson.getJSONArray("results");
        JSONObject morty = results.getJSONObject(0);
        JSONArray episodes = morty.getJSONArray("episode");

        String lastEpisodeUrl = episodes.getString(episodes.length() - 1);
        Response lastEpisodeResponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(lastEpisodeUrl);

        JSONObject lastEpisodeJson = new JSONObject(lastEpisodeResponse.getBody().asString());
        JSONArray characters = lastEpisodeJson.getJSONArray("characters");

        String lastCharacterUrl = characters.getString(characters.length() - 1);
        Response lastCharacterResponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(lastCharacterUrl);

        JSONObject lastCharacterJson = new JSONObject(lastCharacterResponse.getBody().asString());
        String lastCharacterSpecies = lastCharacterJson.getString("species");
        String lastCharacterLocation = lastCharacterJson.getJSONObject("location").getString("name");



        checkResults(lastCharacterSpecies, lastCharacterLocation);
    }

    public static void checkResults(String species, String location) {

        assertEquals(expectedSpecies, species);
        assertEquals(expectedLocation, location);
    }
}










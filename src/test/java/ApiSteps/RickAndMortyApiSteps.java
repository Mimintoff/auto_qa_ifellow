package ApiSteps;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

public class RickAndMortyApiSteps {

    public String charid;
    public static String charlocation;
    public static JSONObject namePerson;


    public static void gettingCharLocation(String id) {
        Response gettingCharLocation = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/" + id)
                .then()
                .statusCode(200)
                .log().all()
                .extract()
                .response();
        charlocation = new JSONObject(gettingCharLocation.getBody().asString()).getJSONObject("location").get("name").toString();
        System.out.println(charlocation);


    }

    public static void gettingNameParams(String nameParams) {
        Response gettingNameParams = given()
                .baseUri("https://rickandmortyapi.com/api")
                .when()
                .get("/character/?name=" + nameParams)
                .then()
                .statusCode(200)
                .log().all()
                .extract()
                .response();

        namePerson = new JSONObject(gettingNameParams.getBody().asString());
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


    }


}










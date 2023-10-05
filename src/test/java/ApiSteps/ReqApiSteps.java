package ApiSteps;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReqApiSteps {


    public static void createUser() throws IOException {
        JSONObject user = new JSONObject();
        user.put("name", "Tomato");
        user.put("job", "Eat market");

        File file = new File("MyFile.json");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(user.toString());
        fileWriter.flush();
        fileWriter.close();

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(file)
                .post("https://reqres.in/api/users");

        assertEquals(201, response.getStatusCode());

        JSONObject jsonResponse = new JSONObject(response.getBody().asString());
        assertEquals("Tomato", jsonResponse.getString("name"));
        assertEquals("Eat market", jsonResponse.getString("job"));
        assertEquals("325", jsonResponse.getString("id"));
        assertEquals("2021-08-03T10:22:44.071Z", jsonResponse.getString("createdAt"));
    }
}


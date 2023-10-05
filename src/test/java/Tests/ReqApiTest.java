package Tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static ApiSteps.ReqApiSteps.createUser;

public class ReqApiTest {

    @Test
    public void testCreateUser() throws IOException {
        createUser();

    }
}

package Tests;

import org.junit.jupiter.api.Test;

import static ApiSteps.RickAndMortyApiSteps.*;


public class RickAndMortyApiTest {

    @Test
    public void testMortyName(){


        gettingParams("Morty Smith");

    }


}

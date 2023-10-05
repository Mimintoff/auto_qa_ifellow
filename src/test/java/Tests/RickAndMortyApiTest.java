package Tests;

import org.junit.jupiter.api.Test;

import static ApiSteps.RickAndMortyApiSteps.gettingCharLocation;
import static ApiSteps.RickAndMortyApiSteps.gettingNameParams;


public class RickAndMortyApiTest {

    @Test
    public void testMortyName(){
//        gettingCharLocation("2");
        gettingNameParams("Morty Smith");

    }

}

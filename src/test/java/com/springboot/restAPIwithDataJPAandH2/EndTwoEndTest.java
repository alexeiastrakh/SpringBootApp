package com.springboot.restAPIwithDataJPAandH2;



import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;
import static org.springframework.http.HttpStatus.OK;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EndTwoEndTest {


    @LocalServerPort
    private int port;

   @Before()
    public void setUp() {
        RestAssured.port = port;
        String baseHost = System.getProperty("server.host");
        if (baseHost == null) {
            baseHost = "http://localhost";
        }
        RestAssured.baseURI = baseHost;
    }

    @Test
    public void testFunctionality() {

        given().when().get("/persons/1").then().statusCode(OK.value());
        given().when()
               .get("/persons/2")
               .then().assertThat().body("name", is("Taras "))
                .statusCode(OK.value());
        given().when()
                .get("/persons/1")
                .then().assertThat().body("surname", is("Franko"))
                .statusCode(OK.value());
        given().when()
                .get("/persons/2")
                .then().assertThat().body("age", is(208))
                .statusCode(OK.value());
    }

}
package com.course;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * @author KyrianSun
 * @create 2021-06-06 0:41
 */
public class RestAssuredTest {
   public static final Logger logger = Logger.getLogger(RestAssuredTest.class.getName());
   @Test
   public void testGetMockObj(){
      RestAssured.baseURI = "https://0c773c1c-78ad-4613-bb21-3506c9a098f9.mock.pstmn.io";
      RestAssured.basePath = "/get?test=123";
      RequestSpecification requestSpec = RestAssured.given();
      Response response = requestSpec.headers("x-api-key","PMAK-60bb832a32cbfe00516dad84-ce99a9d0cdafc580a2e6f4ce43282b13ac").get();
      response.getBody().prettyPrint();
      response.then()
              .body("args.0.applicationNum", Matchers.equalTo("1234123412341234"));
      logger.info(response.asPrettyString());
   }
}

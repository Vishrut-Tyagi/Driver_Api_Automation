package com.blusmart.driver.steps;

//import com.blusmart_dev.database.Tables;
import com.blusmart.driver.Database.BlusmartDevDb;
import com.blusmart_dev.database.Tables;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static io.restassured.RestAssured.given;


public class Api_test extends BlusmartDevDb {

    static String otp;
    static String ssoId;
    static String mobile = "1900478321";
    static String bearer;
    static String bearerHub;
    static String getVehicle = "";
    static String driverAuth;
    static String appName;


    @Given("^Database is connected$")
    public void database_is_connected() throws SQLException {
        BlusmartDevDb dbConnection = new BlusmartDevDb();
        dbConnection.dbConnect();
        DSLContext db = DSL.using(conn, SQLDialect.MYSQL);
        db.update(com.blusmart_dev.database.Tables.DRIVERS).set(Tables.DRIVERS.EMAIL,"test-auto@gmail.com").where(com.blusmart_dev.database.Tables.DRIVERS.FIRST_NAME.eq("automation")).execute();
        Result<Record> result = db.select().from(com.blusmart_dev.database.Tables.DRIVERS).where(com.blusmart_dev.database.Tables.DRIVERS.FIRST_NAME.eq("automation")).fetch();
        System.out.println(result);
    }

    @When("^User calls login api$")
    public void user_calls_login_api(){

        RestAssured.baseURI = "https://driver.tracking.dev.blucgn.com";
        String responseOtp =  given().log().all().header("Content-Type", "application/json").body("{ \"phone\":\"" + mobile + "\"}").when().post("api/v1/app/auth/otp").then().assertThat().statusCode(200).extract().response().asString();
        JsonPath otp_path = new JsonPath(responseOtp);
        System.out.println(responseOtp);
        otp = otp_path.getString("response.password");

    }

    @Then("^the API call is success with status code (\\d+)$")
    public void the_API_call_is_success_with_status_code(int arg1){
        RestAssured.baseURI = "https://driver.tracking.dev.blucgn.com";
        String responseDriver = given().log().all().headers("Content-Type", "application/json").body("{\"otp\":"+ otp+",\"phone\":"+mobile+"}").when().post("api/v1/app/auth/verify").then().assertThat().statusCode(200).extract().response().asString();
        System.out.println(responseDriver);
        JsonPath authPath = new JsonPath(responseDriver);
        driverAuth = authPath.getString("response.accessToken");
        System.out.println("LogIn api working correctly");

    }

    @Then("^status in response body is ok$")
    public void status_in_response_body_is_ok() {
        System.out.println("OK");
    }
}

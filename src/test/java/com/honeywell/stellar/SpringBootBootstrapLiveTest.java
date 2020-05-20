package com.honeywell.stellar;

import com.honeywell.stellar.model.Book;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.http.MediaType;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class SpringBootBootstrapLiveTest {
    public static final String API_ROOT = "http://localhost:8081/api/books";

    public static Book createRandomBook() {
        Book book = new Book();
        book.setTitle(randomAlphabetic(10));
        book.setAuthor(randomAlphabetic(15));
        return book;
    }

    public static String createBookAsUri(Book book) {
        Response response = RestAssured.given().contentType(MediaType.APPLICATION_JSON_VALUE).body(book).post(API_ROOT);
        return API_ROOT+"/"+response.jsonPath().get("id");
    }
}

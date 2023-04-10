package com.app.feattures.eleven;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ft_04_NewHttpClientModuleTest {

	 private HttpClient client;
	    String serviceUri;
	 
	    @BeforeEach
	    public void setup() {
	        client = HttpClient.newHttpClient();// default to HTTP_2
	        serviceUri = "https://reqres.in/api/users";
	    }
	 
	    @Test
	    public void get_ofString() {
	        String getUrl = serviceUri + "/2";
	        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(getUrl)).build();
	        HttpResponse response;
	        try {
	            response = client.send(request, BodyHandlers.ofString());
	            System.out.println("Response" + response.body());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	    @Test
	    public void put_ofString() {
	        String putUrl = serviceUri + "/2";
	        String upUsdateerString = "{\"name\": \"Mary\",  \"job\": \"leader\"}";
	        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(putUrl))
	                .PUT(BodyPublishers.ofString(upUsdateerString)).build();
	        HttpResponse response;
	        try {
	            response = client.send(request, BodyHandlers.ofString());
	            System.out.println("Response" + response.body());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	    @Test
	    public void post_discarding() {
	        String newUserString = "{\"name\": \"Mary\",  \"job\": \"leader\"}";
	        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(serviceUri))
	                .POST(BodyPublishers.ofString(newUserString)).build();
	        try {
	            HttpResponse response = client.send(request, BodyHandlers.discarding());
	            System.out.println("Response" + response.statusCode());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	 
	    @Test
	    public void delete_ofString() {
	        String deleteUrl = serviceUri + "/2";
	        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(deleteUrl)).DELETE().build();
	        try {
	            HttpResponse response = client.send(request, BodyHandlers.discarding());
	            System.out.println("Response" + response.statusCode());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}

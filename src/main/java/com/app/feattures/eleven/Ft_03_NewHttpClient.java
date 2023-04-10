package com.app.feattures.eleven;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Ft_03_NewHttpClient {

	public static void http() throws InterruptedException, IOException {
		HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(20)).build();
		HttpRequest httpRequest = HttpRequest.newBuilder().GET()
				.uri(URI.create("https://dummy.restapiexample.com/api/v1/employees")) // Modify to your endpoint
				.build();
		HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println(httpResponse.body());

	}

	public static void main(String[] args)throws InterruptedException, IOException  {
       http();
	}

}

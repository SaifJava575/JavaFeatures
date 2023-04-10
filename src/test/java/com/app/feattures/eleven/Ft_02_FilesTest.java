package com.app.feattures.eleven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

public class Ft_02_FilesTest {

	// Java 11 new features added to file static methods

	// static String readString(Path path)
	// static String readString(Path path, Charset cs)
	// static Path writeString(Path path, CharSequence csq, OpenOption… options)
	// static Path writeString(Path path, CharSequence csq, Charset cs, OpenOption…
	// options)

	@Test
	public void writeString_readString() {
		try {
			Path localFile = Path.of("D:\\SaifuddinWorkSpace\\CompressFile\\info.txt");
			String sampleString = "Some example of text";
			Files.writeString(localFile, sampleString);

			String readData = Files.readString(localFile);
			System.out.println(readData);
			assertEquals(sampleString, readData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void writeString_readString_utf8() {
		try {
			String sampleString = "Some example of text";
			Files.writeString(Path.of("test.txt"), sampleString, Charset.forName("UTF-8"));

			String readData = Files.readString(Path.of("test.txt"));
			System.out.println(readData);
			assertEquals(sampleString, readData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

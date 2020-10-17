package org.testmonkeys.demo;

import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestOutput {

    @SneakyThrows
    private static String readLineByLineJava8(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();

        Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8);
        stream.forEach(s -> contentBuilder.append(s).append("\n"));

        return contentBuilder.toString();
    }

    @Test
    public void testCucumberReport() {
        Assert.assertTrue("Output contains logged message", readLineByLineJava8("target/cucumber/cucumber.json").contains("LoggedInformation"));
    }
}

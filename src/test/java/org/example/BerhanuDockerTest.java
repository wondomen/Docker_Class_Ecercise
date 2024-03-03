package org.example;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BerhanuDockerTest {
    @Test
    public void testAmirDockerProgram() {
        String simulatedInput = "John Doe\n";
        InputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Run the AmirDocker program
        BerhanuDocker.main(new String[]{});

        // Reset System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Capture the entire output
        String actualOutput = outContent.toString().trim();

        // Check if the output contains the expected message
        assertEquals("Enter your name: Your name is: John Doe", actualOutput);
    }
}

package pij.day11;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class StringExperimentsTest {

    @Test
    void testBuild() {
        assertTimeout(Duration.ofSeconds(1),
           () -> {
                   StringExperiments.build(200000);
                 });
    }
}
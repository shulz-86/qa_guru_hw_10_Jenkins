package simpletest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    @Tag("simple")
    @DisplayName("Positive test")
    void test1(){
        assertTrue(true);
    }

    @Test
    @DisplayName("Negative test")
    void test2(){
        assertTrue(false);
    }
}

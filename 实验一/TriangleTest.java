package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TriangleTest {
    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 6, 10);
        assertEquals("输入错误", type);
    }

    @Test
    @DisplayName("为一般三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("一般三角形", type);
    }

    @Test
    @DisplayName("非三角形")
    void not_triangle_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 8);
        assertEquals("非三角形", type);
    }

    @Test
    @DisplayName("为等边三角形")
    void equilateral_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 3, 3);
        assertEquals("等边三角形", type);
    }

    @Test
    @DisplayName("为等腰三角形")
    void isosceles_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(5, 8, 5);
        assertEquals("等腰三角形", type);
    }
}

package tamgiac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Test3giac {

    @Test
    void testEquilateralTriangle() {
        assertEquals("Triangle is Equilateral", checkTriangleType(1, 1, 1));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Triangle is Isosceles", checkTriangleType(2, 2, 3));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Triangle is Scalene", checkTriangleType(3, 4, 5));
    }

    @Test
    void testNotATriangle() {
        assertEquals("Not a Triangle", checkTriangleType(1, 2, 3));
        assertEquals("Not a Triangle", checkTriangleType(5, 1, 1));
        assertEquals("Not a Triangle", checkTriangleType(2, 2, 4));
    }

    @Test
    void testZeroLength() {
        assertEquals("Not a Triangle", checkTriangleType(0, 1, 1));
        assertEquals("Not a Triangle", checkTriangleType(1, 0, 1));
        assertEquals("Not a Triangle", checkTriangleType(1, 1, 0));
    }

    private String checkTriangleType(double a, double b, double c) {
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            return "Not a Triangle";
        } else if (a == b && b == c) {
            return "Triangle is Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Triangle is Isosceles";
        } else {
            return "Triangle is Scalene";
        }
    }
}

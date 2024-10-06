package com.java.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.java.ptb2.ptb2;

class Ptb2Test {

    @Test
    void testGiaiPhuongTrinhBacHai_AEqualsZero_BNotZero() {
        double a = 0;
        double b = 2;
        double c = 4;
        String expected = "Phương trình có một nghiệm x = -2.0";
        
        assertEquals(expected, ptb2.giaiPhuongTrinhBacHai(a, b, c));
    }

    @Test
    void testGiaiPhuongTrinhBacHai_AEqualsZero_BEqualsZero_CNotZero() {
        double a = 0;
        double b = 0;
        double c = 5;
        
        String result = ptb2.giaiPhuongTrinhBacHai(a, b, c);
        
        assertEquals("Phương trình vô nghiệm.", result);
    }

    @Test
    void testGiaiPhuongTrinhBacHai_AEqualsZero_BEqualsZero_CEqualsZero() {
        double a = 0;
        double b = 0;
        double c = 0;
        
        String result = ptb2.giaiPhuongTrinhBacHai(a, b, c);
        
        assertEquals("Phương trình vô số nghiệm.", result);
    }

    @Test
    void testGiaiPhuongTrinhBacHai_DeltaGreaterThanZero() {
        double a = 1;
        double b = -3;
        double c = 2;
        String expected = "Phương trình có 2 nghiệm phân biệt:\n" +
                          "x1 = 2.0\n" +
                          "x2 = 1.0";

        String result = ptb2.giaiPhuongTrinhBacHai(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testGiaiPhuongTrinhBacHai_DeltaEqualsZero() {
        double a = 1;
        double b = 2;
        double c = 1;
        String expected = "Phương trình có nghiệm kép: x = -1.0";

        String result = ptb2.giaiPhuongTrinhBacHai(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testGiaiPhuongTrinhBacHai_DeltaLessThanZero() {
        double a = 1;
        double b = 2;
        double c = 5;
        
        String result = ptb2.giaiPhuongTrinhBacHai(a, b, c);
        
        assertEquals("Phương trình vô nghiệm thực.", result);
    }
}

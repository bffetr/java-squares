package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shoudCalcExact() {

        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shoudCalcInExact() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(1000, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeMaxRange() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(100, - 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void negativeMinRange () {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqrt(- 200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeBothRange() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(- 200, - 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxRangeZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(200, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minRangeZero() {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSqrt(0, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bothRangeZero() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(0, 0);

        Assertions.assertEquals(expected, actual);
    }

}

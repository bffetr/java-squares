package ru.netology.sqr;
public class SQRService {

    public int calcSqrt(int rangeMin, int rangeMax) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeMin && i * i <= rangeMax) {
                amount = amount + 1;
            }
        }
        return amount;
    }

}



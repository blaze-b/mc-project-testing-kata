package com.mclebtec;

public class FizzBuzzKata {

    public String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append("FIZZ");
        }
        if (number % 5 == 0) {
            stringBuilder.append("BUZZ");
        }
        if (!stringBuilder.isEmpty())
            return stringBuilder.toString();
        return stringBuilder.append(number).toString();
    }

}

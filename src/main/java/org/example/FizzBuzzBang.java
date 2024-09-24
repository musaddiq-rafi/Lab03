package org.example;

public class FizzBuzzBang {

    public String fizzBuzzBangMethod(int n, boolean uppercase) {
        String result;

        if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
            result = "FizzBuzzBang";
        } else if (n % 3 == 0 && n % 5 == 0) {
            result = "FizzBuzz";
        } else if (n % 3 == 0 && n % 7 == 0) {
            result = "FizzBang";
        } else if (n % 5 == 0 && n % 7 == 0) {
            result = "BuzzBang";
        } else if (n % 3 == 0) {
            result = "Fizz";
        } else if (n % 5 == 0) {
            result = "Buzz";
        } else if (n % 7 == 0) {
            result = "Bang";
        } else {
            result = "Boom";
        }

        if (uppercase) {
            result = result.toUpperCase();
        }

        return result;
    }
}

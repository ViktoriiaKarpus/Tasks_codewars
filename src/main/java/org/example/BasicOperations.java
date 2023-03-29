package org.example;

public class BasicOperations {

    public static Integer basicMath(String op, int v1, int v2) {


        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else {
            return v1 / v2;
        }

    }

}

//('+', 4, 7) --> 11
//('-', 15, 18) --> -3
//('*', 5, 5) --> 25
//('/', 49, 7) --> 7



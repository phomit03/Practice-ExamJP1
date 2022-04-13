package testjp1;

import java.util.Scanner;

public class ComplexDemo {

    public static void main(String[] args) {
        Complex n1 = new Complex(2.6, 5.2),
                n2 = new Complex(6.2, 4.8),
                add = n1.add(n2),
                subtract = n1.subtract(n2),
                multiply = n1.multiply(n2),
                divide = n1.divide(n2);

        System.out.println("Sum = " + add.toString());
        System.out.println("Subtract = " + subtract.toString());
        System.out.println("Multiply = " + multiply.toString());
        System.out.println("Divide = " + divide.toString());
    }

}

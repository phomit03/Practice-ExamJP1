package testjp1;

public class ComplexDemo {

    public static void main(String[] args) {
        Complex c = new Complex();
        Complex n1 = new Complex(2.5, 3.7),
                n2 = new Complex(3.8, 9.6),
                temp;

        temp = c.add(n1, n2);
        temp = c.subtract(n1, n2);
        temp = c.multiply(n1, n2);
        temp = c.divide(n1, n2);

        System.out.println("Complex number: " + c.realPart + " + " + c.imaginaryPart + "i");

        System.out.printf("Sum = %.1f + %.1fi\n", n1.add(n1,n2));
        System.out.printf("Subtract = %.1f + %.1fi\n", temp.realPart, temp.imaginaryPart);
        System.out.printf("Multiply = %.1f + %.1fi\n", temp.realPart, temp.imaginaryPart);
        System.out.printf("Divide = %.1f + %.1fi\n", temp.realPart, temp.imaginaryPart);

    }
}

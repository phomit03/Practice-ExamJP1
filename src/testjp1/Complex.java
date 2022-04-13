package testjp1;

public class Complex {
    public double realPart;
    public double imaginaryPart;

    ComplexDemo cd;

    //contructor
    public Complex() {
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    //getter & setter
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    //Instance methods:
    public Complex add(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);

        temp.realPart = n1.realPart + n2.realPart;
        temp.imaginaryPart = n1.imaginaryPart + n2.imaginaryPart;

        return temp;
    }

    public Complex subtract(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);

        temp.realPart = n1.realPart - n2.realPart;
        temp.imaginaryPart = n1.imaginaryPart - n2.imaginaryPart;

        return temp;
    }

    public Complex multiply(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);

        temp.realPart = n1.realPart * n2.realPart;
        temp.imaginaryPart = n1.imaginaryPart * n2.imaginaryPart;

        return temp;
    }

    public Complex divide(Complex n1, Complex n2){
        Complex temp = new Complex(0.0, 0.0);
        Sumbp = n1.realPart *n2.realPart + n1.imaginaryPart * n2.imaginaryPart;
        Sumbp.realPart = (n1.realPart*n1.imaginaryPart + n2.realPart*n2.imaginaryPart)/tongbp;

        c.ao   = (a.ao*b.thuc - a.thuc*b.ao)/tongbp;

        temp.realPart = n1.realPart / n2.realPart;
        temp.imaginaryPart = n1.imaginaryPart / n2.imaginaryPart;

        return temp;
    }

}

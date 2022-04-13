package testjp1;

public class Complex {
    public Double realPart, imaginaryPart;

    //contructor
    public Complex() {
        Complex temp = new Complex(0.0, 0.0);
    }

    public Complex(Double realPart, Double imaginaryPart) {
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    //getter & setter
    public Double getRealPart() {
        return realPart;
    }

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    //Instance methods:
    public Complex add(Complex otherNumber) {
        Complex result = new Complex();
        result.realPart = this.realPart + otherNumber.realPart;
        result.imaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        return result;
    }

    public Complex subtract(Complex otherNumber) {
        Complex result = new Complex();
        result.realPart = this.realPart - otherNumber.realPart;
        result.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return result;
    }

    public Complex multiply(Complex otherNumber) {
        Complex result = new Complex();
        result.realPart = this.realPart * (otherNumber.realPart + otherNumber.imaginaryPart);
        result.imaginaryPart = this.imaginaryPart * (otherNumber.realPart + otherNumber.imaginaryPart);
        return result;
    }

    public Complex divide(Complex otherNumber) {
        Complex result = new Complex();
        result.realPart = (this.realPart * otherNumber.realPart + this.imaginaryPart * otherNumber.imaginaryPart) / (Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2));
        result.imaginaryPart = (this.imaginaryPart * otherNumber.realPart - this.realPart * otherNumber.imaginaryPart) / (Math.pow(otherNumber.realPart, 2) + Math.pow(otherNumber.imaginaryPart, 2));
        return result;
    }

    public String toString() {
        if (this.getImaginaryPart() < 0) {
            return this.getRealPart() + " " + this.getImaginaryPart() + "i";
        }
        return this.getRealPart() + " + " + this.getImaginaryPart() + "i";
    }
}


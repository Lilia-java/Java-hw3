public class MyComplex {
    double real;
    double imag;
    private int id;
    private static final double e = 1e-12;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public int getId() {
        return id;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;

    }

    String toString(double real, double imag) {
        return "real+imagi=" + real + "+" + imag;
    }

    public boolean isReal() {
        return Math.abs(imag) < e;
    }

    public boolean isImaginary() {
        return Math.abs(imag) > e;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        MyComplex e = (MyComplex) o;
        return (this.getId() == e.getId());
    }

    public boolean equals(/*double real1,double imag1,*/
            double real, double imag) {
        if (real == 0 & imag == 0) {
            return false;
        }
        return real == getReal() && imag == getImag();
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        double cosfi;
        cosfi = real / Math.sqrt(real * real + imag * imag);
        return Math.acos(cosfi);
    }
    public MyComplex addNew(MyComplex m) {
        return new MyComplex(real+m.real, imag+m.imag);
    }
    public MyComplex subtractNew(MyComplex m){
        return new MyComplex(real-m.real,imag-m.imag);
    }
    public MyComplex add(MyComplex m) {
        MyComplex myComplex = new MyComplex(real+m.real, imag+m.imag);
        return myComplex;
    }
    public MyComplex subtract(MyComplex m) {
        MyComplex myComplex = new MyComplex(real-m.real, imag-m.imag);
        return myComplex;
    }
    public MyComplex multiply(MyComplex m){
        MyComplex myComplex = new MyComplex(real*m.real,imag*m.imag);
        return myComplex;
    }
    public MyComplex divide(MyComplex m){
        MyComplex myComplex = new MyComplex(real/m.real,imag/m.imag);
        return myComplex;
    }
    public MyComplex conjugate(){
        MyComplex myComplex = new MyComplex(real,-1*imag);
        return myComplex;
    }
}
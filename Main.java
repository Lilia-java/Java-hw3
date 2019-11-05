
public class Main {
    public static void main(String[] args) {
        MyComplex myComplex = new MyComplex(3,4);
        MyComplex myComplex1 = new MyComplex(1,2);
        System.out.println("Argument: "+myComplex.argument());
        System.out.println("Are equal? : "+myComplex.equals(myComplex1));
        System.out.println("Real: "+myComplex.getReal());
        System.out.println("Magnitude:"+myComplex.magnitude());
    }
}

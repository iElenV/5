import java.util.Scanner;

public class Complex {



    public  double a;
    public  double b;
    public String String_a;
    public String String_b;



    public Complex(double a, double b) {

        this.a = a;
        this.b = b;
        String_a = Double.toString(a);
        if (b > 0) {
            String_b = "+" + Double.toString(Math.abs(b));
        } else {
            String_b = "-" + Double.toString(Math.abs(b));
        }

    }

    public Complex( int a, int b) {

        this.a = (int) a;
        this.b = (int) b;
        String_a = Integer.toString(a);
        if (b > 0) {
            String_b = "+" + Integer.toString(Math.abs(b));
        } else {
            String_b = "-" + Integer.toString(Math.abs(b));
        }
    }


    public void getComplex (){
        System.out.println(String_a + String_b + "i");
    }


}


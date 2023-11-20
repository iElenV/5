import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Задайте вещественные числа комплексного числа 1: ");
        System.out.print( "a1: ");
        double number_a1 = scanner.nextDouble();
        System.out.print( "b1: ");
        double number_b1 = scanner.nextDouble();
        System.out.println( "Задайте вещественные числа комплексного числа 2: ");
        System.out.print( "a2: ");
         double number_a2 = scanner.nextDouble();
        System.out.print( "b2: ");
        double number_b2 = scanner.nextDouble();

       Complex complex1 = new Complex(number_a1, number_b1);
       Complex complex2 = new Complex(number_a2, number_b2);
        System.out.print( "Комплексное число 1: ");
        complex1.getComplex();
        System.out.print( "Комплексное число 2: ");
        complex2.getComplex();
        ComplexMath.sum(complex1, complex2);
        ComplexMath.diff(complex1, complex2);
        ComplexMath.mult(complex1, complex2);
        ComplexMath.equal(complex1, complex2);

    }




}


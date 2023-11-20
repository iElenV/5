public class ComplexMath extends Complex {
    public ComplexMath(double a, double b) {
        super(a, b);
    }

    public ComplexMath(int a, int b) {
        super(a, b);
    }

    Complex complex1;
    Complex complex2;


    public static void sum(Complex complex1, Complex complex2) {
        double sum_a = complex1.a + complex2.a;
        double sum_b = complex1.b + complex2.b;
        Complex complex3 = new Complex(sum_a, sum_b);
        System.out.print("Сумма комплексных чисел: ");
        complex3.getComplex();
    }

    public static void diff(Complex complex1, Complex complex2) {
        double diff_a = complex1.a - complex2.a;
        double diff_b = complex1.b - complex2.b;
        Complex complex3 = new Complex(diff_a, diff_b);
        System.out.print("Разность комплексных чисел: ");
        complex3.getComplex();
    }

    public static void mult(Complex complex1, Complex complex2) {
        double mult_a = complex1.a * complex2.a - complex1.b * complex2.b;
        double mult_b = complex1.a * complex2.b + complex1.b * complex2.a;
        Complex complex3 = new Complex(mult_a, mult_b);
        System.out.print("Произведение комплексных чисел: ");
        complex3.getComplex();
    }

    public static void equal(Complex complex1, Complex complex2) {
        if (complex1.a == complex2.a && complex1.b == complex2.b) {
            System.out.println("Комплексные числа равны");
        } else {
            System.out.println("Комплексные числа не равны");
        }


    }
}

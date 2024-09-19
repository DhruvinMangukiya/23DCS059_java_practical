public class practical_16 {
    public static void main(String[] args) {
        Complex com = new Complex();
        com.sum(1,2,3,4);
        com.subtraction(1,2,3,4);
        com.multiplication(1,2,3,4);
    }
}

class Complex {
    int real;
    int imag;

    void sum(int r1, int r2, int im1, int im2) {
        real = r1 + r2;
        imag = im1 + im2;
        if (0 > imag) {
            System.out.println("Sum = " + real + imag + "i");
        } else {
            System.out.println("Sum = " + real + "+" + imag + "i");
        }
    }

    void subtraction(int r1, int r2, int im1, int im2) {
        real = r1 - r2;
        imag = im1 - im2;
        if (0 > imag) {
            System.out.println("Subtraction = " + real + imag + "i");
        } else {
            System.out.println("Subtraction = " + real + "+" + imag + "i");
        }
    }

    void multiplication(int r1, int r2, int im1, int im2) {
        real = (r1 * r2) - (im1 * im2);
        imag = (r1 * im2) + (r2 * im1);
        if (0 > imag) {
            System.out.println("multiplication = " + real + imag + "i");
        } else {
            System.out.println("Multiplication = " + real + "+" + imag + "i");
        }
    }
}

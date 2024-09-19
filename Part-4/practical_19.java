public class practical_19 {
    public static void main(String[] args) {
        Square Sc = new Square(5);
        Rectangle rc = new Rectangle(5.6f, 7.0f);
        
        rc.printArea();
        rc.printPerimeter();

        Sc.printArea();
        Sc.printPerimeter();

    }
}

class Rectangle {
    float length;
    float breadth;

    public

    Rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    void printArea() {
        System.out.println("Area : " + (length * breadth));
    }

    void printPerimeter() {
        System.out.println("parimeter : " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle {
    Square(float side) {
        super(side, side);
    }
}

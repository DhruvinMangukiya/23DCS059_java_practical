public class practical_20 {
    public static void main(String[] args) {
        {
            Square sq = new Square();
            sq.shapePutdata();
            sq.rectanglePutdata();
        }
    }
}

class Shape {
    void shapePutdata() {
        System.out.println("This is Shape.");
    }
}

class Rectangle extends Shape {
    void rectanglePutdata() {
        System.out.println("This is Rectangle Shape.");
    }
}

class Circle extends Shape {
    void circlePutdata() {
        System.out.println("This is Circle Shape.");
    }
}
class Square extends Rectangle {
    void squarePutdta() {
        System.out.println("Square is a rectangle.");
    }
}


public class practical_21 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergraduate = new Undergraduate();
        Postgraduate postgraduate = new Postgraduate();

        degree.getDegree();
        undergraduate.getData();
        postgraduate.getData();
    }
}

class Degree {
    void getDegree() {
        System.out.println("I got a Degree.");
    }
}

class Undergraduate extends Degree {
    void getData() {
        System.out.println("I am an Undergraduate.");
    }
}

class Postgraduate extends Degree {
    void getData() {
        System.out.println("I am an Postgraduate.");
    }
}
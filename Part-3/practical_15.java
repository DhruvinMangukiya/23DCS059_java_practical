
public class practical_15 {
    public static void main(String args[]) {
        Area area = new Area(10, 15);
        area.display();
    }
}

class Area {
    float length, breadth;

    Area(float l, float b) {
        length = l;
        breadth = b;
    }

    float returnArea() {
        return length * breadth;
    }

    void display(){
        System.out.println("Rectangle Area : "+returnArea());
    }
}
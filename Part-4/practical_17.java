public class practical_17 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Sub s = new Sub();
        p.methodParent();
        s.methodSub();
    }
}

class Parent {
    void methodParent() {
        System.out.println("This is parent class.");
    }
}

class Sub extends Parent {
    void methodSub() {
        System.out.println("This is Sub class.");
    }
}
package Module4;

abstract class CircleClass {
    abstract void display();
}

class Circle extends CircleClass {
    void display() {
        System.out.println("This is a Circle");
    }
}
class driver {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}

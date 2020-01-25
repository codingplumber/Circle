public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        Cylinder cylinder = new Cylinder(20, 10);

        System.out.println(circle.getArea());
        System.out.println(cylinder.getArea());
    }
}

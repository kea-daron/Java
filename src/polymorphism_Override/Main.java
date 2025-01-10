package polymorphism_Override;

 public class Main {
    public static void main(String[] args) {
        Shape cricle = new Circle();
        cricle.draw();
        //cricle.get();
        Circle circle1 = new Circle();
        circle1.draw();
        circle1.get();
        Shape triangle = new Triangle();
        triangle.draw();
    }
}

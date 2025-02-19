public class Main { 
    public static void main(String[] args) {
        
        // OCP
        AreaCalculator calculator = new AreaCalculator();

        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);
        Shape ellipse = new Ellipse(5, 3);

        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse area: " + calculator.calculateArea(ellipse));

        // LSP

        
    }
}

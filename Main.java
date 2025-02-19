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
        Penguin penguin = new Penguin();
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Ostrich ostrich = new Ostrich();

        penguin.walk();
        penguin.swim();

        sparrow.walk();
        sparrow.fly();

        eagle.walk();
        eagle.fly();
        
        ostrich.walk();
        ostrich.run();

        // DIP
        Order order = new Order();
        OrderProcessor orderProcessor = new OrderProcessor(new EmailNotifier());
        orderProcessor.processOrder(order);    
    }
}

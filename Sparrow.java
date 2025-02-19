public class Sparrow implements Flyable {

    @Override
    public void walk() {
        System.out.println("Sparrow moves by walking.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow moves by flying.");
    }
}
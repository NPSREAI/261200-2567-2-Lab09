public class Penguin implements Swimmable {

    @Override
    public void walk() {
        System.out.println("Penguin moves by walking.");
    }

    @Override
    public void swim() {
        System.out.println("Penguin moves by swimming.");
    }
}
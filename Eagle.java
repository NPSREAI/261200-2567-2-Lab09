public class Eagle implements Flyable {

    @Override
    public void walk() {
        System.out.println("Eagle moves by walking.");
    }

    @Override
    public void fly() {
        System.out.println("Eagle moves by flying.");
    }
}
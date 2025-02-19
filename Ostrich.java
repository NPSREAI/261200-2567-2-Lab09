public class Ostrich implements Runnable{

    @Override
    public void walk() {
        System.out.println("Ostrich moves by walking.");
    }

    @Override
    public void run() {
        System.out.println("Ostrich moves by running.");
    }
}

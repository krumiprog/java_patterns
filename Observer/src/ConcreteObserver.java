public class ConcreteObserver implements Observer {
    @Override
    public void handleEvent() {
        System.out.println("Observer was notified");
    }
}

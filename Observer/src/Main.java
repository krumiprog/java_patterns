public class Main {

    public static void main(String[] args) {
        ConcreteObservable observable = new ConcreteObservable();

        ConcreteObserver observer = new ConcreteObserver();

        observable.addObserver(observer);
        observable.notifyObservers();
    }
}

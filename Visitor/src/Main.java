public class Main {

    public static void main(String[] args) {
        Element[] elements = new Element[] { new House(), new Bank() };

        Visitor visitor = new Insurer();

        for (Element element: elements) {
            element.accept(visitor);
        }
    }
}

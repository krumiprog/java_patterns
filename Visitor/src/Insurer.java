public class Insurer implements Visitor {
    @Override
    public void visit(House house) {
        System.out.println("Offer health insurance");
    }

    @Override
    public void visit(Bank bank) {
        System.out.println("Offer financial insurance");
    }
}

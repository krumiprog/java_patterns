public class House implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

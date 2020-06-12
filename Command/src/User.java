public class User {

    private Command copy;
    private Command paste;

    public User(Command copy, Command paste) {
        this.copy = copy;
        this.paste = paste;
    }

    public void copyRecord() {
        copy.execute();
    }

    public void pasteRecord() {
        paste.execute();
    }
}

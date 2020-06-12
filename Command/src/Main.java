public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();

        User user = new User(new CopyCommand(editor), new PasteCommand(editor));

        user.copyRecord();
        user.pasteRecord();
    }
}

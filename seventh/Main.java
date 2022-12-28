
public class Main {
    public static void main(String[] args) throws Exception {
        NoteOperation noteOperation = new NoteOperationImpl();
        NoteMapper noteMapper = new NoteMapper();
        FileOperation fileOperation = new FileOperationImpl(
                "C:\\Users\\Сергей\\source\\oop_java_learning\\Homework6_2.0\\notes.txt", noteMapper);
        Operate operate = new Operate(fileOperation, noteOperation);
        NoteCreator noteCreator = new NoteCreator();
        View view = new View(noteCreator, operate);
        view.run();

    }
}

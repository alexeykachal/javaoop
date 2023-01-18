
public class LessDataExeption extends RuntimeException {

    public LessDataExeption() {
        super("Введено меньшее количество данных, чем нужно");
    }
    
}

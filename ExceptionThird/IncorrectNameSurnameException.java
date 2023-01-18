
public class IncorrectNameSurnameException extends RuntimeException  {

    public IncorrectNameSurnameException() {
        super("Некорректно заполнено поле ФИО");
    }
    
}


public class MoreDataExeption extends RuntimeException  {

    public MoreDataExeption() {
        super("Введено большее количество данных, чем нужно");
    }
    
}

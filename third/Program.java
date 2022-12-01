import java.util.*;

public class Program {
    public static void main(String[] args) {
        User bigBoss = new User("Большой", "Начальник", 40);
        User littleBoss = new User("Маленький", "Начальник", 33);
        List<User> users = Arrays.asList(new User[]{new User("Василий", "Иванов", 50), 
        new User("Василий", "Пупкин", 22),
        new User("Петр", "Михайлов", 48),
        new User("Михаил", "Никулин", 56),
        new User("Владислав", "Сюткин", 80)});
        Personal personal = new Personal(users);
        for (User user : personal) {
            System.out.println(user);
        }
        Collections.sort(users);
        System.out.println(users);
        Company company = new Company(bigBoss);
        littleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(littleBoss));
        
        
        for (User user : company) {
            
            System.out.println(user);
        }
        

    }
}
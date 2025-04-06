import java.time.LocalDate;
public class TaskManagerApp {


    public static void main(String[] args) {
        Task Task1 = new Task();
        Task Task = new Task("test","Science",LocalDate.of(2025, 1, 22),"High");

        System.out.println(Task.toString());
    }
    
}

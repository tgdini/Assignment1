import java.time.LocalDate;
public class TaskManagerApp {


    public static void main(String[] args) {
        Task task1 = new Task();
        Task taskError = new Task("test","Science",LocalDate.of(2025, 1, 22),"High");
        Task taskNoError = new Task("test","Science",LocalDate.now().plusDays(5),"High");

        System.out.println(taskError.toString());
        System.out.println("\n"+TaskValidator.validateTask(taskError)+"\n");
        System.out.println(taskNoError.toString());
        System.out.println("\n"+TaskValidator.validateTask(taskNoError));
        
    }
    
}

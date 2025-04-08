import java.time.LocalDate;

public class TaskValidator {
   //comments 


    public static String validateTask(Task task)
    {
        
        try
        {
            if (task.getTaskName().isEmpty()) 
            {
                throw new IllegalArgumentException("Task cannot be empty");
            }
            else if (task.getCategory().isEmpty()) 
            {
                throw new IllegalArgumentException("Category cannot be empty");
            } 
            else if (task.getDueDate().isBefore(LocalDate.now())) 
            {
                throw new IllegalArgumentException("The Date cannot be before the current date");
            } 
            if ((!task.getPriority().equals("High"))&&!task.getPriority().equals("Medium")&&!task.getPriority().equals("Low"))
            {
                throw new IllegalArgumentException("Valid Priority values can only be High,Medium or Low");
            }
            else {

                return("Valid");
                
            }
            
        }

        catch(IllegalArgumentException e)
        {
            return "Error:" + e.getMessage();
        }



    }
    
}

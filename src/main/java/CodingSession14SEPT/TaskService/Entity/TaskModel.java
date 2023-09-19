package CodingSession14SEPT.TaskService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TaskModel {
    @Id
    private Long id;
    private String taskTitle;
    private boolean isCompleted;
}

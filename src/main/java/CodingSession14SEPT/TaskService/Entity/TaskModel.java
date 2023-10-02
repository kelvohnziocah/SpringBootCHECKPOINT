package CodingSession14SEPT.TaskService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Data
public class TaskModel {
    @Id
    private Long id;
    private String taskTitle;
    private String description;
    private int quantity;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdOn;
    private Timestamp updatedOn;
    //private boolean isCompleted;
}

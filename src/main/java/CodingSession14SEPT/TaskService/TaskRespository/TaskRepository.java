package CodingSession14SEPT.TaskService.TaskRespository;

import CodingSession14SEPT.TaskService.Entity.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository  extends JpaRepository<TaskModel, Long> {
    TaskModel getTaskById(Long id);
    //boolean deleteTaskById(Long id);
}

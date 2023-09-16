package CodingSession14SEPT.TaskService;

public interface TaskService {
    List<TaskModel> getAllTasks();
    TaskModel createTask(TaskModel task);
Long getTaskById(Long id)
            TaskModel updateTask(Long id, TaskModel updatedTask);
boolean deleteTask(Long id);

}

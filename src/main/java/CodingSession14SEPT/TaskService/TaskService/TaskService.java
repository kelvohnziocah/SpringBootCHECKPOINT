package CodingSession14SEPT.TaskService.TaskService;

import CodingSession14SEPT.TaskService.TaskModel.TaskModel;

import java.util.List;

public interface TaskService {
    List<TaskModel> getAllTasks();
    TaskModel createTask(TaskModel task);
    TaskModel getTaskById(Long id);
    TaskModel updateTask(Long id, TaskModel updatedTask);
    boolean deleteTask(Long id);

}

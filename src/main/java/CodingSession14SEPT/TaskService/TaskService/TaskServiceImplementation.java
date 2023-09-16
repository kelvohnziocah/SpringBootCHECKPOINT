package CodingSession14SEPT.TaskService.TaskService;

import CodingSession14SEPT.TaskService.TaskModel.TaskModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskServiceImplementation implements TaskService{
    List<TaskModel> tasks= new ArrayList<>();
    @Override
    public List<TaskModel> getAllTasks(){
        return tasks;
    }
    @Override
    public TaskModel createTask(TaskModel task){
        if(task.getTaskID()<=0 ){
            throw new IllegalArgumentException("ID should not be less or equal to zero");
        }
        if (task.getTaskTitle()==null || task.getTaskTitle().isBlank()){
            throw new IllegalArgumentException("The task title can't be blank");
        }
        if (task == null){
            throw new IllegalArgumentException("Task cannot be null/blank");
        }
        tasks.add(task);
        return task;
    }
    @Override
    public TaskModel getTaskById(Long id){
        if (id == null){
            throw  new IllegalArgumentException("Task ID cannot be null");
        }
        TaskModel taskModel = tasks.get(id.intValue());
        return taskModel;
    }
    @Override
    public TaskModel updateTask(Long id, TaskModel updatedTask){
        // Use anyMatch to check if a task with the given ID exists
        boolean taskExists = tasks.stream()
                .anyMatch(task -> task.getTaskID().equals(id));
        if (!taskExists) {
            throw new IllegalArgumentException("No task with the specified ID found.");
        }
        tasks.removeIf(task -> task.getTaskID().equals(id));
        tasks.add(updatedTask);
        return updatedTask;
    }
    @Override
   public boolean deleteTask(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Task ID should have a value");
        }
        // Use anyMatch to check if a task with the given ID exists
        boolean taskExists = tasks.stream()
                .anyMatch(task -> task.getTaskID().equals(id));
        if (!taskExists) {
            return false;
        }
        tasks.removeIf(task -> task.getTaskID().equals(id));
        return true;
    }

}

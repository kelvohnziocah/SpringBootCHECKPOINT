package CodingSession14SEPT.TaskService.TaskService;

import CodingSession14SEPT.TaskService.Entity.TaskModel;
import CodingSession14SEPT.TaskService.TaskRespository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskServiceImplementation implements TaskService{
    @Autowired
    TaskRepository taskRepository;
   // List<TaskModel> tasks= new ArrayList<>();
    @Override
    public List<TaskModel> getAllTasks(){
        return null;
    }
    @Override
    public TaskModel createTask(TaskModel task){
        if(task.getId()<=0 ){
            throw new IllegalArgumentException("ID should not be less or equal to zero");
        }
        if (task.getTaskTitle()==null || task.getTaskTitle().isBlank()){
            throw new IllegalArgumentException("The task title can't be blank");
        }
        if (task == null){
            throw new IllegalArgumentException("Task cannot be null/blank");
        }
        taskRepository.save(task);
        return task;
    }
    @Override
    public TaskModel getTaskById(Long id){
        if (id == null){
            throw  new IllegalArgumentException("Task ID cannot be null");
        }
        return taskRepository.getTaskById(id);
    }
    @Override
    public TaskModel updateTask(Long id, TaskModel updatedTask){
        // Use anyMatch to check if a task with the given ID exists
        boolean taskExists = taskRepository.existsById(id);
        if (!taskExists) {
            throw new IllegalArgumentException("No task with the specified ID found.");
        }
        updatedTask.setId(id);
        return taskRepository.save(updatedTask);
    }
    @Override
   public boolean deleteTask(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Task ID should have a value");
        }
        // Use anyMatch to check if a task with the given ID exists
        if (taskRepository.existsById(id)) {
            taskRepository.deleteTask(id);
            return false;
        }
        return false;
    }

}

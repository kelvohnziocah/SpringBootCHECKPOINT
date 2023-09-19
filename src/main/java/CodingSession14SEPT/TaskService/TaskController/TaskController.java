package CodingSession14SEPT.TaskService.TaskController;

import CodingSession14SEPT.TaskService.Entity.TaskModel;
import CodingSession14SEPT.TaskService.TaskService.TaskServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskServiceImplementation taskServiceImplementation;
    public TaskController (TaskServiceImplementation taskServiceImplementation){
        this.taskServiceImplementation = taskServiceImplementation;
    }
    @GetMapping("/tasks")
    public ResponseEntity<?>  getAllTasks(){
        List<TaskModel> taskModel = taskServiceImplementation.getAllTasks();
        return ResponseEntity.ok(taskModel);
    }
    @GetMapping("/tasks/{id}")
    ResponseEntity<?> getTaskById(@PathVariable("id") Long id) {
        try {
            TaskModel taskModel = taskServiceImplementation.getTaskById(id);
            return ResponseEntity.ok(taskModel);
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/tasks")
    public ResponseEntity<?> createItem(@RequestBody TaskModel task) {
        try {
            TaskModel taskModel = taskServiceImplementation.createTask(task);
            return ResponseEntity.ok("task " + task.getTaskTitle() + " successfully created");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable("id") Long id){
        try {
            boolean taskModel = taskServiceImplementation.deleteTask(id);
            return ResponseEntity.ok(taskModel);
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("/tasks/{id}")
    public ResponseEntity<?> updateItem(@RequestBody Long id, TaskModel updatedTask){
        try {
            TaskModel taskModel = taskServiceImplementation.updateTask(id, updatedTask);
            return ResponseEntity.ok("Task with task ID" + taskModel.getId() + "updated successfully");
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

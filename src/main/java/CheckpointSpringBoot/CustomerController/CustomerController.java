package CheckpointSpringBoot.CustomerController;

import CheckpointSpringBoot.CustomerService.CustomerService;
import CheckpointSpringBoot.CustomerService.CustomerServiceImpl;
import CheckpointSpringBoot.Entity.Customer;
import CodingSession14SEPT.TaskService.Entity.TaskModel;
import CodingSession14SEPT.TaskService.TaskService.TaskServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@@RestController
public class CustomerController (CustomerServiceImpl customerServiceImpl){
    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @GetMapping("/tasks")
    public ResponseEntity<?> getAllTasks(){
        List<TaskModel> taskModel = customerServiceImpl.getAllTasks();
        return ResponseEntity.ok(taskModel);
    }
    @GetMapping("/tasks/{id}")
    ResponseEntity<?> getTaskById(@PathVariable("id") Long id) {
        try {
            Customer customer = customerServiceImpl.getTaskById(id);
            return ResponseEntity.ok(customer);
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PostMapping("/tasks")
    public ResponseEntity<?> createItem(@RequestBody TaskModel task) {
        try {
            Customer customer = customerServiceImpl.createTask(task);
            return ResponseEntity.ok("task " + task.getTaskTitle() + " successfully created");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable("id") Long id){
        try {
            boolean customer = customerServiceImpl.deleteTask(id);
            return ResponseEntity.ok(customer);
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @PutMapping("/tasks/{id}")
    public ResponseEntity<?> updateItem(@RequestBody Long id, TaskModel updatedTask){
        try {
            Customer customer = customerServiceImpl.updateTask(id, updatedTask);
            return ResponseEntity.ok("Task with task ID" + customer.getId() + "updated successfully");
        }catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}

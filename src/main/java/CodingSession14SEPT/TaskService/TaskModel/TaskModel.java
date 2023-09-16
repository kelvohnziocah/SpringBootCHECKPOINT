package CodingSession14SEPT.TaskService;

public class TaskModel {
    private Long taskID;
    private String taskTitle;
    private boolean isCompleted;

    public TaskModel(Long taskID, String taskTitle, boolean isCompleted) {
        this.taskID = taskID;
        this.taskTitle = taskTitle;
        this.isCompleted = isCompleted;
    }

    public Long getTaskID() {
        return taskID;
    }

    public void setTaskID(Long taskID) {
        this.taskID = taskID;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}

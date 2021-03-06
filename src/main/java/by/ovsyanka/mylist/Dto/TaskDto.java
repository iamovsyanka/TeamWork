package by.ovsyanka.mylist.Dto;

import by.ovsyanka.mylist.Entity.Task;
import lombok.Data;

import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Data
public class TaskDto {
    @Null
    private Long id;

    @Size(max = 40)
    private String name;

    @Size(max = 4000)
    private String description;

    private String dateOfCreation;
    private String dateOfDeadline;
    private Long userId;

    public static Task toTask(TaskDto taskDto){
        Task task = new Task();
        task.setId(taskDto.getId());
        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        task.setDateOfCreation(taskDto.getDateOfCreation());
        task.setDateOfDeadline(taskDto.getDateOfDeadline());

        return task;
    }

    public static TaskDto fromTask(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setName(task.getName());
        taskDto.setDescription(task.getDescription());
        taskDto.setDateOfCreation(task.getDateOfCreation());
        taskDto.setDateOfDeadline(task.getDateOfDeadline());
        taskDto.setUserId(task.getUser().getId());

        return taskDto;
    }
}

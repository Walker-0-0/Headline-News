package schedule.service.impl;

import com.headline.model.schedule.dtos.Task;
import com.headline.schedule.ScheduleApplication;
import com.headline.schedule.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest(classes = ScheduleApplication.class)
@RunWith(SpringRunner.class)
public class TaskServiceImplTest {

    @Autowired
    private TaskService taskService;

    @Test
    public void addTask() {

//        for (int i = 0; i < 5; i++) {
        Task task = new Task();
        task.setTaskType(100);
        task.setPriority(50);
        task.setParameters("task test".getBytes());
        task.setExecuteTime(new Date().getTime());

        long taskId = taskService.addTask(task);
        System.out.println(taskId);
//        }
    }

    @Test
    public void cancelTesk(){
        taskService.cancelTask(1393402270461292545L);
    }

    @Test
    public void testPoll(){
        Task task = taskService.poll(100, 50);
        System.out.println(task);
    }


}
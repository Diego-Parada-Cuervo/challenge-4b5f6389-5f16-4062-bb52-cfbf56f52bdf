package com.pragma.tasks;

import com.pragma.tasks.base.Task;
import com.pragma.tasks.derived.SpecificTask;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void testSpecificTaskExecution() {
        Task task = new SpecificTask("Test Task", "This is a test task");
        task.execute();
        assertEquals("Test Task", task.getName());
    }
}
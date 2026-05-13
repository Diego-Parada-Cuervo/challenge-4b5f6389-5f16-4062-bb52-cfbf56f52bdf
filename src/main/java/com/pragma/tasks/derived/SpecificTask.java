package com.pragma.tasks.derived;

import com.pragma.tasks.base.Task;

public class SpecificTask extends Task {
    public SpecificTask(String name, String description) {
        super(name, description);
    }

    @Override
    public void execute() {
        System.out.println("Executing specific task: " + getName());
    }
}
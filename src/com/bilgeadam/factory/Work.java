package com.bilgeadam.factory;

import com.bilgeadam.enums.TodoStatusEnums;

public class Work {
    private TodoStatusEnums status;
    private int priority;

    public Work() {
    }

    public Work(TodoStatusEnums status, int priority) {
        this.status = status;
        this.priority = priority;
    }

    public TodoStatusEnums getStatus() {
        return status;
    }

    public void setStatus(TodoStatusEnums status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Work{" +
                "status = " + status.getValue() +"\n"+
                "status code = " + status.getCode()+"\n"+
                ", priority = " + priority +"\n"+
                '}';
    }
}

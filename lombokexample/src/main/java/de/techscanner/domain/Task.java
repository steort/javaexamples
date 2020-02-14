package de.techscanner.domain;

class Task {
    private String title;
    private String details;
    private int priority;
    private boolean done = false;

    public Task(String title, String details, int priority, boolean done) {
        this.title = title;
        this.details = details;
        this.priority = priority;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
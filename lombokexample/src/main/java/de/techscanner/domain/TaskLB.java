package de.techscanner.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
class TaskLB {
    private String title;
    private String details;
    private int priority;
    private boolean done = false;
}
package com.example.demo;

import lombok.Getter;

@Getter
public class DTO_mode {

    private int id;
    private String isActive;
    private String start_time;
    private String end_time;

    public void setId(int id) {
        this.id = id;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }
}

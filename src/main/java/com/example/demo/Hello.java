package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Hello {

    @GetMapping("/api")
    List<DTO_mode> abc() {
        List<DTO_mode> modes = new ArrayList<>();

        DTO_mode dt = new DTO_mode();

        dt.setId(20);
        dt.setIsActive("True");
        dt.setStart_time("12-02-2026");
        dt.setEnd_time("13-12-2026");

        modes.add(dt);

        return modes;
    }
}

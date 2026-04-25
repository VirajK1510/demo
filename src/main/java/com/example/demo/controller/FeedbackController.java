package com.example.demo.controller;

import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // POST - Submit feedback
    @PostMapping("/submit")
    public ResponseEntity<Map<String, Object>> submitFeedback(@RequestBody Feedback feedback) {
        feedbackService.submitFeedback(feedback);
        return ResponseEntity.ok(Map.of(
                "status", 201,
                "message", "Feedback submitted successfully!",
                "timestamp", LocalDateTime.now().toString()
        ));
    }

    // GET - All feedback
    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> getAllFeedback() {
        List<Feedback> list = feedbackService.getAllFeedback();
        return ResponseEntity.ok(Map.of(
                "status", 200,
                "message", "Feedback fetched successfully",
                "data", list,
                "timestamp", LocalDateTime.now().toString()
        ));
    }

    // GET - Feedback by course ID
    @GetMapping("/course/{courseId}")
    public ResponseEntity<Map<String, Object>> getFeedbackByCourseId(@PathVariable Long courseId) {
        List<Feedback> list = feedbackService.getFeedbackByCourseId(courseId);
        return ResponseEntity.ok(Map.of(
                "status", 200,
                "message", "Feedback fetched successfully",
                "data", list,
                "timestamp", LocalDateTime.now().toString()
        ));
    }
}
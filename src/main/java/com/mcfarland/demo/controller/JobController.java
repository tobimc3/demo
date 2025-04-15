package com.mcfarland.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mcfarland.demo.entity.Job;
import com.mcfarland.demo.service.JobService;

@RestController

@RequestMapping("/api/jobs")

public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping

    public List<Job> getAllJobs() {

        return jobService.getAllJobs();

    }
    
}

package com.mcfarland.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcfarland.demo.dao.JobRepository;
import com.mcfarland.demo.entity.Job;


@Service
public class JobService {

        @Autowired

    private JobRepository jobRepository;

    public List<Job> getAllJobs() {

        return jobRepository.findAll();

    }
    
}

package com.mcfarland.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcfarland.demo.dao.JobRepository;
import com.mcfarland.demo.entity.Job;


@Service
public class JobService implements IJobService {

        @Autowired

    private JobRepository jobRepository;


    public List<Job> getAllJobs() {

        return jobRepository.findAll();

    }
    public Optional<Job> getJobById(Long id) {

        return jobRepository.findById(id);

    }
    public void deleteJobById(Long id) {

        jobRepository.deleteById(id);

    }

    public Job createJob(Job job) {

        return jobRepository.save(job);

    }
    
}

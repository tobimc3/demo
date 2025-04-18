package com.mcfarland.demo.service;

import java.util.List;
import java.util.Optional;

import com.mcfarland.demo.entity.Job;

public interface IJobService {

    public List<Job> getAllJobs();

    public Optional<Job> getJobById(Long id);

    public void deleteJobById(Long id);


    
}

package com.mcfarland.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.mcfarland.demo.dao.JobRepository;
import com.mcfarland.demo.entity.Job;




@SpringBootTest
public class JobServiceTest {

    @Mock
    private JobRepository jobRepository;

    @InjectMocks
    private JobService jobService;

    public JobServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllJobs() {
  
        Job job1 = new Job();
        job1.setId(1);
        job1.setJobDescription("Software Engineer");

        Job job2 = new Job();
        job2.setId(2);
        job2.setJobDescription("Data Scientist");

        List<Job> mockJobs = Arrays.asList(job1, job2);

        when(jobRepository.findAll()).thenReturn(mockJobs);

        // Act
        List<Job> result = jobService.getAllJobs();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Software Engineer", result.get(0).getJobDescription());
        assertEquals("Data Scientist", result.get(1).getJobDescription());
    }
}
package com.simran.job.jobserve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simran.job.jobserve.domain.Acceptor;
import com.simran.job.jobserve.domain.Job;
import com.simran.job.jobserve.repository.AcceptorRepository;
import com.simran.job.jobserve.repository.JobRepository;
import com.simran.job.jobserve.service.SequenceGeneratorService;

@Controller
public class JobController {
	
	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	private AcceptorRepository acceptorRepository;
	
	
	@GetMapping("/addjob")
	public String addJobData(Model model) {
		model.addAttribute("job",new Job());
		return "addjob";
	}
	
	@PostMapping("/process_register")
	public String processData(Job job) {
		job.setId(sequenceGeneratorService.getSequenceNumber(Job.SEQUENCE_NAME));
		jobRepository.save(job);
		return "dashboard";
		}
	@GetMapping("/joblist")
    public String viewHomePage(Model model) {
        model.addAttribute("jobList", jobRepository.findAll());
        return "joblist";
	}
	@RequestMapping("/acceptor")
    public String acceptorInformation(Model model) {
		model.addAttribute("acceptor",new Acceptor());
        return "acceptor";
    }
	@PostMapping("/acceptor_register")
	public String acceptorAdd(Acceptor acceptor) {
		acceptor.setId(sequenceGeneratorService.getSequenceNumber(Acceptor.SEQUENCE_NAME));
		acceptorRepository.save(acceptor);
		return "joblist";
		}
    @RequestMapping("/acceptorlist")
    public String acceptorView(Model model) {
    model.addAttribute("acceptorList",acceptorRepository.findAll());
        return "dashboard";
    }

}

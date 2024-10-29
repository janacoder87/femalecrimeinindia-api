package com.example.femalecrimestats;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CrimeDataController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private CrimeServiceAPI crimeService;
	
	@GetMapping("/crimedata")
	public CrimeData greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new CrimeData(counter.incrementAndGet(), String.format(template, name));
	}
	
    @GetMapping("/crimelist")
    public List<CrimeEntity> getAllCrimeData(){
    	System.out.println("inside the service");
    	List<CrimeEntity> crime = crimeService.getAllCrimeData();
    	
        return crime;
    }
    
    @GetMapping("/statetotalcrime")
    public List<StatewiseData> getAllStatewiseData(){
    	System.out.println("inside the service");
    	List<StatewiseData> crime = crimeService.getAllStatewiseData();
    	
        return crime;
    }
    
    @GetMapping("/loaddata")
    public  String loadCrimeData(){
    	System.out.println("data load started");
        String filePath = "src/main/resources/data/CrimesOnWomenData.csv"; 
        crimeService.loadCrimeData(filePath);
    	
        return "Data Loaded Successfully";
    }
}

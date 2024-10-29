package com.example.femalecrimestats;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.opencsv.CSVReader;

import com.opencsv.CSVReader;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CrimeServiceAPI{
	
	@Autowired
	private CrimeRepository crimeRepository;
	@Autowired 
	private StatewiseDataRepository statewiseDataRepository;
	
	public CrimeEntity createCrimeRecord(CrimeEntity crime) {
		// TODO Auto-generated method stub
		return crimeRepository.save(crime);
	} 

	public List<CrimeEntity> getAllCrimeData() {
		// TODO Auto-generated method stub
		return crimeRepository.findAll();
	}
	
	public List<StatewiseData> getAllStatewiseData() {
		// TODO Auto-generated method stub
		return statewiseDataRepository.findAll();
	}
	
	public void loadCrimeData(String filePath) {
		List<CrimeEntity> crimes = new ArrayList<CrimeEntity>();
		List<StatewiseData> states = new ArrayList<StatewiseData>();

        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] values;
            csvReader.readNext();
            while ((values = csvReader.readNext()) != null) {
            	CrimeEntity crime = new CrimeEntity();
            	crime.setRecordID(Long.parseLong(values[0]));
            	crime.setState(values[1]);
            	crime.setYear(Integer.parseInt(values[2]));
            	crime.setRape(Integer.parseInt(values[3]));
            	crime.setKA(Integer.parseInt(values[4]));
            	crime.setDD(Integer.parseInt(values[5]));
            	crime.setAoW(Integer.parseInt(values[6]));
            	crime.setAoM(Integer.parseInt(values[7]));
            	crime.setDV(Integer.parseInt(values[8]));
            	crime.setWT(Integer.parseInt(values[9]));
            	crimes.add(crime);                
            }
            crimeRepository.saveAll(crimes);
            System.out.println("data load completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}

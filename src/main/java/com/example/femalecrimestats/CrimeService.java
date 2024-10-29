package com.example.femalecrimestats;

import java.util.List;


public interface CrimeService {
	
	CrimeEntity createCrimeRecord(CrimeEntity crime);

    List<CrimeEntity> getAllCrimeData();
    
    void loadCrimeData(String filepath);
    
    List<StatewiseData> getAllStatewiseData();
}

package com.example.femalecrimestats;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.femalecrimestats.CrimeEntity;

import java.util.List;

public interface CrimeRepository extends JpaRepository<CrimeEntity, Long> {
//	List<CrimeEntity> findByState(String State);
//	void loadCrimeData(String FileName);
}

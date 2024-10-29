package com.example.femalecrimestats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CrimeData")
public class CrimeEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long RecordID;
    @Column(nullable = false)    
    public Long getRecordID() {
		return RecordID;
	}
	public void setRecordID(Long RecordID) {
		this.RecordID = RecordID;
	}
	
	private String State;
	@Column(nullable = false)   
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	
	public int Year;
	@Column(nullable = false)   
	public int getYear() {
		return Year;
	}
	public void setYear(int Year) {
		this.Year = Year;
	}
	
	public int Rape;
	public int getRape() {
		return Rape;
	}
	public void setRape(int Rape) {
		this.Rape = Rape;
	}
	
	public int KA;
	public int getKA() {
		return KA;
	}
	public void setKA(int KA) {
		this.KA = KA;
	}
	
	public int DD;
	public int getDD() {
		return DD;
	}
	public void setDD(int DD) {
		this.DD = DD;
	}
	
	public int AoW;
	public int getAoW() {
		return AoW;
	}
	public void setAoW(int AoW) {
		this.AoW = AoW;
	}
	
	public int AoM;
	public int getAoM() {
		return AoM;
	}
	public void setAoM(int AoM) {
		this.AoM = AoM;
	}
	
	public int DV;
	public int getDV() {
		return DV;
	}
	public void setDV(int DV) {
		this.DV = DV;
	}
	
	public int WT;
	public int getWT() {
		return WT;
	}
	public void setWT(int WT) {
		this.WT = WT;
	}

}

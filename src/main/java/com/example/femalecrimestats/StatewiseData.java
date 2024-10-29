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
@Table(name = "StatewiseData")
public class StatewiseData {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StateID;
    @Column(nullable = false)    
    public Long getStateID() {
		return StateID;
	}
	public void setStateID(Long StateID) {
		this.StateID = StateID;
	}
	
	private String State;
	@Column(nullable = false)   
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	
	public Long Total;
	@Column(nullable = false)   
	public Long getTotal() {
		return Total;
	}
	public void setTotal(Long Total) {
		this.Total = Total;
	}
	
}

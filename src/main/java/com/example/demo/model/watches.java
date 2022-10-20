package com.example.demo.model;
import javax.persistence.Id;

import lombok.AllArgsConstructor;				  //All Required packages are imported.
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class watches {
	@Id
	public int watchSerialNumber;						//Variables of the project are declared here.
	public String watchName;
	public String watchPrice;
	public String watchBeltType;
}
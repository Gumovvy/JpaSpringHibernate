package com.gmv.decerto;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vechicle {
	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}

}

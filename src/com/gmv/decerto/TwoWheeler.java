package com.gmv.decerto;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vechicle {
	private String SteeringHandle;

	public String getSteeringHandle() {
		return SteeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		SteeringHandle = steeringHandle;
	}

}

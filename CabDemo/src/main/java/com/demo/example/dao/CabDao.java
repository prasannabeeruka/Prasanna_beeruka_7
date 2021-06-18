package com.demo.example.dao;

import com.demo.example.entity.Cab;

public interface CabDao {
	
	public void addCab(Cab cab);

	public int getCabId();
	
	public void changeCabStatus(int cabId, boolean i);
}

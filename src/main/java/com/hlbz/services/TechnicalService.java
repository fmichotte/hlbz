package com.hlbz.services;

import java.util.List;

import com.hlbz.entities.Technical;

public interface TechnicalService {

	public List<Technical> getTechnicals();
	public Technical saveTechnical(Technical tech);
	public Technical getTechnical(int id);
	public void removeTechnical(Technical tech);
	
}

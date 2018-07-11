package com.hlbz.daos;

import java.util.List;

import com.hlbz.entities.Technical;

public interface TechnicalDAO {

	
	public List<Technical> getTechnicals();
	public Technical saveTechnical(Technical tech);
	public void deleteTechnical(Technical tech);
	public Technical getTechnical(int id);
	
	
}

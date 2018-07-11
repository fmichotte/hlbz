package com.hlbz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hlbz.daos.TechnicalDAO;
import com.hlbz.entities.Technical;

@Service
@Transactional
public class TechnicalServiceImpl implements TechnicalService {

	
	@Autowired
	private TechnicalDAO technicalDAO;
	
	
	@Override
	public List<Technical> getTechnicals() {
		return technicalDAO.getTechnicals();
	}


	@Override
	public Technical saveTechnical(Technical tech) {
		
		System.out.println("Technical to save :" + tech);
		return technicalDAO.saveTechnical(tech);
	}


	@Override
	public Technical getTechnical(int id) {
		return technicalDAO.getTechnical(id);
	}


	@Override
	public void removeTechnical(Technical tech) {
		technicalDAO.deleteTechnical(tech);
		
	}

}

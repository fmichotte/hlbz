package com.hlbz.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hlbz.entities.Technical;

@Repository
public class TechnicalDAOImpl implements TechnicalDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Technical> getTechnicals() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Technical> q =  currentSession.createQuery("from Technical", Technical.class);
		List<Technical> result = q.getResultList();
		
		return result;
				
	}

	@Override
	public Technical saveTechnical(Technical tech) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(tech);
		
		return tech;
	}

	@Override
	public void deleteTechnical(Technical tech) {

		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.remove(tech);
		
	}
 
	@Override
	public Technical getTechnical(int id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Technical tech = currentSession.get(Technical.class, id);
		
		return tech;
	}

}

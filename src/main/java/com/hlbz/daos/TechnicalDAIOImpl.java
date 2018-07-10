package com.hlbz.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hlbz.entities.Technical;

@Repository
public class TechnicalDAIOImpl implements TechnicalDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Technical> getTechnicals() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Technical> q =  currentSession.createQuery("from Technical", Technical.class);
		List<Technical> result = q.getResultList();
		
		return result;
				
	}

}

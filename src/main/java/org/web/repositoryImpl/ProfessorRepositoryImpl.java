package org.web.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.web.model.Professor;
import org.web.repository.CommonRepository;

public class ProfessorRepositoryImpl implements CommonRepository<Professor>{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Professor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor add(Professor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor update(Professor entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Professor entity) {
		// TODO Auto-generated method stub
		return false;
	}

}

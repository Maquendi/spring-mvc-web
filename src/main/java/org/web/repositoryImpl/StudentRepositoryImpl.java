package org.web.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.web.model.Student;
import org.web.repository.CommonRepository;

public class StudentRepositoryImpl implements CommonRepository<Student>{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student add(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student update(Student entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Student entity) {
		// TODO Auto-generated method stub
		return false;
	}

}

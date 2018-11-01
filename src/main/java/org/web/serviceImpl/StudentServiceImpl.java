package org.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.web.model.Student;
import org.web.repository.CommonRepository;
import org.web.services.CommonService;

public class StudentServiceImpl implements CommonService<Student>{
	
	@Autowired
	private CommonRepository<Student> repository;

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

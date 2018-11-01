package org.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.web.model.Professor;
import org.web.model.Student;
import org.web.repository.CommonRepository;
import org.web.services.CommonService;

public class ProfessorServiceImpl implements CommonService<Professor> {
	
	
	@Autowired
	private CommonRepository<Student> repository;

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

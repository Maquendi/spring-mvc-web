package org.web.repository;

import java.util.List;

public interface CommonRepository<T>{
	
	public List<T> findAll();
	
	public T findById(long id);
	
	public T add(T entity);
	
	public T update(T entity);
	
	public boolean remove(T entity);

}

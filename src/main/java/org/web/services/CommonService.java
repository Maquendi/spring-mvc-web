package org.web.services;

import java.util.List;

public interface CommonService<T> {
	
    public List<T> findAll();
	
	public T findById(long id);
	
	public T add(T entity);
	
	public T update(T entity);
	
	public boolean remove(T entity);

}

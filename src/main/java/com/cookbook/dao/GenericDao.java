package com.cookbook.dao;

import java.util.List;

import com.cookbook.domain.DomainObject;

public interface GenericDao<T extends DomainObject> {
	
	public T get(Long id);

	public List<T> getAll();

	public void save(T object);

	public void delete(T object);
}

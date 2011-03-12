/**
 * 
 */
package com.cookbook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.cookbook.domain.DomainObject;

/**
 * @author lokesh
 * 
 */
public class GenericDaoImpl<T extends DomainObject> implements GenericDao<T> {

	private Class<T> type;

	@PersistenceContext
	protected EntityManager entityManager;

	public GenericDaoImpl(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	@Transactional(readOnly = true)
	public T get(Long id) {
		if (id == null) {
			return null;
		} else {
			return entityManager.find(type, id);
		}
	}

	@Override
	@Transactional(readOnly = true)
	public List<T> getAll() {
		return entityManager.createQuery(
				"select o from " + type.getName() + " o" ).getResultList();
	}

	@Override
	public void save(T object) {
		entityManager.persist(object);
	}

	@Override
	public void delete(T object) {
		entityManager.remove(object);
	}

}

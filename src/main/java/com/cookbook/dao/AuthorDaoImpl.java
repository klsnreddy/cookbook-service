/**
 * 
 */
package com.cookbook.dao;

import org.springframework.stereotype.Repository;

import com.cookbook.domain.Author;

/**
 * @author lokesh
 * 
 */
@Repository("authorDao")
public class AuthorDaoImpl extends GenericDaoImpl<Author> implements AuthorDao {

	public AuthorDaoImpl() {
		super(Author.class);
	}

}

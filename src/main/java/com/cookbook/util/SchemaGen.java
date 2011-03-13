/**
 * 
 */
package com.cookbook.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author lokesh
 * 
 */
@Component("schemaGen")
public class SchemaGen {

	@Autowired
	private LocalContainerEntityManagerFactoryBean fb;

	/**
	 * 
	 */
	public SchemaGen() {
		// TODO Auto-generated constructor stub
	}

	public void generateSchema() {
		org.hibernate.ejb.Ejb3Configuration cfg = new org.hibernate.ejb.Ejb3Configuration();
		org.hibernate.ejb.Ejb3Configuration configured = cfg.configure(
				fb.getPersistenceUnitInfo(), fb.getJpaPropertyMap());
		org.hibernate.tool.hbm2ddl.SchemaExport schemaExport = new org.hibernate.tool.hbm2ddl.SchemaExport(
				configured.getHibernateConfiguration());
		schemaExport.create(true, false);

	}

}

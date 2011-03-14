/**
 * 
 */
package com.cookbook.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author lokesh
 * 
 */
@Component("schemaGen")
public class SchemaGen {

	private static final Logger logger = Logger.getLogger(SchemaGen.class
			.getName());

	@Autowired
	private LocalContainerEntityManagerFactoryBean fb;

	/**
	 * 
	 */
	public SchemaGen() {
		// TODO Auto-generated constructor stub
	}

	public boolean generateSchema() {
		boolean generated = false;
		org.hibernate.ejb.Ejb3Configuration cfg = new org.hibernate.ejb.Ejb3Configuration();
		org.hibernate.ejb.Ejb3Configuration configured = cfg.configure(
				fb.getPersistenceUnitInfo(), fb.getJpaPropertyMap());
		org.hibernate.tool.hbm2ddl.SchemaExport schemaExport = new org.hibernate.tool.hbm2ddl.SchemaExport(
				configured.getHibernateConfiguration());
		schemaExport.create(true, false);
		logger.info("Schema Generation successful !!!");
		generated = true;
		return generated;

	}

}

package com.niit.NIITBackEnd.main;

import java.util.List;
import java.util.logging.Logger;

import javax.imageio.spi.ServiceRegistry;
import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.NIITBackEnd.Dao.IProductDAO;
import com.niit.NIITBackEnd.model.Category;
import com.niit.NIITBackEnd.model.Person;

public class TestBackEnd {

	private final static org.jboss.logging.Logger logger = LoggerFactory.logger(TestBackEnd.class);

	public static void main(String[] args) {
		/*Configuration configuration=((Object) new Configuration()).configure();
		ServiceRegistryBuilder registry=new ServiceRegistryBuilder();
		registry.applySettings(((Object) configuration).getPropertise());
		ServiceRegistry serviceregistry=(ServiceRegistry) registry.getBootstrapServiceRegistry();
		Object sessionFactory;
		Session session=((Object) sessionFactory).openSession();
		session.beginTransaction();
		Category category=new Category();*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("niit_backend.xml");
		IProductDAO personDAO = context.getBean(IProductDAO.class);
		Person person = new Person();
		person.setName("Prakashaa11");
		person.setCountry("India");
		personDAO.save(person);

		logger.info("Person::" + person);
		List<Person> list = personDAO.list();

		for (Person p : list) {
			logger.info("Person List::" + p);
		}
		// close resources
		context.close();
	}

}

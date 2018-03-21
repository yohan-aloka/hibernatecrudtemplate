package hibernatecrud.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import hibernatecrud.service.HibernateUtil;

@WebListener
public class AppContextListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("App Initialized");
		HibernateUtil.getSessionFactory();
	}
	
	public void contextDestroyed(ServletContextEvent arg0) {
		HibernateUtil.getSessionFactory().close();
	}

}

package net.sam.context;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {

		//load db 
		System.out.println("Loaded DB details !!");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Closed DB Connections !!");
		
	}

}

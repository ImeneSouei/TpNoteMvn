package com.infotel.TpMavenNote.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenNote.metier.Dev;
import com.infotel.TpMavenNote.metier.DevLogiciel;
import com.infotel.TpMavenNote.metier.Etudiant;
import com.infotel.TpMavenNote.service.Iservice;
import com.infotel.TpMavenNote.service.ServiceImpl;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext context = 
      		   new ClassPathXmlApplicationContext("applicationContext.xml");
    	 
    	 
    	 Dev d = context.getBean("Dev1", Dev.class);
    	 Dev d2 = context.getBean("Dev2", Dev.class);
    	 
    	 DevLogiciel dev = context.getBean("DevLo1", DevLogiciel.class);
    	 
    	 System.out.println(d);
         System.out.println(d2);
         
         System.out.println(dev);

     	
     	
     	
    	 Etudiant e = context.getBean("etudiant", Etudiant.class);
    	 
    	 Iservice service= context.getBean("serviceImpl", ServiceImpl.class);
         service.ajouterEtudiant(e);
         
         
         
         context.close();
    }
}

package org.test;

import java.util.ArrayList;
import java.util.List;

import org.entity.Piscina;
import org.entity.RoomService;
import org.entity.Serviciu;

public class TestServicii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf =Persistence.createEntityManagerFactory("HotelJPA");
		EntityManager em=emf.createEntityManager();
		
	
		
		//POPULARE SERVICII
		List <Serviciu> lstServiciiPersistente=em.createQuery("Select s From Serviciu s",Serviciu.class).getResultList();
		if(!lstServiciiPersistente.isEmpty()) {
			em.getTransaction().begin();
			for(Serviciu s:lstServiciiPersistente) em.remove(s);
			em.getTransaction().commit();
		}
		List<Serviciu> catalogServicii=new ArrayList<Serviciu>();
		//Initializare explicita  a unor servicii oferite
		RoomService s1=new RoomService(1,"all inclusive","RoomService_1",450.0,10,"inclus in pret");
		RoomService s2=new RoomService (2,"non inclusive","RoomService_2",240.0,11, "la cerere");
		catalogServicii.add(s1);
		catalogServicii.add(s2);
		
		Piscina s3= new Piscina(3,"all inclusive","Piscina",300.0,12,"Piscina acoperita");
		Piscina s4= new Piscina(4,"all inclusive","Piscina",230.0,13,"Piscina descoperita");
		Piscina s5= new Piscina(5," non inclusive","Piscina",330.0,13,"Piscina acoperita");
		Piscina s6= new Piscina(6," non inclusive","Piscina",260.0,13,"Piscina descoperita");
		catalogServicii.add(s3);
		catalogServicii.add(s4);
		catalogServicii.add(s5);
		catalogServicii.add(s6);
		
		
		em.getTransaction().begin();
		catalogServicii.stream().forEach(s->em.persist(s));
		em.getTransaction().commit();
		//Read after create
		lstServiciiPersistente=em.createQuery("Select s From Serviciu s",Serviciu.class).getResultList();
		System.out.println("Lista serviciilor persistente/salvate in baza de date");
		for (Serviciu s:lstServiciiPersistente)
			System.out.println("Id: "+s.getIdServiciu()+ ", tip:" +s.getTipServiciu()+", denumire: "+s.getDenServiciu()+", pret: "+s.getPretServiciu().toString());
}


	
		
	}



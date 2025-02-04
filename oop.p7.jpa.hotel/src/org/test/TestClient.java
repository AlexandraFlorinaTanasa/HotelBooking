package org.test;

import java.util.ArrayList;
import java.util.List;

import org.entity.Client;


public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		List<Client> clienti=new ArrayList<Client>();

		clienti.add(new Client(1, "Ignat Ioana", 28, "Iasi","Strada Fericirii", "ignatioana5@yahoo.com"));
		clienti.add(new Client(2,"Raileanu Catalina",31,"Botosani","Strada Alfa","c.raileanu@yahoo.com"));
		clienti.add(new Client(3,"Aonicesei Ema",62,  "Galati", "Strada Beta","a.ema@yahoo.com"));
		clienti.add(new Client(4,"Radu Mircea",71,  "Botosani", "Strada Gama","radumircea9@yahoo.com"));
		clienti.add(new Client(5,"Munteanu Adriana",45, "Roman", "Strada Delta","muntean.ad@yahoo.com"));
		clienti.add(new Client(6,"Marin Marin", 25, "Radauti", "Strada Sesiunii","marin.m@yahoo.com"));
		clienti.add(new Client(7,"Irimia Daniela",21, "Pitesti", "Strada Pitestiului","daniela.irimia8@yahoo.com"));
		clienti.add(new Client(8,"Melniciuc Sabina",55,"Suceava", "Strada Restantierului","sabina.m8@yahoo.com"));
		clienti.add(new Client(9,"Zamfirache Eduard",24, "Bucuresti", "Strada Soarelui","zmf.ed8@yahoo.com"));
		clienti.add(new Client(10,"Gimir Ioana",25,"Timisoara", "Strada Fericitului","ioanagmr8@yahoo.com"));
		clienti.add(new Client(11,"Ilas Silviu",29,"Ploiesti", "Strada Inchisorii","ilas.silviu78@yahoo.com"));
		clienti.add(new Client(12,"Saramet Lorena",30, "Dorohoi", "Strada Unirii","lorena.saramet98@yahoo.com"));
		clienti.add(new Client(13,"Ciornea Ilinca",34, "Brasov", "Strada Sfatului","ciornea.irlinca18@yahoo.com"));
		clienti.add(new Client(14,"Petrea Roxana",69, "Vaslui", "Strada Divortului","rox.p@yahoo.com"));
		clienti.add(new Client(15,"Zahiu Paul",67, "Pascani", "Strada Iasului","zahiup@yahoo.com"));
		clienti.add(new Client(16,"Cretu Ionut",18,"Harlau", "Strada Programarii","cretu.ionut@yahoo.com"));
		clienti.add(new Client(17,"Pintilie Lavinia",19,"Flamanzi", "Strada Tineretului","pinti.lav@yahoo.com"));
		clienti.add(new Client(18,"Benea Alexandra", 20, "Constanta", "Strada Soarelui","benea.ale89@yahoo.com"));
		clienti.add(new Client(19,"Vlad Ivan", 80, "Bacau", "Strada Garii","vladivan22@yahoo.com"));
		clienti.add(new Client(20,"Lupu Ecaterina",37, "Vatra-Dornei", "Strada Muntelui","lupu.eca99@yahoo.com"));
		clienti.add(new Client(21,"Zibilieanu Alessia",19, "Oradea", "Strada Orzului","zibi.alessia@yahoo.com"));
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("HotelJPA");
		EntityManager em=emf.createEntityManager();
		
		//Clean-up clienti
		em.getTransaction().begin();
		em.createQuery("Delete From Client c").executeUpdate();
		em.getTransaction().commit();
		
		//Create
		em.persist(clienti.get(0));
		em.persist(clienti.get(1));
		em.persist(clienti.get(2));
		em.persist(clienti.get(3));
		em.persist(clienti.get(4));
		em.persist(clienti.get(5));
		em.persist(clienti.get(6));
		em.persist(clienti.get(7));
		em.persist(clienti.get(8));
		em.persist(clienti.get(9));
		em.persist(clienti.get(10));
		em.persist(clienti.get(11));
		em.persist(clienti.get(12));
		em.persist(clienti.get(13));
		em.persist(clienti.get(14));
		em.persist(clienti.get(15));
		em.persist(clienti.get(16));
		em.persist(clienti.get(17));
		em.persist(clienti.get(18));
		em.persist(clienti.get(19));
		em.persist(clienti.get(20));
		em.persist(clienti.get(21));
		
		
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.clear();
		
		//Read after create
		List<Client> ClientiPersitenti=em.
				createQuery("Select c From Client c",Client.class).getResultList();
		
		System.out.println("Lista clienti persitenti/salvati in baza de date");
		for(Client c:ClientiPersitenti)
			System.out.println("IdClient: "+c.getId()+", nume: "+c.getNume()+", varsta: "+c.getVarsta()+" oras: "+c.getOras()+" adresa: "+c.getAdresa()+" email: "+c.getEmail());
		
		//Update/Remove
		em.getTransaction().begin();
		Client c21=em.find(Client.class, 21);
		if(c21 != null) {
			c21.setNume("Mirciulescu Marin");
			
		}
		//Read/Remove
		
		//Client c11=(Client)em.createQuery("Select o From Client o where o.idclient=11").getSingleResult();
		Client c11=em.find(Client.class, 11);
		if(c11 !=null) em.remove(c11);
		
		//Realizare tranzactie
		em.getTransaction().commit();
		em.clear();
		
		ClientiPersitenti=em.
				createQuery("Select c From Client c",Client.class).getResultList();
		System.out.println("Lista finala clienti persistenti (salvati in baza de date):");
		for(Client c:ClientiPersitenti)
			System.out.println("IdClient: "+c.getId()+", nume: "+c.getNume()+", varsta: "+c.getVarsta()+", oras: "+c.getOras()+", adresa: "+c.getAdresa()+", email: "+c.getEmail());
		

	}


	
		
	}



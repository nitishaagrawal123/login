import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestOntToOneDemo {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntiManager();
		EntityTransaction et = em.getTransaction();
		Address vAddress = new Address();
		vAddress.setCity("Aligarh");
		vAddress.setState("MP");
		vAddress.setStreet("Mall Road");
		vAddress.setZipcode("283456");

		Address rAddress = new Address();
		rAddress.setCity("Banaras");
		rAddress.setState("UP");
		rAddress.setStreet("Talawade Road");
		rAddress.setZipcode("789562");

		Student tanu = new Student();
		tanu.setStuName("Tanu Paagal");
		tanu.setStuAddress(vAddress);

		Student abhijeet = new Student();
		abhijeet.setStuName("Abhijeet Jaiswal");
		abhijeet.setStuAddress(rAddress);
		et.begin();
		em.persist(tanu);
		em.persist(abhijeet);
		et.commit();
		System.out.println("Data is inserted in the ");
		System.out.println("----------Fetch-------------");

	}

}

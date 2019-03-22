import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestInheritanceDemo 
{

	public static void main(String[] args)
	{
		Emp em=new Emp();
		em.setEmpName("Tanu Paagal");
		em.setEmpSal(23456);
		Manager mgr=new Manager();
		mgr.setEmpName("Nitisha Agrawal");
		mgr.setEmpSal(5000000);
		mgr.setDeptName("Java");
		EntityManager em1=JPAUtil.getEntiManager();
		EntityTransaction tran=em1.getTransaction();
		tran.begin();
		em1.persist(em);
		em1.persist(mgr);
		tran.commit();
		System.out.println("Data is inserted");
	}

}

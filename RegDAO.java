package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vo.CountryVO;
import vo.LoginVO;
import vo.RegVO;
import vo.StateVO;

public class RegDAO {
	public void insert(RegVO obj)
	{
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			s1.save(obj);
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void insert1(LoginVO obj1)
	{
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			s1.save(obj1);
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	//------------------------------***----------------------------***-----------------------------//
	
	
	
	public void insert2(CountryVO obj)
	{
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			s1.save(obj);
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public List search(CountryVO obj1) 
	{
		List ls = new ArrayList();
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			Query q = s1.createQuery("from CountryVO");
			ls = q.list();
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return ls;
	}
	
	public void insert3(StateVO obj3)
	{
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			s1.save(obj3);
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public List searcha(StateVO obj4) 
	{
		List ls1 = new ArrayList();
		try
		{
			SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();
			
			Query q = s1.createQuery("from StateVO");
			ls1 = q.list();
			
			t.commit();
			
			s1.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return ls1;
	}
	
	public void update(StateVO obj4)
	{
		try
		{
SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();

			s1.update(obj4);
			
			t.commit();
			
			s1.close();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public void update1(CountryVO obj5)
	{
		try
		{
SessionFactory s=new Configuration().configure().buildSessionFactory();
			
			Session s1 = s.openSession();
			
			Transaction t = s1.beginTransaction();

			s1.update(obj5);
			
			t.commit();
			
			s1.close();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}


}

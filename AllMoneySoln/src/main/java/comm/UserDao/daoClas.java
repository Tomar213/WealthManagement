package comm.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import comm.entity.Userdata;


@Repository
public class daoClas {
	@Autowired
	private HibernateTemplate hibernateTemplate;	

	
	@Transactional
	public int dataSave(Userdata userdata) {
		
		Integer i= (Integer)this.hibernateTemplate.save(userdata);
		return i;
	}}



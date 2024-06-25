package comm.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comm.UserDao.daoClas;
import comm.entity.Userdata;

@Service
public class service {
	@Autowired
	private daoClas userDao;
	
	
	public int createuser(Userdata user) {
		
		return this.userDao.dataSave(user);
		
	}

}

package comm.userService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.Repositoryy.repository;
import comm.entity.Userdata;

@Service
public class service {
	@Autowired(required=true)
	private repository repo;
	
	@Transactional
	 public void save(Userdata userdata) {
		repo.save(userdata);
		
	}

	

}

package comm.allMoneySoln.userService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.allMoneySoln.Repositoryy.repository;
import comm.allMoneySoln.Repositoryy.repositoryReg2;
import comm.allMoneySoln.entity.Userdata;
import comm.allMoneySoln.entity.userdata2;

@Service
public class service {
	@Autowired(required=true)
	private repository repo;
	
	@Autowired(required=true)
	private repositoryReg2 repo2;
	
	@Transactional
	 public void save(Userdata userdata) {
		repo.save(userdata);
		
	}
	
	
	@Transactional
	 public void save1(userdata2 userdata2) {
		repo2.save(userdata2);
		
	}
		



}

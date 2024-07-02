package comm.allMoneySoln.Repositoryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comm.allMoneySoln.entity.Userdata;
@Repository
public interface repository extends JpaRepository<Userdata, Integer> {

}



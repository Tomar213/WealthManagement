package comm.Repositoryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comm.entity.Userdata;

@Repository
public interface repository extends JpaRepository<Userdata, String>{
	
}

package com.fullstack.project.User_Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.project.entity.User;

@Repository
public interface User_Repository extends JpaRepository<User, Long> {

	User findByPasswordAndUsername(String password, String username);

	

//	User findBypasswordandname(String password, String name);

	

	

	



	

	//User findBygenderAndpassword(String gender, String password);

	

	

	
	

	


}

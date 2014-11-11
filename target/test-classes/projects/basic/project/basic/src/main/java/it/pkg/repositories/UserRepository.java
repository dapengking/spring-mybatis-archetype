/**
 * 
 */
package it.pkg.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.pkg.entities.User;
import it.pkg.mappers.UserMapper;

/**
 * @author Siva
 *
 */
@Repository
public class UserRepository {

	@Autowired
	private UserMapper userMapper;
	
	public User findUserById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	public List<User> findAllUsers() {
		return userMapper.selectAll(); 
	}
}

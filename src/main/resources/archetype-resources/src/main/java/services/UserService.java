#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 
 */
package ${package}.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.entities.User;
import ${package}.repositories.UserRepository;

/**
 * @author Siva
 *
 */
@Service
@Transactional
public class UserService 
{
	@Autowired private UserRepository userRepository;
	
	public List<User> findAllUsers() {
		return userRepository.findAllUsers();
	}
	
}

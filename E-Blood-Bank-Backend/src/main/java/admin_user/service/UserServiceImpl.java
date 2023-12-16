package admin_user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import admin_user.dto.UserDto;
import admin_user.model.User;
import admin_user.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User save(UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAddress(userDto.getAddress());
		user.setContact(userDto.getContact());
		user.setBloodType(userDto.getBloodType());
		user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		//user.setPassword(userDto.getPassword());
		user.setRole("USER");
		user.setArea(userDto.getArea());
		return userRepository.save(user);
	}

}

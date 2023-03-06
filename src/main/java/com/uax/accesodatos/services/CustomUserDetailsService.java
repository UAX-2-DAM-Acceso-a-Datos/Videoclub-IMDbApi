package com.uax.accesodatos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Service;

import com.uax.accesodatos.dto.UsersDto;
import com.uax.accesodatos.repository.UsuarioRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
    private UsuarioRepository userRepository;
	
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailManager;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final UsersDto customer = userRepository.findByUsername(username);
        if (customer == null) {
            throw new UsernameNotFoundException(username);
        }
        //Formamos el objeto userdetails para spring
        UserDetails user = User.withUsername(username).password(customer.getPassword()).roles(customer.getRoles()).build();
        return user;
    }
    
    public boolean registerUserDB(UsersDto usuario) {
    	
    	try {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(usuario.getRoles()));

		String encodededPassword = bCryptPasswordEncoder.encode(usuario.getPassword());

		User user = new User(usuario.getUserName(), encodededPassword, false, false, false, false, authorities);

		jdbcUserDetailManager.createUser(user);
		
    	}catch(Exception e) {
    		e.getMessage();
    		return false;
    	}

		return true;
}
}
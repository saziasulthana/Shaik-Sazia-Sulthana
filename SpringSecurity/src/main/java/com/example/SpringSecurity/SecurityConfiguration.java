package com.example.SpringSecurity;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Bean
	@Override
	protected UserDetailsService userDetailsService() {
	  
    	List<UserDetails>users= new ArrayList<>();
	    
    	users.add(User.withDefaultPasswordEncoder().username("sazia").password("1234").roles("USER").build());
    	return new InMemoryUserDetailsManager(users);
	}
	
		
		
		
		
		
	



}

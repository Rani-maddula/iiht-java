package com.springboot.studentdemo;

import java.net.PasswordAuthentication;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("krishna")
		.password("{noop}krishna").roles("USER");
		auth.inMemoryAuthentication().withUser("root")
		.password("{noop}12345").roles("root");
		
		
				
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and()
		.authorizeRequests()
		.antMatchers(HttpMethod.GET,"/home").hasRole("USER").antMatchers(HttpMethod.GET, "/student").hasRole("root")
		.and()
		
		.csrf().disable()
		.formLogin().disable();
		
		
		
			}
	
	
	
	

}

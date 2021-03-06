package com.devpro.shop13.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/*
 * day la cau hinh cho starter-security
 */
@Configuration
@EnableWebSecurity
public class SecureConf extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests() // bat dau cau hinh security

		// tat cac users deu truy cap duoc
		.antMatchers("/css/**", "/js/**", "/img/**","/scss/**","/fonts/**","/assets/**","/dist/**","/upload/**")
		.permitAll()

		// chi co admin moi truy cap duoc
		.antMatchers("/admin1/**").hasAnyAuthority("ADMIN")
		.and()

		.formLogin().loginPage("/loginAdmin").loginProcessingUrl("/perform_login").defaultSuccessUrl("/home", true)
		.failureUrl("/login?login_error=true").permitAll()

		.and()

		.logout().logoutUrl("/logout").logoutSuccessUrl("/home").invalidateHttpSession(true)
		.deleteCookies("JSESSIONID").permitAll();
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder(4));
	}
	
}

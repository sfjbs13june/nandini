package com.nandini.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



@Configuration
public class HospitalConfig  extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/swagger-ui/index.html").hasAnyRole("DOCTOR", "PATIENT")
                .antMatchers(HttpMethod.GET, "/doctor/appointment").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.GET, "/patient/appointment").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.POST, "/doctor/save").hasAnyRole("DOCTOR")
                .antMatchers(HttpMethod.POST, "/patient/save").hasAnyRole("PATIENT")
                .antMatchers(HttpMethod.GET, "/viewprescrption").hasAnyRole("DOCTOR", "PATIENT")
                .antMatchers(HttpMethod.POST, "/saveprescrption").hasAnyRole("DOCTOR", "PATIENT").and().csrf().disable().headers()
                .frameOptions().disable();
    }
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
        auth.inMemoryAuthentication().withUser("doctor").password("{noop}pass123").roles("DOCTOR").and()
                .withUser("patient").password("{noop}password123").roles("PATIENT");
    }
}

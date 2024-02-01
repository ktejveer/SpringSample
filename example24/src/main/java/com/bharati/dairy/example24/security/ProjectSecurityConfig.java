package com.bharati.dairy.example24.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf)->csrf.disable())
                .authorizeHttpRequests((requests)-> requests
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/saveCustomer").permitAll()
                        .requestMatchers("/getAllCustomer").permitAll()

                );
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailService(){
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("root").password("12345").roles("user").build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin").password("54321").roles("admin").build();
        return new InMemoryUserDetailsManager(user, admin);
    }
}

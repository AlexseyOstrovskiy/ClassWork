package org.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Require authentication to every URL in your application
 *
 * Generate a login form for you
 *
 * Allow the user with the Username user and the Password password to authenticate with form based
 * authentication
 *
 * Allow the user to logout
 *
 * CSRF attack prevention
 *
 * Session Fixation protection
 *
 * Security Header integration
 *
 * HTTP Strict Transport Security for secure requests
 *
 * X-Content-Type-Options integration
 *
 * Cache Control (can be overridden later by your application to allow caching of your static
 * resources)
 *
 * X-XSS-Protection integration
 *
 * X-Frame-Options integration to help prevent Clickjacking
 *
 * Integrate with the following Servlet API methods
 *
 * HttpServletRequest#getRemoteUser()
 *
 * HttpServletRequest.html#getUserPrincipal()
 *
 * HttpServletRequest.html#isUserInRole(java.lang.String)
 *
 * HttpServletRequest.html#login(java.lang.String, java.lang.String)
 *
 * HttpServletRequest.html#logout()
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Bean
  public UserDetailsService userDetailsService() {

    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(
        User.withDefaultPasswordEncoder()
            .username("user").password("password").roles("USER")
            .build());
    return manager;
  }

  /**
   * Ensures that any request to our application requires the user to be authenticated
   *
   * Allows users to authenticate with form based login
   *
   * Allows users to authenticate with HTTP Basic authentication
   */
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
        .mvcMatchers("/pages/**").permitAll()
        .anyRequest().authenticated()
        .and()
        .formLogin()
        .and()
        .httpBasic();
  }
}

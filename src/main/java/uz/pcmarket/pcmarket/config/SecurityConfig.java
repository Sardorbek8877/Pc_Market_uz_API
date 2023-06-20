package uz.pcmarket.pcmarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((requests) -> requests
                       .requestMatchers(HttpMethod.GET, "/api/**").hasAnyRole("SUPER_ADMIN", "OPERATOR")
                       .requestMatchers( HttpMethod.POST,"/api/**").hasAnyRole("SUPER_ADMIN", "MODERATOR")
                       .requestMatchers( HttpMethod.PUT,"/api/**").hasAnyRole("SUPER_ADMIN", "MODERATOR")
                       .requestMatchers( "/api/**").hasRole("SUPER_ADMIN")
                       .anyRequest().authenticated()
                )
                .formLogin(withDefaults())
                .logout(LogoutConfigurer::permitAll)
                .httpBasic(withDefaults());
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails super_admin = User.builder()
                .username("super_admin")
                .password(passwordEncoder().encode("super_admin"))
                .roles("SUPER_ADMIN")
                .build();
        UserDetails moderator = User.builder()
                .username("moderator")
                .password(passwordEncoder().encode("moderator"))
                .roles("MODERATOR")
                .build();
        UserDetails operator = User.builder()
                .username("operator")
                .password(passwordEncoder().encode("operator"))
                .roles("OPERATOR")
                .build();
        return new InMemoryUserDetailsManager(super_admin, moderator, operator);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

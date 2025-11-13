//package ;
package com.codes;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CertificateConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Allow all paths
                .allowedOrigins("http://localhost:4200") // Allow requests from Angular app
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed HTTP methods
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true);
        
    }
}

//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import com.sun.net.httpserver.HttpServer;
//
//
//@Configuration
//public class CertificateConfig<SecurityFilterChain> implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:4200")
//                .allowedMethods("GET", "POST", "PUT", "DELETE")
//                .allowedHeaders("*")
//                .allowCredentials(true);
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpServer http) throws Exception {
//        ((Object) http).csrf().disable()
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers("/certificate", "/certificate/**").permitAll()
//                .anyRequest().authenticated()
//            )
//            .httpBasic();
//        return ((Object) http).build();
//    }
    
//}



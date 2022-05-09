//package com.agacorporation.demo.config;
//
//import com.agacorporation.demo.domain.Authority;
//import com.agacorporation.demo.domain.User;
//import com.agacorporation.demo.repository.AuthorityRepository;
//import com.agacorporation.demo.repository.UserRepository;
//
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.Arrays;
//import java.util.Date;
//import java.util.HashSet;
//
//@Configuration
//public class RepositoriesInitializer {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private AuthorityRepository authorityRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Bean
//    InitializingBean init() {
//
//        return () -> {
//
//
//
//            if (authorityRepository.findAll().isEmpty() == true) {
//                try {
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//    }
//}

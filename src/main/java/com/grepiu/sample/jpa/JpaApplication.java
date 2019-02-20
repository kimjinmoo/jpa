package com.grepiu.sample.jpa;

import com.grepiu.sample.jpa.process.sample.entity.Member;
import com.grepiu.sample.jpa.process.sample.repository.MemberRepository;
import java.util.Date;
import java.util.stream.LongStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpaApplication.class, args);
  }

  @Bean
  CommandLineRunner init(MemberRepository repository) {
    return args -> {
      repository.deleteAll();
      repository.save(new Member(0l,"tester","tester@mail.com",new Date(), null));
    };
  }

}

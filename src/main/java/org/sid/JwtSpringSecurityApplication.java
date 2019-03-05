package org.sid;

import java.util.stream.Stream;

import org.sid.dao.TaskRepository;
import org.sid.entities.AppRole;
import org.sid.entities.AppUser;
import org.sid.entities.Task;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtSpringSecurityApplication implements CommandLineRunner {
	
	@Autowired
	AccountService accountService;
	@Autowired
	TaskRepository taskRepository;
	public static void main(String[] args) {
		SpringApplication.run(JwtSpringSecurityApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
		//accountService.saveUser(new AppUser("admin","1234",null));
		/*accountService.saveUser(new AppUser("user","1234",null));
		accountService.saverole(new AppRole("ADMIN"));
		accountService.saverole(new AppRole("USER"));*/
		/*accountService.addRoleToUser("admin", "ADMIN");
		accountService.addRoleToUser("admin", "USER");
		accountService.addRoleToUser("user", "USER");*/
		/*Stream.of( "T1","T2","T3").forEach(t->{
			taskRepository.save(new Task(t));
		});*/
		taskRepository.findAll().forEach(t->{
			System.out.println(t.getTaskName());
		});
	}

}

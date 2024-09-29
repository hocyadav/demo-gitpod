package io.hari.demo_gitpod;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitpodApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGitpodApplication.class, args);
	}

	// use spring application runner class to run methods on startup
	 @PostConstruct
	 public void init() {
	 	System.out.println("DemoGitpodApplication started");
	 }
}

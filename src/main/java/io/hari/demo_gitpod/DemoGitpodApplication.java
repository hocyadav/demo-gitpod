package io.hari.demo_gitpod;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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


@RestController
@RequestMapping("/api/v1/demo")
class DemoRestController {

	// sample get method
	@GetMapping("/hello")
	public Map<String, Object> hello() {
		return Map.of("key1", "hello");
	}
}

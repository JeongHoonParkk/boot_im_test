package egovframework.example.boot.web;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ComponentScan(basePackages = "egovframework")
@Slf4j
public class EgovBootApplication {
	public static void main(String[] args) {
		log.info("어플리케이션 시작");
		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.setLogStartupInfo(false);
		springApplication.run(args);
	}

}

package in.practice.ajinkya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertiesFileExApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(PropertiesFileExApplication.class, args);
		Object ob = ac.getBean("pob");
		System.out.println(ob);
	}
}

package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExampleApplication.class, args);
	}

}

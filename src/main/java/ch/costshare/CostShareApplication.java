package ch.costshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CostShareApplication {
	
	public static final String CORS_ORIGINS = "http://localhost:8081/costshare";
//	@Value("${db.schema}")
//	private String dbSchema;
	
	public static void main(String[] args) {
		SpringApplication.run(CostShareApplication.class, args);
	}
	
//	@Bean
//	public UserRepository userRepository(){
//		return new UserRepository(dbSchema+".User");
//	}
}

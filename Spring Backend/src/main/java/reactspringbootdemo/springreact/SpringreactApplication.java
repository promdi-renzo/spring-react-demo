package reactspringbootdemo.springreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactspringbootdemo.springreact.model.User;
import reactspringbootdemo.springreact.repository.UserRepository;

@SpringBootApplication
public class SpringreactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringreactApplication.class, args);
	}

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new User("Renzo", "Cabarios", "sample@gmail.com"));
		repository.save(new User("Mairene", "Cabarios", "sample@gmail.com"));
		repository.save(new User("Amos", "Cabarios", "sample@gmail.com"));
	}
}

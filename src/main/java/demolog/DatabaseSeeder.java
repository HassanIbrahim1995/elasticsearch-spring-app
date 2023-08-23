package demolog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    @Override
    public void run(String... args) throws Exception {
        personService.save(new Person("Alice", "alice@email.com"));
        personService.save(new Person("Bob", "bob@email.com"));
        personService.save(new Person("Charlie", "charlie@email.com"));
        personService.save(new Person("David", "david@email.com"));
    }
}

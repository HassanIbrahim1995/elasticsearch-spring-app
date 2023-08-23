package demolog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private PersonService personService;
    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    public PersonController(PersonService personService) {
        logger.atInfo().log("Heloooooo From the constructor and fuck you.");
        this.personService = personService;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        logger.info("Creating a new person with details: {}", person);
        Person result = personService.save(person);
        logger.info("Person created with ID: {}", result.getId());
        return result;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        logger.info("Fetching all persons");
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        logger.info("Fetching person with ID: {}", id);
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        logger.info("Updating person with ID: {} with details: {}", id, updatedPerson);
        return personService.update(id, updatedPerson);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        logger.info("Deleting person with ID: {}", id);
        personService.delete(id);
    }

}

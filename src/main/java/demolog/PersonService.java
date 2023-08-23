package demolog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
        // Could also throw an exception if not found,
        // depending on your requirements
    }

    public Person update(Long id, Person updatedPerson) {
        if (personRepository.existsById(id)) {
            updatedPerson.setId(id);
            return personRepository.save(updatedPerson);
        }
        // Optionally handle not found scenario here
        // (e.g., throw exception or return null)
        return null;
    }

    public void delete(Long id) {
        personRepository.deleteById(id);
    }
}

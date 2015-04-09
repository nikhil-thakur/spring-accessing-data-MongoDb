package hello;

import java.util.List;

import org.springframework.data.mongodb.*;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomeRepository extends MongoRepository<Customer, String> {
	public Customer findByFirstName(String firstName);

	public List<Customer> findByLastName(String lastName);
}

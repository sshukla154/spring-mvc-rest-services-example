package frontier.learning.brewery.assignment;

import java.util.UUID;

public interface CustomerService {

	CustomerDTO getCustomerById(UUID customerId);

	CustomerDTO createCustomer(UUID customerId, CustomerDTO customerDTO);

	void updateCustomer(UUID customerId, CustomerDTO customerDTO);

	void deleteCustomerById(UUID customerId);

}

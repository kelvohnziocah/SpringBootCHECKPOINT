package CheckpointSpringBoot.CustomerService;

import CheckpointSpringBoot.Entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer createCustomer(Customer customer);
    Customer getCustomerById(Long Id);
    Customer updateCustomerById(Long Id);
    boolean deleteCustomer(Long Id);
}

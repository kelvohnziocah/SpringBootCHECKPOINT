package CheckpointSpringBoot.CustomerService;

import CheckpointSpringBoot.CheckpointRepository.CustomerRepository;
import CheckpointSpringBoot.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustmerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List <Customer> getAllCustomers(){
        return customerRepository.findAll();

    }
    @Override
    Customer createCustomer(Customer customer){
        return customerRepository.save(customer);

    }
    @Override
    Customer getCustomerById(Long Id){
        if(customerRepository.existsById(Id)){
            return
        }

    }
    @Override
    Customer updateCustomerById(Long Id){

    }
    @Override
    boolean deleteCustomer(Long Id){

    }
}

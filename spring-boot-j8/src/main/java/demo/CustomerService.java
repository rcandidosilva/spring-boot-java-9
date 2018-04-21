package demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    List<Customer> customers = Arrays.asList(
            new Customer(1, "Rodrigo", "Silva", "rcandidosilva@gmail.com"),
            new Customer(2, "Luiz", "Avila (RockStar)", "luiz@email.com"),
            new Customer(2, "Vinicius", "Nunes", "vinicius@email.com"),
            new Customer(2, "Rafael", "Benevides", "rafael@email.com"));

    public List<Customer> getCustomers() {
        return customers;
    }

    public Optional<Customer> getCustomer(Integer id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

}

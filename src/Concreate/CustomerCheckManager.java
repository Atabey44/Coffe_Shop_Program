package Concreate;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkİfRealPerson(Customer customer) {
        return true;
    }
}

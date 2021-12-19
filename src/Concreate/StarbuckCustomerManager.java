package Concreate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (this.customerCheckService.checkİfRealPerson(customer)){
          System.out.print("Starbuckta ");  super.Save(customer);
        } else{
            System.out.println("Kimlik Paylaşım Sistemi Bilgileri Doğrulamadı !!! ");
        }

    }
}

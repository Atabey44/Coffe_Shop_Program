import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concreate.NeroCustomerManager;
import Concreate.StarbuckCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager starbucksCustomerManager= new StarbuckCustomerManager(new MernisServiceAdapter());
        BaseCustomerManager neroCustomerManager= new NeroCustomerManager();

        Customer kullanici1= new Customer(1,"Gazi", "Atabey", LocalDate.of(1983,1,1),"11111111111");

        starbucksCustomerManager.Save(kullanici1);
        neroCustomerManager.Save(kullanici1);

    }
}

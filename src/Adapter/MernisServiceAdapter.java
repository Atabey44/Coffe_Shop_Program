package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.PJKKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    PJKKPSPublicSoap pjkkpsPublicSoap = new PJKKPSPublicSoap();

    @Override
    public boolean checkİfRealPerson(Customer customer) {
        try {
            return pjkkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}


package Adapters;

import Abstract.CustomerCheckService;
import Entities.IndividualCustomer;
import mernisReference.HOEKPSPublicSoap;

public class MernisServiceAdapters implements CustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(IndividualCustomer individualCustomer) throws Exception {
        HOEKPSPublicSoap client = new HOEKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(individualCustomer.getNationalityId()),individualCustomer.getFirstName().toUpperCase(),individualCustomer.getLastName().toUpperCase(),individualCustomer.getDateOfBirth());
    }
}

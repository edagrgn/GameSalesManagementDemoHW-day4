package Abstract;


import Entities.IndividualCustomer;

public interface CustomerCheckService {
    boolean CheckIfRealPerson(IndividualCustomer individualCustomer) throws Exception;
}

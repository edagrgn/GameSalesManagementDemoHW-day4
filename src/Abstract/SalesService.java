package Abstract;

import Entities.Customer;
import Entities.IndividualCustomer;

public interface SalesService {
    void add(IndividualCustomer individualCustomer) throws Exception;
}

package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;
import Entities.Game;
import Entities.IndividualCustomer;

public class IndividualCustomerManager extends BaseCustomerManager {


    private CustomerCheckService _customerCheckService;

    public IndividualCustomerManager(CustomerCheckService customerCheckService){
        this._customerCheckService = customerCheckService;

    }

    public void save(IndividualCustomer individualCustomer) throws Exception {
        if(_customerCheckService.CheckIfRealPerson(individualCustomer)){
            super.save(individualCustomer);
        }
        else{
            System.out.println("Not a valid person! Cannot be saved");
        }
    }

    public void delete(IndividualCustomer individualCustomer){
        System.out.println("Your registration has been deleted.Bye Bye!!");
    }



}

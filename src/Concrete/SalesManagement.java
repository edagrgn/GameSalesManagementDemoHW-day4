package Concrete;

import Abstract.CustomerCheckService;
import Abstract.SalesService;
import Entities.Customer;
import Entities.IndividualCustomer;

public class SalesManagement implements SalesService {


    private CustomerCheckService customerCheckService;

    public SalesManagement(CustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(IndividualCustomer individualCustomer) throws Exception {
        if(customerCheckService.CheckIfRealPerson(individualCustomer)){
            System.out.println("The Game has been added to your account for : "+individualCustomer.getFirstName()+ " " +individualCustomer.getLastName());
        }
        else{
            System.out.println("Your account could not be found! Please login again");
        }

    }






}

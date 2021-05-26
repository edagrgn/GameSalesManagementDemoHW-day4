package Abstract;
import Entities.Customer;
import Entities.Game;

public abstract class BaseCustomerManager implements CustomerService  {

    public final void save(Customer customer) {
        System.out.println("Saved login info successfully : "+customer.getId());

    }
    public void passwordVerification(Customer customer){
        if(customer.getPassword() == customer.getPassword()){//klavyeden veri alınınca değişir kod
            System.out.println("Hi!Welcome");
        }
        else{
            System.out.println("Wrong password!You cannot not login.");
        }

    }

    public void update(Game game){
        System.out.println("Updated successfully: "+ game.getGameName());
    }


}
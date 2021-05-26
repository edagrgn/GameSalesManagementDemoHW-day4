package Abstract;

import Entities.Customer;
import Entities.Game;

public interface CustomerService {

    void save(Customer customer);
    void passwordVerification(Customer customer);
    void update(Game game);
}

package EStore;

import EStore.Admin;
import EStore.Customer;
import EStore.EStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EStoreTest {
    @Test
    public void EStoreCanBeCreated() {
        EStore estore = new EStore();
    }
    @Test
    public void UserCanBeCreated(){
        User user = new User();
    }
    public void CustomerCanBeCreated(){
        Customer customer = new Customer();
    }
    public void SellersCanBeCreated(){
        Seller seller = new Seller();
    }
    public void AdminCanBeCreated(){
        Admin admin = new Admin();
    }
}

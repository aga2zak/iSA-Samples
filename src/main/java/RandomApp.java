import dataModels.Address;
import dataModels.RegisteredUser;
import utils.*;

public class RandomApp {

    public static void main(String[] args) {


//        String staticFirstaname = Sample5.generateFirstname();
//        String staticLastname = Sample5.generateLastname();
//        System.out.println(staticFirstaname + " " + staticLastname);
//
//        String prettyFirstaname = Sample6.generateFirstname();
//        String prettyLastname = Sample6.generateLastname();
//        System.out.println(prettyFirstaname + " " + prettyLastname);

        Address address = new Address(true);
        RegisteredUser user = new RegisteredUser();

        System.out.println(address.getStreetAddress() + " " + address.getCity() + " " + address.getCountry() + " " + address.getState() + " " + address.getPostalCode());
        System.out.println(user.getFirstname() + " " + user.getLastname() + " " + user.getEmail());
    }
}

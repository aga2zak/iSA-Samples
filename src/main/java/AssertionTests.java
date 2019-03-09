import dataModels.Address;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AssertionTests {
    private Address address1;
    private Address address2;
    private Address address3;
    @Before
    public void createAddresses(){
        address1 = new Address(false);
        address2 = new Address(false);
        address3 = address1;
    }

    @Test //Musi byc inaczej assert jest niezrozumialy
    public void IsTrue(){
        Assert.assertTrue("State is not of type String", address1.getState() instanceof String);
    }

    @Test
    public void Equals(){
        Assert.assertEquals("cities are not equal", address1.getCity(), address1.getCity());
    }

    @Test
    public void NotTheSame(){
        Assert.assertNotSame("addresses refer to the same instance", address1, address2);
    }

    @Test
    public void TheSame(){
        Assert.assertSame("addresses do not refer to the same instance", address1, address3);
    }

    @Test
    public void IsNotNull(){
        Assert.assertNotNull("addresses is null", address2);
    }




}

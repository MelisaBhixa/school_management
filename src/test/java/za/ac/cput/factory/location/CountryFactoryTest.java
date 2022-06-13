/**
 * Country Factory Test
 * CountryFactoryy.java
 * Thina Mbiza 217217095
 * 13 June 202
 */

package za.ac.cput.factory.location;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.location.Country;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class CountryFactoryTest {

    @Test
    void createCountry() {
        Country country = CountryFactory.createCountry("244", "Angola");
        System.out.println(country);
    }

    @Test
    //Group Position equality test
    public void name(){
        Country country = CountryFactory.createCountry("001", "United States");
        System.out.println("Name: " + country.getName());
        assertEquals(4,country.getName());
    }

    @Test
    public void testForIdentity() {
        assertSame("United States", "Angola");
    }

    @Test
    @org.junit.jupiter.api.Timeout(value = 1000, unit = TimeUnit.NANOSECONDS)
    public void testTimeout() {
        System.out.println("Setting the Timeout");
    }

    @Disabled("Test Disabled")
    @Test
    public void testDisable(){
        Country country = CountryFactory.createCountry("001", "United States");
        assertSame("United States",country.getId());
        org.junit.jupiter.api.Assertions.fail("This test should fail. Program still being developed");
    }

}

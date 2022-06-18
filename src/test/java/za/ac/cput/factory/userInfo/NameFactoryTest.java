/**
 NameFactoryTest.java
 Factory test for the NameFactory
 Author: Legiste Ndabashinze (217046207)
 Date: 15 June 2022
 */
package za.ac.cput.factory.userInfo;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.userInfo.Name;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class NameFactoryTest {

    @Test
    public void successTest(){
        Name name = NameFactory.newName(
                "Legiste","Middle Name","Ndabashinze"
        );
        System.out.println(name);
        assertNotNull(name);
    }

    @Test
    public void failedEmptyFirstName(){ // Empty firstName provided... TEST IS SUPPOSED TO FAIL
        Name name = NameFactory.newName(
                "","Middle Name","Ndabashinze"
        );
        System.out.println(name);
        assertNotNull(name);

    }

}
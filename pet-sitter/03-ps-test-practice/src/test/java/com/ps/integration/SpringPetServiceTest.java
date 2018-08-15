package com.ps.integration;

import com.ps.base.UserType;
import com.ps.ents.Pet;
import com.ps.ents.User;
import com.ps.services.PetService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

import static com.ps.util.TestObjectsBuilder.buildUser;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

//TODO 18. Complete the test class definition in order for all the test to pass.
public class SpringPetServiceTest {

    private static final Long PET_ID = 1L;
    private static final User owner = buildUser("test@gmail.com", "a!2#tre", UserType.OWNER);

    @Autowired
    private PetService simplePetService;

    //positive test, we know that a Pet with ID=1 exists
    @Test
    public void findByIdPositive() {
        Pet pet = simplePetService.findById(PET_ID);
        assertNotNull(pet);
    }

    //positive test, we know that pets for this owner exist and how many
    @Test
    public void findByOwnerPositive() {
        Set<Pet> result = simplePetService.findAllByOwner(owner);
        assertEquals(result.size(), 2);
    }

}

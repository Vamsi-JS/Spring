package com.ps.services;

import com.ps.base.PetType;
import com.ps.ents.Pet;
import com.ps.ents.User;

import java.util.Set;

public interface PetService extends AbstractService<Pet> {

    Pet createPet(User user, String name, int age, PetType petType, String rfid);

    Set<Pet> findAllByOwner(User user);

    Pet findByOwner(User user, String name);
}

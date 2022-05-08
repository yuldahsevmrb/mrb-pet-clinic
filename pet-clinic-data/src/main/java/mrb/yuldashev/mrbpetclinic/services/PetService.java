package mrb.yuldashev.mrbpetclinic.services;


import mrb.yuldashev.mrbpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

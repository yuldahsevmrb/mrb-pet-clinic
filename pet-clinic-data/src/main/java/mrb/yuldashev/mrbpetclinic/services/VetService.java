package mrb.yuldashev.mrbpetclinic.services;

import mrb.yuldashev.mrbpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

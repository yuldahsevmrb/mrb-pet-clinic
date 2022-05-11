package mrb.yuldashev.mrbpetclinic.services;

import mrb.yuldashev.mrbpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}

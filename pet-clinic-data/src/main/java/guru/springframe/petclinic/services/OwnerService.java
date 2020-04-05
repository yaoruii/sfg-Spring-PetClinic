package guru.springframe.petclinic.services;

import guru.springframe.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String Lastname);
}

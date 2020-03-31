package guru.springframe.petclinic.services;

import guru.springframe.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String Lastname);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}

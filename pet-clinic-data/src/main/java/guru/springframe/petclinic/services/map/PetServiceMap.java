package guru.springframe.petclinic.services.map;

import guru.springframe.petclinic.model.Pet;
import guru.springframe.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return (Pet) super.findById(id);
    }

    @Override
    public Pet save(Pet obj) {
        return (Pet) super.save(obj.getId(),obj);
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


}

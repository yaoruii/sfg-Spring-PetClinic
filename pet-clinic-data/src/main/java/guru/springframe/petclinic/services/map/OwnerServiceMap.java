package guru.springframe.petclinic.services.map;

import guru.springframe.petclinic.model.Owner;
import guru.springframe.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService <Owner,Long>{
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return (Owner) super.findById(id);
    }

    @Override
    public Owner save(Owner obj) {
        return (Owner) super.save(obj.getId(),obj);
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

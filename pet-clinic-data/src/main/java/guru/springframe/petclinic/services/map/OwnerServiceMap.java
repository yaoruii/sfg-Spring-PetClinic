package guru.springframe.petclinic.services.map;

import guru.springframe.petclinic.model.Owner;
import guru.springframe.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
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
        return (Owner) super.save(obj);
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String Lastname) {
        return null;
    }
}

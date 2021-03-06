package guru.springframe.petclinic.services.map;

import guru.springframe.petclinic.model.Vet;
import guru.springframe.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return (Vet) super.findById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return (Vet) super.save(obj);
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

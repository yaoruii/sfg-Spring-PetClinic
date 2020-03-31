package guru.springframe.petclinic.services;

import java.util.Set;
//模仿crudrepository.class
public interface CrudService <T, ID>{
    Set<T> findAll();
    T findById(ID id);
    T save(T obj);
    void delete(T obj);
    void deleteById(ID id);

}

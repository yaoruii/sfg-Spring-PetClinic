package guru.springframe.petclinic.services.map;

import guru.springframe.petclinic.model.BaseEntity;

import java.util.*;
//T extends BaseEntity使得我们对T有一点基本的假设：比如有id这个属性，可以getid()。
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long,T> map = new HashMap<>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }
    T findById(ID id){
        return map.get(id);
    }
    T save(T t){
        if(t!=null){
            if(t.getId() == null){
                t.setId(getNextId());
            }
            map.put(t.getId(),t);
        }else{
            throw new RuntimeException("object should not be null");
        }
        return t;
    }
    void delete(T t){
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
    void deleteById(ID id){
        map.remove(id);
    }

    private Long getNextId(){
        Long nextID = null;
        try{
            nextID = Collections.max(map.keySet())+1;//得到的keyset是long型的数据
        }catch(NoSuchElementException e){
            nextID = 1L;
        }
        return nextID;
    }



}

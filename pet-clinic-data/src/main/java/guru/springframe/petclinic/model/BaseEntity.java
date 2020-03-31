package guru.springframe.petclinic.model;

import java.io.Serializable;

//this is base entity
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

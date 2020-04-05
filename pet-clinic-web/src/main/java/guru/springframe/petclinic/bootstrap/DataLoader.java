package guru.springframe.petclinic.bootstrap;

import guru.springframe.petclinic.model.Owner;
import guru.springframe.petclinic.model.Vet;
import guru.springframe.petclinic.services.OwnerService;
import guru.springframe.petclinic.services.VetService;
import guru.springframe.petclinic.services.map.OwnerServiceMap;
import guru.springframe.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    //private final PetService petService;
    private final VetService vetService;

    public DataLoader() {
        //petService = new PetServiceMap();//具体实现是用map型的service实现的
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);//long
        owner1.setFirstName("rui");
        owner1.setLastName("yao");
        //调用ownerService服务器，将其保存在服务器的map中
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);//long
        owner1.setFirstName("yan");
        owner1.setLastName("zhao");
        //调用ownerService服务器，将其保存在服务器的map中
        ownerService.save(owner2);

        System.out.print("loaded owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);//long
        vet1.setFirstName("Diane");
        vet1.setLastName("Locked");
        //调用ownerService服务器，将其保存在服务器的map中
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);//long
        vet2.setFirstName("sam");
        vet2.setLastName("Axe");
        //调用ownerService服务器，将其保存在服务器的map中
        vetService.save(vet2);

        System.out.print("loaded vets....");




    }
}

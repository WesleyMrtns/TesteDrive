package com.tech4pet.petshop.repository;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.tech4pet.petshop.model.Pet;

public interface PetRepository extends MongoRepository<Pet, String>{

    Optional<Pet> obterPetPorId(String id);

}

package geekdisplaced.learning.sfgpetclinic.services.sdjpa;

import geekdisplaced.learning.sfgpetclinic.model.Owner;
import geekdisplaced.learning.sfgpetclinic.repositories.OwnerRepository;
import geekdisplaced.learning.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("sdjpa")
public class SdjpaOwnerService extends SdjpaAbstractService implements OwnerService {

    private final OwnerRepository ownerRepository;

    public SdjpaOwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {

        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);

        return owners;
    }

    @Override
    public Owner findById(Long id) {

        return ownerRepository.findById(id).orElse();
    }

    @Override
    public Owner save(Owner object) {

        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {

        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {

        ownerRepository.deleteById(id);
    }

}

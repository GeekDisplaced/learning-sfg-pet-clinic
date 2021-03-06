package geekdisplaced.learning.sfgpetclinic.data.services.map;

import geekdisplaced.learning.sfgpetclinic.data.model.Specialty;
import geekdisplaced.learning.sfgpetclinic.data.model.Vet;
import geekdisplaced.learning.sfgpetclinic.data.services.SpecialtyService;
import geekdisplaced.learning.sfgpetclinic.data.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class MapVetService extends MapAbstractService<Vet, Long> implements VetService {

    SpecialtyService specialtyService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object != null) {

            // if there are Specialties relationships must be confirmed...
            if (object.getSpecialties().size() > 0) {

                object.getSpecialties().forEach( specialty -> {

                    // check Specialty relationship / id sync
                    if (specialty.getId() == null) {
                        Specialty savedSpecialty = specialtyService.save(specialty);
                        specialty.setId(savedSpecialty.getId());
                    }

                });
            }

            return super.save(object);
        } else {

            return null;
        }

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}

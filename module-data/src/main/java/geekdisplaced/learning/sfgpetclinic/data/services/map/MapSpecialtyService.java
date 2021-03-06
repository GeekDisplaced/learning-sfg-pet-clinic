package geekdisplaced.learning.sfgpetclinic.data.services.map;

import geekdisplaced.learning.sfgpetclinic.data.model.Specialty;
import geekdisplaced.learning.sfgpetclinic.data.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class MapSpecialtyService extends MapAbstractService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long Id) {
        return super.findById(Id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long Id) {
        super.deleteById(Id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }
}

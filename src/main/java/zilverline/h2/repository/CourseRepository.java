package zilverline.h2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zilverline.h2.domain.Course;

import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

    Optional<Course> findByToken(String token);

}

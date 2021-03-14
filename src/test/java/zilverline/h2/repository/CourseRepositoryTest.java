package zilverline.h2.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zilverline.h2.domain.Course;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @BeforeEach
    void setUp() {
        courseRepository.deleteAll();
        courseRepository.save(new Course("test", "token"));
    }

    @Test
    void findByToken() {
        Optional<Course> courseOptional = courseRepository.findByToken("token");
        assertEquals("token", courseOptional.get().getToken());
    }
}
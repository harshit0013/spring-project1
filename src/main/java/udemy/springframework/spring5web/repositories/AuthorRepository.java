package udemy.springframework.spring5web.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.spring5web.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

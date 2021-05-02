package udemy.springframework.spring5web.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.spring5web.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

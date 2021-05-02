package udemy.springframework.spring5web.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.springframework.spring5web.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

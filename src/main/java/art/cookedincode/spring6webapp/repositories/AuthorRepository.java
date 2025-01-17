package art.cookedincode.spring6webapp.repositories;

import art.cookedincode.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

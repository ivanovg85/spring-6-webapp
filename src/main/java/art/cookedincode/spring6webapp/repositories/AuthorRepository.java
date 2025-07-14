package art.cookedincode.spring6webapp.repositories;

import art.cookedincode.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Georgi Ivanov
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {}

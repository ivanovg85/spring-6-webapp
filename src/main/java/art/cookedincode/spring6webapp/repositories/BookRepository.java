package art.cookedincode.spring6webapp.repositories;

import art.cookedincode.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/** Created by Georgi Ivanov */
public interface BookRepository extends CrudRepository<Book, Long> {}

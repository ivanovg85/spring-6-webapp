package art.cookedincode.spring6webapp.repositories;

import art.cookedincode.spring6webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

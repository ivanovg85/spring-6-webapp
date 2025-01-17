package art.cookedincode.spring6webapp.services;

import art.cookedincode.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}

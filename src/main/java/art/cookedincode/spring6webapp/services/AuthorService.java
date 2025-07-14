package art.cookedincode.spring6webapp.services;

import art.cookedincode.spring6webapp.domain.Author;

/** Created by Georgi Ivanov */
public interface AuthorService {

    Iterable<Author> findAll();
}

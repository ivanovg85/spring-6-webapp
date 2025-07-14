package art.cookedincode.spring6webapp.services;

import art.cookedincode.spring6webapp.domain.Book;

/** Created by Georgi Ivanov */
public interface BookService {

    Iterable<Book> findAll();
}

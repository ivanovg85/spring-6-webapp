package art.cookedincode.spring6webapp.services;

import art.cookedincode.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}

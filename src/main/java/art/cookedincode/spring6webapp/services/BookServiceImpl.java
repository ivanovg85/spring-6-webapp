package art.cookedincode.spring6webapp.services;

import art.cookedincode.spring6webapp.domain.Book;
import art.cookedincode.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

/** Created by Georgi Ivanov */
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}

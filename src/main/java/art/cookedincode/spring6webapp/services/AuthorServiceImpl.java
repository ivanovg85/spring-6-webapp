package art.cookedincode.spring6webapp.services;

import art.cookedincode.spring6webapp.domain.Author;
import art.cookedincode.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

/** Created by Georgi Ivanov */
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}

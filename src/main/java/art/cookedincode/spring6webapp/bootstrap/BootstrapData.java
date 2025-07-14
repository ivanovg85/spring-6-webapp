package art.cookedincode.spring6webapp.bootstrap;

import art.cookedincode.spring6webapp.domain.Author;
import art.cookedincode.spring6webapp.domain.Book;
import art.cookedincode.spring6webapp.domain.Publisher;
import art.cookedincode.spring6webapp.repositories.AuthorRepository;
import art.cookedincode.spring6webapp.repositories.BookRepository;
import art.cookedincode.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/** Created by Georgi Ivanov */
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Publisher addison = new Publisher();
        addison.setPublisherName("Addison-Wesley Professional");
        addison.setAddress("75 Arlington St");
        addison.setCity("Boston");
        addison.setState("MA");
        addison.setZip("02116");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);
        Publisher addisonSaved = publisherRepository.save(addison);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");

        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);

        dddSaved.setPublisher(addisonSaved);
        noEJBSaved.setPublisher(addisonSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}

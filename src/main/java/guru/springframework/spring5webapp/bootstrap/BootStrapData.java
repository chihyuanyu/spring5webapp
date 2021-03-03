package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Yu on 03/01/2021.
 * to initialize data in database
 * 啟動初始資料
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher manning_publisher = new Publisher();
        manning_publisher.setName("Manning Publications Co.");
        manning_publisher.setAddress("20 Baldwin Road, PO Box 761 Shelter Island, NY");

        Publisher packt_publisher = new Publisher();
        packt_publisher.setName("Packt Publishing");
        packt_publisher.setAddress("Birmingham, UK");

        Publisher ch_publisher = new Publisher();
        ch_publisher.setName("深智數位");
        ch_publisher.setAddress("台北市信義區基隆路");

        publisherRepository.save(manning_publisher);
        publisherRepository.save(packt_publisher);
        publisherRepository.save(ch_publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author author1 = new Author("Craig", "Walls");
        Book book1 = new Book("Spring Boot in Action", "1617292540", manning_publisher);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Greg L.", "Turnquist");
        Book book2 = new Book("Learning Spring Boot 2.0", "1786463784", packt_publisher);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);

        Author author3 = new Author("中華", "龍");
        Book book3 = new Book("極速開發 Java 大型系統:Spring Boot 又輕又快又好學", "9865501643", ch_publisher);
        author3.getBooks().add(book3);
        book3.getAuthors().add(author3);

        authorRepository.save(author3);
        bookRepository.save(book3);

        System.out.println("啟動載入資料");
        System.out.println("書本數: " + bookRepository.count());
    }
}

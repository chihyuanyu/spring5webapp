package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Yu on 03/01/2021.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

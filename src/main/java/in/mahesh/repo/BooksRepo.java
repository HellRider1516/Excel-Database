package in.mahesh.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mahesh.entity.Books;

public interface BooksRepo extends JpaRepository<Books, Serializable> {

}

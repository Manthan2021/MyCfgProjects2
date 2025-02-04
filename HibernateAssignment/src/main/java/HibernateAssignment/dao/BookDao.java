package HibernateAssignment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import HibernateAssignment.model.Book;

@Component
public class BookDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Book book) {

		this.hibernateTemplate.save(book);

	}

	// get all products
	public List<Book> getBooks() {
		List<Book> books = this.hibernateTemplate.loadAll(Book.class);
		return books;
	}

	// delete the single product
	@Transactional
	public void deleteBook(int bid) {
		Book b = this.hibernateTemplate.load(Book.class,bid);
		this.hibernateTemplate.delete(b);
	}

	// get the single product
	public Book getBook(int bid) {
		return this.hibernateTemplate.get(Book.class, bid);
	}


}

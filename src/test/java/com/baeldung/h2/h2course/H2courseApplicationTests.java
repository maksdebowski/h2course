package com.baeldung.h2.h2course;

import com.baeldung.h2.h2course.models.Book;
import com.baeldung.h2.h2course.services.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class H2courseApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	void contextLoads() {
	}

	@Test
	public void whenApplicationStarts_thenHibernateCreatesInitialRecords(){
		List<Book> books = bookService.list();

		assertEquals(books.size(), 0);
	}

}

package com.henriquemoreira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import com.henriquemoreira.domain.Book;
import com.henriquemoreira.domain.Library;
import com.henriquemoreira.domain.Post;
import com.henriquemoreira.domain.PostComment;
import com.henriquemoreira.domain.TodoList;
import com.henriquemoreira.domain.TodoListItem;
import com.henriquemoreira.repository.BookRepository;
import com.henriquemoreira.repository.LibraryRepository;
import com.henriquemoreira.repository.PostCommentRepository;
import com.henriquemoreira.repository.PostRepository;
import com.henriquemoreira.repository.TodoListItemRepository;
import com.henriquemoreira.repository.TodoListRepository;

//Acredito ser uma relação unidirecional

@SpringBootApplication
public class ExerciciosRelacionamentosApplication implements CommandLineRunner{
	
	@Autowired
	TodoListRepository todoListRepo;
	
	@Autowired
	TodoListItemRepository todoListItemRepo;
	
	@Autowired
	LibraryRepository libraryRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	PostCommentRepository commentRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosRelacionamentosApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		
		//TodoList
//	TodoList td1 = new TodoList(null, "A fazer 1");
	
//	TodoListItem tdli1 = new TodoListItem(null, "Compras");
//	TodoListItem tdli2 = new TodoListItem(null, "Leituras");
//	TodoListItem tdli3 = new TodoListItem(null, "Exercicio");
	
//	tdli1.setList(td1);
//	tdli2.setList(td1);
//	tdli3.setList(td1);
	
//	todoListRepo.save(td1);
	
//	todoListItemRepo.save(tdli1);
//	todoListItemRepo.save(tdli2);
//	todoListItemRepo.save(tdli3);
		
		
		
	// Biblioteca
//		Library lib1 = new Library(null, "Livraria da esquina");
		
//		Book book1 = new Book(null, "Narnia", lib1);
//		Book book2 = new Book(null, "Harry Potter", lib1);
		
//		libraryRepo.save(lib1);
		
//		bookRepo.save(book1);
//		bookRepo.save(book2);
		
		
		// Post
		Post post1 = new Post(null, "Post de Curiosidades");
		
		PostComment comment1 = new PostComment(null, post1, "Que legal essas curiosidades");
		PostComment comment2 = new PostComment(null, post1, "Que chato");
		PostComment comment3 = new PostComment(null, post1, "Bacana!");
		
		postRepo.save(post1);
		
		commentRepo.save(comment1);
		commentRepo.save(comment2);
		commentRepo.save(comment3);
			
	}

}
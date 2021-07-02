package com.example.demo;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@Controller
public class BooksController {
	private final BookService bookService;
	
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value="/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "/index.jsp";
	}
	
	@RequestMapping("/{index}")
	public String findBookByIndex(Model model, @PathVariable("index") Long index) {
		Book book = bookService.findById(index);
		model.addAttribute("book", book);
		return "/showBook.jsp";
	}
	
	@RequestMapping("/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "/new.jsp";
	}
	
    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findById(id);
        if (book != null){
            model.addAttribute("book", book);
            return "editBook.jsp";
        }else{
            return "redirect:/";
        }
    }
    
    @PostMapping("/edit/{id}")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        }else{
            List<Book> books = bookService.allBooks();
            bookService.updateBook(id, book, books);
            return "redirect:/";
        }
    }

    @RequestMapping(value="/delete/{id}")
    public String destroyBook(@PathVariable("id") Long id, @ModelAttribute("book") Book book) {
        List<Book> books = bookService.allBooks();
    	bookService.destroyBook(id, book, books);
        return "redirect:/";
    }
}
package tr.com.obss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tr.com.obss.model.Books;
import tr.com.obss.service.BooksService;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/books")
public class BooksRestController {

    @Autowired
    private BooksService booksService;

    @GetMapping
    public List<Books> getBooks() {
        return booksService.getAllBook();
    }

    @GetMapping("/{bookID}")
    public Books getBook(@PathVariable int bookID) {
        return booksService.getBook(bookID);
    }

    @PostMapping
    public Books saveBook(@RequestBody Books books) { return booksService.addBook(books); }

    @PutMapping("/{bookID}")
    public Books updateBook(@PathVariable int bookID, @RequestBody Books books) {
        return booksService.editBook(books,bookID);
    }

    @DeleteMapping("/{bookID}")
    public void deleteBook(@PathVariable int bookID) {
        booksService.deleteBook(bookID);
    }
}
package com.kodilla.rest.controller.homework;

import com.kodilla.rest.controller.BookController;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BookControllerTestSuite {

    @Test
    public void shouldCorrectAddBooks() {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookDtoList = new ArrayList<>();
        BookDto result = bookController.addBook(new BookDto("title", "author"));
        bookDtoList.add(result);
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookDtoList);

        assertThat(bookDtoList).hasSize(1);
    }
}
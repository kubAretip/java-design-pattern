package pl.pitera.flyweight.homework.adapter;

import pl.pitera.flyweight.homework.User;
import pl.pitera.flyweight.homework.api.LibraryAPI;
import pl.pitera.flyweight.homework.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private LibraryAPIv2 libraryAPIv2;
    private User user;

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }


    @Override
    public boolean isAvailable(String bookTitle) {
        return libraryAPIv2.numberOfAvailableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return libraryAPIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return libraryAPIv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}

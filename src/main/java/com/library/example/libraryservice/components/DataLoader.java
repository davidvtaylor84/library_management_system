package com.library.example.libraryservice.components;

import com.library.example.libraryservice.models.Book;
import com.library.example.libraryservice.models.Library;
import com.library.example.libraryservice.models.Member;
import com.library.example.libraryservice.models.Staff;
import com.library.example.libraryservice.repositories.BookRepository;
import com.library.example.libraryservice.repositories.LibraryRepository;
import com.library.example.libraryservice.repositories.MemberRepository;
import com.library.example.libraryservice.repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    LibraryRepository libraryRepository;

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    StaffRepository staffRepository;

    public DataLoader(){};

    public void run(ApplicationArguments args){
        Library library = new Library();
        libraryRepository.save(library);

        Member member1 = new Member("Jim", "Olsen", "12/02/1984", "123 Fake Street", "johnhell@gmail.com", "ID456", "Has terrible breath", library);
        memberRepository.save(member1);

        Member member2 = new Member("Rita", "De La Cruz", "12/08/1902", "45 Desolation Row", "whereisthebeef@gmail.com", "ID126", "Wants some biscuits", library);
        memberRepository.save(member2);

        Staff staff1 = new Staff("Helen", "Hunter", "ID675", "jellyfish12", library);
        staffRepository.save(staff1);

        Staff staff2 = new Staff("Mickey", "Flippant", "ID755", "thegodsarehere", library);
        staffRepository.save(staff2);

        Book book1 = new Book("The Death of Wheat Fields in the Summer", "Steve Jimmy", "987786776776", "Steve-O books", "Horror", 1987, false, library, member1);
        bookRepository.save(book1);

        Book book2 = new Book("When the Gods fuss over my bread", "Rick Hell", "978867868867", "James Books", "Crime", 1982, false, library, member2);
        bookRepository.save(book2);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.addStaff(staff1);
        library.addStaff(staff2);

        libraryRepository.save(library);

    }

}

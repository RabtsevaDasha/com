package Library;

public class Library {
    public static void main(String[] args) {
        Student student1 = new Student("Mark So Li", 785996, 3, "12.12.2001", 805798665);
        Student student2 = new Student("David Do", 789964, 5, "01,08.1995", 80499654);
        Student student3 = new Student("Jackson Malik", 895642, 2, "09.06.2003", 804579563);
        Student[] students = {student1, student2, student3};

        Books book1 = new Books("Pride & Prejudice", "Jane Austen");
        Books book2 = new Books("The theory of everything", "Stephen Hawking");
        Books book3 = new Books("Martin Eden", "Jack London");
        Books[] books = {book1, book2, book3};

        printStudent(students);
        printBooks(books);

        student1.takeBook(5);
        student2.takeBook("Cosmobiolukhi, Gromyko", "Java programming, Shildt");
        student3.takeBook(book1, book2, book3);

        student1.returnBook(2);
        student2.returnBook("Java programming, Shildt");
        student3.returnBook(book3);
    }

    private static void printBooks(Books[] books){
        System.out.println("Books list: ");
        for (Books book : books){
            System.out.println(book.toString());
        }
        System.out.println();
    }

    private static void printStudent(Student[] students){
        System.out.println("Reader list: ");
        for (Student student : students){
            System.out.println(student.toString());
        }
        System.out.println();
    }
}

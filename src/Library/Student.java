package Library;

public class Student {
    String fullName;
    int readNumber;
    int faculty;
    String birthNum;
    int telephoneNum;

    public Student(String fullName, int readNumber, int faculty, String birthNum, int telephoneNum) {
        this.fullName = fullName;
        this.readNumber = readNumber;
        this.faculty = faculty;
        this.birthNum = birthNum;
        this.telephoneNum = telephoneNum;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public int getReadNumber() {
        return readNumber;
    }

    public void setReadNumber(int readNumber) {
        this.readNumber = readNumber;
    }

    public String getBirthNum() {
        return birthNum;
    }

    public void setBirthNum(String birthNum) {
        this.birthNum = birthNum;
    }

    public int getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(int telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public void takeBook(int readNumber){
        System.out.println(this.fullName + " take " + readNumber + " books");
    }

    public void takeBook (String...book){
        System.out.println(this.fullName + " take the next books: ");
        for (String books : book) {
            System.out.println(books);
        }
        System.out.println();
    }

    public void takeBook(Books...books){
        System.out.println(this.fullName + " take the next books: ");
        for (Books books1 : books){
            System.out.println(books1.getName() + ", author - " + books1.getAuthor());
        }
        System.out.println();
    }
    public void returnBook(int readNumber){
        System.out.println(this.fullName + " take back" + readNumber + " books ");
    }

    public void returnBook (String...book){
        System.out.println(this.fullName + " take back the next books: ");
        for (String books : book) {
            System.out.println(books);
        }
        System.out.println();
    }

    public void returnBook(Books...books) {
        System.out.println(this.fullName + " take back the next books: ");
        for (Books books1 : books) {
            System.out.println(books1.getName() + ", author - " + books1.getAuthor());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", readNumber=" + readNumber +
                ", faculty=" + faculty +
                ", birthNum=" + birthNum +
                ", telephoneNum=" + telephoneNum +
                '}';
    }
}

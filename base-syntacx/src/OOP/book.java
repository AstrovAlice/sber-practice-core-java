package OOP;

    public class book {
        private String name;
        private String gender;
        private String email;

        public book(String name, String gender, String email) {
            this.name = name;
            this.gender = gender;
            this.email = email;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    class Book {
        private String title;
        private book author;
        private int year;

        public Book(String title, book author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public book getAuthor() {
            return author;
        }

        public void setAuthor(book author) {
            this.author = author;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author=" + author +
                    ", year=" + year +
                    '}';
        }
    }

    class Main {
        public static void main(String[] args) {
            book author = new book("Alice Smith", "Female", "alice.smith@example.com");
            Book book = new Book("Java Programming", author, 2021);

            System.out.println(book);
        }
    }
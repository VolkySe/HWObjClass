public class AppHWObjClass {
    public static void main(String[] args) {
        Author author1 = new Author("Arthur", "Doyle");
        Book book1 = new Book("Shelock Holmes", author1, 2002);
        Author author2 = new Author("Robert", "Martin");
        Book book2 = new Book("Clean Code. A Handbook of Agile Software Craftsmanship", author2, 2018);
        book2.setYearPublication(2022);

        System.out.println("book1.toString() = " + book1);
        System.out.println("book2.toString() = " + book2);
        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }
        if (author1.equals(author2)) {
            System.out.println("Автор один и тот же");
        } else {
            System.out.println("Авторы разные");
        }

    }
}

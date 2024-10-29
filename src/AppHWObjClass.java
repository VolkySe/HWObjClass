public class AppHWObjClass {
    public static void main(String[] args) {
        Author author1 = new Author("Arthur", "Doyle");
        Book book1 = new Book("Shelock Holmes", author1, 2002);
        Author author2 = new Author("Robert", "Martin");
        Book book2 = new Book("Clean Code. A Handbook of Agile Software Craftsmanship", author2, 2018);
        System.out.println("author1.getAuthor() = " + author1.getAuthor());
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getYearPublication() = " + book1.getYearPublication());
        System.out.println("author2.getAuthor() = " + author2.getAuthor());
        System.out.println("book2.getTitle() = " + book2.getTitle());
        System.out.println("book2.getYearPublication() = " + book2.getYearPublication());
        book2.setYearPublication(2022);
        System.out.println("author2.getAuthor() = " + author2.getAuthor());
        System.out.println("book2.getTitle() = " + book2.getTitle());
        System.out.println("book2.getYearPublication() = " + book2.getYearPublication());
    }
}

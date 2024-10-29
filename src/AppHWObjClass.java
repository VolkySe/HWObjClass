public class AppHWObjClass {
    public static void main(String[] args) {
        Author author1 = new Author("Arthur", "Doyle");
        Book book1 = new Book("Shelock Holmes", author1, 2002);
        Author author2 = new Author("Robert", "Martin");
        Book book2 = new Book("Clean Code. A Handbook of Agile Software Craftsmanship", author2, 2018);
        book2.setYearPublication(2022);
    }
}

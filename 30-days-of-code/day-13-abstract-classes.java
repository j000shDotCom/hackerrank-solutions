class MyBook extends Book {
    int price;
    MyBook(String t, String a, int p) {
        super(t, a);
        price = p;
    }
    void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d", title, author, price);
    }
}

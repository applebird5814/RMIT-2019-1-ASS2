public class Book extends Publication {
    private String[] author;

    //not free
    public Book(String inputid, String inputname, double inputprice, String inputpublisher, int inputnumpage, String[] inputAuthor) {
        super(inputid, inputname, inputprice, inputpublisher, inputnumpage);
        author = new String[inputAuthor.length];
        System.arraycopy(inputAuthor, 0, author, 0, inputAuthor.length);
    }

    //free
    public Book(String inputid, String inputname, String inputpublisher, int inputnumpage, String[] inputAuthor) {
        super(inputid, inputname, 0, inputpublisher, inputnumpage);
        author = new String[inputAuthor.length];
        System.arraycopy(inputAuthor, 0, author, 0, inputAuthor.length);
    }

    public String[] getAuthor() {
        return author;
    }

}
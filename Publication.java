public class Publication extends Content {
    private String publisher;
    //numPage means num of pages
    private int numPage;

    public Publication(String inputid, String inputname, double inputprice, String inputpublisher, int inputnumpage) {
        super(inputid, inputname, inputprice);
        publisher = inputpublisher;
        numPage = inputnumpage;
    }


    public String getPublisher() {
        return publisher;
    }

    public int getNumOfPages() {
        return numPage;
    }
}
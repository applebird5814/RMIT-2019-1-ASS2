import java.util.ArrayList;

public abstract class Content {
    private String id;
    private String name;
    private int numDownload;
    private double price;
    private ArrayList<Comment> review;
    private int i;

    public Content(String inputid, String inputname, double inputprice) {
        id = inputid;
        name = inputname;
        price = inputprice;
        numDownload = 0;
        review = new ArrayList<Comment>();
    }

    public void addReview(Comment addcomment) {
        this.review.add(addcomment);
        i++;
    }

    public void showReviews() {
        if (i == 0) {
            System.out.printf("There is no review\n");
        } else {
            for (int j = 0; j < i; j++) {
                Comment showcomment = (Comment) review.get(j);
                System.out.println(showcomment.getUser().getId() + " " + showcomment.getComment());
            }
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumDownload() {
        return numDownload;
    }

    public double getPrice() {
        return price;
    }

    public void download() {
        numDownload += 1;
    }

}
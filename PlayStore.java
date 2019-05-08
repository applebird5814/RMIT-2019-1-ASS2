import java.util.ArrayList;
import java.util.Iterator;

public class PlayStore {

    // Instance variables that you need.
    // They must all be marked as private

    // Declare a private variable (array or similar) to store your Content objects here
    private ArrayList allContent;
    // Declare a private variable (array or similar) to store your User objects here
    private ArrayList allUser;
    private int contentNum;
    private int userNum;

    public PlayStore() {
        allContent = new ArrayList();
        allUser = new ArrayList();
    }

    public void addContent(Content newContent) {
        // add the content into your content list
        allContent.add(contentNum, newContent);
        contentNum++;
    }

    public void addUser(User newUser) {
        // add the user to your list of users
        allUser.add(userNum, newUser);
        userNum++;
    }

    public User getUser(String UserId) {
        int i;
        for (i = 0; i < userNum; i++) {
            User user = (User) allUser.get(i);
            if (user.getId().equals(UserId)) {
                break;
            }
        }
        return (User) allUser.get(i);
    }

    public Content getContent(String ContentId) {
        int i;
        for (i = 0; i < contentNum; i++) {
            Content content = (Content) allContent.get(i);
            if (content.getId().equals(ContentId)) {
                break;
            }
        }
        return (Content) allContent.get(i);
    }

    // show all
    public void showContent() {
        // add your code here
        for (int j = 0; j < contentNum; j++) {
            Content show = (Content) allContent.get(j);
            System.out.println(show.getId() + " " + show.getName() + " " + show.getPrice() + " " + show.getNumDownload());
        }
    }

    public void showUser() {
        // add your code here
        for (int j = 0; j < userNum; j++) {
            User show = (User) allUser.get(j);
            System.out.println(show.getId() + " " + show.getName() + " " + show.getPhoneNumber() + " " + show.getBalance());
        }
    }

    // show some
    public void showContent(String ContentType) {
        // add your code here
        // Content type can be book,game,application or magazine.
        // get the type of content, in the content id, only the first letter decide the content type
        // charAt(0)can get the first letter.
        // a is a test char
        char a;
        a = ContentType.charAt(0);
        for (int j = 0; j < contentNum; j++) {
            Content show = (Content) allContent.get(j);
            if (a == show.getId().charAt(0)) {
                System.out.println(show.getId() + " " + show.getName() + " " + show.getPrice() + " " + show.getNumDownload());
            }
        }
    }

    // possible methods here

}
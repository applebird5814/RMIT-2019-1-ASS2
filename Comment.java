public class Comment {
    private User user;
    private String comment;

    public Comment(User inputuser, String inputcomment) {
        user = inputuser;
        comment = inputcomment;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }
}
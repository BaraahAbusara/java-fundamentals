package inheritance;

public class Review  {
    private String body;
    private String author;
    private double reviewStars;

    public Review(String body, String author, double reviewStars) {
        //Write a Review constructor.
        this.body = body;
        this.author = author;
        this.reviewStars = reviewStars;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getReviewStars() {
        return reviewStars;
    }

    public void setReviewStars(int reviewStars) {
        this.reviewStars = reviewStars;
    }


    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", reviewStars=" + reviewStars +
                '}';
    }

}

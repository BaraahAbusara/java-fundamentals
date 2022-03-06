package inheritance;
import java.util.ArrayList;

public class Restaurant {
    private String name ;
    private double stars; //should be between 0 and 5
    private double sumOfStars;
    private int numberOfReviews;
    private String priceCategory ;// and a price category (i.e. number of dollar signs).
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, String priceCategory) { //Implement a Restaurant constructor.
        this.name = name;
        this.stars = 0;
        this.sumOfStars=0;
        this.numberOfReviews=0;
        this.priceCategory = priceCategory;
    }

    public void setStars() {
        this.stars = sumOfStars/numberOfReviews;
    }

    public void setSumOfStars(double sumOfStars) {
        this.sumOfStars += sumOfStars;
    }

    public void setNumberOfReviews() {
        this.numberOfReviews = numberOfReviews+1;
    }

    public void addReview (String body, String author, double reviewStars)
    {
        Review review = new Review(body,author,reviewStars);

        if(review.getReviewStars()<0||review.getReviewStars()>5)
        {
            System.out.println("Review can't be added , please make sure you are giving the restaurant stars between 0 and 5");
            return;
        }

        reviews.add(review);
        setSumOfStars(reviewStars);
        setNumberOfReviews();
        setStars();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + reviews +
                '}';
    }

  //  @Override
   // public String toString() {  //Implement a reasonable toString method for Restaurants.
    //    return "Restaurant{" +
    //            "name='" + name + '\'' +
    //            ", stars=" + stars +
    //            ", priceCategory='" + priceCategory + '\'' +
       //         '}';
    //}
}

package inheritance;

import java.util.ArrayList;

public class Company {
    private String name ;

    private double stars; //should be between 0 and 5
    private double sumOfStars;

    private int numberOfReviews;

    protected ArrayList<Review> reviews = new ArrayList<>();

    public Company(String name) {
        this.name = name;
        this.stars = 0;
        this.sumOfStars=0;
        this.numberOfReviews=0;
    }

    public String getName() {
        return name;
    }

    public void setStars() {
        this.stars = sumOfStars/numberOfReviews;
    }

    public double getStars() {
        return stars;
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

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }
}

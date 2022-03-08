package inheritance;

import java.util.ArrayList;

public class Theater extends Company{

    protected ArrayList <Movie> moviesList = new ArrayList<Movie>();

    public Theater(String name) {
        super(name);
    }

    public void addMovie (Movie newMovie){

        moviesList.add(newMovie);

    }

    public void removeMovie (Movie movieName){
        if(moviesList.contains(movieName))
        moviesList.remove(movieName);
        else
            System.out.println("This movie does not exist");
    }

    public ArrayList<Movie> getMoviesList() {
        return moviesList;
    }

    public void addReview (String body, String author, double reviewStars, Movie movie)
    {

        MovieReview review = new MovieReview(body,author,reviewStars,movie);

        if(review.getReviewStars()<0||review.getReviewStars()>5)
        {
            System.out.println("Review can't be added , please make sure you are giving the restaurant stars between 0 and 5");
            return;
        }
        super.reviews.add(review);

        setSumOfStars(reviewStars);
        setNumberOfReviews();
        setStars();
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + this.getName() + '\'' +
                ", stars=" + this.getStars() + '\'' +
                "reviews=" + this.getReviews()+
                ", moviesList=" + getMoviesList() +
                '}';
    }
}

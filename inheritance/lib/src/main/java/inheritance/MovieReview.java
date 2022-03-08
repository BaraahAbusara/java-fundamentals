package inheritance;

public class MovieReview extends Review{
    Movie movie=new Movie("Movie Name Not Added");

    public MovieReview(String body, String author, double reviewStars,Movie newMovie) {
        super(body, author, reviewStars);
        movie = newMovie;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "movie=" + movie +
                '}';
    }
}

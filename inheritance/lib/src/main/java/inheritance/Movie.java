package inheritance;

public class Movie {
    String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                '}';
    }
}

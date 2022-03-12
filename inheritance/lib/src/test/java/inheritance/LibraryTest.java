/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LibraryTest {
//    ---------------------------------Shop--------------------------------
    Shop shop = new Shop ("August","$$$","shop selling turkish shoes for both genders.");
    Review shopReview2 = new Review("bad shop!","Lama",1);
    @Test void testToStringShop() { //Test that your Shop constructor is behaving reasonably.
        String ans =shop.toString();
        String expectedAns = "Shop{name='August', stars=0.0'priceCategory='$$$', description='shop selling turkish shoes for both genders.', reviews=[]}";
        assertEquals(expectedAns,ans);

    }
    @Test void testToStringShopReview() {  //Test that your constructor is working reasonably.
        String ans =shopReview2.toString();
        String expectedAns = "Review{body='bad shop!', author='Lama', reviewStars=1.0}";
        assertEquals(expectedAns,ans);
    }
    @Test void addReviewShopTest () {
        shop.addReview("very good shop","Bara'ah",5);
        shop.addReview("very good looking","Hala",2);
        String ans =shop.toString();
        String expectedAns = "Shop{name='August', stars=3.5'priceCategory='$$$', description='shop selling turkish shoes for both genders.', reviews=[Review{body='very good shop', author='Bara'ah', reviewStars=5.0}, Review{body='very good looking', author='Hala', reviewStars=2.0}]}";
        assertEquals(expectedAns,ans);
    }
//    ---------------------------------Restaurant--------------------------------
    Restaurant restaurant = new Restaurant("restaurantTest" , "$$$" );
    Review review = new Review("very good meals","Bara'ah",5);
    @Test void testToStringRestaurant() { //Test that your Restaurant constructor is behaving reasonably.
        String ans =restaurant.toString();
        String expectedAns = "Restaurant{name='restaurantTest', stars=0.0, priceCategory='$$$', reviews=[]}";
        assertEquals(expectedAns,ans);

    }
    @Test void testToStringReview() {  //Test that your constructor is working reasonably.
        String ans =review.toString();
        String expectedAns = "Review{body='very good meals', author='Bara'ah', reviewStars=5.0}";
        assertEquals(expectedAns,ans);
    }
    @Test void testAddingOutOfBoundsStars() {  //Test that your constructor is working reasonably.
        Review badReview = new Review("very bad","Hala",-10);
        Review goodReview = new Review("THE BEST EVER", "Mona",100);
        String ans =review.toString();
        String expectedAns = "Review{body='very good meals', author='Bara'ah', reviewStars=5.0}";
        assertEquals(expectedAns,ans);
    }
    @Test void addReviewTest () {
        restaurant.addReview("very good meals","Bara'ah",5);
        restaurant.addReview("very good looking","Hala",2);
        String ans =restaurant.toString();
        String expectedAns = "Restaurant{name='restaurantTest', stars=3.5, priceCategory='$$$', reviews=[Review{body='very good meals', author='Bara'ah', reviewStars=5.0}, Review{body='very good looking', author='Hala', reviewStars=2.0}]}";
        assertEquals(expectedAns,ans);
    }
    //    ---------------------------------Theater--------------------------------
    Theater theater = new Theater ("Shams");
    Review theaterReview = new Review("Great theater!","Hasan",5);
    @Test void testToStringTheater() { //Test that your Theater constructor is behaving reasonably.
        String ans =theater.toString();
        String expectedAns = "Theater{name='Shams', stars=0.0'reviews=[], moviesList=[]}";
        assertEquals(expectedAns,ans);
    }
    @Test void testToStringTheaterReview() {  //Test that your constructor is working reasonably.
        String ans =theaterReview.toString();
        String expectedAns = "Review{body='Great theater!', author='Hasan', reviewStars=5.0}";
        assertEquals(expectedAns,ans);
    }
    @Test void addReviewTheaterTest () { //testing for adding reviews with a movie name and without.
        Movie batman = new Movie("batman");
        theater.addMovie(batman);
        theater.addReview("very good Theater","Bara'ah",4);
        theater.addReview("very good looking","Hala",3,batman);
        String ans =theater.toString();
        String expectedAns ="Theater{name='Shams', stars=3.5'reviews=[Review{body='very good Theater', author='Bara'ah', reviewStars=4.0}, MovieReview{body='very good looking', author='Hala', reviewStars=3.0movie=Movie{movieName='batman'}}], moviesList=[Movie{movieName='batman'}]}";
        assertEquals(expectedAns,ans);
    }
    @Test void removeMovieTest ()
    {
        Movie batman = new Movie("batman");
        Movie augustRush = new Movie("August Rush");
        theater.addMovie(batman);
        theater.addMovie(augustRush);
        theater.removeMovie(batman);
        String ans = theater.moviesList.toString();
        String expectedAns ="[Movie{movieName='August Rush'}]";
        assertEquals(expectedAns,ans);
    }
}

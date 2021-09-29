package inheritance;

public class Review implements ReviewLocations{
    String author, locationName, body;
    float stars;

    public Review(String author, String locationName, String body, int stars)
    {
        this.author = author;
        this.body = body;
        this.locationName = locationName;
        this.stars = (float) stars;
    }
    @Override
    public void stars(int starRating)
    {
        this.stars = starRating;
    }
    @Override
    public String toString(){
        String finishedReview = "";
        finishedReview += locationName + "\n" + body + "\n" + author + "\n" + stars;
        return finishedReview;
    }

}

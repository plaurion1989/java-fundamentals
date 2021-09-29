package inheritance;

import java.util.ArrayList;

public class Location
{
    String name, price = "$";
    float currentStars = 0.0f;
    ArrayList<Review> reviewArrayList = new ArrayList<>();

    public Location(String name, int price)
    {
        this.name = name;
        this.price = this.price.repeat(price);
    }
    public Review addReview(Review review)
    {
        reviewArrayList.add(review);
        this.currentStars += review.stars;
        return review;
    }

    @Override
    public String toString(){
       String locationInfo = "";
       locationInfo += name + "\n"+ price +"\n"+ currentStars;
       return locationInfo;
    }
}

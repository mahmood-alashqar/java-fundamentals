package Inheritance.com;

public class Review extends Restaurant{
    private String body;
    private String author;
    private int noOfStars;

//    public Review(String name, int noOfStars, String priceCategory) {
//
//    }
    public Review(String body, String author, int noOfStars) {
        super( noOfStars);
        this.body=body;
        this.author=author;
        this.noOfStars=noOfStars;
    }



    public String toString(){
        System.out.println(this.body);
        System.out.println(this.author);
        System.out.println(this.noOfStars);
    return "";
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

    public int getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(int noOfStars) {
        this.noOfStars = noOfStars;
    }
}

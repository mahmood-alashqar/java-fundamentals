package Review_packege;

public class Review {
    public String body;
    private String author;
    private int stars;
    public Review(String body,String author,int stars){
        this.body=body;
        this.author=author;
        this.stars=stars;
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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
    public String tostring(){
        String result;
        result= " the Restaurant "+this.author + "  voted " +this.stars +"  stars  " + this.body;
        return  result;
    }
}

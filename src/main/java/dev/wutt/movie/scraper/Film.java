package dev.wutt.movie.scraper;

public class Film {

    private String title;
    private Double rating;

    public Film(String title, Double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + " ---- " + rating;
    }
}

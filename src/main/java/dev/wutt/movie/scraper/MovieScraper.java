package dev.wutt.movie.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieScraper {

    final String url = "https://www.imdb.com/chart/top/";
    List<Film> films = new ArrayList<>();

    public List<Film> getData() {
        try {
            Document doc = Jsoup.connect(url).get();

            String movieSelector = "table.chart.full-width";

            Element table = doc.select(movieSelector).get(0);
            Elements rows = table.select("tr");

            // sublist to ignore first element containing column names
            for (Element row : rows.subList(1, rows.size())) {
                String title = row.select(".titleColumn a").text();
                Double rating = Double.parseDouble(row.select(".imdbRating").text());

                films.add(new Film(title, rating));
            }



        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return films;
    }


}



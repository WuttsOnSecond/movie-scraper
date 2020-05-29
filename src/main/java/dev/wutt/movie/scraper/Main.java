package dev.wutt.movie.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

       MovieScraper topFilms = new MovieScraper();
       List<Film> films = topFilms.getData();

       films.forEach(System.out::println);

    }
}

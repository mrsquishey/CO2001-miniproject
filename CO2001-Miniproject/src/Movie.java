import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
public class Movie {
	
	private int movieID, imdbID, tmdbID;
	private String title, genres, timeStamp, tag;
	private double rating;
	
	static private String links = "/Users/James/Desktop/ml-latest-smallz/links.csv";
	static private String movies = "C:\\Users\\James\\Desktop\\movies.csv";
	static private String ratings = "/Users/James/Desktop/ml-latest-smallz/ratings.csv";
	static private String tags = "/Users/James/Desktop/ml-latest-smallz/tags.csv";

	
	
	public Movie(){
		this.movieID = -1;
		this.imdbID = -1; 
		this.tmdbID = -1;
		this.title = "none";
		this.rating = -0.1;
	}

	public Movie(int movieID, int imdbID, int tmdbID, String title,
			double rating) {
		
		this.movieID = movieID;
		this.imdbID = imdbID; 
		this.tmdbID = tmdbID;
		this.title = title;
		this.rating = rating;
	
	}
	
	public String toString(){
		return(this.getMovieID() + ", " + this.getTitle());
	}
	
	
/*	
	public void setIdAndTitle(){
		try (BufferedReader br = new BufferedReader(new FileReader(movies))) {

            while ((line = br.readLine()) != null) {
            	Random ran = new Random();
            	
                // use comma as separator
                Object[] movie = line.split(cvsSplitBy);
                if(movie[0].equals("movieId")){
                }
               
            	
            	else{
            	int i = Integer.valueOf((String) movie[0]);
                int q = ran.nextInt(16498);
            	if (q == i){
                this.setMovieID(i);
                this.setTitle((String)(movie[1]));
                
                }
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
*/
	
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public int getImdbID() {
		return imdbID;
	}
	public void setImdbID(int imdbID) {
		this.imdbID = imdbID;
	}
	public int getTmdbID() {
		return tmdbID;
	}
	public void setTmdbID(int tmdbID) {
		this.tmdbID = tmdbID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	

}

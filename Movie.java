import java.util.HashMap;

public class Movie {
	
	private int movieID, imdbID, tmdbID;
	private String title, genres, timeStamp, tag;
	private double rating;	
	private HashMap <Integer, Movie> movieList = new HashMap<Integer, Movie>();
	
	

	public Movie(int movieID, int imdbID, int tmdbID, String title, String genres, String timeStamp, String tag,
			double rating) {
		
		this.movieID = movieID;
		this.imdbID = imdbID;
		this.tmdbID = tmdbID;
		this.title = title;
		this.genres = genres;
		this.timeStamp = timeStamp;
		this.tag = tag;
		this.rating = rating;
	}

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

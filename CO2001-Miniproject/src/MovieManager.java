import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MovieManager {

	static private ArrayList<Movie> movieList = new ArrayList<Movie>();
	static private BufferedReader br = null;
	static 	private String line = "";
	static private String line1 = "";
    static private String cvsSplitBy = ",";
    private String filePath = new File("").getAbsolutePath();
	private String sepe = File.separator;
	File movieFile = new File(filePath+sepe+"CVS"+sepe+"movies.csv");
	File linksFile = new File(filePath+sepe+"CVS"+sepe+"links.csv");
	File ratingsFile = new File(filePath+sepe+"CVS"+sepe+"ratings.csv");
	File tagsFile = new File(filePath+sepe+"CVS"+sepe+"tags.csv");
	
	public MovieManager(){
		
	}
	
	
	public void createMovieList(){
		
		try (BufferedReader br = new BufferedReader(new FileReader(movieFile))) {
			try (BufferedReader lr = new BufferedReader(new FileReader(linksFile))) {
            while ((line = br.readLine()) != null && (line1 = lr.readLine()) != null) {
            	Movie m = new Movie();
                // use comma as separator
                Object[] movie = line.split(cvsSplitBy);
                if(movie[0].equals("movieId")){
                }
          
            	else{    
            	int i = Integer.parseInt((String)movie[0]);
                m.setMovieID(i);
                m.setTitle((String)movie[1]);
            	}
            	
          
            	
            	
                // use comma as separator
                Object[] movie1 = lr.readLine().split(cvsSplitBy);
                if(movie[0].equals("movieId")){
                }
          
            	else{    
            	int i = Integer.parseInt((String)movie1[1]);
            	try {
            		int n = Integer.parseInt((String)movie1[2]);
            		m.setTmdbID(n);
            	} catch (Exception e) {
            		
            		//System.out.println(e.getMessage());
            	}
            	m.setImdbID(i);
               // m.setTmdbID(n);
            	}
               // System.out.println(m.toString());
                movieList.add(m);
                }
            	}
        
        } catch (IOException e) {e.printStackTrace();}
		
	//	movieList.add(m);
		
		
	}
	public String getMovieList(){
		return movieList.toString();
	}
	
	public String getShortList(){
		String x = movieList.get(0).toString();
		String y = movieList.get(123).toString();
		String z = movieList.get(413).toString();
		return (x+y+z);
		
	}
}

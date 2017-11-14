import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Driver {
    static private Movie movie1 = new Movie();
    static private Movie movie2 = new Movie();
    static private Movie movie3 = new Movie();
    static private Movie movie4 = new Movie();
    static private Movie movie5 = new Movie();
    static private Movie movie6 = new Movie();
    static private Movie movie7 = new Movie();
    static private Movie movie8 = new Movie();
    static private Movie movie9 = new Movie();
    static private Movie movie10 = new Movie();
    
	public static void main(String[] args) {
		
		movie1.setIdAndTitle();
		movie2.setIdAndTitle();
		System.out.println(movie1.toString()+", "+movie2.toString());
		
	}
	
	

}

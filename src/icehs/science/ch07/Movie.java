package icehs.science.ch07;

public class Movie {
	private String title;
	private String director;
	private String genre;
	
	
	public void setTitle(string title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDirector() {
		return director;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre () {
		return genre;
	}
	public Movie() {

	}
	public Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}
	
	public Movie(String title, String director, String genre) {
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	
	
}

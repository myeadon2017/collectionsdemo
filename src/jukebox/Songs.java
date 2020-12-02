package jukebox;

public class Songs {

	private String songName;
	private String rating;
	private String genre;
	private String producer;
	@Override
	public String toString() {
		return "Songs [songName=" + songName + ", rating=" + rating + ", genre=" + genre + ", producer=" + producer
				+ "]";
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Songs(String songName, String rating, String genre, String producer) {
		super();
		this.songName = songName;
		this.rating = rating;
		this.genre = genre;
		this.producer = producer;
	}
	
}

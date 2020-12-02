package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class JukeBox {

	ArrayList<Songs> al= new ArrayList<Songs>();
	
	public static void main(String[] args) {
		
		new JukeBox().go();
		
	}
	public void go() {
		getSongs();
		for (Object ob : al) {
			System.out.println(ob);
		}
		
		
	}
	void getSongs() {
		try {
			File file= new File("songs.txt");
			BufferedReader br= new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null) {
				addSongs(line);
				
			}
		}catch (Exception e) {
			
		}
	}
	void addSongs(String lineToParse) {
		String[] tokens=lineToParse.split("/");
		Songs nextsong =new Songs(tokens[0],tokens[1],tokens[2],tokens[3]);
		al.add(nextsong);
	}

}

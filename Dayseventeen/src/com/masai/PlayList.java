package com.masai;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	public List<Song> songs = new ArrayList<>();

	public void addSong(Song song) {
		int count=0;
		for(Song s:songs) {
			if(song.songName.equals(s.songName)) {
				count++;
				break;
			}
		}
		if(count>0) {
			System.out.println("Song is already added in the playlist");
		}
		else
		{
			songs.add(song);
			System.out.println("Song added to the playlist successfully");
		}
		
	
	
	}

	
	public ArrayList<Song> getSongs() {
		return (ArrayList<Song>) songs;
	}


	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

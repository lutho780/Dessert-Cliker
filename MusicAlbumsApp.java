package za.ac.wsu.220548579
import package com.gmail.luthombaxa

//MusicAlbumApp.java

public class MusicAlbumApp
{
	public static void main( String[] args)
	{
		MusicAlbum Album1 = new MusicAlbum();
		Album1.setNumberOfTracks(1);
		Album1.settitleOfAlbum("Umuthi");
		Album1.setnameOfArtists("Blaq Diamond");
		Album1.getnamesOfTracks("Ama A-Lister");
		Album1.getnumberOfMiutes(4.5);
	
		MusicAlbum Album2 = new MusicAlbum();
		Album2.setNumberOfTracks(1);
		Album2.settitleOfAlbum("Free 6lack");
		Album2.setnameOfArtists("6lack");
		Album1.getnamesOfTracks("Never know");
		Album1.getnumberOfMiutes(4);
		
		MusicAlbum Album3 = new MusicAlbum();
		Album3.Album1.setNumberOfTracks(1);
		Album3.settitleOfAlbum("Meet the woo");
		Album3.setnameOfArtists("Pop smoke");
		Album3.getnamesOfTracks("Woo");
		Album3.getnumberOfMiutes(2.1);
		
		MusicAlbum Album4 = new MusicAlbum("Loner",6, "Tory Lanez, "Young niggas",4);
		Album4.setNumberOfTracks(1);
		Album4.settitleOfAlbum("Loner");
		Album4.setnameOfArtists("Tory Lanez");
		Album4.getnamesOfTracks("Young niggas");
		Album4.getnumberOfMiutes(3);
	
		
		MusicAlbum Album5 = new MusicAlbum("Play boy", 7, "Tory Lanez","Are you dumb",2);
		Album5.setNumberOfTracks(1);
		Album5.settitleOfAlbums("Play Boy");
		Album1.setnameOfArtists("Tory Lanez");
		Album1.getnamesOfTracks("Are you Dumb");
		Album1.getnumberOfMiutes(5);
		
		Album1.System.out.println( "ALBUM 1\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
		Album2.System.out.println( "ALBUM 2\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n" );
		Album3.System.out.println( "ALBUM 3\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
	    Album4.System.out.println( "ALBUM 4\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
        Album5.System.out.println( "ALBUM 5\n" + "Album Title: "  + gettitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getnameOfArtists() + "TrackName: " + getnamesOfTracks() + "\nNumber Of Minutes: " + getnumberOfMiutes() + "\n\n\n");
        
		System.exit(0);
	}
}

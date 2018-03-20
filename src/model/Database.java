package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Database {

	private static final String DEFAULT_FILE_NAME = "default.txt";
	private static final String CURRENT_FILE_NAME = "current.txt";
	
	private Database() {
		
	}
	
	public static void loadNewGame() {
		
	}
	
	public static Tournament loadCurrentGame() throws IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream( CURRENT_FILE_NAME );
		ObjectInputStream ois = new ObjectInputStream( file );
		Tournament.setInstance( (Tournament) ois.readObject() );
		ois.close();
		return Tournament.getInstance();
	}
	
	public static void saveCurrentGame( Tournament tournament ) throws IOException {
		FileOutputStream file = new FileOutputStream( CURRENT_FILE_NAME );
		ObjectOutputStream oos = new ObjectOutputStream( file );
		oos.writeObject( tournament );
		oos.close();
	}
	
}

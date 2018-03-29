package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

public class HomeScreen implements Initializable {
	
	    @FXML private Button searchButton;
	    @FXML private TextField searchField;
	    @FXML private WebView deneme;

	    public void newGameClicked() throws IOException {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/NewGameView.fxml"));
	        Parent root = loader.load();
	        Main.getMainStage().setScene(new Scene(root)); 
	    }
	    
	    public void loadGameClicked() throws IOException {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TeamView.fxml"));
	        Parent root = loader.load();
	        Main.getMainStage().setScene(new Scene(root)); 
	    }
	    
	    public void helpClicked() throws IOException {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/HelpView.fxml"));
	        Parent root = loader.load();
	        Main.getMainStage().setScene(new Scene(root)); 
	    }
	    
	    public void exitClicked() throws IOException {
	        System.exit(0);
	    }
	    
	    /**
	     * Initializes the controller class.
	     */
	    @Override
	    public void initialize(URL url, ResourceBundle rb)
	    {
	        // TODO
	    }
}

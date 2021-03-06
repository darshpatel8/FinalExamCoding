package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.awt.TextField;
import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {

	@FXML
	private Label income = new Label();
	@FXML
	private Label expenses = new Label();
	@FXML
	private Label creditScore = new Label();
	@FXML
	private Label houseCost = new Label();
	@FXML
	private Label term = new Label();	
	@FXML
	private Label mortgage;
	@FXML
	private TextField Income;
	@FXML
	private TextField Expense;
	@FXML
	private TextField CreditScore;
	@FXML
	private TextField HouseCost;
	@FXML
	private ComboBox<String> Term;
	@FXML
    private void mortgageCalc() {
    	Double income = Double.parseDouble(this.Income.getText());
    	Double Expense = Double.parseDouble(this.Expense.getText());
    	int creditScore = Integer.parseInt(this.CreditScore.getText());
    	Double houseCost = Double.parseDouble(this.HouseCost.getText());
    	Double term = Double.parseDouble(this.Term.getValue().toString());
    	
	
	
	
	
	
	
	
	
    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {

    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
   
}
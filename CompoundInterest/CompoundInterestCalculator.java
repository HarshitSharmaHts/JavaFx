import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.event.*;

public class CompoundInterestCalculator extends Application
{

		Spinner noySpinner = new Spinner(1,20,4);
		ComboBox<String> npyBox = new ComboBox<String>();
		TextField rateField = new TextField();
		TextField amtField = new TextField();
		TextArea monthPay = new TextArea();
	
	public void start(Stage stage)
	{
		stage.setTitle("Compound Interest Calculator");

		HBox hbox1 = new HBox(10);
		hbox1.setAlignment(Pos.CENTER);
		HBox hbox2 = new HBox(10);
		hbox2.setAlignment(Pos.CENTER);
		HBox hbox3 = new HBox(10);
		hbox3.setAlignment(Pos.CENTER);
		HBox hbox4 = new HBox(10);
		hbox4.setAlignment(Pos.CENTER);
		VBox vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);

		StackPane stackPane = new StackPane();

		Label noy = new Label("Calculation Period : ");
		noy.setPrefWidth(150);
		Label amt = new Label("Principal Amount : ");
		amt.setPrefWidth(150);
		Label rate = new Label("Annual Interest Rate : ");
		rate.setPrefWidth(150);
		Label npy = new Label("Compound Interval : ");
		npy.setPrefWidth(150);
		Label txt = new Label("year");
		txt.setPrefWidth(40);

		Rectangle rect = new Rectangle(450,300);
		String url = "./a1.jpg";
		Image img = new Image(url);
		ImagePattern imgpt = new ImagePattern(img);
		rect.setFill(imgpt);
		npyBox.setValue("--select--");
		npyBox.getItems().addAll("Monthly","Quarterly","Half-Yearly","Yearly");

		amtField.setPrefWidth(200);
		noySpinner.setPrefWidth(150);
		rateField.setPrefWidth(200);
		npyBox.setPrefWidth(200);
		monthPay.setPrefRowCount(1);
		monthPay.setEditable(false);
		monthPay.setStyle("-fx-font-alignment: center;");

		amtField.setOnKeyPressed(new nutralField());
		rateField.setOnKeyPressed(new nutralField());


		Button bt1 = new Button("Compute");
		bt1.setPrefWidth(360);
		bt1.setOnAction(new compute());
		
		hbox1.getChildren().addAll(amt,amtField);
		hbox2.getChildren().addAll(rate,rateField);
		hbox3.getChildren().addAll(noy,noySpinner,txt);
		hbox4.getChildren().addAll(npy,npyBox);


		vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,bt1,monthPay);
		stackPane.getChildren().addAll(rect,vbox);

		stage.setScene(new Scene(stackPane,450,300,imgpt));
		stage.setMaxHeight(300);	
		stage.setMinHeight(300);
		stage.setMaxWidth(450);	
		stage.setMinWidth(450);
		stage.setFullScreen(false);
		stage.show();
	}
	
	class compute implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent ae)
		{
			compute dum = new compute();
			String amtStr = amtField.getText();
			String rateStr= rateField.getText();
			String noyStr = noySpinner.getEditor().getText();
			String npyStr = npyBox.getSelectionModel().getSelectedItem().toString();
			if(amtStr.equals("") || dum.check(amtStr))
			{
				amtField.setStyle("-fx-faint-focus-color: #ff000022;-fx-focus-color : red");
				amtField.requestFocus();
				monthPay.setText("--Amount Field--");
				return;
			}
			if(rateStr.equals("") || dum.check(rateStr))
			{
				rateField.setStyle("-fx-faint-focus-color: #ff000022;-fx-focus-color : red");
				rateField.requestFocus();
				monthPay.setText("--Rate Field--");
				return;
			}
			double P = Double.parseDouble(amtStr);
			double r = Double.parseDouble(rateStr);
			double t = Double.parseDouble(noyStr);

			double n=1;
			if(npyStr.equals("Yearly"))
				n=1;
			if(npyStr.equals("Monthly"))
				n=12;
			if(npyStr.equals("Half-Yearly"))
				n=2;
			if(npyStr.equals("Quarterly"))
				n=4;


			double A =P * Math.pow((1+(r/(n*100))),(n*t));

			monthPay.setText("Total Amount after "+t+" years : " + String.format("%f",A));
		}
		boolean check(String str)
		{
			try
			{
				Double.parseDouble(str);
			}
			catch(NumberFormatException e)
			{
				return true;
			}
			return false;
		}
	}
	class nutralField implements EventHandler <KeyEvent>
	{
		public void handle(KeyEvent ae)
		{
			amtField.setStyle("-fx-focus-color: #039ED3; -fx-faint-focus-color: #039ED322;");
			rateField.setStyle("-fx-focus-color: #039ED3; -fx-faint-focus-color: #039ED322;");
		}
	}
}

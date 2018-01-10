package com.company;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Style
{
	public static void setTextFieldStyle(final TextField txtf)
	{
		txtf.setPrefWidth(150);
		txtf.setPrefHeight(25);
		txtf.setStyle("-fx-background-radius:0px;-fx-border-radius:0px;-fx-padding:3px;");
	}

	public static void setLabelStyle(final Label lbl)
	{
		lbl.setPrefWidth(150);
		lbl.setStyle("-fx-background-radius:0px;-fx-border-radius:0px;-fx-padding:3px;-fx-font-size:14px;");
	}

	public static void setResetStyle(final Button btn)
	{
		btn.setAlignment(Pos.CENTER);
		btn.setPrefSize(300,50);
		btn.setStyle("-fx-background-color:#131E40;" +
				             "-fx-border-color:rgba(58,91,191,0.4);" +
				             "-fx-text-fill:#fff;" +
				             "-fx-font-size:22px;" +
				             "-fx-border-radius:0px;" +
				             "-fx-background-radius:0px;");
		btn.setOnMouseEntered(e->{
			btn.setStyle("-fx-background-color:#263D7F;" +
					             "-fx-border-color:rgba(58,91,191,0.4);" +
					             "-fx-text-fill:#fff;" +
					             "-fx-font-size:22px;"+
  								 "-fx-border-radius:0px;" +
								 "-fx-background-radius:0px;");
		});
		btn.setOnMouseExited(e->{
			btn.setStyle("-fx-background-color:#131E40;" +
					             "-fx-border-color:rgba(58,91,191,0.4);" +
					             "-fx-text-fill:#fff;" +
					             "-fx-font-size:22px;" +
					             "-fx-border-radius:0px;" +
					             "-fx-background-radius:0px;");	});
	}

	public static void setToX(final Button btn)
	{
		final String style="-fx-background-color:#8E4497;" +
				                   "-fx-font-size:52px;" +
				                   "-fx-padding:0px;"+
								   "-fx-background-radius:0px;"+
				                   "-fx-border-radius:0px;" +
				                   "-fx-text-fill:#fff";
		btn.setStyle(style);
		btn.setText("X");
	}

	public static void setToO(final Button btn)
	{
		final String style="-fx-background-color:#DE606D;" +
				                   "-fx-font-size:52px;" +
				                   "-fx-padding:0px;" +
				                   "-fx-background-radius:0px;"+
				                   "-fx-border-radius:0px;" +
				                   "-fx-text-fill:#fff";
		btn.setStyle(style);
		btn.setText("O");
	}

	public static void setToDefault(final Button btn)
	{
		final String style="-fx-background-color:#fff;" +
				                   "-fx-font-size:52px;" +
				                   "-fx-padding:0px;" +
				                   "-fx-background-radius:0px;"+
				                   "-fx-border-radius:0px;" +
				                   "-fx-text-fill:#000";
		btn.setStyle(style);
		btn.setText("+");
	}
}

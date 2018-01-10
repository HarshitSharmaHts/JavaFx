package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private static int count =0;
	private static int xCount =0;
	private static int oCount =0;
    private Button [] tile = new Button[9];
    private Button reset = new Button("Restart");
	private TextField xScoreField = new TextField();
	private TextField oScoreField = new TextField();
	private Label xLbl = new Label("X's Score : ");
	private Label oLbl = new Label("O's Score : ");
	private Label whoWin = new Label();

    public void start(Stage stage)
    {
        stage.setTitle("Tic-Tac-Toe");

        GridPane gridPane = new GridPane();

        Style.setTextFieldStyle(xScoreField);
        Style.setTextFieldStyle(oScoreField);

        Style.setLabelStyle(xLbl);
        Style.setLabelStyle(oLbl);

        xScoreField.setEditable(false);
	    oScoreField.setEditable(false);

	    GridPane gridPaneTop = new GridPane();
	    gridPaneTop.setAlignment(Pos.CENTER);

	    gridPaneTop.add(xLbl,0,0);
	    gridPaneTop.add(xScoreField,1,0);
	    gridPaneTop.add(oLbl,0,1);
	    gridPaneTop.add(oScoreField,1,1);
	    gridPaneTop.add(whoWin,0,2);

	    GridPane.setColumnSpan(whoWin,2);

        for (int i = 0 ; i < tile.length; i++)
        {
            tile[i]=new Button();
            Style.setToDefault(tile[i]);
            tile[i].setPrefSize(100,100);
        }

        Style.setResetStyle(reset);

        gridPane.add(tile[0],0,1);
        gridPane.add(tile[1],1,1);
        gridPane.add(tile[2],2,1);
        gridPane.add(tile[3],0,2);
        gridPane.add(tile[4],1,2);
        gridPane.add(tile[5],2,2);
        gridPane.add(tile[6],0,3);
        gridPane.add(tile[7],1,3);
        gridPane.add(tile[8],2,3);

        tile[0].setOnAction(e->{
            if(tile[0].getText().equals("+")){
                count++;
                if(count%2==0)
                    Style.setToX(tile[0]);
                else
                    Style.setToO(tile[0]);
            }

            if(count == 9)
            {
            	whoWin.setText("Draw!");
            	HaltTile();
            }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });


        tile[1].setOnAction(e->{
            if(tile[1].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[1]);
                else
                    Style.setToO(tile[1]);
            }


	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });

        tile[2].setOnAction(e->{
            if(tile[2].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[2]);
                else
                    Style.setToO(tile[2]);
            }

	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });


        tile[3].setOnAction(e->{
            if(tile[3].getText().equals("+")){
                count++;
                if(count%2==0)
                    Style.setToX(tile[3]);
                else
                    Style.setToO(tile[3]);
            }

	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });


        tile[4].setOnAction(e->{
            if(tile[4].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[4]);
                else
                	Style.setToO(tile[4]);
            }

	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });


        tile[5].setOnAction(e->{
            if(tile[5].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[5]);
                else
                	Style.setToO(tile[5]);
            }

	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });

        tile[6].setOnAction(e->{
            if(tile[6].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[6]);
                else
                	Style.setToO(tile[6]);
            }

	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });


        tile[7].setOnAction(e->{
            if(tile[7].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[7]);
                else
                	Style.setToO(tile[7]);
            }

	        if(count == 9)
	        {
		        whoWin.setText("Draw!");
		        HaltTile();
	        }
            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });


        tile[8].setOnAction(e->{
            if(tile[8].getText().equals("+")){
                count++;
                if(count%2==0)
                	Style.setToX(tile[8]);
                else
                	Style.setToO(tile[8]);
            }

            if(isCrossWon())
            {
                whoWin.setText("X is Winner!");
                HaltTile();
            }
            if(isZeroWon())
            {
                whoWin.setText("O is Winner!");
                HaltTile();
            }
        });

	    HBox hBoxBottom = new HBox();

	    hBoxBottom.getChildren().add(reset);
	    hBoxBottom.setAlignment(Pos.CENTER);
        reset.setOnAction(e->{
        	resetGame();
        });

        gridPane.setAlignment(Pos.CENTER);
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(gridPaneTop);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(hBoxBottom);
        stage.setScene(new Scene(borderPane,300,400));
        stage.setResizable(false);
        stage.show();
    }


    private boolean isCrossWon()
    {
        if(tile[0].getText().equals("X")&&tile[1].getText().equals("X")&&tile[2].getText().equals("X") ||
                tile[3].getText().equals("X")&&tile[4].getText().equals("X")&&tile[5].getText().equals("X") ||
                tile[6].getText().equals("X")&&tile[7].getText().equals("X")&&tile[8].getText().equals("X") ||
                tile[0].getText().equals("X")&&tile[3].getText().equals("X")&&tile[6].getText().equals("X") ||
                tile[1].getText().equals("X")&&tile[4].getText().equals("X")&&tile[7].getText().equals("X") ||
                tile[2].getText().equals("X")&&tile[4].getText().equals("X")&&tile[6].getText().equals("X") ||
                tile[2].getText().equals("X")&&tile[5].getText().equals("X")&&tile[8].getText().equals("X") ||
                tile[0].getText().equals("X")&&tile[4].getText().equals("X")&&tile[8].getText().equals("X"))
        {
        	xCount++;
	        xScoreField.setText(""+xCount);
        	return true;
        }
        return false;
    }


    private boolean isZeroWon()
    {
        if( tile[0].getText().equals("O")&&tile[1].getText().equals("O")&&tile[2].getText().equals("O") ||
                tile[3].getText().equals("O")&&tile[4].getText().equals("O")&&tile[5].getText().equals("O") ||
                tile[6].getText().equals("O")&&tile[7].getText().equals("O")&&tile[8].getText().equals("O") ||
                tile[0].getText().equals("O")&&tile[3].getText().equals("O")&&tile[6].getText().equals("O") ||
                tile[1].getText().equals("O")&&tile[4].getText().equals("O")&&tile[7].getText().equals("O") ||
                tile[2].getText().equals("O")&&tile[4].getText().equals("O")&&tile[6].getText().equals("O") ||
                tile[2].getText().equals("O")&&tile[5].getText().equals("O")&&tile[8].getText().equals("O") ||
                tile[0].getText().equals("O")&&tile[4].getText().equals("O")&&tile[8].getText().equals("O"))
        {
        	oCount++;
	        oScoreField.setText(""+oCount);
        	return true;
        }
        return false;
    }

    private void resetGame()
    {
    	count=0;
    	whoWin.setText("");
    	for(int i = 0 ; i < tile.length ; i ++)
	    {
	    	tile[i].setDisable(false);
	    	Style.setToDefault(tile[i]);
	    }
    }

    private void HaltTile()
    {
        for(int i = 0 ; i < tile.length ; i ++)
            tile[i].setDisable(true);
    }
}

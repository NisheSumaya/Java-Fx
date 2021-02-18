/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import javafx.application.Application; 

import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage; 


public class JavaFxApplication extends Application {
    
   
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)
    {
    Text first_name=new Text("First Name");
    TextField textbox1=new TextField();
    Text last_name=new Text("Last Name");
    TextField textbox2=new TextField();
    Text gender=new Text("Gender");
    ComboBox GenderBox = new ComboBox();
        GenderBox.getItems().addAll(
            "Male",
            "Female"
            
        );   
     GenderBox.setValue("Male");
     Label address=new Label("Adrress");
      TextArea  textarea = new TextArea  ();
     double height = 100;
     double width = 200;  
     textarea.setPrefHeight(height);  
     textarea.setPrefWidth(width);  
     ToggleGroup group = new ToggleGroup();
     RadioButton b1 = new RadioButton("Islam");
     b1.setToggleGroup(group);
     b1.setSelected(true);
     RadioButton b2 = new RadioButton("Hindu");
     b2.setToggleGroup(group);
     Button button1 = new Button("Submit"); 
     Button button2 = new Button("Clear");  
     GridPane degine= new GridPane();
     degine.setMinSize(400, 200); 
     degine.setPadding(new Insets(10, 10, 10, 10)); 
     degine.setVgap(10); 
     degine.setHgap(5);    
     degine.setAlignment(Pos.CENTER); 
     degine.add(first_name, 0, 0); 
     degine.add(textbox1, 1, 0); 
     degine.add(last_name, 0, 1);       
     degine.add(textbox2, 1, 1); 
     degine.add(gender, 0, 2); 
     degine.add(GenderBox, 1, 2); 
     degine.add(address,0,5); 
     degine.add(textarea, 1, 5);
     degine.add(b1,0,3); 
     degine.add(b2, 1, 3);
     degine.add(button1,0,7); 
     degine.add(button2, 1, 7);
     
     
     
     Scene scene=new Scene(degine);
     primaryStage.setTitle("NID Appliction Form");
     primaryStage.setScene(scene);
     primaryStage.show();
     
     
     
    
    }
    
}

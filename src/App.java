
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        BorderPane BPane = new BorderPane();

        BPane.setCenter(addGridPane());
        HBox hbox = addHBox();
        BPane.setTop(hbox);
        addStackPane(hbox);

        Scene scene = new Scene(BPane, 490, 600);
        
        stage.setScene(scene);
        stage.setTitle("Renew");
        stage.show();

    }



    public HBox addHBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(5, 5, 5, 5));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #c9df8a;");


        Text title = new Text("Renew");
        title.setFont((Font.font("Times New Roman", FontWeight.BOLD, 24)));
        
        

        hbox.getChildren().add(title);

        return hbox;

        
    }

    private void addStackPane(HBox hb) {
 
        StackPane stack = new StackPane();
        Rectangle helpIcon = new Rectangle(30.0, 25.0);
        helpIcon.setFill(new LinearGradient(0,0,0,1, true, CycleMethod.NO_CYCLE,
            new Stop[]{
            new Stop(0,Color.web("#999999")),
            new Stop(0.5, Color.web("#bcbcbc")),
            new Stop(1,Color.web("#eeeeee")),}));
        helpIcon.setStroke(Color.web("#f3f6f4"));
        helpIcon.setArcHeight(3.5);
        helpIcon.setArcWidth(3.5);
        
        Text helpText = new Text("?");
        helpText.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
        helpText.setFill(Color.WHITE);
        
        
        stack.getChildren().addAll(helpIcon, helpText);
        stack.setAlignment(Pos.CENTER_RIGHT);
        
        StackPane.setMargin(helpText, new Insets(0, 10, 0, 0));
        
        hb.getChildren().add(stack);
        HBox.setHgrow(stack, Priority.ALWAYS);
                
    }

    public GridPane addGridPane() {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setStyle("-fx-background-color: #f0f7da;");
        
        Text yours = new Text();
        yours.setFont((Font.font("Times New Roman", FontWeight.BOLD, 11)));

        Text monday = new Text("M");
        monday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(monday, 1, 0);

        Text tuesday = new Text("T");
        tuesday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(tuesday, 2, 0);


        Text wednesday = new Text("W");
        wednesday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(wednesday, 3, 0);


        Text thurday = new Text("T");
        thurday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(thurday, 4, 0);

        Text friday = new Text("F");
        friday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(friday, 5, 0);

        Text saturday = new Text("S");
        saturday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(saturday, 6, 0);

        Text sunday = new Text("S");
        sunday.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        grid.add(sunday, 7, 0);


        


        Button button2 = new Button("Add a Habit...");
        button2.setPrefSize(100, 20);
        button2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button2, 0, 2);

        Button button3 = new Button("Add a Habit...");
        button3.setPrefSize(100, 20);
        button3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button3, 0, 3);

        Button button4 = new Button("Add a Habit...");
        button4.setPrefSize(100, 20);
        button4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button4, 0, 4);

        Button button5 = new Button("Add a Habit...");
        button5.setPrefSize(100, 20);
        button5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button5, 0, 5);

        Button button6 = new Button("Add a Habit...");
        button6.setPrefSize(100, 20);
        button6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        
        grid.add(button6, 0, 6);

        Button button7 = new Button("Add a Habit...");
        button7.setPrefSize(100, 20);
        button7.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button7, 0, 7);

        Button button8 = new Button("Add a Habit...");
        button8.setPrefSize(100, 20);
        button8.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button8, 0, 8);

        Button button9 = new Button("Add a Habit...");
        button9.setPrefSize(100, 20);
        button9.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button9, 0, 9);

        Button button10 = new Button("Add a Habit...");
        button10.setPrefSize(100, 20);
        button10.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button10, 0, 10);

        Button button11 = new Button("Add a Habit...");
        button11.setPrefSize(100, 20);
        button11.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button11, 0, 11);

        Button button12 = new Button("Add a Habit...");
        button12.setPrefSize(100, 20);
        button12.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button12, 0, 12);

        Button button13 = new Button("Add a Habit...");
        button13.setPrefSize(100, 20);
        button13.setFont(Font.font("Times New Roman", FontWeight.BOLD, 12));
        grid.add(button13, 0, 13);

      
        CheckBox cb;
        int i,j;
        
        for (i = 1; i <= 12; i++) {
            for (j = 1; j <= 7; j++) {
                //checkBoxName = "cb" + i + j;
                //System.out.println(checkBoxName);
                cb = new CheckBox();
                grid.add(cb, j, i+1);
            }
        }
  

        button2.setStyle("-fx-background-color: 	#77ab59");
        button3.setStyle("-fx-background-color: 		#77ab59");
        button4.setStyle("-fx-background-color: 		#77ab59");
        button5.setStyle("-fx-background-color: 		#77ab59");
        button6.setStyle("-fx-background-color: 		#77ab59");
        button7.setStyle("-fx-background-color: 		#77ab59");
        button8.setStyle("-fx-background-color: 		#77ab59");
        button9.setStyle("-fx-background-color: 		#77ab59");
        button10.setStyle("-fx-background-color: 		#77ab59");
        button11.setStyle("-fx-background-color: 		#77ab59");
        button12.setStyle("-fx-background-color: 		#77ab59");
        button13.setStyle("-fx-background-color: 		#77ab59");

        return grid;

    }

    

}



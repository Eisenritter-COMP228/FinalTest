package FinalTest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// For running Oracle SQL
import java.sql.*;
import java.util.concurrent.Flow;


public class FinalTestTemplate extends Application{
    private PreparedStatement preparedStatement;

    private TextField templateTF = new TextField();
    private Label templateL = new Label();
    // HBox has all child element arranged horizontally
    private HBox templateHBox = new HBox();
    // VBox has all child element arranged vertically
    private VBox templateVBox = new VBox();

    // Scene holds all the element associated within the parent UI
    Scene templateScene = new Scene(templateHBox,0,0);

    ///////////
    // Panes //
    ///////////

    /////////////
    //StackPane//////////////////////////////////////////////////////////
    //Stack pane allows you to place many nodes one on top of an other.//
    /////////////////////////////////////////////////////////////////////
    private StackPane templateSPane = new StackPane();
    /////////////
    //GridPane///////////////////////////////////////////////////////////
    //GridPane allows you to create a flexible grid of rows and columns//
    // and position each node in exact place.                          //
    /////////////////////////////////////////////////////////////////////
    private GridPane templateGPane = new GridPane();
    /////////////
    //FlowPane///////////////////////////////////////////////////////////////////
    //Flow Pane lays all nodes one after an other in the order they were added.//
    /////////////////////////////////////////////////////////////////////////////
    private FlowPane templateFPane= new FlowPane();
    /////////////
    //TilePane///////////////////////////////////////////////////////////////////
    //TilePane is similar to the flow pane.                                    //
    // All nodes are placed in a grid in the same order they were added.       //
    /////////////////////////////////////////////////////////////////////////////
    private TilePane templateTPane= new TilePane();
    /////////////
    //AnchorPane////////////////////////////////////////////////////////
    //AnchorPane allows you to position nodes in the                  //
    // top, bottom, left side, right side, or center of the pane.     //
    ////////////////////////////////////////////////////////////////////
    private AnchorPane templateAPane = new AnchorPane();
    /////////////
    //BorderPane////////////////////////////////////////////////
    //BorderPane splits the scene in five regions such as:    //
    // top, bottom, left, right, and center.                  //
    // Where you can adjust added nodes.                      //
    // BorderPane also allows you to add different panes      //
    // in each region as shown in my example.                 //
    //However  you cannot use the same pane more than once.   //
    ////////////////////////////////////////////////////////////
    private  BorderPane templateBPane = new BorderPane();





    public static void main(String[] args){launch(args); }
    public void start(Stage primaryStage){
    }
}

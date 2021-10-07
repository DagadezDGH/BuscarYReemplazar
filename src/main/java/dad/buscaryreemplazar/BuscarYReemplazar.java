package dad.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {
	private TextField buscarText, reemplazarText;
	private CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;
	private VBox naranjaVBox;
	private GridPane conjuntoGrid, verdeGrid, amarilloGrid;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		
		buscarText = new TextField();
		reemplazarText = new TextField();
		
		checkBox1 = new CheckBox("Mayúsculas y minúsculas");
		checkBox2 = new CheckBox("Buscar hacia atrás");
		checkBox3 = new CheckBox("Expresión regular");
		checkBox4 = new CheckBox("Resaltar resultados");
		
		amarilloGrid = new GridPane();
		amarilloGrid.setPadding(new Insets(5));
		amarilloGrid.setHgap(5);
		amarilloGrid.setVgap(5);
		amarilloGrid.addRow(0, checkBox1, checkBox2 );
		amarilloGrid.addRow(1, checkBox3, checkBox4);
		
		verdeGrid = new GridPane();
		verdeGrid.setPadding(new Insets(5));
		verdeGrid.setHgap(5);
		verdeGrid.setVgap(5);
		verdeGrid.addRow(0, new Label("Buscar:"), buscarText);
		verdeGrid.addRow(1, new Label("Reemplazar con: "), reemplazarText);
		verdeGrid.add(amarilloGrid, 1, 2);
		
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar Todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setMinWidth(120);
		reemplazarButton.setMinWidth(120);
		reemplazarTodoButton.setMinWidth(120);
		cerrarButton.setMinWidth(120);
		ayudaButton.setMinWidth(120);
		
		naranjaVBox = new VBox();
		naranjaVBox.getChildren().addAll(buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton);
		naranjaVBox.setAlignment(Pos.CENTER);
		naranjaVBox.setSpacing(5);
		naranjaVBox.setPadding(new Insets(5));
		
		
		conjuntoGrid = new GridPane();
		conjuntoGrid.setPadding(new Insets(5));
		conjuntoGrid.setHgap(5);
		conjuntoGrid.setVgap(5);
		conjuntoGrid.addRow(0, verdeGrid, naranjaVBox);
		conjuntoGrid.setAlignment(Pos.TOP_LEFT);
		//conjuntoGrid.setGridLinesVisible(true);
		
		ColumnConstraints[]  columns = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
//		conjuntoGrid.getColumnConstraints().setAll(columns);
//		RowConstraints [] rows = {
//				new RowConstraints(),	
//				new RowConstraints(),	
//				new RowConstraints(),	
//				new RowConstraints(),	
//				new RowConstraints(),	
//				new RowConstraints(),	
//				new RowConstraints(),	
//			};
		columns[0].setHalignment(HPos.CENTER);
		columns[0].setHgrow(Priority.ALWAYS);
		columns[1].setHalignment(HPos.CENTER);
		columns[1].setHgrow(Priority.ALWAYS);
		columns[1].setFillWidth(true);
		
		
		 Scene scene = new Scene(conjuntoGrid, 515, 210);
		 primaryStage.setTitle("Buscar Y Reemplazar");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
	}
	public static void main(String[] args) {
		launch(args);
	}
}

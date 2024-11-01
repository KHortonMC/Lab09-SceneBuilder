module edu.miracosta.cs112.scenebuilder.lab09scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.scenebuilder.lab09scenebuilder to javafx.fxml;
    exports edu.miracosta.cs112.scenebuilder.lab09scenebuilder;
}
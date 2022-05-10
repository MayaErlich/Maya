module com.example.maya {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maya to javafx.fxml;
    exports com.example.maya;
    exports com.example.maya.controller;
    opens com.example.maya.controller to javafx.fxml;
}
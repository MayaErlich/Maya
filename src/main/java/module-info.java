module com.example.maya {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.maya to javafx.fxml;
    exports com.example.maya;
}
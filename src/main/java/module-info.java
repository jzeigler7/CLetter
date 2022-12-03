module com.example.cletter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cletter to javafx.fxml;
    exports com.example.cletter;
}
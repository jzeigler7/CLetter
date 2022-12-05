module com.example.cletter {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.io;
    requires html2pdf;


    opens com.example.cletter to javafx.fxml;
    exports com.example.cletter;
}
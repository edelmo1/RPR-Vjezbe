module com.example.zadnjavjezba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.zadnjavjezba to javafx.fxml;
    exports com.example.zadnjavjezba;
}
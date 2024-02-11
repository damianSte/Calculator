module lab.mi.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens lab.mi.calculatorfx to javafx.fxml;
    exports lab.mi.calculatorfx;
}
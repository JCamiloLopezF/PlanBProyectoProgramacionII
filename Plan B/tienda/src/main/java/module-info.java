module co.uniquindio.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.proyecto to javafx.fxml;
    exports co.uniquindio.proyecto;

    opens co.uniquindio.proyecto.Controller;
    exports co.uniquindio.proyecto.Controller;
}
module fr.uvsq.iutvelizy.tp1.tpjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens fr.uvsq.iutvelizy.tp1.tpjavafx to javafx.fxml;
    exports fr.uvsq.iutvelizy.tp1.tpjavafx;
}
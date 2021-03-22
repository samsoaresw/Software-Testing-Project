/* doesn't work with source level 1.8:
module sample {
    requires javafx.controls;
    requires javafx.fxml;

    opens sample to javafx.fxml;
    exports sample;
}
*/

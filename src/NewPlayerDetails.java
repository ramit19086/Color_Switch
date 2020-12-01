import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.transform.Rotate;

public class NewPlayerDetails {

    @FXML
    private Group obs11;
    @FXML
    private Group obs22;

    Rotate rotate11 = new Rotate();
    Rotate rotate22 = new Rotate();

    @FXML
    Button submit;
    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long l) {
            //11
            rotate11.setPivotX(0);
            rotate11.setPivotY(0);
            rotate11.setAxis(new Point3D(0,0,1));
            obs11.getTransforms().addAll(rotate11);
            rotate11.setAngle(1.5);

            //22
            rotate22.setPivotX(0);
            rotate22.setPivotY(0);
            rotate22.setAxis(new Point3D(0,0,1));
            obs22.getTransforms().addAll(rotate22);
            rotate22.setAngle(1.5);
        }
    };

    public NewPlayerDetails(){ timer.start(); }
    public void dosubmit(ActionEvent e){
        Frame.navigation.load("Player_Menu.fxml");
    }
}
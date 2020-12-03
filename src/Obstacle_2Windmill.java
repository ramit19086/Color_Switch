import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

public class Obstacle_2Windmill extends Obstacle{
    private Shape_rect rect1;
    private Shape_rect rect2;
    private Shape_rect rect3;
    private Shape_rect rect4;

    private Shape_rect rect5;
    private Shape_rect rect6;
    private Shape_rect rect7;
    private Shape_rect rect8;

    private Group grp1 = new Group();
    private Group grp2 = new Group();

    public Obstacle_2Windmill(){
        display();
    }

    @Override
    public void display() {
        rect1 = new Shape_rect(50,150,colors[0],144,140,164,38);
        rect2 = new Shape_rect(150,50,colors[3],0,121,38,164);
        rect3 = new Shape_rect(50,150,colors[2],145,-24,164,38);
        rect4 = new Shape_rect(150,50,colors[1],162,121,38,164);

        grp1.getChildren().addAll(rect1.getRect(),rect2.getRect(),rect3.getRect(),rect4.getRect());

        rect5 = new Shape_rect(50,150,colors[0],144,140,164,38);
        rect6 = new Shape_rect(150,50,colors[1],0,121,38,164);
        rect7 = new Shape_rect(50,150,colors[2],145,-24,164,38);
        rect8 = new Shape_rect(150,50,colors[3],162,121,38,164);

        grp2.getChildren().addAll(rect5.getRect(),rect6.getRect(),rect7.getRect(),rect8.getRect());

        //grp1 properties
        grp1.setLayoutX(30);
        grp1.setLayoutY(322);
        grp1.setScaleX(0.35);
        grp1.setScaleY(0.35);

        //grp2 properties
        grp2.setLayoutX(144);
        grp2.setLayoutY(322);
        grp2.setScaleX(0.35);
        grp2.setScaleY(0.35);
        grp2.setRotate(0);
        group.getChildren().addAll(grp1,grp2);
    }

    @Override
    public boolean checkcollide(Circle c) {
        return false;
    }
    private Rotate rotateobj = new Rotate();
    private Rotate rotateright = new Rotate();
    @Override
    public void rotate() {
        rotateobj.setPivotX(163);
        rotateobj.setPivotY(140);
        rotateobj.setAngle(1.5);
        grp1.getTransforms().add(rotateobj);

        rotateright.setPivotX(163);
        rotateright.setPivotY(140);
        rotateright.setAxis(new Point3D(0,0,1));
        grp2.getTransforms().addAll(rotateright);
        rotateright.setAngle(-1.5);
    }

}
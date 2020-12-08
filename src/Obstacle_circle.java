import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;

import java.util.ArrayList;

public class Obstacle_circle extends Obstacle {

    private Shape_quartcircle q1;
    private Shape_quartcircle q2;
    private Shape_quartcircle q3;
    private Shape_quartcircle q4;

    private Rotate rotate_obj = new Rotate();

    private ArrayList<Shape_quartcircle> allshapes = new ArrayList<>();


    @Override
    public boolean collide(Ball c) {
        for(Shape_quartcircle s:allshapes)
        {
            if(s.collide(c) && !s.getQuat().getFill().equals(c.getBallColor()))
                return true;

        }
        return false;
    }

    @Override
    public void rotate() {
        rotate_obj.setPivotX(400);
        rotate_obj.setPivotY(300);
        rotate_obj.setAngle(2);
        group.getTransforms().add(rotate_obj);
    }

    @Override
    public void display() {
        q1=new Shape_quartcircle(0,0,0,colors[0]);
        q2=new Shape_quartcircle(250,250,180,colors[1]);
        q3=new Shape_quartcircle(0,250,-90,colors[2]);
        q4=new Shape_quartcircle(250,0,90,colors[3]);

        allshapes.add(q1);
        allshapes.add(q2);
        allshapes.add(q3);
        allshapes.add(q4);

        group.getChildren().addAll(q1.getQuat(),q2.getQuat(),q3.getQuat(),q4.getQuat());
        //group properties
        group.setLayoutX(-150);
        group.setLayoutY(-170);
        group.setScaleX(0.35);
        group.setScaleY(0.35);
    }

    public Obstacle_circle() {
        display();
    }
}

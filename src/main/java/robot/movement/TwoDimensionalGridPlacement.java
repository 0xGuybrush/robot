package robot.movement;

import java.awt.*;

public class TwoDimensionalGridPlacement implements Placement {
    Rotation rotation;
    Point coordinate;

    enum Rotation {
            NORTH, SOUTH, EAST, WEST
    }

}

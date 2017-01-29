package robot.io;

import robot.movement.Grid;
import robot.robot.Robot;

public interface Command {

    /*
		Validates itself against the grid.
        Calls robot.setPlacement() if valid
        Logs errors
    */
    void execute(Robot robot, Grid grid);
}

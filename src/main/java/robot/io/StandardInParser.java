package robot.io;

import robot.movement.Placement;

import java.util.Queue;

/**
 * Code to reaad from STDIN.
 */
public class StandardInParser implements InputParser {


    public StandardInParser(String[] args) {

    }

    @Override
    public void setQueue(Queue<Command> commands) {

    }

    @Override
    public boolean isLive() {
        return false;
    }

    @Override
    public Placement getInitialPlacement() {
        return null;
    }

    @Override
    public void checkForNewCommands() {

    }
}

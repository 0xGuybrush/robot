package robot.io;

import robot.movement.Placement;

import java.util.Queue;

public interface InputParser {
    /* Allows parser to push commands onto the Robot’s queue */
    void setQueue(Queue<Command> commands);

    /* Logic to handle timeouts against input,
    e.g. close if user is inactive */
    boolean isLive();

    /* Loops until a valid PLACE command formats and sends to Robot */
    Placement getInitialPlacement();

    /* If “isLive”, reads input and pushes valid commands
        onto the Robot’s queue.
    *   Logs invalid commands */
    void checkForNewCommands();
}

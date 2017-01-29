package robot.robot;

import robot.io.Command;
import robot.io.InputParser;
import robot.movement.Grid;
import robot.movement.Placement;
import robot.report.ReportGenerator;

import java.util.LinkedList;
import java.util.Queue;

public class Robot {
    InputParser inputParser;
    ReportGenerator reportGenerator;
    Grid grid;
    Placement currentPlacement;
    Queue<Command> commands = new LinkedList<Command>();

    public Robot(InputParser inputParser, ReportGenerator reportGenerator, Grid grid) {
        this.inputParser = inputParser;
        this.reportGenerator = reportGenerator;
        this.grid = grid;

        currentPlacement = inputParser.getInitialPlacement();
        inputParser.setQueue(commands);
    }

    public void traverse() {
        while (inputParser.isLive() || commands.poll() != null) {
            inputParser.checkForNewCommands();
            Command nextCommand = commands.remove();
            nextCommand.execute(this, grid);
        }

        reportGenerator.generate(currentPlacement);

    }

    protected void setPlacement(Placement placement) {
        this.currentPlacement = placement;
    }
}
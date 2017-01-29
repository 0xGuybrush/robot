package robot;

import robot.io.InputParser;
import robot.io.StandardInParser;
import robot.movement.BasicGrid;
import robot.movement.Grid;
import robot.report.ReportGenerator;
import robot.report.StandardOutputReportGenerator;
import robot.robot.Robot;

public class Application {
    public static void main(String args[]) {
        InputParser inputParser = new StandardInParser(args);
        ReportGenerator reportGenerator = new StandardOutputReportGenerator();
        Grid grid = new BasicGrid(5, 5);

        Robot robot = new Robot(inputParser, reportGenerator, grid);

        robot.traverse();
    }
}

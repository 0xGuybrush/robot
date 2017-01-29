package robot.report;

import robot.movement.Placement;

public interface ReportGenerator {

    /* Generates report as needed */
    void generate(Placement placement);
}

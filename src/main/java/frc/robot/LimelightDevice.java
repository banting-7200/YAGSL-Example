package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.NetworkTableEntry;

public class LimelightDevice {
    private NetworkTable mainTable;

    public LimelightDevice() {
        mainTable = NetworkTableInstance.getDefault().getTable("limelight");
    }

    public void setCameraLightState(boolean on) {
        mainTable.getEntry("ledMode").setNumber(on ? 3 : 1);
    }

    //Set which pipeline you want the limelight to be processing. 0 for april tag detection, 1 for note detection.
    public void setPipeline(int pipeline) {
		NetworkTableEntry pipelineEntry = mainTable.getEntry("pipeline");
    	pipelineEntry.setNumber(pipeline);
    }

    /**
     * 0 = x
     * 1 = y
     * 2 = area
     */
    public double[] getLimelightCurrentData() {
        return new double[] {
            mainTable.getEntry("tx").getDouble(0),
            mainTable.getEntry("ty").getDouble(0),
            mainTable.getEntry("ta").getDouble(0)
        };
    }
}
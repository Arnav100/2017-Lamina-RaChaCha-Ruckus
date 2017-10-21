package org.usfirst.frc.team4930.robot.utilities;

import java.io.*;
import org.usfirst.frc.team4930.robot.*;

public class ReplayRecorder
{

  private FileWriter writer;
  private long startTimestamp;
  private String alliance;

  // instantiate writer and set the start time
  public void setup() throws IOException {
    writer = new FileWriter(Robot.replayFilePath);
    alliance = Robot.switches.getAlliance();
    startTimestamp = System.currentTimeMillis();
    Robot.isRecording = true;
    OI.motorControllerSafetyAndBrakes(false, false);
  }

  // write a timestamp, the motor values, then make a new line
  public void record() throws IOException {
    if (writer != null) {
      writer.append("" + (System.currentTimeMillis() - startTimestamp));
      // alliance
      writer.append("," + alliance);
      // drive train left
      writer.append("," + Robot.oi.j0.getY());
      // drive train right
      writer.append("," + Robot.oi.j1.getY());
      // gear gadget left value
      writer.append("," + RobotMap.gadgetL.get());
      // gear gadget right value
      writer.append("," + RobotMap.gadgetR.get());
      // intake value
      writer.append("," + RobotMap.intake.get());
      // create a new line
      writer.append("\n");
    }
  }

  // stop writing to file
  public void end() throws IOException {
    Robot.isRecording = false;
    if (writer != null) {
      writer.flush();
      writer.close();
    }
    OI.motorControllerSafetyAndBrakes(false, true);
  }
}

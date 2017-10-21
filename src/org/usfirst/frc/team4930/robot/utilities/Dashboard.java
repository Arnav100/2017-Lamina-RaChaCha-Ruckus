package org.usfirst.frc.team4930.robot.utilities;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.RobotMap;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Dashboard
{

  long currentTime;

  public Dashboard() {
    currentTime = System.currentTimeMillis();
  }

  public void update() {

    // limit smart dashboard updates
    if (System.currentTimeMillis() > (currentTime + 200)) {

      currentTime = System.currentTimeMillis();

      // set selected replay dial
      Robot.dial.setSelectedReplay();

      // put hard code values
      SmartDashboard.putString("4", "Intake: " + String.valueOf(RobotMap.values.get("intake_in") * 100));

      // put dial and alliance side
      SmartDashboard.putString("16", "Replay Selected: " + Robot.autoDescription);
      SmartDashboard.putString("17", "Alliance Switch: " + Robot.switches.getAlliance());
      SmartDashboard.putString("18", "Replay Switch: " + Robot.switches.getRoutineOrReplay());

    }

  }
}

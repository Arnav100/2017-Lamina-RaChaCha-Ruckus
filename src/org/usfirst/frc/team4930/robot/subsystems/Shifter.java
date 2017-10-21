package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.Robot;
import org.usfirst.frc.team4930.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shifter extends Subsystem
{
  public void initDefaultCommand() {}

  public void lowGear() {
    RobotMap.solenoid1.set(true);
    Robot.inLowGear = true;
  }

  public void highGear() {
    RobotMap.solenoid1.set(false);
    Robot.inLowGear = false;
  }
}

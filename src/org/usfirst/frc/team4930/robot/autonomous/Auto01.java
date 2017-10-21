package org.usfirst.frc.team4930.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto01 extends CommandGroup
{
  public Auto01() {

    System.out.println("AUTO 01: Initializing");

    // go straight at 90% speed for 2 seconds, if something goes wrong stop at 3 seconds
    addSequential(new GoStraight(0.9, 2), 3);

  }
}

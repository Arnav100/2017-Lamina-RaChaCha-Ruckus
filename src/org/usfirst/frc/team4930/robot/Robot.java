package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.sensors.*;
import org.usfirst.frc.team4930.robot.subsystems.*;
import org.usfirst.frc.team4930.robot.utilities.*;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends IterativeRobot
{

  public static OI oi;
  public static Dashboard dashboard;
  public static CANTalon testMotor;

  // subsystems
  public static Climber climber;
  public static DriveTrain driveTrain;
  public static GearGadget gearGadget;
  public static Intake intake;
  public static Shifter shifter;
  public static Lifter lifter;
  public static Poker poker;

  // sensors
  public static Cameras cameras;
  public static Dial dial;
  public static ToggleSwitch switches;

  // auto replay setup
  public static Integer dialNumber;
  public static Command autoCommand;
  public static String autoDescription;
  public static String replayFilePath;
  public static ReplayPlayer replayPlayer;
  public static ReplayRecorder replayRecorder;

  // initial robot states
  public static boolean inLowGear = true;
  public static boolean isRecording = false;
  public static boolean isReplaying = false;
  public static boolean isRed = false;
  public static boolean isReplayOn = false;

  public void robotInit() {

    // initialize robot mappings
    RobotMap.init();

    // instantiate drive train first
    Robot.driveTrain = new DriveTrain();

    // instantiate the rest of the subsystems and sensors
    Robot.cameras = new Cameras();
    Robot.climber = new Climber();
    Robot.gearGadget = new GearGadget();
    Robot.intake = new Intake();
    Robot.shifter = new Shifter();
    Robot.lifter = new Lifter();
    Robot.poker = new Poker();
    Robot.dial = new Dial();
    Robot.switches = new ToggleSwitch();

    // instantiate replay code
    Robot.replayPlayer = new ReplayPlayer();
    Robot.replayRecorder = new ReplayRecorder();

    // instantiate dashboard and oi last
    Robot.oi = new OI();
    Robot.dashboard = new Dashboard();

    OI.motorControllerSafetyAndBrakes(false, true);
  }

  public void robotPeriodic() {
    Robot.dashboard.update();
  }

  public void autonomousInit() {
    Robot.autoCommand.start();
  }

  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  public void teleopInit() {
    if (Robot.autoCommand != null) {
      Robot.autoCommand.cancel();
    }
  }

  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  public void disabledInit() {
    RobotMap.disableAllTalons();
  }

  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  public void testInit() {
    Robot.testMotor = new CANTalon(30);
  }

  public void testPeriodic() {
    Robot.testMotor.set(0.5);
  }
}

package org.usfirst.frc.team4930.robot;

import org.usfirst.frc.team4930.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI
{
  // joysticks 0-1-2
  public Joystick j0 = new Joystick(0);
  public Joystick j1 = new Joystick(1);
  public Joystick j2 = new Joystick(2);
  
  // all joystick0 buttons

  // all joystick1 buttons
  public JoystickButton j1b1 = new JoystickButton(j1, 1);
  public JoystickButton j1b3 = new JoystickButton(j1, 3);

  // all joystick2 buttons
  public JoystickButton j2b1 = new JoystickButton(j2, 1);
  public JoystickButton j2b2 = new JoystickButton(j2, 2);
  public JoystickButton j2b3 = new JoystickButton(j2, 3);
  public JoystickButton j2b4 = new JoystickButton(j2, 4);
  public JoystickButton j2b5 = new JoystickButton(j2, 5);
  public JoystickButton j2b6 = new JoystickButton(j2, 6);
  public JoystickButton j2b8 = new JoystickButton(j2, 8);
  public JoystickButton j2b10 = new JoystickButton(j2, 10);
  public JoystickButton j2b12 = new JoystickButton(j2, 12);

  public OI() {
	  
	// joystick0 button actions

    // joystick1 button actions
    j1b1.whenPressed(new ShiftUp());
    j1b1.whenReleased(new ShiftDown());
    j1b3.whenPressed(new ToggleCamera());

    // joystick2 button actions
    j2b1.whenPressed(new PokeOut());
    j2b1.whenReleased(new PokeIn());
    
    j2b2.whileHeld(new ClimbRope());
    
    j2b3.whileHeld(new IntakeIn());;
    
    j2b4.whenPressed(new LiftDown());
    j2b6.whenPressed(new LiftUp());
    
    j2b5.whileHeld(new GearGadgetOpen());
    j2b5.whenReleased(new GearGadgetClose());
    
    j2b8.whenPressed(new ReplayRecord());
    j2b10.whenPressed(new ReplayStopRecord());
    j2b12.whenPressed(new ReplayPlayback());
  }

  public static void motorControllerSafetyAndBrakes(boolean safety, boolean brake) {
    RobotMap.dtMasterMotors.setSafetyEnabled(safety);
    Robot.driveTrain.brakeMode(brake);
    RobotMap.intake.setSafetyEnabled(safety);
    Robot.intake.brakeMode(false);
    RobotMap.gadgetL.setSafetyEnabled(safety);
    RobotMap.gadgetR.setSafetyEnabled(safety);
    Robot.gearGadget.brakeMode(brake);
  }
}

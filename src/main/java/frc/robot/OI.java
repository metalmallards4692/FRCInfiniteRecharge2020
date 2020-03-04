
package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.Intake;

public class OI {

  public final Joystick leftJoy = new Joystick(RobotMap.leftJoystick);
  public final Joystick rightJoy = new Joystick(RobotMap.rightJoystick);
  public final Joystick gamepad = new Joystick(RobotMap.gamepad);
	public JoystickButton gamepadX;	
	public JoystickButton gamepadA;
	public JoystickButton gamepadY;
	public JoystickButton gamepadB;
	public JoystickButton gamepadStart;
	public JoystickButton gamepadSelect;
	public JoystickButton gamepadL1;
	public JoystickButton gamepadR1;
	public JoystickButton gamepadR3;
	public JoystickButton gamepadL3;

  public static final double JOY_DEADZONE = 0.25;
  
  public double getLeftJoyX() {
              double raw = leftJoy.getX();
              return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
  }
  public double getLeftJoyY() {
              double raw = leftJoy.getY();
              return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
  }
  public double getRightJoyX() {
              double raw = rightJoy.getX();
              return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
  }
  public double getRightJoyY() {
              double raw = rightJoy.getY();
              return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
  }

  public OI() {
    gamepadX = new JoystickButton(gamepad, RobotMap.GamepadX);
		gamepadA = new JoystickButton(gamepad, RobotMap.GamepadA);
		gamepadY = new JoystickButton(gamepad, RobotMap.GamepadY);
		gamepadB = new JoystickButton(gamepad, RobotMap.GamepadB);
		gamepadStart = new JoystickButton(gamepad, RobotMap.GamepadStart);
		gamepadSelect = new JoystickButton(gamepad, RobotMap.GamepadSelect);
		gamepadR1 = new JoystickButton(gamepad, RobotMap.GamepadR1);
    gamepadL1 = new JoystickButton(gamepad, RobotMap.GamepadL1);
    gamepadR3 = new JoystickButton(gamepad, RobotMap.GamepadR3);
    gamepadL3 = new JoystickButton(gamepad, RobotMap.GamepadL3);

  //Command Calls
    gamepadY.whileHeld(new ShootOut());
    gamepadY.whenReleased(new ShootStop());
    gamepadA.whileHeld(new IntakeIn());
    gamepadA.whenReleased(new IntakeStop());
    gamepadX.whenPressed(new IntakeSlide());
    gamepadR3.whenPressed(new HoodUp());
    gamepadL3.whenPressed(new HoodDown());

  //LimeLight Command Calls
    gamepadStart.whileHeld(new LimelightAimRange());
 
  
  //SmartDashboad
    SmartDashboard.putData("LimeLightDrive", new LimeLightDrive());
    SmartDashboard.putData("LimeLightAimRange", new LimelightAimRange());
    SmartDashboard.putData("LimeLightRange", new LimeLightRange());
  }
}

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class RobotMap {
//Drive Motors
  public static int rightMotor = 12;
  public static int leftMotor = 13;
  //Slave Motors
    public static int rightSlave = 14;
    public static int leftSlave = 15;
//Intake Motors
  public static int intakeMotor = 5;
//Shooting Motor
  public static int shootMotor = 6;
//Joysticks
  public static int rightJoystick = 0;
  public static int leftJoystick = 1;
//Gamepad
  public static int gamepad = 2;
  //Gamepad Buttons
    public static int GamepadA = 2;
    public static int GamepadB = 3;
    public static int GamepadX = 1;
    public static int GamepadY = 4;
    public static int GamepadL1 = 5;
    public static int GamepadR1 = 6;           
    public static int GamepadSelect = 7;
    public static int GamepadStart = 8;
    public static int GamepadR3 = 12;

//Spark Motors
  public static CANSparkMax RightMotor = new CANSparkMax(RobotMap.rightMotor, MotorType.kBrushless);
  public static CANSparkMax LeftMotor = new CANSparkMax(RobotMap.leftMotor, MotorType.kBrushless);
  public static CANSparkMax RightSlave = new CANSparkMax(RobotMap.rightSlave, MotorType.kBrushless);
  public static CANSparkMax LeftSlave = new CANSparkMax(RobotMap.leftSlave, MotorType.kBrushless);
  public static CANSparkMax IntakeMotor = new CANSparkMax(RobotMap.intakeMotor, MotorType.kBrushless);
  public static CANSparkMax ShootMotor = new CANSparkMax(RobotMap.shootMotor, MotorType.kBrushless);

}

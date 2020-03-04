package frc.robot;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import frc.robot.RobotMap;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.*;
import frc.robot.commands.*;

public class Robot extends TimedRobot {
  public static DriveTrain driveTrain = new DriveTrain();
  public static Object vision_hardware;
  public static Intake intake = new Intake();
  public static Hood hood = new Hood();
  public static Climber climber = new Climber();
  public static Pneumatics pneumatics = new Pneumatics();
  //public static Index indexer = new Index();
  //public static Index index = new Index();
  public static Auto autonomous;
  private Command TankDrive;
  private CANSparkMax rightMotor = RobotMap.RightMotor;
  private CANSparkMax leftMotor = RobotMap.LeftMotor;
  private CANEncoder rightEncoder;
  private CANEncoder leftEncoder;
  public static OI m_oi;

  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();

  @Override
  public void robotInit() {
   
    m_chooser.setDefaultOption("Default Auto", new TankDrive());
    TankDrive = new TankDrive();
    autonomous = new Auto();
    //ClimbDown = new ClimbDown();
  
    rightEncoder = rightMotor.getEncoder();
    leftEncoder = leftMotor.getEncoder();
    m_oi = new OI();
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_chooser.getSelected();

    if (m_autonomousCommand != null) {
      autonomous.start();
    }
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {

    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }

    TankDrive.start();

  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();

    //Limelight
        NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
        NetworkTableEntry tx = table.getEntry("tx");
        NetworkTableEntry ty = table.getEntry("ty");
        NetworkTableEntry ta = table.getEntry("ta");    
	
    //read values periodically
        double x = tx.getDouble(0.0);
        double y = ty.getDouble(0.0);
        double area = ta.getDouble(0.0);

  // Shift gears using a third dedicated joystick (small black one)
	
  //post to smart dashboard periodically
  SmartDashboard.putNumber("RightJoy", Robot.m_oi.getRightJoyY());
	SmartDashboard.putNumber("LimelightX", x);
	SmartDashboard.putNumber("LimelightY", y);
  SmartDashboard.putNumber("LimelightArea", area);
  SmartDashboard.putNumber("LeftEncoder", leftEncoder.getPosition());
  SmartDashboard.putNumber("RightEncoder", rightEncoder.getPosition());
  
  }

  @Override
  public void testPeriodic() {
  }
}
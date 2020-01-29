package frc.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Hood;
import frc.robot.subsystems.Intake;


public class Robot extends TimedRobot {
  public static DriveTrain driveTrain = new DriveTrain();
      public static Object vision_hardware;
  public static Intake intake = new Intake();
  public static Hood hood = new Hood();
  public static OI m_oi;
  private Command TankDrive;





  Command m_autonomousCommand;
  SendableChooser<Command> m_chooser = new SendableChooser<>();


  @Override
  public void robotInit() {
    m_oi = new OI();
    m_chooser.setDefaultOption("Default Auto", new TankDrive());
    TankDrive = new TankDrive();


    //SmartDashboard.putData("Auto mode", m_chooser);
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
      m_autonomousCommand.start();
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
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
	//NetworkTableEntry tv = table.getEntry("tv");
	  NetworkTableEntry tx = table.getEntry("tx");
	  NetworkTableEntry ty = table.getEntry("ty");
	  NetworkTableEntry ta = table.getEntry("ta");
	
	//read values periodically
	double x = tx.getDouble(0.0);
	double y = ty.getDouble(0.0);
	double area = ta.getDouble(0.0);
	
	//post to smart dashboard periodically
	SmartDashboard.putNumber("LimelightX", x);
	SmartDashboard.putNumber("LimelightY", y);
	SmartDashboard.putNumber("LimelightArea", area);
  }

  @Override
  public void testPeriodic() {
  }
}
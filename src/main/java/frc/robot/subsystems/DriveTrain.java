
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import oi.limelightvision.limelight.frc.LimeLight;

public class DriveTrain extends Subsystem {
  private LimeLight _limelight;
  private CANSparkMax rightMotor = RobotMap.RightMotor;
  private CANSparkMax leftMotor = RobotMap.LeftMotor;
  private CANSparkMax rightSlave = RobotMap.RightSlave;
  private CANSparkMax leftSlave = RobotMap.LeftSlave;
  private DifferentialDrive differentialDrive1;

  public DriveTrain() {
      _limelight = new LimeLight();
      differentialDrive1 = new DifferentialDrive(leftMotor, rightMotor);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TankDrive());
    rightSlave.follow(rightMotor);
    leftSlave.follow(leftMotor);
  }

  public void drive() {
    leftMotor.set(Robot.m_oi.getLeftJoyY()); 
    rightMotor.set(Robot.m_oi.getRightJoyY());
   
  }

  public void AutoDrive() {
    rightMotor.set(.5);
    leftMotor.set(-.5);
  }

  public void AutoDriveStop() {
    rightMotor.set(0);
    leftMotor.set(0);
  }

  public void teleopDrive(double speed, double turn){
  }

  public void MyTankDrive(double xSpeed, double zRotation) {
    differentialDrive1.tankDrive(xSpeed, zRotation);
  }

  public LimeLight gLimeLight() {
    return _limelight;
  }
}

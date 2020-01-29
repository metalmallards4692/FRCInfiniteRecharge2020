
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
  CANSparkMax rightMotor = RobotMap.RightMotor;
  CANSparkMax leftMotor = RobotMap.LeftMotor;
  CANSparkMax rightSlave = RobotMap.RightSlave;
  CANSparkMax leftSlave = RobotMap.LeftSlave;
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
    rightMotor.set(-Robot.m_oi.getRightJoyY());
    leftMotor.set(-Robot.m_oi.getLeftJoyY());

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

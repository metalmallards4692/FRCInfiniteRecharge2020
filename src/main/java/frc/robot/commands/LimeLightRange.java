
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class LimeLightRange extends Command {

  private double kpDistance = 0.09;
  private double m_moveValue;
  private double m_rotateValue;

  public LimeLightRange() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    double ty = Robot.driveTrain.gLimeLight().getdegVerticalToTarget();
    boolean targetFound = Robot.driveTrain.gLimeLight().getIsTargetFound();

    if(targetFound){
      m_moveValue = ty * kpDistance;
      m_rotateValue = 0;
    }else{
      m_moveValue = 0;
      m_rotateValue = 0;
    }

    Robot.driveTrain.MyTankDrive(m_moveValue, m_rotateValue);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
      Robot.driveTrain.MyTankDrive(0,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}


package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class LimeLightRange extends Command {

  private double kpDistance = 0.09;
  private double m_moveValue;
  private double m_rotateValue;

  public LimeLightRange() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
  }

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

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
      Robot.driveTrain.MyTankDrive(0,0);
  }

  @Override
  protected void interrupted() {
    end();
  }
}

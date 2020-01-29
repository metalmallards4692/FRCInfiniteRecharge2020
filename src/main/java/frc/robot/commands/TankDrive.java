

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;



public class TankDrive extends Command {
  public TankDrive() {

    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.driveTrain.drive();
    double m_moveValue = Robot.m_oi.leftJoy.getRawAxis(1);
    double m_rotateValue = Robot.m_oi.rightJoy.getRawAxis(4);

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

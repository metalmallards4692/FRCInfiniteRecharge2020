
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShootOut extends Command {
  public ShootOut() {
    requires(Robot.hood);
  }


  @Override
  protected void initialize() {
  }


  @Override
  protected void execute() {
    Robot.hood.ShootBall(1);
  }


  @Override
  protected boolean isFinished() {
    return false;
  }


  @Override
  protected void end() {
    Robot.hood.ShootBall(0);
  }


  @Override
  protected void interrupted() {
  }
}

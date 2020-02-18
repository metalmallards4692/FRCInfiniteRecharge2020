

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
    
  }

  @Override
  protected boolean isFinished() {
      return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
      end();
  }
}

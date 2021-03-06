
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class HoodDown extends Command {
  public HoodDown() {
    requires(Robot.hood);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.hood.HoodDown();
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
  }
}

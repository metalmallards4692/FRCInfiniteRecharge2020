
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShiftGears extends Command {
  public ShiftGears() {
    requires(Robot.pneumatics);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.pneumatics.shiftGears( 0.5, 1);
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

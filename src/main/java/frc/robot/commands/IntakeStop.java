

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeStop extends Command {
  public IntakeStop() {
   requires(Robot.intake);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.intake.TakeBall(0);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.intake.TakeBall(0);
  }

  @Override
  protected void interrupted() {
  }
}

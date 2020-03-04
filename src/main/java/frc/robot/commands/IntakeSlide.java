
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeSlide extends Command {
  boolean bDone = false;
  public IntakeSlide() {
    requires(Robot.intake);
  }

  @Override
  protected void initialize() {
    bDone = false;
    Robot.intake.IntakeSlideInOut();
  }

  @Override
  protected void execute() {
    bDone = true;
  }

  @Override
  protected boolean isFinished() {
    return bDone;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}

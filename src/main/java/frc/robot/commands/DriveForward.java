
package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveForward extends Command {
      Timer driveTimer = new Timer();
  public DriveForward() {
      requires(Robot.driveTrain);
  }


  @Override
  protected void initialize() {
    driveTimer.start();
  }

  @Override
  protected void execute() {
      Robot.driveTrain.AutoDrive();
  }

  @Override
  protected boolean isFinished() {
    return (driveTimer.get()>2.0);
  }

  @Override
  protected void end() {
    Robot.driveTrain.AutoDriveStop();
  }

  @Override
  protected void interrupted() {
  }
}

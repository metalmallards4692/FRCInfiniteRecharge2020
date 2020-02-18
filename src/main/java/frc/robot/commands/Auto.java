
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup {

  public Auto() {
    addSequential(new DriveForward());
    addSequential(new LimelightAimRange());
    addSequential(new ShootOut());
  }
}

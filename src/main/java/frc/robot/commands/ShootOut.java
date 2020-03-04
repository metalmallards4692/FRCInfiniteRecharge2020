
package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShootOut extends Command {
  public ShootOut() {
    requires(Robot.hood);
  }

  @Override
  protected void initialize() {
  }

  //checking solenoid on hood, if it's low, run half speed
  //otherwise run the shooter full speed
  @Override
  protected void execute() {
    DoubleSolenoid.Value val = Robot.hood.HoodCylinders.get();
    if(val == Value.kForward) {
      Robot.hood.ShootBall(1);
    } else {
      Robot.hood.ShootBall(.5);
    }    
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.hood.ShootBall(0);
    //Robot.hood.ShootBallRight(0);
  }

  @Override
  protected void interrupted() {
  }
}

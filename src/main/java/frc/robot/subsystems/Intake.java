
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;


public class Intake extends Subsystem {
  private DoubleSolenoid IntakeCylinder;
  CANSparkMax intakeMotor = RobotMap.IntakeMotor;

  public Intake() {
    IntakeCylinder = new DoubleSolenoid(2,2,3);
    IntakeCylinder.set(Value.kOff);
  }

  public void TakeBall(double output) {
    intakeMotor.set(output);
  }
//call this to make the intake slide move.  this should check  the current state of the selonoid and do the reverse
  public void IntakeSlideInOut() {
    DoubleSolenoid.Value val = IntakeCylinder.get();
    if(val == DoubleSolenoid.Value.kForward) {
      IntakeCylinder.set(Value.kReverse);
    }
    else {
      IntakeCylinder.set(Value.kForward);
    }
  }
  //end IntakeSlide method

  /*public void IntakeIn() {
    IntakeCylinder.set(Value.kReverse);
  }*/

  @Override
  public void initDefaultCommand() {
  }
}

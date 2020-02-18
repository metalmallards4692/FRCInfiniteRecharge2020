
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
    IntakeCylinder = new DoubleSolenoid(0,2,3);
    IntakeCylinder.set(Value.kOff);
  }

  public void TakeBall(double output) {
    intakeMotor.set(output);
  }

  public void IntakeUp() {
    IntakeCylinder.set(Value.kForward);
  }

  public void IntakeDown() {
    IntakeCylinder.set(Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
   IntakeCylinder.set(Value.kOff);
  }
}

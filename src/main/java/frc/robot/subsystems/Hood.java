
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class Hood extends Subsystem {
  CANSparkMax shootMotor = RobotMap.ShootMotor;
  CANSparkMax shootRight = RobotMap.ShootRight;
  public DoubleSolenoid HoodCylinders;

  public Hood() {
    HoodCylinders = new DoubleSolenoid(0,0,1);
    HoodCylinders.set(Value.kOff);
  }

  public void ShootBall(double output) {
    shootMotor.set(output);
    shootRight.set(-output);
  }

  //public void ShootBallRight(double output) {
   // shootSlave.set(-output);
  //}

  public void HoodUp() {
    HoodCylinders.set(DoubleSolenoid.Value.kForward);
  }

  public void HoodDown() {
    HoodCylinders.set(DoubleSolenoid.Value.kReverse);
  }

  public void initDefaultCommand() {
    HoodCylinders.set(Value.kOff);
  }
}

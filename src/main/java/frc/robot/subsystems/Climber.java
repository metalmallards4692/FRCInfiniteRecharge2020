
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Climber extends Subsystem {
  WPI_VictorSPX climbWheel;
  private DoubleSolenoid ClimbCylinders;

public Climber() {
  climbWheel = new WPI_VictorSPX(RobotMap.climbWheel);
  ClimbCylinders = new DoubleSolenoid(2,0,1);
  ClimbCylinders.set(Value.kOff);
}

public void ClimbDrive(double output) {
  climbWheel.set(ControlMode.PercentOutput, output);
}

public void ArmOut() {
  ClimbCylinders.set(DoubleSolenoid.Value.kForward);
}

public void ArmIn() {
  ClimbCylinders.set(DoubleSolenoid.Value.kReverse);
}


  @Override
  public void initDefaultCommand() {
    ClimbCylinders.set(Value.kOff);
  }
}

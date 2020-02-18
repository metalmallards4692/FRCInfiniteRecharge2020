
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;

public class Pneumatics extends Subsystem {
  public static OI m_oi;
  private DoubleSolenoid gearShifter;

  public Pneumatics(){
    m_oi = new OI();
    gearShifter = new DoubleSolenoid(0,4,5);
  }
  
  @Override
  public void initDefaultCommand() {
  }

public void shiftGears(double threshold, int axis){
  if(m_oi.leftJoy.getRawAxis(axis) <= -0.05 && m_oi.rightJoy.getRawAxis(axis) <= -0.05){
    gearShifter.set(DoubleSolenoid.Value.kForward);
  }else if (m_oi.leftJoy.getRawAxis(axis) <= 0.05 && m_oi.rightJoy.getRawAxis(axis) <= 0.05){
    gearShifter.set(DoubleSolenoid.Value.kReverse);
  }else{
    }
  }

}

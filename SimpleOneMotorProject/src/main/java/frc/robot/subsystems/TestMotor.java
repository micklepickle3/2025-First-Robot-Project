package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TestMotor extends SubsystemBase {
    private TalonFX motor;
    
    public TestMotor() {
        motor = new TalonFX(14);
    }

    public void setSpeed(double speed) {
        motor.setVoltage(speed * 2);
    }

    public void stopMovement () {
        motor.setVoltage(0);
    }
}
//say gex
//patthew mickart
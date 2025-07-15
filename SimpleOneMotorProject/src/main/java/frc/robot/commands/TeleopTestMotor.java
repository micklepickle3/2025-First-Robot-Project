package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.TestMotor;

public class TeleopTestMotor extends Command{
    private TestMotor m_TestMotor;
    private DoubleSupplier speedSup;
    
    public TeleopTestMotor(TestMotor motor, DoubleSupplier speed) {
        m_TestMotor = motor;
        speedSup = speed;

        addRequirements(motor);
    }
    
    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        double speed = speedSup.getAsDouble();
                  
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        
    }
}
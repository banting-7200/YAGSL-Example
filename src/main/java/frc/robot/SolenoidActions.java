package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;

public class SolenoidActions {
    private final Solenoid SOLENOID;

    public SolenoidActions(Solenoid s) {      
        SOLENOID = s;
        setOff();
    }

    public void toggle() {
        SOLENOID.set(!SOLENOID.get());
    }

    public void setOff() {
        SOLENOID.set(false);
    }

    public void setOn() {
        SOLENOID.set(true);
    }
}

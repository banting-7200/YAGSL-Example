package frc.robot;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
//import frc.robot.Color;

public class Lights {
    private final AddressableLED statusLights;
    private final AddressableLEDBuffer statusBuffer;

    enum lightStates {
        ReadyForPickup,
        NotePickedUp,
        CarryingNote,
        ReadyToShoot
    }

    /*
     * Color ReadyForPickupColor = new Color();
     * Color NotePickedUpColor = new Color();
     * Color CarryingNoteColor = new Color();
     * Color ReadyToShootColor = new Color();
     */

    public Lights(int lightPort, int stringLength) {
        statusLights = new AddressableLED(lightPort);
        statusBuffer = new AddressableLEDBuffer(stringLength);
        statusLights.setLength(stringLength);
        statusLights.start();
    }
    
    //Singleton instance of lights to call in other classes. 
    Lights instance = new Lights(0, 0);// port and length still nedd to be filled as they are unknowns right now. 

    public void SetLightState(lightStates stateToSet) {
        switch (stateToSet) {
            case ReadyForPickup:
                setColor(232, 7, 7);// Red
                break;
            case NotePickedUp:
                setColor(237, 122, 7);// Orange
                break;
            case CarryingNote:
                setColor(12, 28, 245);// Blue
                break;
            case ReadyToShoot:
                setColor(23, 232, 61);// Green
                break;
            default:
                setColor(255, 0, 247);// Purple(for error)
                break;
        }
    }

    public void setColor(int r, int g, int b) {
        for (int i = 0; i < statusBuffer.getLength(); i++) {
            statusBuffer.setRGB(i, r, g, b);
        }

        statusLights.setData(statusBuffer);
    }
}

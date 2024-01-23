package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ArmMovement {
    
    //look into .config_k for limits on motor controller 
    WPI_VictorSPX m_intake, m_shoot, m_armOne, m_armTwo; //motor object 
    double m_speed = 0.8;  //-1.0 to 1.0    motor speed 
    double a_speed = 0.2; //-1.0 to 1.0     arm speed
    
    double shootRPM = 2800;
    double intakeRPM;


    //Todo figure out encoders with SPX 
    //There has to be a better way to make these motors move right??? This is so repetitive 
    public void intake(){ 
        m_intake = new WPI_VictorSPX(3); 
        
        double m_velocity = 2048 / intakeRPM / 600;// This math converts the desired rpm to a motor velocity(supposedly)
        m_intake.set(ControlMode.Velocity, m_velocity);

        //intake till prox sensor says stop 
    }   


    public void shoot(){ 
        m_shoot = new WPI_VictorSPX(4); 
        
        double m_velocity = 2048 / shootRPM / 600;// This math converts the desired rpm to a motor velocity(supposedly)
        m_shoot.set(ControlMode.Velocity, m_velocity);

        //shoot till prox sensor says stop 

    }


} 

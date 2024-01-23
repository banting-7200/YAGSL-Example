package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class ArmMovement {
    
    //look into .config_k for limits on motor controller 
    WPI_VictorSPX m_intake, m_shoot, m_armOne, m_armTwo; //motor object 
    double m_speed = 0.8;  //-1.0 to 1.0    motor speed 
    double a_speed = 0.2; //-1.0 to 1.0     arm speed
 


    //Todo figure out encoders with SPX 
    //There has to be a better way to make these motors move right??? This is so repetitive 
    public void intake(){ 
        m_intake = new WPI_VictorSPX(3); 
        m_intake.set(m_speed);

        //intake till prox sensor says stop 
    }   


    public void shoot(){ 
        m_shoot = new WPI_VictorSPX(4); 
        m_shoot.set(m_speed);

        //shoot till prox sensor says stop 

    }


} 

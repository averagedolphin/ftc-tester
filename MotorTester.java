  

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.navigation.Position;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.*;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Motor Tester")
public class MotorTester extends LinearOpMode {

// Motor Declarations, Plus their Hardware maps
  private DcMotor motor0;
  private DcMotor motor1;
  private DcMotor motor2;
  private DcMotor motor3;
  private Servo servo0;
  private Servo servo1;
  private Servo servo2;
  private Servo servo3;
  
  motor0 = hardwareMap.get(DcMotor.class, "motor0");
  motor1 = hardwareMap.get(DcMotor.class, "motor1");
  motor2 = hardwareMap.get(DcMotor.class, "motor2");
  motor3 = hardwareMap.get(DcMotor.class, "motor3");
  servo0 = hardwareMap.get(Servo.class, "servo0");
  servo1 = hardwareMap.get(Servo.class, "servo1");
  servo2 = hardwareMap.get(Servo.class, "servo2");
  servo3 = hardwareMap.get(Servo.class, "servo3");

  @Override
  public void runOpMode() {
    double power;
    int selectedMotor = 0;
    waitForStart();
    
    if (opModeIsActive()) {
      
      power = gamepad1.right_stick_x;
      
      while (opModeIsActive()) {
        
        power = gamepad1.right_stick_x;
        
        //Detecting what motor is selected
        
        if (selectedMotor == 0) {
        
        
        
      
        telemetry.update();
        
   }
  }
 }
}

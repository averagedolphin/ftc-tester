  

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.navigation.Position;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.*;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import java.lang.Thread;
import java.lang.System;

@TeleOp(name = "FTC Tester (1 Hub)")
public class ftctester extends LinearOpMode {

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
  servo0 = hardwareMap.get(Servo.class,   "servo0");
  servo1 = hardwareMap.get(Servo.class,   "servo1");
  servo2 = hardwareMap.get(Servo.class,   "servo2");
  servo3 = hardwareMap.get(Servo.class,   "servo3");

  @Override
  public void runOpMode() {
    double power;
    int selectedMotor = 0;
    boolean motorMenu = true;
    waitForStart();
    
    if (opModeIsActive()) {
      
      while (opModeIsActive()) {
        
        power = gamepad1.right_stick_x;
        
        //Detecting what menu and motor is selected
        if (motorMenu = true) {
          
                if (selectedMotor == 0) { 
                  
          telemetry.addLine("  -Motors-  Servo");
          telemetry.addLine("-Motor 0-");
          telemetry.addLine(" Motor 1 ");          
          telemetry.addLine(" Motor 2 ");  
          telemetry.addLine(" Motor 3 ");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(power);
          motor1.setPower(0);
          motor2.setPower(0);
          motor3.setPower(0);
          servo0.setPosition(0);
          servo1.setPosition(0);
          servo2.setPosition(0);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 3;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 1;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
       
          } else if (selectedMotor == 1) {
            
          telemetry.addLine("  -Motors-  Servo");
          telemetry.addLine(" Motor 0 ");
          telemetry.addLine("-Motor 1-");          
          telemetry.addLine(" Motor 2 ");  
          telemetry.addLine(" Motor 3 ");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(power);
          motor2.setPower(0);
          motor3.setPower(0);
          servo0.setPosition(0);
          servo1.setPosition(0);
          servo2.setPosition(0);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 0;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 2;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
                  
          } else if (selectedMotor == 2) {
            
          telemetry.addLine("  -Motors-  Servo");
          telemetry.addLine(" Motor 0 ");
          telemetry.addLine(" Motor 1 ");          
          telemetry.addLine("-Motor 2-");  
          telemetry.addLine(" Motor 3 ");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(0);
          motor2.setPower(power);
          motor3.setPower(0);
          servo0.setPosition(0);
          servo1.setPosition(0);
          servo2.setPosition(0);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 1;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 3;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
          } else if (selectedMotor == 3) {
          telemetry.addLine("  -Motors-  Servo");
          telemetry.addLine(" Motor 0 ");
          telemetry.addLine(" Motor 1 ");          
          telemetry.addLine(" Motor 2 ");  
          telemetry.addLine("-Motor 3-");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(0);
          motor2.setPower(0);
          motor3.setPower(power);
          servo0.setPosition(0);
          servo1.setPosition(0);
          servo2.setPosition(0);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 2;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 0;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
          }
         
        } else {
                if (selectedMotor == 0) { 
                  
          telemetry.addLine("   Motors  -Servo-");
          telemetry.addLine("-Servo 0-");
          telemetry.addLine(" Servo 1 ");          
          telemetry.addLine(" Servo 2 ");  
          telemetry.addLine(" Servo 3 ");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(0);
          motor2.setPower(0);
          motor3.setPower(0);
          servo0.setPosition(power);
          servo1.setPosition(0);
          servo2.setPosition(0);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 3;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 1;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
       
          } else if (selectedMotor == 1) {
            
          telemetry.addLine("   Motors  -Servo-");
          telemetry.addLine(" Servo 0 ");
          telemetry.addLine("-Servo 1-");          
          telemetry.addLine(" Servo 2 ");  
          telemetry.addLine(" Servo 3 ");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(0);
          motor2.setPower(0);
          motor3.setPower(0);
          servo0.setPosition(0);
          servo1.setPosition(power);
          servo2.setPosition(0);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 0;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 2;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
                  
          } else if (selectedMotor == 2) {
            
          telemetry.addLine("   Motors  -Servo-");
          telemetry.addLine(" Servo 0 ");
          telemetry.addLine(" Servo 1 ");          
          telemetry.addLine("-Servo 2-");  
          telemetry.addLine(" Servo 3 ");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(0);
          motor2.setPower(0);
          motor3.setPower(0);
          servo0.setPosition(0);
          servo1.setPosition(0);
          servo2.setPosition(power);
          servo3.setPosition(0);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 1;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 3;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
          } else if (selectedMotor == 3) {
          telemetry.addLine("   Motors  -Servo-");
          telemetry.addLine(" Servo 0 ");
          telemetry.addLine(" Servo 1 ");          
          telemetry.addLine(" Servo 2 ");  
          telemetry.addLine("-Servo 3-");
          telemetry.addLine("Power: " + power);
                  
          motor0.setPower(0);
          motor1.setPower(0);
          motor2.setPower(0);
          motor3.setPower(0);
          servo0.setPosition(0);
          servo1.setPosition(0);
          servo2.setPosition(0);
          servo3.setPosition(power);        
                 
                  
                  if (gamepad1.dpad_up) {
             selectedMotor = 2;
           } else if (gamepad1.dpad_down) {
             selectedMotor = 0;
           }
                  
           while (gamepad1.dpad_up && gamepad1.dpad_down) {
             try {
               Thread.sleep(25);
             } catch (exception Ex) {
               telemetry.addLine("ERROR: Thread error caught at sleep.");    
               System.exit(0);
             }
           }
    
          }
        }
        
        if (gamepad1.right_bumper || gamepad1.left_bumper) {
          motorMenu = !motorMenu;
         }
        telemetry.update(); 
   }
  }
 }
}


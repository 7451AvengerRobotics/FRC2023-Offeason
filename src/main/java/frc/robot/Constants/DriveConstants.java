package frc.robot.Constants;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;

//All these variables are likely subject to change after we retest the drive train 

public class DriveConstants {
  // Voltage
  public static final double KS_VOLTS = 0.8828;
  public static final double KV_VOLT_SECONDS_PER_METER = 0.47828;
  public static final double KA_VOLT_SECONDS_SQUARED_PER_METER = 1.2292;

  public static final double KP_DRIVE_VELOCITY = 3.2478;

  // Differential Drive Kinematics
  public static final double K_TRACK_WIDTH_METERS = 0.53;
  public static final DifferentialDriveKinematics K_DRIVE_KINEMATICS =
      new DifferentialDriveKinematics(K_TRACK_WIDTH_METERS);

  // Max Velocity/Acceleration
  public static final double K_MAX_SPEED_METER_PER_SECOND = .4788;
  public static final double K_MAX_ACCELERATION_METERS_PER_SECOND_SQUARED = .2;

  // RAMSETE Parameters
  public static final double K_RAMSETE = 2;
  public static final double K_RAMSETE_ZETA = 0.7;
  public static final double MAX_DRIVE_VOLTAGE = 7;






}




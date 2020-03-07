/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import frc.robot.subsystems.JetsonSubsystem;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj.XboxController.Button;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

<<<<<<< HEAD
/*import frc.robot.commands.RotateToAngle;
import frc.robot.commands.IntakeWithButton;
import frc.robot.commands.LaunchWithButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.DriveWithJoystick;

import frc.robot.subsystems.DriveSystem;
import frc.robot.commands.Autonomous;
import frc.robot.commands.DriveWithPercent;
import frc.robot.commands.ToggleFieldOriented;
import frc.robot.commands.TogglePID;
import frc.robot.commands.ToggleSlowMode;
import frc.robot.commands.ToggleTurboMode;
import frc.robot.commands.ZeroGyro;
import frc.robot.commands.ChangeColor;
import frc.robot.subsystems.ControlPanelSubsystem;
=======
import frc.robot.commands.IntakeWithButton;
import frc.robot.commands.LaunchWithButton;
>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509
import frc.robot.subsystems.DriveSystem;
import frc.robot.commands.ActivateWinches;
<<<<<<< HEAD
import frc.robot.commands.LockWinches;*/
=======
//import frc.robot.commands.Autonomous;

import frc.robot.subsystems.ClimbSubsystem;

import frc.robot.commands.ActivateTelescopes;

import frc.robot.commands.LockWinches;
import frc.robot.commands.ManualControlPanel;
import frc.robot.commands.MoveArm;
import frc.robot.commands.ReverseIntake;

import frc.robot.subsystems.IntakeAndOutake;

>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */

public class RobotContainer {
<<<<<<< HEAD

  //remote controls 
  XboxController m_driverController = new XboxController(Constants.driver_joystick);
  private static Joystick joy;
  private static JoystickButton leftBumper; 
  private static JoystickButton rightBumper;
  private static JoystickButton xbox_A;  
  private static JoystickButton trigger; 

  //subsystems and commands

  private static JoystickButton gyrozeroer;
  private static JoystickButton fieldtoggle;
  private static JoystickButton pidtoggle;
  private static JoystickButton toggleSlow;
  private static JoystickButton toggleTurbo;

  private static Joystick colorGetter;
  private static JoystickButton colorBtn;
  private static Joystick tele;
  private static JoystickButton winchLock;
  private static JoystickButton winchActivate;
  /*private final DriveWithJoystick driveWithJoystick;
  private final DriveWithPercent driveWithPercent;
=======
>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509
  private final DriveSystem driveSystem;
  private final ClimbSubsystem climb;

  // Driver controller
  private static Joystick driver; // port 0

  private JoystickButton driver_autoAlignBtn; // button 1
  private JoystickButton driver_fieldOrientBtn; // button 2
  private JoystickButton driver_turboBtn; // button 5
  private JoystickButton driver_slowBtn;
  private JoystickButton driver_zeroBtn;
  private JoystickButton driver_reverseBtn;

  private Command driver_autoAlign;
  private Command driver_fieldOrient;
  private Command driver_turbo;
  private Command driver_slow;
  private Command driver_zero;
  private Command driver_reverse;

  // Operator controller
  private static XboxController operator;

  private JoystickButton op_launchBtn;
  private JoystickButton op_slowBtn;
  private JoystickButton op_intakeBtn;
  private JoystickButton op_lockWinchBtn;
  private JoystickButton op_runWinchBtn; 
  private JoystickButton op_telescopesBtn;
  private JoystickButton op_reverseBtn;
  private JoystickButton op_controlarmBtn;
  private JoystickButton op_manual_wheelBtn;
  private JoystickButton op_reverse_teleBtn;

  private Command op_launch;
  private Command op_slow;
  private Command op_intake;
  private Command op_lockWinch;
  private Command op_runWinch;
  private Command op_telescopes;
  private Command op_reverse;
  private Command op_controlarm;
  private Command op_manual_wheel;
  private Command op_reverse_tele;

  // Autonomous
  private Command auto;

<<<<<<< HEAD
  private final IntakeWithButton m_intakeWithButton = new IntakeWithButton();
  private final LaunchWithButton m_launchWithButton = new LaunchWithButton(); */
  

  //rotate to amgle 
  /*private Command RotateToAngle90 = new RotateToAngle(90.0);
  private Command RotateToAngle45 = new RotateToAngle(45.0);
  private final JetsonSubsystem jetson = new JetsonSubsystem();
  private final ControlPanelSubsystem control;
  private final ChangeColor changeColor;
  private final LockWinches lockWinch;
  private final ActivateWinches activateWinches;

  private final ZeroGyro zero = new ZeroGyro();
  private final ToggleFieldOriented togglefield = new ToggleFieldOriented();
  private final TogglePID pid = new TogglePID();
  private final ToggleSlowMode slow = new ToggleSlowMode();
  private final ToggleTurboMode turbo = new ToggleTurboMode();*/

=======
  

>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509
  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
<<<<<<< HEAD

    //establishes joysticks and buttons
    joy = new Joystick(1);
    //leftBumper = new JoystickButton(joy, Constants.LEFTBUMPER); 
    //rightBumper = new JoystickButton(joy, Constants.RIGHTBUMPER); 
    //xbox_A = new JoystickButton(joy, Constants.XBOX_A); 
    trigger = new JoystickButton(joy, Constants.TRIGGER); 
    //control = Factory.getControl();
    joy = new Joystick(Constants.driver_joystick);
    //driveSystem = Factory.getDrive();
    joy = new Joystick(Constants.driver_joystick);
    //driveWithJoystick = new DriveWithJoystick();
    //driveWithPercent = new DriveWithPercent();
    
    gyrozeroer = new JoystickButton(joy, Constants.zeroGyro);
    fieldtoggle = new JoystickButton(joy, Constants.fieldToggler);
    pidtoggle = new JoystickButton(joy, Constants.pidToggler);
    toggleSlow = new JoystickButton(joy, Constants.toggleSlow);
    toggleTurbo = new JoystickButton(joy, Constants.toggleTurbo);
    //changeColor = new ChangeColor();
    //lockWinch = new LockWinches();
    //activateWinches = new ActivateWinches();

    colorGetter = new Joystick(Constants.colorBtn);
    colorBtn = new JoystickButton(colorGetter, Constants.colorBtn);

    tele = new Joystick(1);
    winchLock = new JoystickButton(tele, 7);
    winchActivate = new JoystickButton(tele, 8);
=======
    driveSystem = Factory.getDrive();
    climb = Factory.getClimb();

    // Driver controller
    driver = new Joystick(Constants.DRIVER_CONTROLLER);
>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509

    
    driver_autoAlignBtn = new JoystickButton(driver, Constants.DRIVER_AUTO_ALIGN);
    driver_fieldOrientBtn = new JoystickButton(driver, Constants.DRIVER_FIELD_ORIENT);
    driver_turboBtn = new JoystickButton(driver, Constants.DRIVER_TURBO);
    driver_slowBtn = new JoystickButton(driver, Constants.DRIVER_SLOW);
    driver_zeroBtn = new JoystickButton(driver, Constants.DRIVER_ZERO);
    driver_reverseBtn = new JoystickButton(driver, Constants.DRIVER_REVERSE);

    driver_autoAlign = new InstantCommand(driveSystem::toggleTargeting, driveSystem);
    driver_fieldOrient = new InstantCommand(driveSystem::setFieldOriented, driveSystem);
    driver_turbo = new InstantCommand(driveSystem::setTurbo, driveSystem);
    driver_slow = new InstantCommand(driveSystem::setSlow, driveSystem);
    driver_zero = new InstantCommand(driveSystem::zeroGyro, driveSystem);
    driver_reverse = new ReverseIntake();
    
<<<<<<< HEAD
    // Configure the button bindings
    configureButtonBindings();
  }
  public static Joystick getJoy(){
    return joy;
  }
=======
    driver_autoAlignBtn = new JoystickButton(driver, Constants.DRIVER_AUTO_ALIGN);
    driver_fieldOrientBtn = new JoystickButton(driver, Constants.DRIVER_FIELD_ORIENT);
    driver_turboBtn = new JoystickButton(driver, Constants.DRIVER_TURBO);

>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509



    // Operator controller
    operator = new XboxController(Constants.OPERATOR_CONTROLLER);

    op_launchBtn = new JoystickButton(operator, Constants.OP_LAUNCH);
    op_slowBtn = new JoystickButton(operator, Constants.OP_SLOW);
    op_intakeBtn = new JoystickButton(operator, Constants.OP_INTAKE);

    op_lockWinchBtn = new JoystickButton(operator, Constants.OP_LOCK_WINCH);
    op_runWinchBtn = new JoystickButton(operator, Constants.OP_RUN_WINCH);
    op_telescopesBtn = new JoystickButton(operator, Constants.OP_TELESCOPES);
    op_reverseBtn = new JoystickButton(operator, Constants.OP_REVERSE);
    op_controlarmBtn = new JoystickButton(operator, Constants.OP_CONTROL_ARM);
    op_manual_wheelBtn = new JoystickButton(operator, Constants.OP_CONTROL_RIGHT);
    op_reverse_teleBtn = new JoystickButton(operator, Constants.OP_REVERSE_TELE);
  
    op_launch = new LaunchWithButton();
    op_slow = new InstantCommand(driveSystem::setSlow, driveSystem);

    op_lockWinchBtn = new JoystickButton(operator, Constants.OP_LOCK_WINCH);
    op_runWinchBtn = new JoystickButton(operator, Constants.OP_RUN_WINCH);

    //op_slow = new ToggleSlowMode();

    op_intake = new IntakeWithButton();
    op_lockWinch = new LockWinches();
    op_runWinch = new ActivateWinches();
    op_telescopes = new ActivateTelescopes();
    op_reverse = new ReverseIntake();
    op_controlarm = new MoveArm();
    op_manual_wheel = new ManualControlPanel();
    op_reverse_tele = new InstantCommand(climb::setReverse, climb);

    // Autonomous
    //auto = new Autonomous();

    configureButtonBindings();
  }

<<<<<<< HEAD
  /*public Command getDrive(){
    return driveWithJoystick; 
  }*/

  /*public Command getPercent(){
    return driveWithPercent;
  }*/
=======
  public static Joystick getJoy(){
    return driver;
  }

  public static XboxController getOperator() {
    return operator;
  }
>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by instantiating a {@link GenericHID} or one of its subclasses
   * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
   * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
<<<<<<< HEAD
    /*leftBumper.whileHeld(m_intakeWithButton);
    rightBumper.whileHeld(m_launchWithButton); 
    gyrozeroer.whenPressed(zero);
    fieldtoggle.whenPressed(togglefield);
    pidtoggle.whenPressed(pid);
    toggleSlow.whenPressed(slow);
    toggleTurbo.whenPressed(turbo);
    //leftBumper.whileHeld(m_intakeWithButton);
    //rightBumper.whileHeld(m_launchWithButton); 
    //xbox_A.whenPressed(RotateToAngle90);
    trigger.whenPressed(RotateToAngle45); 
    
    colorBtn.whenPressed(changeColor);
    winchLock.whileHeld(lockWinch);
    winchActivate.whileHeld(activateWinches);*/

=======
    // Driver button bindings
    driver_autoAlignBtn.whenPressed(driver_autoAlign);
    driver_fieldOrientBtn.whenPressed(driver_fieldOrient);
    driver_turboBtn.whenPressed(driver_turbo);
    driver_slowBtn.whenPressed(driver_slow);
    driver_zeroBtn.whenPressed(driver_zero);
    driver_reverseBtn.whileHeld(driver_reverse);

    // Operator button bindings
    op_launchBtn.toggleWhenPressed(op_launch);
    op_slowBtn.whenPressed(op_slow);
    op_intakeBtn.toggleWhenPressed(op_intake);
    op_lockWinchBtn.whenPressed(op_lockWinch);
    op_runWinchBtn.whileHeld(op_runWinch);
    op_telescopesBtn.whileHeld(op_telescopes);
    op_reverseBtn.whileHeld(op_reverse);
    op_controlarmBtn.toggleWhenPressed(op_controlarm);
    op_manual_wheelBtn.whileHeld(op_manual_wheel);
    op_reverse_teleBtn.whenPressed(op_reverse_tele);
>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
<<<<<<< HEAD
  /*public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
=======
  public Command getAutonomousCommand() {
>>>>>>> 7ec6dc5032d27833556de15f2cceb2dc7f272509
    return auto;
  }*/

}
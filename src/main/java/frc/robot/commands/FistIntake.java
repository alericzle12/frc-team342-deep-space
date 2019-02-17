/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.FistSystem;

public class FistIntake extends Command {

  private FistSystem fistIntake;

  public FistIntake() {
    requires(Robot.m_subsystem);
    fistIntake = FistSystem.getInstance();

  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    fistIntake.intake();
    System.out.println("Right Bumper is being pressed.");

  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    fistIntake.stop();
  }

  @Override
  protected void interrupted() {
    end();
  }
}
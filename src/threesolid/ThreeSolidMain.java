package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class ThreeSolidMain
{

   public static Manager tsManager = new Manager();
   public static HumanWorker tsHuman = new HumanWorker();
   public static Robot tsRobot = new Robot();
   public static SuperWorker tsSuper = new SuperWorker();


   // The entry main() method
   public static void main(String[] args)
   {

      try
      {
         System.out.format("Starting ... \n\n");
      }
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }
      System.out.println(" Testing the SuperWorker class");
      tsSuper.eat();
      tsSuper.work();
      System.out.println();
      
      System.out.println(" Testing for HumanWorker class");
      tsHuman.eat();
      tsHuman.work();
      System.out.println();

      System.out.println(" Testing class Robot working properly");
      tsRobot.work();
      tsRobot.processMaintainWeekly();
      tsRobot.processMaintainMonthly();
      tsRobot.processMaintainYearly();
      System.out.println();

      System.out.println("Testing Manager class");
      System.out.println("Manage Human...");
      tsManager.setWorker(tsHuman);
      System.out.println("Manage SuperWorker...");
      tsManager.setWorker(tsSuper);
      tsManager.manage();
      System.out.println("Manage Robot...");
      tsManager.setWorker(tsRobot);
      tsManager.manage();
      System.out.println("Test Complete");
      System.out.println();

      try
      {
         System.out.format("Stopping ... \n");
      }
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_05_mass_and_weight;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Scientists measure an object's mass in kilograms and its weight in Newtons.
 * If you know the amount of mass that an object has, you can calculate its
 * weight, in Newtons, with the following formula:
 * 
 *      Weight = Mass * 9.8
 * 
 * Write a program that asks the user to enter the object's mass, and then
 * calculate its weight. If the object weighs more than 1,000 Newtons, display
 * a message indicating that it is too heavy. If the object weighs less than 
 * 10 Newtons, display a message indicating that the object is too light.
 */
public class JAVA_PRG_03_05_Mass_and_Weight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare constant variable
        final float FLT_EQUATION_CONSTANT = 9.8f;
        
        // Declare variables for use in calculation
        float fltWeight;
        float fltMass;
        
        // Declare string to get user input and for output
        String strMass;
        String strOutput;
        
        // Get user input
        strMass = JOptionPane.showInputDialog("Please enter the object's mass.");
        
        // Convert to float
        fltMass = Float.parseFloat(strMass);
        
        // Calculate weight
        fltWeight = fltMass * FLT_EQUATION_CONSTANT;
        
        // Output message to user, varied depending on how much
        // calculated weight the object has
        if(fltWeight > 1000.0f)
        {
            strOutput = String.format("Your object weights %,.1f Newtons." +
                    "\nThat is too heavy.", fltWeight);
            JOptionPane.showMessageDialog(null, strOutput);
        }
        else if(fltWeight < 10.0f && fltWeight > 0)
        {
            strOutput = String.format("Your object weights %,.1f Newtons." +
                    "\nThat is too light.", fltWeight);
            JOptionPane.showMessageDialog(null, strOutput);
        }
        else if(fltWeight <= 1000.0f && fltWeight >= 10.0f)
        {
            strOutput = String.format("Your object weights %,.1f Newtons." +
                    "\nThat is acceptable.", fltWeight);
            JOptionPane.showMessageDialog(null, strOutput);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "There was an error " +
                    "calculating your object's weight.");
        }
        
        // Exit
        System.exit(0);
    }
    
}

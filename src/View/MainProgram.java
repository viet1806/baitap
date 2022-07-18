/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controllers.StudentManager;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author vietk
 */
public class MainProgram {
     public static int Menu()
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Menu");
        System.out.println("1. Add new student");
        System.out.println("2. Save");
        System.out.println("3. Display all students");
        System.out.println("4. Exit");
        
        while(true)
        {
            try{
                System.out.println("Enter your choice (1-4):");
                choice = sc.nextInt();  
                return choice;
            }
            catch(InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Nhập số!");
            }
        }
    }
    
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        StudentManager stMan = new StudentManager();
        do{
            choice = Menu();
            switch(choice){
                case 1:
                    System.out.println("Add new student");
                    stMan.AddStudent();
                    break;
                case 2:
                    System.out.println("Save to Student.dat");
                    if(stMan.list.isEmpty()==false)
                        stMan.Save();
                    else
                        System.out.println("List is empty");
                    break;
                case 3:
                    if(stMan.Load())
                        stMan.DisplayAll();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please Enter 1-4!");
                    break;
            }
        }while(choice!=4);
    }
}


package com.Grajales.Thinking_Pad;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.List;
import java.util.*;

import java.util.Scanner;

public class Main {

    static void menu(){
        System.out.println("Please choose an option: \n(1) Add a task.\n(2) Remove a task.\n(3) Update a task.\n(4) List all tasks.\n(0) Exit.");
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while(true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if(choice == 0){
                System.out.println("Goodbye!");
                System.exit(0);
            }else if(choice == 1){
                System.out.println("Please enter the task.");
                Scanner input1 = new Scanner(System.in);
                String taskInput = input1.nextLine();
                list.add(taskInput);
            }else if(choice == 2){
                for(String tasks: list) {
                    System.out.println(tasks);
                }
                System.out.println("Type out what you would like remove");
                Scanner input2 = new Scanner(System.in);
                String removeInput =input2.nextLine();
                list.remove(removeInput);

            }else if(choice == 3){
                int currentPosition= 0;
                for(String tasks: list){
                    System.out.println( currentPosition +") " + tasks);
                    currentPosition++;
                }
                System.out.println("Please pick the number beside the task you would like to update.");
                Scanner input3 = new Scanner(System.in);
                int updateChoice = input3.nextInt();
                System.out.println("What is the new task you would like to make?");
                Scanner input4 = new Scanner(System.in);
                String updateInput= input4.nextLine();
                list.set(updateChoice, updateInput);


            }else if(choice == 4){
                for(String tasks: list){
                    System.out.println(tasks);
                }
            }else{
                System.out.println("That is not one of the choices.");
            }
        }
    }

}

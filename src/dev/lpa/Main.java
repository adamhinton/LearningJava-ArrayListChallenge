package dev.lpa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true){



            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 0 to exit, 1 to add items, 2 to remove items");
            int input = scanner.nextInt();

            if(input == 0){
                break;
            }



        }


    }
}

// make interactive console prog

// Avail axns:
// 0. Shut down
// 1. Add item(s) to list (comma delimited)
// Remove items (comma delimited list)

// `enter a number for which axn you want:`

// use Scanner (obviously)

// This is a grocery list. Should be an arrayList
// Use methods on ArrayList to add, remove, check if item exists, and print sorted list

// Print alph sorted list after each op
// No dupes

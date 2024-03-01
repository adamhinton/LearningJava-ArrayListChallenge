package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();

        while(true){


            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 0 to exit, 1 to add items, 2 to remove items");
            int input = scanner.nextInt();
            scanner.nextLine();

            if(input == 0){
                System.out.println(groceryList.toString());
                break;
            }

            if (input ==1){
                System.out.println("Enter items to add, separated by commas");
                String[] addedItems = scanner.nextLine().split(",");

                for (String item : addedItems) {
                    item = item.trim();
                    if (!groceryList.contains(item)) {
                        groceryList.add(item);
                    }
                }

                System.out.println(groceryList.toString());
            }

            if (input ==2){

                System.out.println("Enter items to delete, separated by commas");
                String[] deletedItems = scanner.nextLine().split(",");

                for (String item : deletedItems) {
                        item = item.trim();
                        groceryList.remove(item);
                }

                System.out.println(groceryList.toString());
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

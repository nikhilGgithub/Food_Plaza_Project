package com.shoolini.project.dashboard;

import java.util.List;


import java.util.Scanner;

import com.shoolini.project.controller.CartController;
import com.shoolini.project.controller.FoodController;
import com.shoolini.project.controller.OrderController;
import com.shoolini.project.controller.UserController;
import com.shoolini.project.dto.Cart;
import com.shoolini.project.dto.Food;
import com.shoolini.project.dto.Order;
import com.shoolini.project.dto.User;

public class FoodPlazaDashboard {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		UserController uc = new UserController();
		FoodController fc = new FoodController();
		CartController cc = new CartController();
		OrderController oc = new OrderController();

		int option1 = 0, option2 = 0,option3 =0,option4 =0,option5=0;
		do {
			System.err.println();
			System.out.println("🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝Welcome to Dashboard🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️🏝️");
			System.out.println();
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
			System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
System.out.println();
			System.out.println(
					"Enter 1 for User\nEnter 2 for Food\nEnter 3 for Cart\nEnter 4 for Order\nEnter 5 to Exit");

			option1 = s.nextInt();
			switch (option1) {
			case 1:
				do {
					System.out.println("Enter 1 to add user\nEnter 2 to Update user\nEnter 3 to Delete User"
							+ "\nEnter 4 to View all Users\nEnter 5 to Search any user\nEnter 6 to Exit..");
					option2 = s.nextInt();
					switch(option2) {
					case 1:
						uc.createUser();						
						break;
					case 2:
						uc.updateUser();
						System.out.println("User updated...");
						break;
					case 3:
						uc.deleteUser();
						System.out.println("User Deleted...");
						break;
					case 4:
						List<User> users =uc.showall();
						if(users != null)
						{
						for(User user:users)
						{
							System.out.println(user);
						}
						}
						break;
					case 5:
						User user= uc.searchUser();
						System.out.println("User found..." +user);
						break;
					case 6:
						System.out.println("Exited from User module...\n");
						break;
					}
				}while(option2 != 6);
				
				
				break;
			case 2:
				 do {
                     System.out.println("Enter 1 to add food \nEnter 2 to Update food\nEnter 3 to Delete food"
                             + "\nEnter 4 to View all foods\nEnter 5 to Search any food\nEnter 6 to Exit..");
                     option3 = s.nextInt();
                     switch (option3) {
                         case 1:
                             fc.createfood();
                             break;
                         case 2:
                             fc.updateFood();
                             System.out.println("Food updated...");
                             break;
                         case 3:
                             fc.deleteFood();
                             System.out.println("Food Deleted...");
                             break;
                         case 4:
                        	
                             List<Food> foods = fc.showAll();
                             if (foods != null) {
                                 for (Food food : foods) {
                                     System.out.println(food);
                                 }
                             }
                             break;
                         case 5:
                        	 
     						Food food = fc.searchFood();
     						System.out.println("User found..." +food);
     						break;
     					case 6:
     						System.out.println("Exited from User module...\n");
     						break;
                     }
                     }while(option3 != 6);
                     
                             break;
			case 3:
				do {
                    System.out.println("Enter 1 to add cart \nEnter 2 to Delete cart"
                            + "\nEnter 3 to Search any cart\nEnter 4 to Exit..");
                    option4 = s.nextInt();
                    switch (option4) {
                        case 1:
                            cc.createCart();
                            break;
                        case 2:
                            cc.deleteCart();
                            System.out.println("Cart Deleted...");
                            break;
                        
                        case 3:
                            Cart cart = cc.searchCart();
                            System.out.println("Cart found..." + cart);
                            break;
                            
                        case 4:
                            System.out.println("Exited from Cart module...\n");
                            break;
                    }
                } while (option4 != 4);
				break;
				
				
			case 4:
				do {
                    System.out.println("Enter 1 to add order \nEnter 2 to Delete order"
                            + "\nEnter 3 to Search any order (error)/\nEnter 4 to Exit..");
                    option5 = s.nextInt();
                    switch (option5) {
                        case 1:
                            oc.createOrder();
                            break;
                        case 2:
                            oc.deleteOrder();
                            System.out.println("Order Deleted...");
                            break;
                        case 3:
                            Order order = oc.searchOrder();
                            System.out.println("Order found..." + order);
                            break;
                            
                        case 4:
                            System.out.println("Exited from Order module...\n");
                            break;
                    }
                } while (option5 != 4);
                break;

			case 5:
				System.out.println("Exited....");
				break;
			}
		} while (option1 != 5);
		s.close();

	}
	

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        
        switch(type) {
            case 1:
                Customer app = CustomerFactory.createCustomer("Regular");
                System.out.println(app.createMail());
                break;
            case 2:
                Customer app2 = CustomerFactory.createCustomer("Mountain");
                System.out.println(app2.createMail());
                break;
            case 3:
                Customer app3 = CustomerFactory.createCustomer("Delinquent");
                System.out.println(app3.createMail());
                break;  
        }
        
    }
}

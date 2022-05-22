
package Constructor;

public class Employee {
    
    String name,gender;
    int phone;
    
    
    
    Employee (String n, String g, int p){
        
        name = n;
        gender = g;
        phone = p;
        
    }
    
    void displayinfo(){
        
        System.out.println("name:"+ name);
        System.out.println("gender:"+ gender);
        System.out.println("phone:"+ phone);
        System.out.println("\n \n");
    }
}


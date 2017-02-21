/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4Folder;

/**
 *
 * @author Administratorn gabe
 */
public class c11PetTest {
    public static void main(String[] args) {
        c11Pet pc1 = new c11PetCat();
        c11Pet pd1 = new c11PetDog();
        System.out.println("The cat says " + pc1.speak());
        System.out.println("The dog says " + pd1.speak());
        
        
    }
}

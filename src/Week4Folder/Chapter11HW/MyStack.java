/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4Folder.Chapter11HW;

import java.util.ArrayList;

/**
 *
 * @author Administrator Gabe
 */
public class MyStack extends ArrayList<Object> {
   public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = get(size() - 1);
        remove(size() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }


    @Override /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + super.toString();
    } 
}

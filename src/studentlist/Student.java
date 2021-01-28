/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Amanda
 */
    public class Student {
       private String name;
       private String address;

        public String getName() {
            return name;
        }
        

        public String getAddress() {
            return address;
        }
        
        

        public void setName(String name) {
            this.name = name;
        }

        public Student(String name) {
            this.name = name;
        }
       
       
    }
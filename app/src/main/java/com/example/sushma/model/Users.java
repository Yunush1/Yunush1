package com.example.sushma.model;

public class Users {

    public boolean isPalindrome(String firstname, String lastname){

        String name = "yunush";
        String last = "ansari";

        String fullname = name+last;
        String usesr = firstname+lastname;

        int i=0,j=0;
        while (i<fullname.length()){

            if(fullname.charAt(i) != usesr.charAt(j)){
                return false;
            }
            i++;j++;
        }
        return true;
    }

}

package com.example.sushma.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsersTest {

    @Test
    public void isPalindrome() {
        //Arrange
        Users users = new Users();
        //Act
        boolean val = users.isPalindrome("yunush","ansari");
        //Assert
        assertEquals(true,val);
    }
    @Test
    public void isPalindrome_firstname_lastname_expectedTrue() {
        //Arrange
        Users users = new Users();
        //Act
        boolean val = users.isPalindrome("yunwush","ansari");
        //Assert
        assertEquals(true,val);
    }
}
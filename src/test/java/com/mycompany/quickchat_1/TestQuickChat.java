/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchat_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.quickchat_1.LogIn;
/**
 *
 * @author Student
 */
public class TestQuickChat {
    
        @Test
        public void checkUsernameisCorrect(){
        LogIn log=new LogIn();
        assertTrue(log.checkUsername("kyl_1"));
    }
      @Test
      public void checkUsernameisIncorrect(){
          LogIn log=new LogIn();
          assertFalse(log.checkUsername("kyle!!!!!!!"));
      }
      @Test
      public void checkPasswordisCorrect(){
        LogIn log=new LogIn();
        assertTrue(log.checkPassword("Ch&&sec@ke99!"));
      }
      @Test
      public void checkPasswordisIncorrect(){
          LogIn log=new LogIn();
          assertFalse(log.checkPassword("password"));
      }
      public void checkCellphoneisCorrect(){
       LogIn log = new LogIn();
       assertTrue(log.checkCellphone("+27838968976"));
}
      public void checkCellphoneisIncorrect(){
          LogIn log = new LogIn();
          assertFalse(log.checkCellphone("08966553"));
      } 
    
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

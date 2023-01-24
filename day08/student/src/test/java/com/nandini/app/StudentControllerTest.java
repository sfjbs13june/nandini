package com.nandini.app;


import com.nandini.app.controller.StudentController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class StudentControllerTest {
    StudentController studentController=new StudentController();
    @Test
        public void testGetStudent(){
        int expectedSize=3;
        List result =studentController.getStudent();
        Assertions.assertEquals(expectedSize,result.size());
    }
    @Test
    public  void testMapStudent(){
        int expectedSize=3;
        Map result=studentController.mapStudent();
        Assertions.assertEquals(expectedSize,result.size());
    }


}




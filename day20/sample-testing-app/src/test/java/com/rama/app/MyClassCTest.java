package com.rama.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myclassC;
    @Mock
    MyclassA myclassA;

    @Mock
    MyclassB myclassB;
    @BeforeEach
    void setUp(){
        myclassA= Mockito.mock(MyclassA.class);
        myclassB= Mockito.mock(MyclassB.class);
    }
    @Test
    public void TestMethod3() {
        int age= myclassC.getMyAge(22);
        assertEquals(22, age);
    }

}

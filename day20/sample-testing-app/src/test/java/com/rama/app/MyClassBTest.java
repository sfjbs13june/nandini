package com.rama.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest {
    @InjectMocks
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;

    @Mock
    MyClassC myclassC;
    @BeforeEach
    void setUp(){
        myclassA= Mockito.mock(MyclassA.class);
        myclassC= Mockito.mock(MyClassC.class);
    }
    @Test
    public void TestMethod2() {
        String result = myclassB.getResult();
        assertEquals("my result", result);
    }
    @Test
    public void TestMethod4() {
        String result = myclassB.getMyString(" Pass");
        assertEquals("my result Pass", result);
    }
    @Test
    public void TestMethod5() {
        when(myclassC.getMyAge(anyInt())).thenReturn(20);
        int result = myclassC.getMyAge(20);
        assertEquals(20, result);
    }
    @Test
    public void TestMethod6() {
        myclassB.NoreturnData("Hello data");
        String result = "Hello data";
        assertEquals("Hello data",result);
    }



}

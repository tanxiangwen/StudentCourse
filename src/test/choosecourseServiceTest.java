package test;

import org.junit.Test;
import service.choosecourseService;
import service.impl.choosecourseServiceImpl;

import static org.junit.Assert.*;

public class choosecourseServiceTest {
        choosecourseService choosecourseService=new choosecourseServiceImpl();
    @Test
    public void showing() {
        System.out.println(choosecourseService.showing("1"));
    }
}
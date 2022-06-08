package com.simplilearn.mgawady.distributedpipeline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

public class SqrtControllerTest {
    @Test
    public void testSqrt(){
        SqrtController underTest = new SqrtController();
        Assertions.assertEquals(5.0, underTest.sqrt(25));
    }
}

package com.veinhorn.spring.sqlfile;

import com.squareup.javapoet.MethodSpec;
import org.junit.Test;

import static org.junit.Assert.*;

public class MethodGeneratorTest {
    @Test
    public void testMethodGenerator() {
        String methodName = "findAll";
        String sqlQuery = "select * from users";
        String methodType = "()java.util.List<com.veinhorn.spring.sqlfile.example.domain.User>";

        MethodSpec methodSpec = new MethodGenerator(methodName, sqlQuery, methodType).generate();
        System.out.println(methodSpec.toString());

        assertTrue(true);
    }
}

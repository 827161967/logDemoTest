package com.example.logdemotest.controller;


import com.example.logdemotest.domain.TestClass;
import com.example.logdemotest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/testSuccess")
    public String testSuccess() throws Exception {
        TestClass testClass = new TestClass();
        testClass.setTestStr("str");
        testClass.setTestList(Arrays.asList("1", "2", "3"));
        return testService.testService(testClass, true);
    }

    @GetMapping("/testFailure")
    public String testFailure() throws Exception {
        TestClass testClass = new TestClass();
        testClass.setTestStr("str");
        testClass.setTestList(Arrays.asList("1", "2", "3"));
        return testService.testService(testClass, false);
    }

}

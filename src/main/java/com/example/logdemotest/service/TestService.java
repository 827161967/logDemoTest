package com.example.logdemotest.service;

import com.example.logdemo.annotation.OperationLog;
import com.example.logdemotest.domain.TestClass;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @OperationLog(bizId = "#testClass.testStr", bizType = "testType1", msg = "#testClass")
    @OperationLog(bizId = "#isSuccess", bizType = "testType2", msg = "#testClass")
    @OperationLog(bizId = "bizIdStr", bizType = "testType3", msg = "msgStr")
    public String testService(TestClass testClass, boolean isSuccess) throws Exception {
        if (isSuccess) {
            return testClass.toString();
        } else {
            throw new Exception("testError");
        }
    }
}

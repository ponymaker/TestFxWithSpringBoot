package com.home.controllers;

import com.home.service.TestClass;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

public class TestController {
    @Autowired
    private TestClass testClass;

    @FXML
    public void handleButtonAction() {
        System.out.println(testClass.getTest());
    }

}
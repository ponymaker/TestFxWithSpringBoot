package com.home.views;

import com.home.controllers.TestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TestControllerView extends ControllerView {

    @Value("${ui.test.fxml}")
    private String fxmlLocation;

    @Override
    protected String getFxmlLocation() {
        return fxmlLocation;
    }

    @Bean
    public TestController getController() {
        return (TestController) super.getController();
    }
}
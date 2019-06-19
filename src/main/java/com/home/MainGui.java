package com.home;

import com.home.views.TestControllerView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;

/**
 * Test app
 */
@Lazy
@SpringBootApplication
public class MainGui extends Application {

    @Value("${ui.main.title}")//
    private String windowTitle;

    private ConfigurableApplicationContext applicationContext;

    @Autowired
    private TestControllerView testControllerView;

    @Override
    public void init() {
        applicationContext = SpringApplication.run(getClass());
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle(windowTitle);
        stage.setResizable(false);
        stage.setScene(new Scene(testControllerView.getView()));
        stage.centerOnScreen();
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        applicationContext.close();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
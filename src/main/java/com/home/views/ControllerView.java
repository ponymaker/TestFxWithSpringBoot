package com.home.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import java.io.IOException;

public abstract class ControllerView {
    private FXMLLoader loadView(String url) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(url));
        fxmlLoader.load();
        return fxmlLoader;
    }

    @PostConstruct
    public void loadView() throws IOException {
        loader = loadView(getFxmlLocation());
    }

    protected abstract String getFxmlLocation();

    private FXMLLoader loader;

    @Bean
    public Object getController() {
        return loader.getController();
    }

    public Parent getView() {
        return loader.getRoot();
    }

}

module juplin.client.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.annotation;
    requires kotlin.stdlib;
    requires spring.boot;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.boot.starter;
    requires spring.context;

    opens com.home.service;
    opens com.home.controllers;
    opens com.home.views;
    opens com.home;
    exports com.home;
}
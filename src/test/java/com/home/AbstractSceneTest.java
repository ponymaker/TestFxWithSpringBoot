package com.home;

import com.home.service.TestClass;
import com.home.views.ControllerView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;

import javax.annotation.Resource;
import java.util.concurrent.TimeoutException;

@ExtendWith(ApplicationExtension.class)
abstract class AbstractSceneTest<T extends ControllerView> {

    @MockBean
    TestClass testClass;

    @Resource
    private T sceneView;

    @BeforeAll
    static void init() {
        try {
            FxToolkit.registerPrimaryStage();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Test correct scene initialization")
    void prepareTestScene() throws TimeoutException {
        FxToolkit.setupScene(() -> new Scene(sceneView.getView()));
        FxToolkit.showStage();
    }
}

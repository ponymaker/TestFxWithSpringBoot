package com.home;

import com.home.views.TestControllerView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testfx.api.FxRobot;

@SpringBootTest(classes = TestControllerView.class)
class TestControllerViewTest extends AbstractSceneTest<TestControllerView> {

    @Autowired
    @InjectMocks
    TestControllerView sceneView;

    @Test
    @DisplayName("Test enter button css")
    void should_work_enter(FxRobot robot) {
        Mockito.verify(testClass, Mockito.times(0)).getTest();
        robot.clickOn(".test");
        Mockito.verify(testClass, Mockito.times(1)).getTest();
    }

    @Test
    @DisplayName("Test enter button css")
    void should_work_enter_2(FxRobot robot) {
        Mockito.verify(testClass, Mockito.times(0)).getTest();
        robot.clickOn(".test");
        Mockito.verify(testClass, Mockito.times(1)).getTest();
    }


}
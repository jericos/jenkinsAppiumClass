package com.belatrix.connect.framework;

import io.appium.java_client.AppiumDriver;

public abstract class ParentPage extends DSL{

    public ParentPage(AppiumDriver driver){
        super(driver);
    }
}

package com.francislainy.sobeautomation;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(
        key = Constants.GLUE_PROPERTY_NAME,
        value = "com.francislainy.sobeautomation")
public class EntryPointITTest {
}

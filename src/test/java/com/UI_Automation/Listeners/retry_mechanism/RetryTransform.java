package com.UI_Automation.Listeners.retry_mechanism;

import com.UI_Automation.Listeners.retry_mechanism.MyRetry;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.yaml.snakeyaml.constructor.Constructor;

import java.lang.reflect.Method;

public class RetryTransform implements IAnnotationTransformer {
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor,
                          Method testMethod){
        annotation.setRetryAnalyzer(MyRetry.class);
    }
}

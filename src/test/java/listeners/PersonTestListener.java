package listeners;

import io.qameta.allure.Allure;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.internal.annotations.IListeners;

public class PersonTestListener implements ITestListener {
    private static final Logger LOG = LogManager.getLogger(PersonTestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        LOG.info(String.format("[INFO_AttributeNames] The test with data [%s] was started ", result.getAttributeNames()));
        LOG.info(String.format("Test [%s] was started",result.getName()));
        Allure.addAttachment("LogsFromListener","text",String.format("Test [%s] was started",result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       LOG.debug(String.format("[DEBUG_TestName] The test [%s] passed !!!", result.getTestName()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        LOG.error(String.format("[ERROR_Name] The test [%s] failed", result.getName()));
    }
}

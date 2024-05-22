package TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestRunnerPriority2.class,

        TestRunnerPriority1.class,
})
public class TestSuite {}
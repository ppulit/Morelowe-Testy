package Setup;

/**
 * Created by Wsciekly Paczek on 2018-02-20.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"Steps"},
        tags = {"@Register"}

)

public class RunnerTest {
}

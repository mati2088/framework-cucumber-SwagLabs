package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue="step_definitions",
        snippets = CAMELCASE,
        plugin = {"json:reports/test_report/cucumber_report.json"}
)


public class TestRunner {

    @AfterClass
    public static void runReportTest() throws Exception{
        try {
            System.out.println("generando reporte");
            String[]cmd={"cmd.exe","/c","npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte generado con exito");

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

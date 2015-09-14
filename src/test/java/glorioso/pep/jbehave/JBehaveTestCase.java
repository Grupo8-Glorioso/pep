package glorioso.pep.jbehave;

import net.serenitybdd.jbehave.SerenityStories;

public class JBehaveTestCase extends SerenityStories {
    public JBehaveTestCase() {
      runSerenity().inASingleSession();
    }
}
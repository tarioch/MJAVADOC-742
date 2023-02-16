import jdk.javadoc.doclet.Doclet;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Reporter;

import javax.lang.model.SourceVersion;
import java.util.Locale;
import java.util.Set;

import freemarker.template.Configuration;

public class DummyDoclet implements Doclet {

    @Override
    public void init(Locale locale, Reporter reporter) {
    }

    @Override
    public String getName() {
        return "DummyDoclet";
    }
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.RELEASE_11;
    }

    @Override
    public Set<? extends Option> getSupportedOptions() {
        return null;
    }

    @Override
    public boolean run(DocletEnvironment root) {
        Configuration config = new Configuration();
        return true;
    }
}

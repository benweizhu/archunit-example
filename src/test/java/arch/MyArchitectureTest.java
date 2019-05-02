package arch;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.Test;
import org.springframework.stereotype.Service;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;


public class MyArchitectureTest {
  @Test
  public void some_architecture_rule() {
    JavaClasses importedClasses = new ClassFileImporter().importPackages("me.zeph.archunit.archunitexample");

    ArchRule rule = classes().that().areAnnotatedWith(Service.class)
        .should().resideInAPackage("..service.."); // see next section

    rule.check(importedClasses);
  }
}
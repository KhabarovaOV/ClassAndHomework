package class_work.classwork_03102022.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotPovtorAnnotation {
    double value();
}

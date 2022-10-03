package class_work.classwork_03102022.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepInformation.class)
public @interface DayOfWeek {
    int value();
}

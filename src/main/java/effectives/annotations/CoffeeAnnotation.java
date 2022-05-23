package effectives.annotations;

import effectives.enums.Coffees;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CoffeeAnnotation {

    Coffees coffees() default Coffees.ESPRESSO;
}

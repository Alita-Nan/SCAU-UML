package experiment;

import java.lang.annotation.*;

/**
 * @apiNote Imitate Google's Guice framework.
 * @author Ether
 * @since  2022/5/24
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {
    /**
     *  Inject by type if name is default value.
     */
    String name() default "";
}

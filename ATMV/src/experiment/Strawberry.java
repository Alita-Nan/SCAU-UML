package experiment;

import java.lang.annotation.*;
/**
 * @apiNote Write it on the class means that you want me to manage the class.
 * PS: Strawberry is sweeter than bean, which is why I named it strawberry!!!
 * @author  Ether
 * @since  2022/5/24
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Strawberry {
}

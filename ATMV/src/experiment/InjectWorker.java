package experiment;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

/**
 * @apiNote Inject Object. Notice that only those classes which be annotated Strawberry will be taken over by this worker.
 * @author Ether
 * @since  2022/5/24
 **/
public class InjectWorker {
    private final Factory factory;

    public InjectWorker(Factory factory) {
        this.factory = factory;
    }

    public void inject(List<Class> classes) throws Exception {
        for (Class cla : classes) {
            Annotation annotation1 = cla.getAnnotation(Strawberry.class);
            if (annotation1 == null){
                continue;
            }
            Field[] declaredFields = cla.getDeclaredFields();
            for (Field field : declaredFields) {
                Inject annotation = field.getAnnotation(Inject.class);
                if (annotation != null) {
                    if (annotation.name().equals("")) {
                        Class<?> type = field.getType();
                        Object value = factory.get(type);
                        field.setAccessible(true);
                        Object object = factory.get(field.getDeclaringClass());
                        field.set(object, value);
                    }else{
                        String name = annotation.name();
                        Object o = factory.get(name);
                        field.setAccessible(true);
                        Class<?> c = field.getType();
                        Object object = cla.newInstance();
                        field.set(object, o);
                    }
                }
            }
        }
    }



}

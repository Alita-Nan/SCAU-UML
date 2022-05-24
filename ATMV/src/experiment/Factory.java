package experiment;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @apiNote Generate object here.
 * @author Ether
 * @since  2022/5/24
 **/
public class Factory {

    private final Map<String, Object> claName_Object = new HashMap<>();

    private final Map<Class, Object> type_Object = new HashMap<>();

    /**
     * @param classes Classes under domain package.
     */
    public Factory(List<Class> classes) throws InstantiationException, IllegalAccessException {
        for (Class cla : classes) {
            Annotation annotation = cla.getAnnotation(Strawberry.class);
            if(annotation != null){
                Object object = cla.newInstance();
                String simpleName = cla.getSimpleName();
                claName_Object.put(simpleName, object);
                // By type.
                Class[] interfaces = cla.getInterfaces();
                for (Class inter : interfaces) {
                    type_Object.put(inter, object);
                }
                type_Object.put(cla, object);
            }
        }
    }

   public Object get(String name){
        return claName_Object.get(name);
   }

   public Object get(Class cla){
        return type_Object.get(cla);
   }

    public Object getObject(String className){
        if (claName_Object.containsKey(className)){
            return claName_Object.get(className);
        }
        return null;
    }




}

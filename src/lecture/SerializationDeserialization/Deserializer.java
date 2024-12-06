package lecture.SerializationDeserialization;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Deserializer {
    public static <T> T deserializeFromJSON(String json, Class<T> myClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        T instance = myClass.getDeclaredConstructor().newInstance();

        json = json.substring(1, json.length() - 1);

        String[] pairs = json.split(",");

        for(String pair : pairs){
            String[] keyValue = pair.split(":");
            String key = keyValue[0].replace("\"", "").trim();
            String value = keyValue[1].replace("\"", "").trim();

            Field field = myClass.getDeclaredField(key);
            field.setAccessible(true);

            if(field.getType() == String.class)
                field.set(instance, value);
            else{
                if(field.getType() == int.class)
                    field.set(instance, Integer.parseInt(value));
            }
        }

        return instance;
    }
}

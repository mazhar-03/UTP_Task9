package lecture.SerializationDeserialization;

import java.lang.reflect.Field;

public class Serializer {
    public static String serializeToJSON(Object obj) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder("{");

        Class<?> myClass = obj.getClass();
        Field[] fields = myClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            String name = field.getName();
            Object value = field.get(obj);
            sb.append("\"").append(name).append("\":");

            switch(value){
                case String s -> sb.append("\"").append(s).append("\"");
                default ->  sb.append(value);
            }
            sb.append(",");
        }
        if(sb.length() > 1){
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.append("}");

        return sb.toString();
    }
}

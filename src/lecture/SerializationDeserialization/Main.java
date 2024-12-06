package lecture.SerializationDeserialization;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, NoSuchFieldException {
        Student stud = new Student("Mazhar", "s31162", 21);

        String json = Serializer.serializeToJSON(stud);
        System.out.println(json);

        Student student = Deserializer.deserializeFromJSON(json, Student.class);
        System.out.println(
                student.getName() + " " + student.getId() + " " + student.getAge()
        );
    }
}

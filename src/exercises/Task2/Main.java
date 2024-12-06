package exercises.Task2;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student originalStudent = new Student("Mazhar", "Altincay", 21);

        // Serialize the Student object to JSON
        String json = Serialized.serializedToJSON(originalStudent);
        System.out.println("Serialized JSON: " + json);

        // Deserialize the JSON back into a Student object
        Student deserializedStudent = Deserialized.deserializedFromJSON(json, Student.class);
        System.out.println("Deserialized Student: " + deserializedStudent);

        // Print original and deserialized objects
        System.out.println("Original Student: " + originalStudent);
        System.out.println("Deserialized Student: " + deserializedStudent);

        // Compare the fields of both objects
        boolean areEqual = originalStudent.equals(deserializedStudent);
        System.out.println("Are the original and deserialized objects equal? " + areEqual);
    }
}

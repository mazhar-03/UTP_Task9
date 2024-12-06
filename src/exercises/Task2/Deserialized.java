package exercises.Task2;


import com.google.gson.Gson;

public class Deserialized<T> {
    public static<T> T deserializedFromJSON(String json, Class<T> classOfT){
        Gson gson = new Gson();
        return gson.fromJson(json, classOfT);
    }
}

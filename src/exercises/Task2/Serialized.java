package exercises.Task2;

import com.google.gson.Gson;

public class Serialized{
    public static String serializedToJSON(Object obj){
        Gson gson = new Gson();
        return gson.toJson(obj);
    }
}

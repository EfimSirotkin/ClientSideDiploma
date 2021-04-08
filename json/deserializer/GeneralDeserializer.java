package sample.json.deserializer;

import com.google.gson.Gson;

public class GeneralDeserializer {

    private static GeneralDeserializer instance;
    private static Gson jsonDeserializer;

    public GeneralDeserializer() {}

    public static GeneralDeserializer getInstance() {
        if(instance == null)
        {
            instance = new GeneralDeserializer();
            jsonDeserializer = new Gson();
        }
        return instance;
    }

    public static  Gson getJsonDeserializer() {
        return jsonDeserializer;
    }
}

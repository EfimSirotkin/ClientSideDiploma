package sample.json.serializer;

import com.google.gson.Gson;

import java.util.ArrayList;

public class AbstractJsonSerializer {

    private static Gson jsonSerializer;

    public AbstractJsonSerializer() {
        if(jsonSerializer == null)
            jsonSerializer = new Gson();
    }

    public Gson getInstance() {
        if(this.jsonSerializer == null)
            jsonSerializer = new Gson();
        return jsonSerializer;
    }
}

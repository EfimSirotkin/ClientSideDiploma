package sample.json;

import com.google.gson.Gson;

import java.util.ArrayList;

public final class AbstractJsonSerializer {

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

package sample.json;

import sample.json.interfaces.JsonSerializable;
import sample.objects.SchoolClass;

import java.util.ArrayList;

public class SchoolClassSerializer extends AbstractJsonSerializer implements JsonSerializable<SchoolClass> {
    public String serialize(ArrayList<SchoolClass> instance) {
        String schoolClassSerialized = super.getInstance().toJson(instance);
        return schoolClassSerialized;
    }
}

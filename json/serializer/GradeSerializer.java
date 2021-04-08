package sample.json.serializer;

import sample.json.interfaces.JsonSerializable;
import sample.json.serializer.AbstractJsonSerializer;
import sample.objects.Grade;

import java.util.ArrayList;

public class GradeSerializer extends AbstractJsonSerializer implements JsonSerializable<Grade> {
    public String serialize(ArrayList<Grade> instance) {
        String gradesSerialized = super.getInstance().toJson(instance);
        return gradesSerialized;
    }
}

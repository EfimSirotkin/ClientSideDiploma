package sample.json.serializer;

import sample.json.interfaces.JsonSerializable;
import sample.json.serializer.AbstractJsonSerializer;
import sample.objects.Teacher;

import java.util.ArrayList;

public class TeacherSerializer extends AbstractJsonSerializer implements JsonSerializable<Teacher> {
    public String serialize(ArrayList<Teacher> instance) {
        String teachersSerialized = super.getInstance().toJson(instance);
        return teachersSerialized;
    }
}

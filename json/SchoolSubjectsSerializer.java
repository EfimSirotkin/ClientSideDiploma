package sample.json;

import sample.json.interfaces.JsonSerializable;
import sample.objects.Subject;

import java.util.ArrayList;

public class SchoolSubjectsSerializer extends AbstractJsonSerializer implements JsonSerializable<Subject> {
    public String serialize(ArrayList<Subject> instance) {
        String serializedSubjects = super.getInstance().toJson(instance);
        return serializedSubjects;
    }
}

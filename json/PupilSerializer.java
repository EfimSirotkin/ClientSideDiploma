package sample.json;


import sample.json.interfaces.JsonSerializable;
import sample.objects.Pupil;
import java.util.ArrayList;

public class PupilSerializer extends AbstractJsonSerializer implements JsonSerializable<Pupil> {

    public String serialize(ArrayList<Pupil> pupils) {
         String pupilsSerialized = super.getInstance().toJson(pupils);
         return pupilsSerialized;
    }
}

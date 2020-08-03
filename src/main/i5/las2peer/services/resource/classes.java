package i5.las2peer.services.resource;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class FirstSchema {

    public FirstSchema() {}
    
    private String date;

    public void setdate(String setValue) {
        this.date = setValue;
    }

    public String getdate() {
        return this.date;
    }
    private String name;

    public void setname(String setValue) {
        this.name = setValue;
    }

    public String getname() {
        return this.name;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("date", this.date); 
        jo.put("name", this.name); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.date = (String) jsonObject.get("date"); 
        this.name = (String) jsonObject.get("name"); 

    }

}

    
}

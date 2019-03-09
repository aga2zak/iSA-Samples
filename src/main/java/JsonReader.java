import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("src/main/resources/data.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject json = (JSONObject)jsonParser.parse(reader);
            System.out.println(json.get("Order"));
        } catch(IOException | ParseException exc){
            System.out.println("There has been an exception " + exc.getMessage());
        }
    }
}

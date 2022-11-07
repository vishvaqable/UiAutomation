package web.Utility;
import org.json.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Map;

public class ConvertToJson {

    public static void main(String[] args) throws JSONException, IOException, ParseException {

//            String data;
//            data= new String(Files.readAllBytes(Paths.get("src\\test\\java\\data\\testng-result.xml").toAbsolutePath()));
//            JSONObject test = XML.toJSONObject(data);
            JSONParser parser = new JSONParser();


//            System.out.println(json);
//            System.out.println();
//
//
//            JSONObject test = new JSONObject();
//            test.put("Suite","");
//
//            JSONObject suite = new JSONObject();
//            suite.put("started-at",json.get("started-at"));
//            System.out.println("test"+suite);


             File jsonfile = new File("src\\test\\java\\data\\newjson.json");
      //       FileWriter myWriter =  new FileWriter(Paths.get("src\\test\\java\\data\\newjson.json").toAbsolutePath().toFile());
         // myWriter.write(String.valueOf(test));
          //   System.out.println(myWriter);
//            FileReader reader = new FileReader(jsonfile);
//             Object object = parser.parse(reader);
//        JSONObject unitsJson = (JSONObject) object;
     //      JSONArray jsonArray = (JSONArray)object;
  //         JSONObject jsonObject = (JSONObject) object;
//            JSONArray array = new JSONArray();
//            array.put(jsonObject);

        try {
            FileReader fr = new FileReader(jsonfile);
            String data1;
            data1= new String(Files.readAllBytes(Paths.get("src\\test\\java\\data\\newjson.json").toAbsolutePath()));
            JSONObject main = new JSONObject(data1);
            main.get("testng-results");

            System.out.println("test="+main);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Retrieving the array

//        //Reading the String
//        String name = (String) jsonObject.get("started-at");
//        System.out.println(name);

          //  System.out.println(test4.get("started-at"));


//              myWriter.write(String.valueOf(json));
//            myWriter.close();
}}

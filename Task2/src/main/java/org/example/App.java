package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

    public static void main(String[] args) throws ParseException {
        System.out.println(makeSqlRequest("select * from students where ", "{\"name\":\"null\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"18\"}"));
        int [] sort = (bubbleSort(new int[]{11, 3, 14, 16, 7}));
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }


    private static String makeSqlRequest(String request, String params) throws ParseException {
        StringBuilder builder = new StringBuilder();
        builder.append(request);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(params);
        Map<String, String> parseParams = new HashMap<>();

        if(!((String) jsonObject.get("name")).equals("null"))
            parseParams.put("name", (String) jsonObject.get("name"));
        if(!((String) jsonObject.get("country")).equals("null"))
            parseParams.put("country", (String) jsonObject.get("country"));
        if(!((String) jsonObject.get("city")).equals("null"))
            parseParams.put("city", (String) jsonObject.get("city"));
        if(!((String) jsonObject.get("age")).equals("null"))
            parseParams.put("age", (String) jsonObject.get("age"));


        for (Map.Entry<String, String> param : parseParams.entrySet()) {
                builder.append(param.getKey() + " = " + "'" + param.getValue() + "' and ");
        }

        builder.replace(builder.length() - 5, builder.length() , ";");
        return builder.toString();
    }

    private static int[] bubbleSort(int [] mass) {
        int [] res = mass;
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < res.length-1; i++) {
                if(res[i] > res[i+1]){
                    isSorted = false;
                    buf = res[i];
                    res[i] = res[i+1];
                    res[i+1] = buf;
                }
            }
        }
        return res;
    }
}

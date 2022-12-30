package com.gb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {


    public static Map<String, String> getSortCreteria() throws IOException {
        HashMap<String, String> criterias = new HashMap<>();
        String criteria = "";
        String value = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ\n" + "\n" + "2 - Объем ЖД\n" + "\n" + "3 - Операционная система\n" + "\n" + "4 - Цвет");
        criteria = br.readLine();

        switch (Integer.parseInt(criteria)){
            case 1:
                criteria = "Ram";
                break;
            case 2:
                criteria = "Hdd";
                break;
            case 3:
                criteria = "OS";
                break;
            case 4:
                criteria = "Color";
                break;
        }

        System.out.println("Введите значение параметра:");
        value = br.readLine();
        criterias.put(criteria, value);
        br.close();
        return criterias;
    }


    public static ArrayList<Notebook> sortNotebooksByCriteria(Map<String, String> criterias, List<Notebook> notebooks) {
        ArrayList<Notebook> sorted = new ArrayList<>();
        for (Map.Entry<String, String> crit : criterias.entrySet()) {
            String value = crit.getValue();
            String crt = crit.getKey();

            for (Notebook nb : notebooks){

                if(crt.equals("Ram")){
                    if(Integer.parseInt(nb.getValueByCriteria(crt)) > Integer.parseInt(value)){
                        sorted.add(nb);
                    }
                }
                else if (crt.equals("Hdd")){
                    if(Integer.parseInt(nb.getValueByCriteria(crt)) > Integer.parseInt(value)){
                        sorted.add(nb);
                    }
                }
                else {
                    if(nb.getValueByCriteria(crt).equals(value)){
                        sorted.add(nb);
                    }
                }


            }
        }
        return sorted;
    }
}

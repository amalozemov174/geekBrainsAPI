package com.gb;

import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(10, 100, OperationSystem.Linux, "Black"));
        notebooks.add(new Notebook(20, 200, OperationSystem.Windows, "White"));
        notebooks.add(new Notebook(30, 300, OperationSystem.Linux, "Blue"));
        notebooks.add(new Notebook(40, 400, OperationSystem.Windows, "Green"));
        notebooks.add(new Notebook(50, 500, OperationSystem.Linux, "White"));
        notebooks.add(new Notebook(60, 600, OperationSystem.Windows, "Blue"));

        System.out.println(notebooks);
        System.out.println(Utils.sortNotebooksByCriteria(Utils.getSortCreteria(), notebooks));

    }

}

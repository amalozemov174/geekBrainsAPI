package com.gb;

import java.util.Objects;

public class Notebook {

    private Integer ram;
    private Integer hdd;
    private OperationSystem os;
    private String color;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(ram, notebook.ram) && Objects.equals(hdd, notebook.hdd) && os == notebook.os && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, os, color);
    }

    public Notebook(int ram, int hdd, OperationSystem os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getRam() {
        return ram.toString();
    }

    public String getHdd() {
        return hdd.toString();
    }

    public OperationSystem getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOs(OperationSystem os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValueByCriteria(String criteria) {
        switch (criteria){
            case "Ram":
                return getRam();
            case "Hdd":
                return getHdd();
            case "OS":
                return getOs().toString();
            case "Color":
                return getColor();
            default:
                return "Критерий не найден";
        }

    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", os=" + os +
                ", color='" + color + '\'' +
                '}';
    }
}

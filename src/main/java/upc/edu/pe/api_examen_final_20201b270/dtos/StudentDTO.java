package upc.edu.pe.api_examen_final_20201b270.dtos;

import upc.edu.pe.api_examen_final_20201b270.entities.University;

import javax.persistence.*;

public class StudentDTO {

private Long jrid;

    private String jrcode;

    private String jrname;

    private double jrweightedAverage;

    private University jruniversity;

    public Long getJrid() {
        return jrid;
    }

    public void setJrid(Long jrid) {
        this.jrid = jrid;
    }

    public String getJrcode() {
        return jrcode;
    }

    public void setJrcode(String jrcode) {
        this.jrcode = jrcode;
    }

    public String getJrname() {
        return jrname;
    }

    public void setJrname(String jrname) {
        this.jrname = jrname;
    }

    public double getJrweightedAverage() {
        return jrweightedAverage;
    }

    public void setJrweightedAverage(double jrweightedAverage) {
        this.jrweightedAverage = jrweightedAverage;
    }

    public University getJruniversity() {
        return jruniversity;
    }

    public void setJruniversity(University jruniversity) {
        this.jruniversity = jruniversity;
    }
}

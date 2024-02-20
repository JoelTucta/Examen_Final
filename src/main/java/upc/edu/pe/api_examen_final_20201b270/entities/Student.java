package upc.edu.pe.api_examen_final_20201b270.entities;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jrid;
    @Column(name = "jrcode", length = 50, nullable = false)
    private String jrcode;
    @Column(name = "jrname", length = 50, nullable = false)
    private String jrname;
    @Column(name = "jrweightedAverage", length = 50, nullable = false)
    private double jrweightedAverage;
    @ManyToOne
    @JoinColumn(name = "id_university")
    private University jruniversity;

    public Student() {
    }

    public University getJruniversity() {
        return jruniversity;
    }

    public void setJruniversity(University jruniversity) {
        this.jruniversity = jruniversity;
    }

    public Student(Long jrid, String jrcode, String jrname, double jrweightedAverage) {
        this.jrid = jrid;
        this.jrcode = jrcode;
        this.jrname = jrname;
        this.jrweightedAverage = jrweightedAverage;
    }

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

}

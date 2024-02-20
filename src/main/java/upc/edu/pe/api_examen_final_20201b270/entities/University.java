package upc.edu.pe.api_examen_final_20201b270.entities;

import javax.persistence.*;

@Entity
@Table(name = "universitys")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jrid;
    @Column(name = "jrname", length = 50, nullable = false)
    private String jrname;
    @Column(name = "jraddress", length = 50, nullable = false)
    private String jraddress;
    @Column(name = "jremail", length = 50, nullable = false)
    private String jremail;


    public University() {
    }

    public University(Long jrid, String jrname, String jraddress, String jremail) {
        this.jrid = jrid;
        this.jrname = jrname;
        this.jraddress = jraddress;
        this.jremail = jremail;

    }

    public Long getJrid() {
        return jrid;
    }

    public void setJrid(Long jrid) {
        this.jrid = jrid;
    }

    public String getJrname() {
        return jrname;
    }

    public void setJrname(String jrname) {
        this.jrname = jrname;
    }

    public String getJraddress() {
        return jraddress;
    }

    public void setJraddress(String jraddress) {
        this.jraddress = jraddress;
    }

    public String getJremail() {
        return jremail;
    }

    public void setJremail(String jremail) {
        this.jremail = jremail;
    }


}

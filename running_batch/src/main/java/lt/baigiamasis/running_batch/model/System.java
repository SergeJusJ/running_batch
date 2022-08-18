package lt.baigiamasis.running_batch.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table (name = "system")


public class System {

    @Id
        //  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "presentsysdate")
    private Date systemdatenow;




    public Date getSystemDateNow() {
        return systemdatenow;
    }

   // public void setSystemDateNow(Date systemDateNow) {         this.systemdatenow = systemDateNow;    }


}

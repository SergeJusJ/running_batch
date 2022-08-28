package lt.baigiamasis.running_batch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table (name="batch_execution")

public class BatchExecution {
    @Id
    //    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "JobID")
    private Integer jobID;

    @Column (name = "SystemDate")
    private LocalTime systemDate;

    @Column (name = "StartTime")
    private LocalTime startTime;

    @Column (name = "EndTime")
    private Date endTime;

    @Column (name = "ExecutionTime")
    private Date executionTime;

    @Column (name = "ExitCode")
    private String exitCode;

    @Column (name = "Batch_Name")
    private String batch_name;

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public LocalTime getSystemDate() {
        return  systemDate;
    }

    public void setSystemDate(LocalTime systemDate) {
        this.systemDate = systemDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Date executionTime) {
        this.executionTime = executionTime;
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }


/*@Override
    public String toString() {
        return "ExitCode" + exitCode;

    }*/
}

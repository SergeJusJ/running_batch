package lt.baigiamasis.running_batch.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name="batch_execution")

public class BatchExecution {
    @Id
    //    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "JobID")
    private Integer jobID;

    @Column (name = "SystemDate")
    private Date systemDate;

    @Column (name = "StartTime")
    private Date startTime;

    @Column (name = "EndTime")
    private Date endTime;

    @Column (name = "ExecutionTime")
    private Date executionTime;

    @Column (name = "ExitCode")
    private String exitCode;

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public Date getSystemDate() {
        return (Date) systemDate;
    }

    public void setSystemDate(Date systemDate) {
        this.systemDate = systemDate;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
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

    @Override
    public String toString() {
        return "ExitCode" + exitCode;

    }
}

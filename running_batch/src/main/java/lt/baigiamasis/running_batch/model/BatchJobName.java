package lt.baigiamasis.running_batch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="batchjobname")

public class BatchJobName {
    @Id
    //  @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "job_id")
    private Integer jobId;

    @Column (name = "Job_Name")
    private Integer jobName;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getJobName() {
        return jobName;
    }

    public void setJobName(Integer jobName) {
        this.jobName = jobName;
    }
}

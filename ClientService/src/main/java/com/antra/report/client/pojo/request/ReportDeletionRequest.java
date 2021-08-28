package com.antra.report.client.pojo.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import java.util.List;

public class ReportDeletionRequest {
    private String description;
    @NotBlank
    private String submitter;

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ReportRequest{" +
                " description='" + description + '\'' +
                ", submitter='" + submitter + '\'' +
                '}';
    }
}

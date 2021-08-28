package com.antra.report.client.pojo.request;

public class ReportDeletionVO {
    private String reqId;

    private String description;

    private String submitter;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

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
                "reqId='" + reqId + '\'' +
                ", description='" + description + '\'' +
                ", submitter='" + submitter + '\'' +
                '}';
    }
}

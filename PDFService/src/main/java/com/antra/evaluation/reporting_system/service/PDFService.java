package com.antra.evaluation.reporting_system.service;

import com.antra.evaluation.reporting_system.pojo.api.PDFRequest;
import com.antra.evaluation.reporting_system.pojo.report.PDFFile;

import java.time.LocalDateTime;

public interface PDFService {
    PDFFile createPDF(PDFRequest request);

    PDFFile updatePDF(PDFRequest request, String id);

    void deletePDF(String id);

    String findPDFIdByReqId(String reqId);
}

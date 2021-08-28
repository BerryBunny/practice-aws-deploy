package com.antra.evaluation.reporting_system.repo;

import com.antra.evaluation.reporting_system.pojo.report.ExcelFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ExcelRepositoryImpl implements ExcelRepository {

    Map<String, ExcelFile> excelData = new ConcurrentHashMap<>();

    @Autowired
    MongoOperations mongoOperations;

    @Override
    public Optional<ExcelFile> getFileById(String id) {
        return Optional.ofNullable(mongoOperations.findById(id, ExcelFile.class));
        //return Optional.ofNullable(excelData.get(id));
    }

    @Override
    public ExcelFile saveFile(ExcelFile file) {
        return mongoOperations.save(file);
        //return excelData.put(file.getFileId(), file);
    }

    @Override
    public ExcelFile deleteFile(String id) {
        ExcelFile excelfile = mongoOperations.findById(id, ExcelFile.class);
        try {
            mongoOperations.remove(excelfile);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return excelfile;
        }
        //return excelData.remove(id);
    }

    @Override
    public List<ExcelFile> getFiles() {
        return mongoOperations.findAll(ExcelFile.class);
        //return new ArrayList<>(excelData.values());
    }
}


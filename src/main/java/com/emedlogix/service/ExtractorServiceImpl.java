package com.emedlogix.service;

import com.emedlogix.entity.CodeDetails;
import com.emedlogix.entity.CodeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExtractorServiceImpl implements ExtractorService {


    public static final Logger logger = LoggerFactory.getLogger(ExtractorServiceImpl.class);

    @Override
    public Map<String, CodeInfo> doExtractCodes() {
        String fileStr = "D:\\textfile\\icd10cm_order.txt";
        logger.info("Start Extracting Ordered Codes from file {}", fileStr);
        Map<String, CodeInfo> extractedData = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileStr)));
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if(line.trim().length()>0){
                    CodeInfo details = parseDetails(line);
                    extractedData.put(details.getCode(),details);
                }
            }
        } catch (IOException e) {

        }
        logger.info("Code details successfully extracted ordered codes {}", extractedData.size());
        return extractedData;
    }

    public CodeInfo parseDetails(String input) {
        String tokens [] = input.split("[(?=\\s*$)]");

        CodeInfo codeInfo = new CodeInfo();
        int counter = 0;
        boolean skip = false;
        for (String token: tokens) {
            if(!token.isEmpty()) {
                if(counter == 3 && Character.isUpperCase(token.charAt(0)) && skip ) {
                    if(token.length()>2 && codeInfo.getShortDescription().startsWith(token.substring(0,2)) ) {
                        counter++;
                    }
                }
                switch (counter) {
                    case 0:
                        counter++;
                        break;
                    case 1:
                        codeInfo.setCode(token);
                        counter++;
                        break;
                    case 2:
                        codeInfo.setBillable(token);
                        counter++;
                        break;
                    case 3:
                        codeInfo.setShortDescription((concatenateDescription(codeInfo.getShortDescription(), token)).trim());
                        skip=true;
                        //counter++;
                        break;
                    case 4:
                        codeInfo.setLongDescription((concatenateDescription(codeInfo.getLongDescription(), token)).trim());
                        //counter++;
                        break;
                }
            } else {
                if(codeInfo.getShortDescription() != null && codeInfo.getShortDescription().length() > 0 && counter == 3) {
                    counter++;
                }
            }
        }
        // System.out.println(codeDetails.toString());
        return codeInfo;
    }
    private String concatenateDescription(String previous, String current) {
        return (previous==null?"":previous)+" "+current.trim();
    }


    @Override
    public Map<String, CodeDetails> doExtractOrderedCodes() {
        String fileStr = "D:\\textfile\\icd10cm_order.txt";
        logger.info("Start Extracting Ordered Codes from file {}", fileStr);
        Map<String, CodeDetails> extractedData = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileStr)));
            String line;
            List<String> lines = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                if(line.trim().length()>0){
                    CodeDetails details = parseCodeDetails(line);
                    extractedData.put(details.getCode(), details);
                }
            }
        } catch (IOException e) {

        }
        logger.info("Code details successfully extracted ordered codes {}", extractedData.size());
        return extractedData;
    }

    public CodeDetails parseCodeDetails(String input) {
        String tokens [] = input.split("[(?=\\s*$)]");
        CodeDetails codeDetails = new CodeDetails();
        int counter = 0;
        boolean skip = false;
        for (String token: tokens) {
            if(!token.isEmpty()) {
                if(counter == 3 && Character.isUpperCase(token.charAt(0)) && skip ) {
                    if(token.length()>2 && codeDetails.getShortDescription().startsWith(token.substring(0,2)) ) {
                        counter++;
                    }
                }
                switch (counter) {
                    case 0:
                        counter++;
                        break;
                    case 1:
                        codeDetails.setCode(token);
                        counter++;
                        break;
                    case 2:
                        codeDetails.setBillable((token.equals("1")?true:false));
                        counter++;
                        break;
                    case 3:
                        codeDetails.setShortDescription((concateDescription(codeDetails.getShortDescription(), token)).trim());
                        skip=true;
                        //counter++;
                        break;
                    case 4:
                        codeDetails.setLongDescription((concateDescription(codeDetails.getLongDescription(), token)).trim());
                        //counter++;
                        break;
                }
            } else {
                if(codeDetails.getShortDescription() != null && codeDetails.getShortDescription().length() > 0 && counter == 3) {
                    counter++;
                }
            }
        }
       // System.out.println(codeDetails.toString());
        return codeDetails;
    }
    private String concateDescription(String previous, String current) {
        return (previous==null?"":previous)+" "+current.trim();
    }
}



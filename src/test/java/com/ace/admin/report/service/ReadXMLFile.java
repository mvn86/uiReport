package com.ace.admin.report.service;

import com.ace.admin.report.pojo.CmCase;
import com.ace.admin.report.pojo.CmGroup;
import com.ace.admin.report.service.impl.ReadSaxHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.List;
import java.util.Map;

public class ReadXMLFile {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            ReadSaxHandler readSaxHandler = new ReadSaxHandler();

            saxParser.parse("c:\\testng2.xml", readSaxHandler);

            Map<CmGroup, List<CmCase>> cmGroupCaseListMap = readSaxHandler.groupCaseListMap;

            System.out.println(cmGroupCaseListMap.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

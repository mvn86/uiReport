package com.ace.admin.report.service.impl;

import com.ace.admin.report.pojo.CmCase;
import com.ace.admin.report.pojo.CmGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadSaxHandler extends DefaultHandler {

    /**
     * 文档解析后数据存放
     */
    public final Map<CmGroup, List<CmCase>> groupCaseListMap = new HashMap<>();

    /**
     * 存储 case 集合
     */
    private List<CmCase> caseList = new ArrayList<>();

    /**
     * 定义group 对象
     */
    private CmGroup cmGroup;

    /**
     * 定义case 对象
     */
    private CmCase cmCase;

    private Logger logger = LoggerFactory.getLogger(ReadSaxHandler.class);

    @Override
    public void startDocument() throws SAXException {
        logger.info("start testNg file parse.");
    }

    @Override
    public void endDocument() throws SAXException {
        logger.info("end testNg file parse.");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        String upperQName = qName.toLowerCase();
        switch (upperQName) {
            case "class":
                cmGroup = parseClasses(attributes);
                break;
            case "include":
                cmCase = parseInclude(attributes);
                caseList.add(cmCase);
                break;
            default:

                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        String upperQName = qName.toLowerCase();
        switch (upperQName) {
            case "class":
                List<CmCase> storageCmCaseList = new ArrayList<>();
                storageCmCaseList.addAll(caseList);
                groupCaseListMap.put(cmGroup, storageCmCaseList);
                caseList.clear();
                cmGroup = null;
                break;
            case "include":
                cmCase = null;
                break;
            default:

                break;
        }
    }

    /**
     * 解析class 节点
     *
     * @param attributes class 定义的属性
     * @return
     */
    private CmGroup parseClasses(Attributes attributes) {
        CmGroup cmGroup = new CmGroup();
        for (int i = 0; i < attributes.getLength(); i++) {
            String attrName = attributes.getQName(i);
            String attrValue = attributes.getValue(attrName);
            switch (attrName) {
                case "name":
                    cmGroup.setGroup_url(attrValue);
                    break;
                case "url":
                    cmGroup.setGroup_name(attrValue);
                    break;
            }
        }
        return cmGroup;
    }

    /**
     * 解析include属性节点
     *
     * @param attributes 解析属性节点
     * @return
     */
    private CmCase parseInclude(Attributes attributes) {
        CmCase cmCase = new CmCase();
        for (int i = 0; i < attributes.getLength(); i++) {
            String attrName = attributes.getQName(i);
            String attrValue = attributes.getValue(attrName);
            switch (attrName) {
                case "name":
                    cmCase.setCase_name(attrValue);
                    break;
                case "desc":
                    cmCase.setCase_desc(attrValue);
                    break;
                case "tag":
                    cmCase.setCase_tag(attrValue);
                    break;
                case "priority":
                    cmCase.setCase_priority(attrValue);
                    break;
            }
        }
        return cmCase;
    }
}

package com.ace.admin.report.pojo;

public class CmCase {

    private int case_id;
    private int group_id;
    private String case_name;
    private String case_desc;
    private String case_tag;
    private String case_priority;
    private int is_hidden;

    public int getCase_id() {
        return case_id;
    }

    public void setCase_id(int case_id) {
        this.case_id = case_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getCase_name() {
        return case_name;
    }

    public void setCase_name(String case_name) {
        this.case_name = case_name;
    }

    public String getCase_desc() {
        return case_desc;
    }

    public void setCase_desc(String case_desc) {
        this.case_desc = case_desc;
    }

    public String getCase_tag() {
        return case_tag;
    }

    public void setCase_tag(String case_tag) {
        this.case_tag = case_tag;
    }

    public String getCase_priority() {
        return case_priority;
    }

    public void setCase_priority(String case_priority) {
        this.case_priority = case_priority;
    }

    public int getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(int is_hidden) {
        this.is_hidden = is_hidden;
    }
}

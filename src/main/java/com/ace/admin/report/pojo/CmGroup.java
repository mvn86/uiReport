package com.ace.admin.report.pojo;

public class CmGroup {

    private int group_id;
    private int repository_file_id;
    private String group_url;
    private String group_name;
    private int is_hidden;

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getRepository_file_id() {
        return repository_file_id;
    }

    public void setRepository_file_id(int repository_file_id) {
        this.repository_file_id = repository_file_id;
    }

    public String getGroup_url() {
        return group_url;
    }

    public void setGroup_url(String group_url) {
        this.group_url = group_url;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public int getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(int is_hidden) {
        this.is_hidden = is_hidden;
    }
}

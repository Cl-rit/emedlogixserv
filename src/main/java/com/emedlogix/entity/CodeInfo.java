package com.emedlogix.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Column;


@Document(indexName = "details")
public class CodeInfo {
    @Id
    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    private String id;


    @Field(type = FieldType.Text, name = "code")
    private String code;
    @Field(type = FieldType.Text, name = "billable")
    private String billable;
    @Field(type = FieldType.Text, name = "description")
    private String shortDescription;
    @Field(type = FieldType.Text, name = "longdescription")
    private String longDescription;

    public String getBillable() {
        return billable;
    }

    public void setBillable(String billable) {
        this.billable = billable;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.id = code;
        this.code = code;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}



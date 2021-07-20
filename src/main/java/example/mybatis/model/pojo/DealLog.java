package example.mybatis.model.pojo;

import java.util.Date;
import javax.annotation.Generated;

public class DealLog {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer issueId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String personScore;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String changeScore;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer partner;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer type;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createdTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updatedTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getIssueId() {
        return issueId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPersonScore() {
        return personScore;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonScore(String personScore) {
        this.personScore = personScore == null ? null : personScore.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChangeScore() {
        return changeScore;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChangeScore(String changeScore) {
        this.changeScore = changeScore == null ? null : changeScore.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getPartner() {
        return partner;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPartner(Integer partner) {
        this.partner = partner;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getType() {
        return type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setType(Integer type) {
        this.type = type;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreatedTime() {
        return createdTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdatedTime() {
        return updatedTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
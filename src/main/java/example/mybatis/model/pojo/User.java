package example.mybatis.model.pojo;

import java.util.Date;
import javax.annotation.Generated;

public class User {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String avatarUri;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String displayName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String emailAddress;

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
    public String getAvatarUri() {
        return avatarUri;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAvatarUri(String avatarUri) {
        this.avatarUri = avatarUri == null ? null : avatarUri.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDisplayName() {
        return displayName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmailAddress() {
        return emailAddress;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
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
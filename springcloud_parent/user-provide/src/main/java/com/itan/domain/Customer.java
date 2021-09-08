package com.itan.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    private String id;

    @Column(name = "name")
    private String customerName;
    @Column(name = "mobile_phone")
    private String mobilePhone;
    @Column(name = "avatar_id")
    private String avatarId;
    @Column(name = "open_id")
    private String openId;
    @Column(name = "union_id")
    private String unionId;
    //来源(1.微信小程序, 2.招行app)
    @Column(name = "from_source")
    private String fromSource;
    @Column(name = "created_user")
    private String createdUser;
    @Column(name = "created_time")
    private Date createdTime;
    @Column(name = "updated_user")
    private String updatedUser;
    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "deleted")
    private Integer deleted;
    @Column(name = "last_modify_time")
    private Date lastModifyTime;
    //使用积分
    @Column(name = "used_integral")
    private Integer usedIntegral;

    //获得积分
    @Column(name = "received_integral")
    private Integer receivedIntegral;

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", customerName='" + customerName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", avatarId='" + avatarId + '\'' +
                ", openId='" + openId + '\'' +
                ", unionId='" + unionId + '\'' +
                ", fromSource='" + fromSource + '\'' +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", updatedUser='" + updatedUser + '\'' +
                ", updatedTime=" + updatedTime +
                ", deleted=" + deleted +
                ", lastModifyTime=" + lastModifyTime +
                ", usedIntegral=" + usedIntegral +
                ", receivedIntegral=" + receivedIntegral +
                '}';
    }
}

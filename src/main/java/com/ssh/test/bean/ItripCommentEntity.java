package com.ssh.test.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "itrip_comment", schema = "itripdb", catalog = "")
public class ItripCommentEntity {
    private long id;
    private Long hotelId;
    private long productId;
    private Long orderId;
    private int productType;
    private String content;
    private long userId;
    private int isHavingImg;
    private Integer positionScore;
    private Integer facilitiesScore;
    private Integer serviceScore;
    private int hygieneScore;
    private Integer score;
    private Long tripMode;
    private Integer isOk;
    private Timestamp creationDate;
    private Long createdBy;
    private Timestamp modifyDate;
    private Long modifiedBy;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hotelId")
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    @Basic
    @Column(name = "productId")
    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "orderId")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "productType")
    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "isHavingImg")
    public int getIsHavingImg() {
        return isHavingImg;
    }

    public void setIsHavingImg(int isHavingImg) {
        this.isHavingImg = isHavingImg;
    }

    @Basic
    @Column(name = "positionScore")
    public Integer getPositionScore() {
        return positionScore;
    }

    public void setPositionScore(Integer positionScore) {
        this.positionScore = positionScore;
    }

    @Basic
    @Column(name = "facilitiesScore")
    public Integer getFacilitiesScore() {
        return facilitiesScore;
    }

    public void setFacilitiesScore(Integer facilitiesScore) {
        this.facilitiesScore = facilitiesScore;
    }

    @Basic
    @Column(name = "serviceScore")
    public Integer getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(Integer serviceScore) {
        this.serviceScore = serviceScore;
    }

    @Basic
    @Column(name = "hygieneScore")
    public int getHygieneScore() {
        return hygieneScore;
    }

    public void setHygieneScore(int hygieneScore) {
        this.hygieneScore = hygieneScore;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "tripMode")
    public Long getTripMode() {
        return tripMode;
    }

    public void setTripMode(Long tripMode) {
        this.tripMode = tripMode;
    }

    @Basic
    @Column(name = "isOk")
    public Integer getIsOk() {
        return isOk;
    }

    public void setIsOk(Integer isOk) {
        this.isOk = isOk;
    }

    @Basic
    @Column(name = "creationDate")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "createdBy")
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "modifyDate")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "modifiedBy")
    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItripCommentEntity that = (ItripCommentEntity) o;

        if (id != that.id) return false;
        if (productId != that.productId) return false;
        if (productType != that.productType) return false;
        if (userId != that.userId) return false;
        if (isHavingImg != that.isHavingImg) return false;
        if (hygieneScore != that.hygieneScore) return false;
        if (hotelId != null ? !hotelId.equals(that.hotelId) : that.hotelId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (positionScore != null ? !positionScore.equals(that.positionScore) : that.positionScore != null)
            return false;
        if (facilitiesScore != null ? !facilitiesScore.equals(that.facilitiesScore) : that.facilitiesScore != null)
            return false;
        if (serviceScore != null ? !serviceScore.equals(that.serviceScore) : that.serviceScore != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (tripMode != null ? !tripMode.equals(that.tripMode) : that.tripMode != null) return false;
        if (isOk != null ? !isOk.equals(that.isOk) : that.isOk != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hotelId != null ? hotelId.hashCode() : 0);
        result = 31 * result + (int) (productId ^ (productId >>> 32));
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + productType;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + isHavingImg;
        result = 31 * result + (positionScore != null ? positionScore.hashCode() : 0);
        result = 31 * result + (facilitiesScore != null ? facilitiesScore.hashCode() : 0);
        result = 31 * result + (serviceScore != null ? serviceScore.hashCode() : 0);
        result = 31 * result + hygieneScore;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (tripMode != null ? tripMode.hashCode() : 0);
        result = 31 * result + (isOk != null ? isOk.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }
}

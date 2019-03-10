package com.ssh.test.bean;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "itrip_hotel", schema = "itripdb", catalog = "")
public class ItripHotelEntity {
    private long id;
    private String hotelName;
    private long countryId;
    private Long provinceId;
    private Long cityId;
    private String address;
    private String details;
    private String facilities;
    private String hotelPolicy;
    private int hotelType;
    private int hotelLevel;
    private int isGroupPurchase;
    private String redundantCityName;
    private String redundantProvinceName;
    private String redundantCountryName;
    private Integer redundantHotelStore;
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
    @Column(name = "hotelName")
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Basic
    @Column(name = "countryId")
    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "provinceId")
    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "cityId")
    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "facilities")
    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    @Basic
    @Column(name = "hotelPolicy")
    public String getHotelPolicy() {
        return hotelPolicy;
    }

    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    @Basic
    @Column(name = "hotelType")
    public int getHotelType() {
        return hotelType;
    }

    public void setHotelType(int hotelType) {
        this.hotelType = hotelType;
    }

    @Basic
    @Column(name = "hotelLevel")
    public int getHotelLevel() {
        return hotelLevel;
    }

    public void setHotelLevel(int hotelLevel) {
        this.hotelLevel = hotelLevel;
    }

    @Basic
    @Column(name = "isGroupPurchase")
    public int getIsGroupPurchase() {
        return isGroupPurchase;
    }

    public void setIsGroupPurchase(int isGroupPurchase) {
        this.isGroupPurchase = isGroupPurchase;
    }

    @Basic
    @Column(name = "redundantCityName")
    public String getRedundantCityName() {
        return redundantCityName;
    }

    public void setRedundantCityName(String redundantCityName) {
        this.redundantCityName = redundantCityName;
    }

    @Basic
    @Column(name = "redundantProvinceName")
    public String getRedundantProvinceName() {
        return redundantProvinceName;
    }

    public void setRedundantProvinceName(String redundantProvinceName) {
        this.redundantProvinceName = redundantProvinceName;
    }

    @Basic
    @Column(name = "redundantCountryName")
    public String getRedundantCountryName() {
        return redundantCountryName;
    }

    public void setRedundantCountryName(String redundantCountryName) {
        this.redundantCountryName = redundantCountryName;
    }

    @Basic
    @Column(name = "redundantHotelStore")
    public Integer getRedundantHotelStore() {
        return redundantHotelStore;
    }

    public void setRedundantHotelStore(Integer redundantHotelStore) {
        this.redundantHotelStore = redundantHotelStore;
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

        ItripHotelEntity that = (ItripHotelEntity) o;

        if (id != that.id) return false;
        if (countryId != that.countryId) return false;
        if (hotelType != that.hotelType) return false;
        if (hotelLevel != that.hotelLevel) return false;
        if (isGroupPurchase != that.isGroupPurchase) return false;
        if (hotelName != null ? !hotelName.equals(that.hotelName) : that.hotelName != null) return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (facilities != null ? !facilities.equals(that.facilities) : that.facilities != null) return false;
        if (hotelPolicy != null ? !hotelPolicy.equals(that.hotelPolicy) : that.hotelPolicy != null) return false;
        if (redundantCityName != null ? !redundantCityName.equals(that.redundantCityName) : that.redundantCityName != null)
            return false;
        if (redundantProvinceName != null ? !redundantProvinceName.equals(that.redundantProvinceName) : that.redundantProvinceName != null)
            return false;
        if (redundantCountryName != null ? !redundantCountryName.equals(that.redundantCountryName) : that.redundantCountryName != null)
            return false;
        if (redundantHotelStore != null ? !redundantHotelStore.equals(that.redundantHotelStore) : that.redundantHotelStore != null)
            return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (int) (countryId ^ (countryId >>> 32));
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (facilities != null ? facilities.hashCode() : 0);
        result = 31 * result + (hotelPolicy != null ? hotelPolicy.hashCode() : 0);
        result = 31 * result + hotelType;
        result = 31 * result + hotelLevel;
        result = 31 * result + isGroupPurchase;
        result = 31 * result + (redundantCityName != null ? redundantCityName.hashCode() : 0);
        result = 31 * result + (redundantProvinceName != null ? redundantProvinceName.hashCode() : 0);
        result = 31 * result + (redundantCountryName != null ? redundantCountryName.hashCode() : 0);
        result = 31 * result + (redundantHotelStore != null ? redundantHotelStore.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }
}

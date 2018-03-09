package com.fixed.asset.model;

import java.math.BigDecimal;
import java.util.Date;

public class Asset {
    private Integer assetId;

    private String assetCode;

    private String assetName;

    private Integer type1;

    private Integer type2;

    private Integer type3;

    private Integer type4;

    private Integer assetStatus;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer projectId;

    private Integer projectDetailId;

    private Integer outstockId;

    private Integer outstockDetailId;

    private String firm;

    private String brand;

    private String model;

    private String serialNum;

    private String supplier;

    private String assetRemark;

    private Integer useEntryId;

    private String useEntryName;

    private String usePlaceId;

    private String usePlaceName;

    private Integer priceType;

    private BigDecimal price;

    private String invoiceCode;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode == null ? null : assetCode.trim();
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }

    public Integer getType3() {
        return type3;
    }

    public void setType3(Integer type3) {
        this.type3 = type3;
    }

    public Integer getType4() {
        return type4;
    }

    public void setType4(Integer type4) {
        this.type4 = type4;
    }

    public Integer getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(Integer assetStatus) {
        this.assetStatus = assetStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectDetailId() {
        return projectDetailId;
    }

    public void setProjectDetailId(Integer projectDetailId) {
        this.projectDetailId = projectDetailId;
    }

    public Integer getOutstockId() {
        return outstockId;
    }

    public void setOutstockId(Integer outstockId) {
        this.outstockId = outstockId;
    }

    public Integer getOutstockDetailId() {
        return outstockDetailId;
    }

    public void setOutstockDetailId(Integer outstockDetailId) {
        this.outstockDetailId = outstockDetailId;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm == null ? null : firm.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum == null ? null : serialNum.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getAssetRemark() {
        return assetRemark;
    }

    public void setAssetRemark(String assetRemark) {
        this.assetRemark = assetRemark == null ? null : assetRemark.trim();
    }

    public Integer getUseEntryId() {
        return useEntryId;
    }

    public void setUseEntryId(Integer useEntryId) {
        this.useEntryId = useEntryId;
    }

    public String getUseEntryName() {
        return useEntryName;
    }

    public void setUseEntryName(String useEntryName) {
        this.useEntryName = useEntryName == null ? null : useEntryName.trim();
    }

    public String getUsePlaceId() {
        return usePlaceId;
    }

    public void setUsePlaceId(String usePlaceId) {
        this.usePlaceId = usePlaceId == null ? null : usePlaceId.trim();
    }

    public String getUsePlaceName() {
        return usePlaceName;
    }

    public void setUsePlaceName(String usePlaceName) {
        this.usePlaceName = usePlaceName == null ? null : usePlaceName.trim();
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }
}
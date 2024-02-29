package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Bills {
    private Integer id;//id
    private String billCode;//账单编码
    private String productName;//商品名称
    private String productDesc;//商品描述
    private String productUnit;//商品单位
    private BigDecimal productCount;//商品数
    private BigDecimal totalPrice;//总金额
    private Integer isPayment;//是否支付
    private Integer creatBy;//创建者
    private Date creationDate;//创建时间
    private Integer modifyBy;//更新者
    private Date modifyDate;//更新时间
    private Integer providerId;//供应商id

    private String providerName;//供应商名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public void setProductCount(BigDecimal productCount) {
        this.productCount = productCount;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setIsPayment(Integer isPayment) {
        this.isPayment = isPayment;
    }

    public void setCreatBy(Integer creatBy) {
        this.creatBy = creatBy;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getBillCode() {
        return billCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public BigDecimal getProductCount() {
        return productCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public Integer getIsPayment() {
        return isPayment;
    }

    public Integer getCreatBy() {
        return creatBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public String getProviderName() {
        return providerName;
    }
}

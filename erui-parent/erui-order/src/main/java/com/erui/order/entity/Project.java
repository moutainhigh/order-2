package com.erui.order.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单-项目信息
 */
@Entity
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY,cascade={CascadeType.ALL})
    @JoinColumn(name="order_id")
    private Order order;

    @Column(name="contract_no")
    private String contractNo;

    @Column(name="project_name")
    private String projectName;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="delivery_date")
    private Date deliveryDate;

    private BigDecimal profit;

    @Column(name="currency_bn")
    private String currencyBn;

    @Column(name="profit_percent")
    private BigDecimal profitPercent;

    @Column(name="project_status")
    private String projectStatus;

    @Column(name="purch_req_create")
    private Integer purchReqCreate;

    @Column(name="purch_done")
    private String purchDone;

    @Column(name="exe_chg_date")
    private Date exeChgDate;

    @Column(name="require_purchase_date")
    private Date requirePurchaseDate;

    @Column(name="has_manager")
    private Integer hasManager;

    @Column(name="purchase_uid")
    private Integer purchaseUid;

    @Column(name="quality_uid")
    private Integer qualityUid;

    @Column(name="business_uid")
    private Integer businessUid;

    @Column(name="manager_uid")
    private Integer managerUid;

    @Column(name="logistics_uid")
    private Integer logisticsUid;

    @Column(name="warehouse_uid")
    private Integer warehouseUid;

    @Column(name="create_user_id")
    private Integer createUserId;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="create_time")
    private Date createTime;


    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    public String getCurrencyBn() {
        return currencyBn;
    }

    public void setCurrencyBn(String currencyBn) {
        this.currencyBn = currencyBn;
    }

    public BigDecimal getProfitPercent() {
        return profitPercent;
    }

    public void setProfitPercent(BigDecimal profitPercent) {
        this.profitPercent = profitPercent;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Integer getPurchReqCreate() {
        return purchReqCreate;
    }

    public void setPurchReqCreate(Integer purchReqCreate) {
        this.purchReqCreate = purchReqCreate;
    }

    public String getPurchDone() {
        return purchDone;
    }

    public void setPurchDone(String purchDone) {
        this.purchDone = purchDone;
    }

    public Date getExeChgDate() {
        return exeChgDate;
    }

    public void setExeChgDate(Date exeChgDate) {
        this.exeChgDate = exeChgDate;
    }

    public Date getRequirePurchaseDate() {
        return requirePurchaseDate;
    }

    public void setRequirePurchaseDate(Date requirePurchaseDate) {
        this.requirePurchaseDate = requirePurchaseDate;
    }

    public Integer getHasManager() {
        return hasManager;
    }

    public void setHasManager(Integer hasManager) {
        this.hasManager = hasManager;
    }

    public Integer getPurchaseUid() {
        return purchaseUid;
    }

    public void setPurchaseUid(Integer purchaseUid) {
        this.purchaseUid = purchaseUid;
    }

    public Integer getQualityUid() {
        return qualityUid;
    }

    public void setQualityUid(Integer qualityUid) {
        this.qualityUid = qualityUid;
    }

    public Integer getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(Integer businessUid) {
        this.businessUid = businessUid;
    }

    public Integer getManagerUid() {
        return managerUid;
    }

    public void setManagerUid(Integer managerUid) {
        this.managerUid = managerUid;
    }

    public Integer getLogisticsUid() {
        return logisticsUid;
    }

    public void setLogisticsUid(Integer logisticsUid) {
        this.logisticsUid = logisticsUid;
    }

    public Integer getWarehouseUid() {
        return warehouseUid;
    }

    public void setWarehouseUid(Integer warehouseUid) {
        this.warehouseUid = warehouseUid;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BusinessAccounts implements Serializable {

    private static final long serialVersionUID = -2006384341;

    private UInteger   id;
    private String     code;
    private String     accountType;
    private UInteger   buyingUserId;
    private UInteger   buyingRiderId;
    private Long       expirationTimestamp;
    private String     businessDisplayName;
    private String     businessPictureUrl;
    private String     note;
    private Byte       isActive;
    private Long       createdTimestamp;
    private Long       lastUpdatedTimestamp;
    private UInteger   createdBy;
    private UInteger   lastUpdatedBy;
    private String     gstNo;
    private String     paymentModel;
    private BigDecimal pricingCommission;
    private String     paymentModes;
    private String     rideTypes;
    private String     businessAccountData;
    private Byte       slotsRestricted;
    private Byte       promoApplicable;
    private Byte       bookingVisible;
    private String     shortCode;
    private String     smsNotificationType;

    public BusinessAccounts() {}

    public BusinessAccounts(BusinessAccounts value) {
        this.id = value.id;
        this.code = value.code;
        this.accountType = value.accountType;
        this.buyingUserId = value.buyingUserId;
        this.buyingRiderId = value.buyingRiderId;
        this.expirationTimestamp = value.expirationTimestamp;
        this.businessDisplayName = value.businessDisplayName;
        this.businessPictureUrl = value.businessPictureUrl;
        this.note = value.note;
        this.isActive = value.isActive;
        this.createdTimestamp = value.createdTimestamp;
        this.lastUpdatedTimestamp = value.lastUpdatedTimestamp;
        this.createdBy = value.createdBy;
        this.lastUpdatedBy = value.lastUpdatedBy;
        this.gstNo = value.gstNo;
        this.paymentModel = value.paymentModel;
        this.pricingCommission = value.pricingCommission;
        this.paymentModes = value.paymentModes;
        this.rideTypes = value.rideTypes;
        this.businessAccountData = value.businessAccountData;
        this.slotsRestricted = value.slotsRestricted;
        this.promoApplicable = value.promoApplicable;
        this.bookingVisible = value.bookingVisible;
        this.shortCode = value.shortCode;
        this.smsNotificationType = value.smsNotificationType;
    }

    public BusinessAccounts(
        UInteger   id,
        String     code,
        String     accountType,
        UInteger   buyingUserId,
        UInteger   buyingRiderId,
        Long       expirationTimestamp,
        String     businessDisplayName,
        String     businessPictureUrl,
        String     note,
        Byte       isActive,
        Long       createdTimestamp,
        Long       lastUpdatedTimestamp,
        UInteger   createdBy,
        UInteger   lastUpdatedBy,
        String     gstNo,
        String     paymentModel,
        BigDecimal pricingCommission,
        String     paymentModes,
        String     rideTypes,
        String     businessAccountData,
        Byte       slotsRestricted,
        Byte       promoApplicable,
        Byte       bookingVisible,
        String     shortCode,
        String     smsNotificationType
    ) {
        this.id = id;
        this.code = code;
        this.accountType = accountType;
        this.buyingUserId = buyingUserId;
        this.buyingRiderId = buyingRiderId;
        this.expirationTimestamp = expirationTimestamp;
        this.businessDisplayName = businessDisplayName;
        this.businessPictureUrl = businessPictureUrl;
        this.note = note;
        this.isActive = isActive;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.createdBy = createdBy;
        this.lastUpdatedBy = lastUpdatedBy;
        this.gstNo = gstNo;
        this.paymentModel = paymentModel;
        this.pricingCommission = pricingCommission;
        this.paymentModes = paymentModes;
        this.rideTypes = rideTypes;
        this.businessAccountData = businessAccountData;
        this.slotsRestricted = slotsRestricted;
        this.promoApplicable = promoApplicable;
        this.bookingVisible = bookingVisible;
        this.shortCode = shortCode;
        this.smsNotificationType = smsNotificationType;
    }

    public UInteger getId() {
        return this.id;
    }

    public BusinessAccounts setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public BusinessAccounts setCode(String code) {
        this.code = code;
        return this;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public BusinessAccounts setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }

    public UInteger getBuyingUserId() {
        return this.buyingUserId;
    }

    public BusinessAccounts setBuyingUserId(UInteger buyingUserId) {
        this.buyingUserId = buyingUserId;
        return this;
    }

    public UInteger getBuyingRiderId() {
        return this.buyingRiderId;
    }

    public BusinessAccounts setBuyingRiderId(UInteger buyingRiderId) {
        this.buyingRiderId = buyingRiderId;
        return this;
    }

    public Long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    public BusinessAccounts setExpirationTimestamp(Long expirationTimestamp) {
        this.expirationTimestamp = expirationTimestamp;
        return this;
    }

    public String getBusinessDisplayName() {
        return this.businessDisplayName;
    }

    public BusinessAccounts setBusinessDisplayName(String businessDisplayName) {
        this.businessDisplayName = businessDisplayName;
        return this;
    }

    public String getBusinessPictureUrl() {
        return this.businessPictureUrl;
    }

    public BusinessAccounts setBusinessPictureUrl(String businessPictureUrl) {
        this.businessPictureUrl = businessPictureUrl;
        return this;
    }

    public String getNote() {
        return this.note;
    }

    public BusinessAccounts setNote(String note) {
        this.note = note;
        return this;
    }

    public Byte getIsActive() {
        return this.isActive;
    }

    public BusinessAccounts setIsActive(Byte isActive) {
        this.isActive = isActive;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public BusinessAccounts setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public BusinessAccounts setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        return this;
    }

    public UInteger getCreatedBy() {
        return this.createdBy;
    }

    public BusinessAccounts setCreatedBy(UInteger createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public UInteger getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    public BusinessAccounts setLastUpdatedBy(UInteger lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    public String getGstNo() {
        return this.gstNo;
    }

    public BusinessAccounts setGstNo(String gstNo) {
        this.gstNo = gstNo;
        return this;
    }

    public String getPaymentModel() {
        return this.paymentModel;
    }

    public BusinessAccounts setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel;
        return this;
    }

    public BigDecimal getPricingCommission() {
        return this.pricingCommission;
    }

    public BusinessAccounts setPricingCommission(BigDecimal pricingCommission) {
        this.pricingCommission = pricingCommission;
        return this;
    }

    public String getPaymentModes() {
        return this.paymentModes;
    }

    public BusinessAccounts setPaymentModes(String paymentModes) {
        this.paymentModes = paymentModes;
        return this;
    }

    public String getRideTypes() {
        return this.rideTypes;
    }

    public BusinessAccounts setRideTypes(String rideTypes) {
        this.rideTypes = rideTypes;
        return this;
    }

    public String getBusinessAccountData() {
        return this.businessAccountData;
    }

    public BusinessAccounts setBusinessAccountData(String businessAccountData) {
        this.businessAccountData = businessAccountData;
        return this;
    }

    public Byte getSlotsRestricted() {
        return this.slotsRestricted;
    }

    public BusinessAccounts setSlotsRestricted(Byte slotsRestricted) {
        this.slotsRestricted = slotsRestricted;
        return this;
    }

    public Byte getPromoApplicable() {
        return this.promoApplicable;
    }

    public BusinessAccounts setPromoApplicable(Byte promoApplicable) {
        this.promoApplicable = promoApplicable;
        return this;
    }

    public Byte getBookingVisible() {
        return this.bookingVisible;
    }

    public BusinessAccounts setBookingVisible(Byte bookingVisible) {
        this.bookingVisible = bookingVisible;
        return this;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public BusinessAccounts setShortCode(String shortCode) {
        this.shortCode = shortCode;
        return this;
    }

    public String getSmsNotificationType() {
        return this.smsNotificationType;
    }

    public BusinessAccounts setSmsNotificationType(String smsNotificationType) {
        this.smsNotificationType = smsNotificationType;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final BusinessAccounts other = (BusinessAccounts) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        }
        else if (!code.equals(other.code))
            return false;
        if (accountType == null) {
            if (other.accountType != null)
                return false;
        }
        else if (!accountType.equals(other.accountType))
            return false;
        if (buyingUserId == null) {
            if (other.buyingUserId != null)
                return false;
        }
        else if (!buyingUserId.equals(other.buyingUserId))
            return false;
        if (buyingRiderId == null) {
            if (other.buyingRiderId != null)
                return false;
        }
        else if (!buyingRiderId.equals(other.buyingRiderId))
            return false;
        if (expirationTimestamp == null) {
            if (other.expirationTimestamp != null)
                return false;
        }
        else if (!expirationTimestamp.equals(other.expirationTimestamp))
            return false;
        if (businessDisplayName == null) {
            if (other.businessDisplayName != null)
                return false;
        }
        else if (!businessDisplayName.equals(other.businessDisplayName))
            return false;
        if (businessPictureUrl == null) {
            if (other.businessPictureUrl != null)
                return false;
        }
        else if (!businessPictureUrl.equals(other.businessPictureUrl))
            return false;
        if (note == null) {
            if (other.note != null)
                return false;
        }
        else if (!note.equals(other.note))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        }
        else if (!isActive.equals(other.isActive))
            return false;
        if (createdTimestamp == null) {
            if (other.createdTimestamp != null)
                return false;
        }
        else if (!createdTimestamp.equals(other.createdTimestamp))
            return false;
        if (lastUpdatedTimestamp == null) {
            if (other.lastUpdatedTimestamp != null)
                return false;
        }
        else if (!lastUpdatedTimestamp.equals(other.lastUpdatedTimestamp))
            return false;
        if (createdBy == null) {
            if (other.createdBy != null)
                return false;
        }
        else if (!createdBy.equals(other.createdBy))
            return false;
        if (lastUpdatedBy == null) {
            if (other.lastUpdatedBy != null)
                return false;
        }
        else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
            return false;
        if (gstNo == null) {
            if (other.gstNo != null)
                return false;
        }
        else if (!gstNo.equals(other.gstNo))
            return false;
        if (paymentModel == null) {
            if (other.paymentModel != null)
                return false;
        }
        else if (!paymentModel.equals(other.paymentModel))
            return false;
        if (pricingCommission == null) {
            if (other.pricingCommission != null)
                return false;
        }
        else if (!pricingCommission.equals(other.pricingCommission))
            return false;
        if (paymentModes == null) {
            if (other.paymentModes != null)
                return false;
        }
        else if (!paymentModes.equals(other.paymentModes))
            return false;
        if (rideTypes == null) {
            if (other.rideTypes != null)
                return false;
        }
        else if (!rideTypes.equals(other.rideTypes))
            return false;
        if (businessAccountData == null) {
            if (other.businessAccountData != null)
                return false;
        }
        else if (!businessAccountData.equals(other.businessAccountData))
            return false;
        if (slotsRestricted == null) {
            if (other.slotsRestricted != null)
                return false;
        }
        else if (!slotsRestricted.equals(other.slotsRestricted))
            return false;
        if (promoApplicable == null) {
            if (other.promoApplicable != null)
                return false;
        }
        else if (!promoApplicable.equals(other.promoApplicable))
            return false;
        if (bookingVisible == null) {
            if (other.bookingVisible != null)
                return false;
        }
        else if (!bookingVisible.equals(other.bookingVisible))
            return false;
        if (shortCode == null) {
            if (other.shortCode != null)
                return false;
        }
        else if (!shortCode.equals(other.shortCode))
            return false;
        if (smsNotificationType == null) {
            if (other.smsNotificationType != null)
                return false;
        }
        else if (!smsNotificationType.equals(other.smsNotificationType))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.accountType == null) ? 0 : this.accountType.hashCode());
        result = prime * result + ((this.buyingUserId == null) ? 0 : this.buyingUserId.hashCode());
        result = prime * result + ((this.buyingRiderId == null) ? 0 : this.buyingRiderId.hashCode());
        result = prime * result + ((this.expirationTimestamp == null) ? 0 : this.expirationTimestamp.hashCode());
        result = prime * result + ((this.businessDisplayName == null) ? 0 : this.businessDisplayName.hashCode());
        result = prime * result + ((this.businessPictureUrl == null) ? 0 : this.businessPictureUrl.hashCode());
        result = prime * result + ((this.note == null) ? 0 : this.note.hashCode());
        result = prime * result + ((this.isActive == null) ? 0 : this.isActive.hashCode());
        result = prime * result + ((this.createdTimestamp == null) ? 0 : this.createdTimestamp.hashCode());
        result = prime * result + ((this.lastUpdatedTimestamp == null) ? 0 : this.lastUpdatedTimestamp.hashCode());
        result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
        result = prime * result + ((this.lastUpdatedBy == null) ? 0 : this.lastUpdatedBy.hashCode());
        result = prime * result + ((this.gstNo == null) ? 0 : this.gstNo.hashCode());
        result = prime * result + ((this.paymentModel == null) ? 0 : this.paymentModel.hashCode());
        result = prime * result + ((this.pricingCommission == null) ? 0 : this.pricingCommission.hashCode());
        result = prime * result + ((this.paymentModes == null) ? 0 : this.paymentModes.hashCode());
        result = prime * result + ((this.rideTypes == null) ? 0 : this.rideTypes.hashCode());
        result = prime * result + ((this.businessAccountData == null) ? 0 : this.businessAccountData.hashCode());
        result = prime * result + ((this.slotsRestricted == null) ? 0 : this.slotsRestricted.hashCode());
        result = prime * result + ((this.promoApplicable == null) ? 0 : this.promoApplicable.hashCode());
        result = prime * result + ((this.bookingVisible == null) ? 0 : this.bookingVisible.hashCode());
        result = prime * result + ((this.shortCode == null) ? 0 : this.shortCode.hashCode());
        result = prime * result + ((this.smsNotificationType == null) ? 0 : this.smsNotificationType.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessAccounts (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(accountType);
        sb.append(", ").append(buyingUserId);
        sb.append(", ").append(buyingRiderId);
        sb.append(", ").append(expirationTimestamp);
        sb.append(", ").append(businessDisplayName);
        sb.append(", ").append(businessPictureUrl);
        sb.append(", ").append(note);
        sb.append(", ").append(isActive);
        sb.append(", ").append(createdTimestamp);
        sb.append(", ").append(lastUpdatedTimestamp);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(lastUpdatedBy);
        sb.append(", ").append(gstNo);
        sb.append(", ").append(paymentModel);
        sb.append(", ").append(pricingCommission);
        sb.append(", ").append(paymentModes);
        sb.append(", ").append(rideTypes);
        sb.append(", ").append(businessAccountData);
        sb.append(", ").append(slotsRestricted);
        sb.append(", ").append(promoApplicable);
        sb.append(", ").append(bookingVisible);
        sb.append(", ").append(shortCode);
        sb.append(", ").append(smsNotificationType);

        sb.append(")");
        return sb.toString();
    }
}

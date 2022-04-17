/*
 * This file is generated by jOOQ.
 */
package com.blusmart_dev.database.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagTxnHead implements Serializable {

    private static final long serialVersionUID = 2060108738;

    private Long     createTimestamp;
    private UInteger id;
    private String   token;
    private Integer  resCode;
    private String   resMsg;
    private String   reqId;
    private Integer  entityId;
    private Integer  txnCount;
    private Long     fromDate;
    private Long     toDate;

    public TagTxnHead() {}

    public TagTxnHead(TagTxnHead value) {
        this.createTimestamp = value.createTimestamp;
        this.id = value.id;
        this.token = value.token;
        this.resCode = value.resCode;
        this.resMsg = value.resMsg;
        this.reqId = value.reqId;
        this.entityId = value.entityId;
        this.txnCount = value.txnCount;
        this.fromDate = value.fromDate;
        this.toDate = value.toDate;
    }

    public TagTxnHead(
        Long     createTimestamp,
        UInteger id,
        String   token,
        Integer  resCode,
        String   resMsg,
        String   reqId,
        Integer  entityId,
        Integer  txnCount,
        Long     fromDate,
        Long     toDate
    ) {
        this.createTimestamp = createTimestamp;
        this.id = id;
        this.token = token;
        this.resCode = resCode;
        this.resMsg = resMsg;
        this.reqId = reqId;
        this.entityId = entityId;
        this.txnCount = txnCount;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public TagTxnHead setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    public UInteger getId() {
        return this.id;
    }

    public TagTxnHead setId(UInteger id) {
        this.id = id;
        return this;
    }

    public String getToken() {
        return this.token;
    }

    public TagTxnHead setToken(String token) {
        this.token = token;
        return this;
    }

    public Integer getResCode() {
        return this.resCode;
    }

    public TagTxnHead setResCode(Integer resCode) {
        this.resCode = resCode;
        return this;
    }

    public String getResMsg() {
        return this.resMsg;
    }

    public TagTxnHead setResMsg(String resMsg) {
        this.resMsg = resMsg;
        return this;
    }

    public String getReqId() {
        return this.reqId;
    }

    public TagTxnHead setReqId(String reqId) {
        this.reqId = reqId;
        return this;
    }

    public Integer getEntityId() {
        return this.entityId;
    }

    public TagTxnHead setEntityId(Integer entityId) {
        this.entityId = entityId;
        return this;
    }

    public Integer getTxnCount() {
        return this.txnCount;
    }

    public TagTxnHead setTxnCount(Integer txnCount) {
        this.txnCount = txnCount;
        return this;
    }

    public Long getFromDate() {
        return this.fromDate;
    }

    public TagTxnHead setFromDate(Long fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public Long getToDate() {
        return this.toDate;
    }

    public TagTxnHead setToDate(Long toDate) {
        this.toDate = toDate;
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
        final TagTxnHead other = (TagTxnHead) obj;
        if (createTimestamp == null) {
            if (other.createTimestamp != null)
                return false;
        }
        else if (!createTimestamp.equals(other.createTimestamp))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (token == null) {
            if (other.token != null)
                return false;
        }
        else if (!token.equals(other.token))
            return false;
        if (resCode == null) {
            if (other.resCode != null)
                return false;
        }
        else if (!resCode.equals(other.resCode))
            return false;
        if (resMsg == null) {
            if (other.resMsg != null)
                return false;
        }
        else if (!resMsg.equals(other.resMsg))
            return false;
        if (reqId == null) {
            if (other.reqId != null)
                return false;
        }
        else if (!reqId.equals(other.reqId))
            return false;
        if (entityId == null) {
            if (other.entityId != null)
                return false;
        }
        else if (!entityId.equals(other.entityId))
            return false;
        if (txnCount == null) {
            if (other.txnCount != null)
                return false;
        }
        else if (!txnCount.equals(other.txnCount))
            return false;
        if (fromDate == null) {
            if (other.fromDate != null)
                return false;
        }
        else if (!fromDate.equals(other.fromDate))
            return false;
        if (toDate == null) {
            if (other.toDate != null)
                return false;
        }
        else if (!toDate.equals(other.toDate))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.createTimestamp == null) ? 0 : this.createTimestamp.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.token == null) ? 0 : this.token.hashCode());
        result = prime * result + ((this.resCode == null) ? 0 : this.resCode.hashCode());
        result = prime * result + ((this.resMsg == null) ? 0 : this.resMsg.hashCode());
        result = prime * result + ((this.reqId == null) ? 0 : this.reqId.hashCode());
        result = prime * result + ((this.entityId == null) ? 0 : this.entityId.hashCode());
        result = prime * result + ((this.txnCount == null) ? 0 : this.txnCount.hashCode());
        result = prime * result + ((this.fromDate == null) ? 0 : this.fromDate.hashCode());
        result = prime * result + ((this.toDate == null) ? 0 : this.toDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TagTxnHead (");

        sb.append(createTimestamp);
        sb.append(", ").append(id);
        sb.append(", ").append(token);
        sb.append(", ").append(resCode);
        sb.append(", ").append(resMsg);
        sb.append(", ").append(reqId);
        sb.append(", ").append(entityId);
        sb.append(", ").append(txnCount);
        sb.append(", ").append(fromDate);
        sb.append(", ").append(toDate);

        sb.append(")");
        return sb.toString();
    }
}

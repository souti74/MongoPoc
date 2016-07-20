package com.aon.model;

import java.util.Date;
import java.util.Map;

public class Message {

	private String trackid;
	 private String clientID;
	 private String prsnintid;
	 private String statuscd;
	 private Date fristViewTS= new Date();
	 private Date lstViewTS =new Date();
	 private Date lstMdTS = new Date();
	 private Date msgRtrnTS= new Date();
	 private String  MSG_RTRN_RSN_CD;
	 private String MSG_RTRN_RUL_MH;
	 private String EVNT_NM;          //"Password Reset",
	 private String SRC_SYSTM_NM; //"TBA/Batch 3x"
	 private String MSG_SB_TX;   //"Your Recent Transaction"
	 private String MSG_DEST_AD; // from address
	 private Map<String,String> MSG_HDR_CT;
	  
	 private String MIME_CT_TP; // "multipart/related",
	 private byte [] MSG_CT_IM;
	 
	 public String getTrackid() {
		return trackid;
	}
	public void setTrackid(String trackid) {
		this.trackid = trackid;
	}
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getPrsnintid() {
		return prsnintid;
	}
	public void setPrsnintid(String prsnintid) {
		this.prsnintid = prsnintid;
	}
	public String getStatuscd() {
		return statuscd;
	}
	public void setStatuscd(String statuscd) {
		this.statuscd = statuscd;
	}
	public Date getFristViewTS() {
		return fristViewTS;
	}
	public void setFristViewTS(Date fristViewTS) {
		this.fristViewTS = fristViewTS;
	}
	public Date getLstViewTS() {
		return lstViewTS;
	}
	public void setLstViewTS(Date lstViewTS) {
		this.lstViewTS = lstViewTS;
	}
	public Date getLstMdTS() {
		return lstMdTS;
	}
	public void setLstMdTS(Date lstMdTS) {
		this.lstMdTS = lstMdTS;
	}
	public Date getMsgRtrnTS() {
		return msgRtrnTS;
	}
	public void setMsgRtrnTS(Date msgRtrnTS) {
		this.msgRtrnTS = msgRtrnTS;
	}
	public String getMSG_RTRN_RSN_CD() {
		return MSG_RTRN_RSN_CD;
	}
	public void setMSG_RTRN_RSN_CD(String mSG_RTRN_RSN_CD) {
		MSG_RTRN_RSN_CD = mSG_RTRN_RSN_CD;
	}
	public String getMSG_RTRN_RUL_MH() {
		return MSG_RTRN_RUL_MH;
	}
	public void setMSG_RTRN_RUL_MH(String mSG_RTRN_RUL_MH) {
		MSG_RTRN_RUL_MH = mSG_RTRN_RUL_MH;
	}
	public String getEVNT_NM() {
		return EVNT_NM;
	}
	public void setEVNT_NM(String eVNT_NM) {
		EVNT_NM = eVNT_NM;
	}
	public String getSRC_SYSTM_NM() {
		return SRC_SYSTM_NM;
	}
	public void setSRC_SYSTM_NM(String sRC_SYSTM_NM) {
		SRC_SYSTM_NM = sRC_SYSTM_NM;
	}
	public String getMSG_SB_TX() {
		return MSG_SB_TX;
	}
	public void setMSG_SB_TX(String mSG_SB_TX) {
		MSG_SB_TX = mSG_SB_TX;
	}
	public String getMSG_DEST_AD() {
		return MSG_DEST_AD;
	}
	public void setMSG_DEST_AD(String mSG_DEST_AD) {
		MSG_DEST_AD = mSG_DEST_AD;
	}
	public Map<String, String> getMSG_HDR_CT() {
		return MSG_HDR_CT;
	}
	public void setMSG_HDR_CT(Map<String, String> mSG_HDR_CT) {
		MSG_HDR_CT = mSG_HDR_CT;
	}
	public String getMIME_CT_TP() {
		return MIME_CT_TP;
	}
	public void setMIME_CT_TP(String mIME_CT_TP) {
		MIME_CT_TP = mIME_CT_TP;
	}
	public byte[] getMSG_CT_IM() {
		return MSG_CT_IM;
	}
	public void setMSG_CT_IM(byte[] mSG_CT_IM) {
		MSG_CT_IM = mSG_CT_IM;
	}
	public String getMSG_SNDR_AD() {
		return MSG_SNDR_AD;
	}
	public void setMSG_SNDR_AD(String mSG_SNDR_AD) {
		MSG_SNDR_AD = mSG_SNDR_AD;
	}
	private String MSG_SNDR_AD;  // "Your Spending Account"<9754embx@hewitt.com>",
}

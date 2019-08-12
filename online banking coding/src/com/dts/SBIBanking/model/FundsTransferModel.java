/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dts.SBIBanking.model;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 02-17-2009
 * 
 * XDoclet definition:
 * @struts.form name="fundsTransfermodel"
 */
public class FundsTransferModel extends ActionForm {
	/*
	 * Generated fields
	 */

	/** loginid property */
	private String loginid;

	/** fundsTransferdate property */
	private String fundsTransferdate;

	/** amount property */
	private int amount;

	/** fromAccountno property */
	private String fromAccountno;

	/** fundstransferid property */
	private int fundstransferid;

	/** toAccountno property */
	private String toAccountno;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the loginid.
	 * @return String
	 */
	public String getLoginid() {
		return loginid;
	}

	/** 
	 * Set the loginid.
	 * @param loginid The loginid to set
	 */
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	/** 
	 * Returns the fundsTransferdate.
	 * @return String
	 */
	public String getFundsTransferdate() {
		return fundsTransferdate;
	}

	/** 
	 * Set the fundsTransferdate.
	 * @param fundsTransferdate The fundsTransferdate to set
	 */
	public void setFundsTransferdate(String fundsTransferdate) {
		this.fundsTransferdate = fundsTransferdate;
	}

	/** 
	 * Returns the amount.
	 * @return int
	 */
	public int getAmount() {
		return amount;
	}

	/** 
	 * Set the amount.
	 * @param amount The amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/** 
	 * Returns the fromAccountno.
	 * @return String
	 */
	public String getFromAccountno() {
		return fromAccountno;
	}

	/** 
	 * Set the fromAccountno.
	 * @param fromAccountno The fromAccountno to set
	 */
	public void setFromAccountno(String fromAccountno) {
		this.fromAccountno = fromAccountno;
	}

	/** 
	 * Returns the fundstransferid.
	 * @return int
	 */
	public int getFundstransferid() {
		return fundstransferid;
	}

	/** 
	 * Set the fundstransferid.
	 * @param fundstransferid The fundstransferid to set
	 */
	public void setFundstransferid(int fundstransferid) {
		this.fundstransferid = fundstransferid;
	}

	/** 
	 * Returns the toAccountno.
	 * @return String
	 */
	public String getToAccountno() {
		return toAccountno;
	}

	/** 
	 * Set the toAccountno.
	 * @param toAccountno The toAccountno to set
	 */
	public void setToAccountno(String toAccountno) {
		this.toAccountno = toAccountno;
	}
}
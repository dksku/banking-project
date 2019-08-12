/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dts.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dts.SBIBanking.dao.*;
import com.dts.SBIBanking.model.*;
/** 
 * MyEclipse Struts
 * Creation date: 02-13-2009
 * 
 * XDoclet definition:
 * @struts.action path="/registerAccountTypes" name="branchServiceMaster" scope="request"
 */
public class RegisterAccountTypes extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		try{
		BranchServcesMaster branchServiceMaster = (BranchServcesMaster) form;// TODO Auto-generated method stub
		BranchServiceDAO adao=new BranchServiceDAO();
		boolean flag=adao.registerAccountTypes(branchServiceMaster);
		if(flag)
		{
			return mapping.findForward("success");
					}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return mapping.findForward("fail");
}
}
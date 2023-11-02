/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package la.moes.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for TH_GL_Jn_template_Line
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_TH_GL_Jn_template_Line extends PO implements I_TH_GL_Jn_template_Line, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230719L;

    /** Standard Constructor */
    public X_TH_GL_Jn_template_Line (Properties ctx, int TH_GL_Jn_template_Line_ID, String trxName)
    {
      super (ctx, TH_GL_Jn_template_Line_ID, trxName);
      /** if (TH_GL_Jn_template_Line_ID == 0)
        {
			setAmtAcctCr (Env.ZERO);
			setAmtAcctDr (Env.ZERO);
			setC_Currency_ID (0);
// @C_Currency_ID@
			setLine (0);
// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM TH_GL_Jn_template_Line  WHERE TH_GL_Jn_template_ID=@TH_GL_Jn_template_ID@
			setTH_GL_Jn_template_ID (0);
			setTH_GL_Jn_template_Line_ID (0);
        } */
    }

    /** Load Constructor */
    public X_TH_GL_Jn_template_Line (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_TH_GL_Jn_template_Line[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_ElementValue getAccount() throws RuntimeException
    {
		return (org.compiere.model.I_C_ElementValue)MTable.get(getCtx(), org.compiere.model.I_C_ElementValue.Table_Name)
			.getPO(getAccount_ID(), get_TrxName());	}

	/** Set Account.
		@param Account_ID 
		Account used
	  */
	public void setAccount_ID (int Account_ID)
	{
		if (Account_ID < 1) 
			set_Value (COLUMNNAME_Account_ID, null);
		else 
			set_Value (COLUMNNAME_Account_ID, Integer.valueOf(Account_ID));
	}

	/** Get Account.
		@return Account used
	  */
	public int getAccount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Account_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Accounted Credit.
		@param AmtAcctCr 
		Accounted Credit Amount
	  */
	public void setAmtAcctCr (BigDecimal AmtAcctCr)
	{
		set_ValueNoCheck (COLUMNNAME_AmtAcctCr, AmtAcctCr);
	}

	/** Get Accounted Credit.
		@return Accounted Credit Amount
	  */
	public BigDecimal getAmtAcctCr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctCr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Accounted Debit.
		@param AmtAcctDr 
		Accounted Debit Amount
	  */
	public void setAmtAcctDr (BigDecimal AmtAcctDr)
	{
		set_ValueNoCheck (COLUMNNAME_AmtAcctDr, AmtAcctDr);
	}

	/** Get Accounted Debit.
		@return Accounted Debit Amount
	  */
	public BigDecimal getAmtAcctDr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtAcctDr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source Credit.
		@param AmtSourceCr 
		Source Credit Amount
	  */
	public void setAmtSourceCr (BigDecimal AmtSourceCr)
	{
		set_ValueNoCheck (COLUMNNAME_AmtSourceCr, AmtSourceCr);
	}

	/** Get Source Credit.
		@return Source Credit Amount
	  */
	public BigDecimal getAmtSourceCr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceCr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Source Debit.
		@param AmtSourceDr 
		Source Debit Amount
	  */
	public void setAmtSourceDr (BigDecimal AmtSourceDr)
	{
		set_ValueNoCheck (COLUMNNAME_AmtSourceDr, AmtSourceDr);
	}

	/** Get Source Debit.
		@return Source Debit Amount
	  */
	public BigDecimal getAmtSourceDr () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSourceDr);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
    {
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_Name)
			.getPO(getC_Currency_ID(), get_TrxName());	}

	/** Set Currency.
		@param C_Currency_ID 
		The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1) 
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else 
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	public I_LA_SourceFund getLA_SourceFund() throws RuntimeException
    {
		return (I_LA_SourceFund)MTable.get(getCtx(), I_LA_SourceFund.Table_Name)
			.getPO(getLA_SourceFund_ID(), get_TrxName());	}

	/** Set Source of Fund.
		@param LA_SourceFund_ID Source of Fund	  */
	public void setLA_SourceFund_ID (int LA_SourceFund_ID)
	{
		if (LA_SourceFund_ID < 1) 
			set_Value (COLUMNNAME_LA_SourceFund_ID, null);
		else 
			set_Value (COLUMNNAME_LA_SourceFund_ID, Integer.valueOf(LA_SourceFund_ID));
	}

	/** Get Source of Fund.
		@return Source of Fund	  */
	public int getLA_SourceFund_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LA_SourceFund_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_LA_SubSector getLA_SubSector() throws RuntimeException
    {
		return (I_LA_SubSector)MTable.get(getCtx(), I_LA_SubSector.Table_Name)
			.getPO(getLA_SubSector_ID(), get_TrxName());	}

	/** Set Sub Sector.
		@param LA_SubSector_ID Sub Sector	  */
	public void setLA_SubSector_ID (int LA_SubSector_ID)
	{
		if (LA_SubSector_ID < 1) 
			set_Value (COLUMNNAME_LA_SubSector_ID, null);
		else 
			set_Value (COLUMNNAME_LA_SubSector_ID, Integer.valueOf(LA_SubSector_ID));
	}

	/** Get Sub Sector.
		@return Sub Sector	  */
	public int getLA_SubSector_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LA_SubSector_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_TH_GL_Jn_template getTH_GL_Jn_template() throws RuntimeException
    {
		return (I_TH_GL_Jn_template)MTable.get(getCtx(), I_TH_GL_Jn_template.Table_Name)
			.getPO(getTH_GL_Jn_template_ID(), get_TrxName());	}

	/** Set Journal.
		@param TH_GL_Jn_template_ID Journal	  */
	public void setTH_GL_Jn_template_ID (int TH_GL_Jn_template_ID)
	{
		if (TH_GL_Jn_template_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TH_GL_Jn_template_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TH_GL_Jn_template_ID, Integer.valueOf(TH_GL_Jn_template_ID));
	}

	/** Get Journal.
		@return Journal	  */
	public int getTH_GL_Jn_template_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TH_GL_Jn_template_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Journal Template Line.
		@param TH_GL_Jn_template_Line_ID Journal Template Line	  */
	public void setTH_GL_Jn_template_Line_ID (int TH_GL_Jn_template_Line_ID)
	{
		if (TH_GL_Jn_template_Line_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_TH_GL_Jn_template_Line_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_TH_GL_Jn_template_Line_ID, Integer.valueOf(TH_GL_Jn_template_Line_ID));
	}

	/** Get Journal Template Line.
		@return Journal Template Line	  */
	public int getTH_GL_Jn_template_Line_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_TH_GL_Jn_template_Line_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set TH_GL_Jn_template_Line_UU.
		@param TH_GL_Jn_template_Line_UU TH_GL_Jn_template_Line_UU	  */
	public void setTH_GL_Jn_template_Line_UU (String TH_GL_Jn_template_Line_UU)
	{
		set_Value (COLUMNNAME_TH_GL_Jn_template_Line_UU, TH_GL_Jn_template_Line_UU);
	}

	/** Get TH_GL_Jn_template_Line_UU.
		@return TH_GL_Jn_template_Line_UU	  */
	public String getTH_GL_Jn_template_Line_UU () 
	{
		return (String)get_Value(COLUMNNAME_TH_GL_Jn_template_Line_UU);
	}
}
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

/** Generated Model for GL_JournalRef
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_GL_JournalRef extends PO implements I_GL_JournalRef, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230213L;

    /** Standard Constructor */
    public X_GL_JournalRef (Properties ctx, int GL_JournalRef_ID, String trxName)
    {
      super (ctx, GL_JournalRef_ID, trxName);
      /** if (GL_JournalRef_ID == 0)
        {
			setGL_JournalRef_ID (0);
        } */
    }

    /** Load Constructor */
    public X_GL_JournalRef (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_GL_JournalRef[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Approve_No.
		@param Approve_No Approve_No	  */
	public void setApprove_No (String Approve_No)
	{
		set_Value (COLUMNNAME_Approve_No, Approve_No);
	}

	/** Get Approve_No.
		@return Approve_No	  */
	public String getApprove_No () 
	{
		return (String)get_Value(COLUMNNAME_Approve_No);
	}

	/** Set Year.
		@param FiscalYear 
		The Fiscal Year
	  */
	public void setFiscalYear (String FiscalYear)
	{
		set_Value (COLUMNNAME_FiscalYear, FiscalYear);
	}

	/** Get Year.
		@return The Fiscal Year
	  */
	public String getFiscalYear () 
	{
		return (String)get_Value(COLUMNNAME_FiscalYear);
	}

	public org.compiere.model.I_GL_Journal getGL_Journal() throws RuntimeException
    {
		return (org.compiere.model.I_GL_Journal)MTable.get(getCtx(), org.compiere.model.I_GL_Journal.Table_Name)
			.getPO(getGL_Journal_ID(), get_TrxName());	}

	/** Set Journal.
		@param GL_Journal_ID 
		General Ledger Journal
	  */
	public void setGL_Journal_ID (int GL_Journal_ID)
	{
		if (GL_Journal_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
	}

	/** Get Journal.
		@return General Ledger Journal
	  */
	public int getGL_Journal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GL_JournalRef.
		@param GL_JournalRef_ID GL_JournalRef	  */
	public void setGL_JournalRef_ID (int GL_JournalRef_ID)
	{
		if (GL_JournalRef_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GL_JournalRef_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GL_JournalRef_ID, Integer.valueOf(GL_JournalRef_ID));
	}

	/** Get GL_JournalRef.
		@return GL_JournalRef	  */
	public int getGL_JournalRef_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalRef_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GL_JournalRef_UU.
		@param GL_JournalRef_UU GL_JournalRef_UU	  */
	public void setGL_JournalRef_UU (String GL_JournalRef_UU)
	{
		set_Value (COLUMNNAME_GL_JournalRef_UU, GL_JournalRef_UU);
	}

	/** Get GL_JournalRef_UU.
		@return GL_JournalRef_UU	  */
	public String getGL_JournalRef_UU () 
	{
		return (String)get_Value(COLUMNNAME_GL_JournalRef_UU);
	}

	/** Set Ref_No.
		@param Ref_No Ref_No	  */
	public void setRef_No (String Ref_No)
	{
		set_Value (COLUMNNAME_Ref_No, Ref_No);
	}

	/** Get Ref_No.
		@return Ref_No	  */
	public String getRef_No () 
	{
		return (String)get_Value(COLUMNNAME_Ref_No);
	}

	/** TenderType_MoES AD_Reference_ID=214 */
	public static final int TENDERTYPE_MOES_AD_Reference_ID=214;
	/** Direct Deposit = A */
	public static final String TENDERTYPE_MOES_DirectDeposit = "A";
	/** Credit Card = C */
	public static final String TENDERTYPE_MOES_CreditCard = "C";
	/** Direct Debit = D */
	public static final String TENDERTYPE_MOES_DirectDebit = "D";
	/** Check = K */
	public static final String TENDERTYPE_MOES_Check = "K";
	/** Account = T */
	public static final String TENDERTYPE_MOES_Account = "T";
	/** Cash = X */
	public static final String TENDERTYPE_MOES_Cash = "X";
	/** Set Tender Type.
		@param TenderType_MoES 
		Method of Payment
	  */
	public void setTenderType_MoES (String TenderType_MoES)
	{

		set_Value (COLUMNNAME_TenderType_MoES, TenderType_MoES);
	}

	/** Get Tender Type.
		@return Method of Payment
	  */
	public String getTenderType_MoES () 
	{
		return (String)get_Value(COLUMNNAME_TenderType_MoES);
	}
}
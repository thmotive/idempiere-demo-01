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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for GL_JournalPay_PD
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_GL_JournalPay_PD extends PO implements I_GL_JournalPay_PD, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230811L;

    /** Standard Constructor */
    public X_GL_JournalPay_PD (Properties ctx, int GL_JournalPay_PD_ID, String trxName)
    {
      super (ctx, GL_JournalPay_PD_ID, trxName);
      /** if (GL_JournalPay_PD_ID == 0)
        {
			setGL_JournalPay_PD_ID (0);
        } */
    }

    /** Load Constructor */
    public X_GL_JournalPay_PD (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_GL_JournalPay_PD[")
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

	/** Set Treasury Date.
		@param DateTreasury 
		Treasury Date
	  */
	public void setDateTreasury (Timestamp DateTreasury)
	{
		set_Value (COLUMNNAME_DateTreasury, DateTreasury);
	}

	/** Get Treasury Date.
		@return Treasury Date
	  */
	public Timestamp getDateTreasury () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTreasury);
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

	/** Set GL_JournalPay_PD.
		@param GL_JournalPay_PD_ID GL_JournalPay_PD	  */
	public void setGL_JournalPay_PD_ID (int GL_JournalPay_PD_ID)
	{
		if (GL_JournalPay_PD_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GL_JournalPay_PD_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GL_JournalPay_PD_ID, Integer.valueOf(GL_JournalPay_PD_ID));
	}

	/** Get GL_JournalPay_PD.
		@return GL_JournalPay_PD	  */
	public int getGL_JournalPay_PD_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_JournalPay_PD_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set GL_JournalPay_PD_UU.
		@param GL_JournalPay_PD_UU GL_JournalPay_PD_UU	  */
	public void setGL_JournalPay_PD_UU (String GL_JournalPay_PD_UU)
	{
		set_Value (COLUMNNAME_GL_JournalPay_PD_UU, GL_JournalPay_PD_UU);
	}

	/** Get GL_JournalPay_PD_UU.
		@return GL_JournalPay_PD_UU	  */
	public String getGL_JournalPay_PD_UU () 
	{
		return (String)get_Value(COLUMNNAME_GL_JournalPay_PD_UU);
	}

	public I_GL_JournalRef getGL_JournalRef() throws RuntimeException
    {
		return (I_GL_JournalRef)MTable.get(getCtx(), I_GL_JournalRef.Table_Name)
			.getPO(getGL_JournalRef_ID(), get_TrxName());	}

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
}
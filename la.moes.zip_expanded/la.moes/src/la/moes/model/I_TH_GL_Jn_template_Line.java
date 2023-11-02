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
package la.moes.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for TH_GL_Jn_template_Line
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_TH_GL_Jn_template_Line 
{

    /** TableName=TH_GL_Jn_template_Line */
    public static final String Table_Name = "TH_GL_Jn_template_Line";

    /** AD_Table_ID=1000150 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name Account_ID */
    public static final String COLUMNNAME_Account_ID = "Account_ID";

	/** Set Account.
	  * Account used
	  */
	public void setAccount_ID (int Account_ID);

	/** Get Account.
	  * Account used
	  */
	public int getAccount_ID();

	public org.compiere.model.I_C_ElementValue getAccount() throws RuntimeException;

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AmtAcctCr */
    public static final String COLUMNNAME_AmtAcctCr = "AmtAcctCr";

	/** Set Accounted Credit.
	  * Accounted Credit Amount
	  */
	public void setAmtAcctCr (BigDecimal AmtAcctCr);

	/** Get Accounted Credit.
	  * Accounted Credit Amount
	  */
	public BigDecimal getAmtAcctCr();

    /** Column name AmtAcctDr */
    public static final String COLUMNNAME_AmtAcctDr = "AmtAcctDr";

	/** Set Accounted Debit.
	  * Accounted Debit Amount
	  */
	public void setAmtAcctDr (BigDecimal AmtAcctDr);

	/** Get Accounted Debit.
	  * Accounted Debit Amount
	  */
	public BigDecimal getAmtAcctDr();

    /** Column name AmtSourceCr */
    public static final String COLUMNNAME_AmtSourceCr = "AmtSourceCr";

	/** Set Source Credit.
	  * Source Credit Amount
	  */
	public void setAmtSourceCr (BigDecimal AmtSourceCr);

	/** Get Source Credit.
	  * Source Credit Amount
	  */
	public BigDecimal getAmtSourceCr();

    /** Column name AmtSourceDr */
    public static final String COLUMNNAME_AmtSourceDr = "AmtSourceDr";

	/** Set Source Debit.
	  * Source Debit Amount
	  */
	public void setAmtSourceDr (BigDecimal AmtSourceDr);

	/** Get Source Debit.
	  * Source Debit Amount
	  */
	public BigDecimal getAmtSourceDr();

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LA_SourceFund_ID */
    public static final String COLUMNNAME_LA_SourceFund_ID = "LA_SourceFund_ID";

	/** Set Source of Fund	  */
	public void setLA_SourceFund_ID (int LA_SourceFund_ID);

	/** Get Source of Fund	  */
	public int getLA_SourceFund_ID();

	public I_LA_SourceFund getLA_SourceFund() throws RuntimeException;

    /** Column name LA_SubSector_ID */
    public static final String COLUMNNAME_LA_SubSector_ID = "LA_SubSector_ID";

	/** Set Sub Sector	  */
	public void setLA_SubSector_ID (int LA_SubSector_ID);

	/** Get Sub Sector	  */
	public int getLA_SubSector_ID();

	public I_LA_SubSector getLA_SubSector() throws RuntimeException;

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name TH_GL_Jn_template_ID */
    public static final String COLUMNNAME_TH_GL_Jn_template_ID = "TH_GL_Jn_template_ID";

	/** Set Journal	  */
	public void setTH_GL_Jn_template_ID (int TH_GL_Jn_template_ID);

	/** Get Journal	  */
	public int getTH_GL_Jn_template_ID();

	public I_TH_GL_Jn_template getTH_GL_Jn_template() throws RuntimeException;

    /** Column name TH_GL_Jn_template_Line_ID */
    public static final String COLUMNNAME_TH_GL_Jn_template_Line_ID = "TH_GL_Jn_template_Line_ID";

	/** Set Journal Template Line	  */
	public void setTH_GL_Jn_template_Line_ID (int TH_GL_Jn_template_Line_ID);

	/** Get Journal Template Line	  */
	public int getTH_GL_Jn_template_Line_ID();

    /** Column name TH_GL_Jn_template_Line_UU */
    public static final String COLUMNNAME_TH_GL_Jn_template_Line_UU = "TH_GL_Jn_template_Line_UU";

	/** Set TH_GL_Jn_template_Line_UU	  */
	public void setTH_GL_Jn_template_Line_UU (String TH_GL_Jn_template_Line_UU);

	/** Get TH_GL_Jn_template_Line_UU	  */
	public String getTH_GL_Jn_template_Line_UU();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}

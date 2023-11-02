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

/** Generated Interface for GL_JournalRef
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_GL_JournalRef 
{

    /** TableName=GL_JournalRef */
    public static final String Table_Name = "GL_JournalRef";

    /** AD_Table_ID=1000093 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

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

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

    /** Column name Approve_No */
    public static final String COLUMNNAME_Approve_No = "Approve_No";

	/** Set Approve_No	  */
	public void setApprove_No (String Approve_No);

	/** Get Approve_No	  */
	public String getApprove_No();

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

    /** Column name FiscalYear */
    public static final String COLUMNNAME_FiscalYear = "FiscalYear";

	/** Set Year.
	  * The Fiscal Year
	  */
	public void setFiscalYear (String FiscalYear);

	/** Get Year.
	  * The Fiscal Year
	  */
	public String getFiscalYear();

    /** Column name GL_Journal_ID */
    public static final String COLUMNNAME_GL_Journal_ID = "GL_Journal_ID";

	/** Set Journal.
	  * General Ledger Journal
	  */
	public void setGL_Journal_ID (int GL_Journal_ID);

	/** Get Journal.
	  * General Ledger Journal
	  */
	public int getGL_Journal_ID();

	public org.compiere.model.I_GL_Journal getGL_Journal() throws RuntimeException;

    /** Column name GL_JournalRef_ID */
    public static final String COLUMNNAME_GL_JournalRef_ID = "GL_JournalRef_ID";

	/** Set GL_JournalRef	  */
	public void setGL_JournalRef_ID (int GL_JournalRef_ID);

	/** Get GL_JournalRef	  */
	public int getGL_JournalRef_ID();

    /** Column name GL_JournalRef_UU */
    public static final String COLUMNNAME_GL_JournalRef_UU = "GL_JournalRef_UU";

	/** Set GL_JournalRef_UU	  */
	public void setGL_JournalRef_UU (String GL_JournalRef_UU);

	/** Get GL_JournalRef_UU	  */
	public String getGL_JournalRef_UU();

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

    /** Column name Ref_No */
    public static final String COLUMNNAME_Ref_No = "Ref_No";

	/** Set Ref_No	  */
	public void setRef_No (String Ref_No);

	/** Get Ref_No	  */
	public String getRef_No();

    /** Column name TenderType_MoES */
    public static final String COLUMNNAME_TenderType_MoES = "TenderType_MoES";

	/** Set Tender Type.
	  * Method of Payment
	  */
	public void setTenderType_MoES (String TenderType_MoES);

	/** Get Tender Type.
	  * Method of Payment
	  */
	public String getTenderType_MoES();

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
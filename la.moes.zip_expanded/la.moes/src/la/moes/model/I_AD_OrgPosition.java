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

/** Generated Interface for AD_OrgPosition
 *  @author iDempiere (generated) 
 *  @version Release 8.2
 */
@SuppressWarnings("all")
public interface I_AD_OrgPosition 
{

    /** TableName=AD_OrgPosition */
    public static final String Table_Name = "AD_OrgPosition";

    /** AD_Table_ID=1000117 */
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

    /** Column name AD_OrgPosition_ID */
    public static final String COLUMNNAME_AD_OrgPosition_ID = "AD_OrgPosition_ID";

	/** Set Position	  */
	public void setAD_OrgPosition_ID (int AD_OrgPosition_ID);

	/** Get Position	  */
	public int getAD_OrgPosition_ID();

    /** Column name AD_OrgPosition_UU */
    public static final String COLUMNNAME_AD_OrgPosition_UU = "AD_OrgPosition_UU";

	/** Set AD_OrgPosition_UU	  */
	public void setAD_OrgPosition_UU (String AD_OrgPosition_UU);

	/** Get AD_OrgPosition_UU	  */
	public String getAD_OrgPosition_UU();

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

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Name2 */
    public static final String COLUMNNAME_Name2 = "Name2";

	/** Set Name2.
	  * Additional Name
	  */
	public void setName2 (String Name2);

	/** Get Name2.
	  * Additional Name
	  */
	public String getName2();

    /** Column name Name3 */
    public static final String COLUMNNAME_Name3 = "Name3";

	/** Set Name3	  */
	public void setName3 (String Name3);

	/** Get Name3	  */
	public String getName3();

    /** Column name Name4 */
    public static final String COLUMNNAME_Name4 = "Name4";

	/** Set Name4	  */
	public void setName4 (String Name4);

	/** Get Name4	  */
	public String getName4();

    /** Column name Name5 */
    public static final String COLUMNNAME_Name5 = "Name5";

	/** Set Name5	  */
	public void setName5 (String Name5);

	/** Get Name5	  */
	public String getName5();

    /** Column name Position1 */
    public static final String COLUMNNAME_Position1 = "Position1";

	/** Set Position1	  */
	public void setPosition1 (String Position1);

	/** Get Position1	  */
	public String getPosition1();

    /** Column name Position2 */
    public static final String COLUMNNAME_Position2 = "Position2";

	/** Set Position2	  */
	public void setPosition2 (String Position2);

	/** Get Position2	  */
	public String getPosition2();

    /** Column name Position3 */
    public static final String COLUMNNAME_Position3 = "Position3";

	/** Set Position3	  */
	public void setPosition3 (String Position3);

	/** Get Position3	  */
	public String getPosition3();

    /** Column name Position4 */
    public static final String COLUMNNAME_Position4 = "Position4";

	/** Set Position4	  */
	public void setPosition4 (String Position4);

	/** Get Position4	  */
	public String getPosition4();

    /** Column name Position5 */
    public static final String COLUMNNAME_Position5 = "Position5";

	/** Set Position5	  */
	public void setPosition5 (String Position5);

	/** Get Position5	  */
	public String getPosition5();

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

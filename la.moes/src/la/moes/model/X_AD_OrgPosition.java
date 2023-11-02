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

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for AD_OrgPosition
 *  @author iDempiere (generated) 
 *  @version Release 8.2 - $Id$ */
public class X_AD_OrgPosition extends PO implements I_AD_OrgPosition, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20230904L;

    /** Standard Constructor */
    public X_AD_OrgPosition (Properties ctx, int AD_OrgPosition_ID, String trxName)
    {
      super (ctx, AD_OrgPosition_ID, trxName);
      /** if (AD_OrgPosition_ID == 0)
        {
			setAD_OrgPosition_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_OrgPosition (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_AD_OrgPosition[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Position.
		@param AD_OrgPosition_ID Position	  */
	public void setAD_OrgPosition_ID (int AD_OrgPosition_ID)
	{
		if (AD_OrgPosition_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_OrgPosition_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_OrgPosition_ID, Integer.valueOf(AD_OrgPosition_ID));
	}

	/** Get Position.
		@return Position	  */
	public int getAD_OrgPosition_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_OrgPosition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AD_OrgPosition_UU.
		@param AD_OrgPosition_UU AD_OrgPosition_UU	  */
	public void setAD_OrgPosition_UU (String AD_OrgPosition_UU)
	{
		set_Value (COLUMNNAME_AD_OrgPosition_UU, AD_OrgPosition_UU);
	}

	/** Get AD_OrgPosition_UU.
		@return AD_OrgPosition_UU	  */
	public String getAD_OrgPosition_UU () 
	{
		return (String)get_Value(COLUMNNAME_AD_OrgPosition_UU);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Name2.
		@param Name2 
		Additional Name
	  */
	public void setName2 (String Name2)
	{
		set_Value (COLUMNNAME_Name2, Name2);
	}

	/** Get Name2.
		@return Additional Name
	  */
	public String getName2 () 
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** Set Name3.
		@param Name3 Name3	  */
	public void setName3 (String Name3)
	{
		set_Value (COLUMNNAME_Name3, Name3);
	}

	/** Get Name3.
		@return Name3	  */
	public String getName3 () 
	{
		return (String)get_Value(COLUMNNAME_Name3);
	}

	/** Set Name4.
		@param Name4 Name4	  */
	public void setName4 (String Name4)
	{
		set_Value (COLUMNNAME_Name4, Name4);
	}

	/** Get Name4.
		@return Name4	  */
	public String getName4 () 
	{
		return (String)get_Value(COLUMNNAME_Name4);
	}

	/** Set Name5.
		@param Name5 Name5	  */
	public void setName5 (String Name5)
	{
		set_Value (COLUMNNAME_Name5, Name5);
	}

	/** Get Name5.
		@return Name5	  */
	public String getName5 () 
	{
		return (String)get_Value(COLUMNNAME_Name5);
	}

	/** Set Position1.
		@param Position1 Position1	  */
	public void setPosition1 (String Position1)
	{
		set_Value (COLUMNNAME_Position1, Position1);
	}

	/** Get Position1.
		@return Position1	  */
	public String getPosition1 () 
	{
		return (String)get_Value(COLUMNNAME_Position1);
	}

	/** Set Position2.
		@param Position2 Position2	  */
	public void setPosition2 (String Position2)
	{
		set_Value (COLUMNNAME_Position2, Position2);
	}

	/** Get Position2.
		@return Position2	  */
	public String getPosition2 () 
	{
		return (String)get_Value(COLUMNNAME_Position2);
	}

	/** Set Position3.
		@param Position3 Position3	  */
	public void setPosition3 (String Position3)
	{
		set_Value (COLUMNNAME_Position3, Position3);
	}

	/** Get Position3.
		@return Position3	  */
	public String getPosition3 () 
	{
		return (String)get_Value(COLUMNNAME_Position3);
	}

	/** Set Position4.
		@param Position4 Position4	  */
	public void setPosition4 (String Position4)
	{
		set_Value (COLUMNNAME_Position4, Position4);
	}

	/** Get Position4.
		@return Position4	  */
	public String getPosition4 () 
	{
		return (String)get_Value(COLUMNNAME_Position4);
	}

	/** Set Position5.
		@param Position5 Position5	  */
	public void setPosition5 (String Position5)
	{
		set_Value (COLUMNNAME_Position5, Position5);
	}

	/** Get Position5.
		@return Position5	  */
	public String getPosition5 () 
	{
		return (String)get_Value(COLUMNNAME_Position5);
	}
}
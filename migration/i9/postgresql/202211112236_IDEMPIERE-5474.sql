-- IDEMPIERE-5474 Fixed Assets don't allow depreciation on 18 months
SELECT register_migration_script('202211112236_IDEMPIERE-5474.sql') FROM dual;

-- Nov 11, 2022, 10:36:25 PM CET
UPDATE AD_Column SET AD_Reference_ID=22,Updated=TO_TIMESTAMP('2022-11-11 22:36:25','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=56032
;

-- Nov 11, 2022, 10:36:27 PM CET
INSERT INTO t_alter_column values('i_asset','UseLifeYears','NUMERIC',null,'NULL')
;

-- Nov 11, 2022, 10:36:35 PM CET
UPDATE AD_Column SET AD_Reference_ID=22,Updated=TO_TIMESTAMP('2022-11-11 22:36:35','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55863
;

-- Nov 11, 2022, 10:36:36 PM CET
INSERT INTO t_alter_column values('a_asset_change','UseLifeYears','NUMERIC',null,'NULL')
;

-- Nov 11, 2022, 10:36:42 PM CET
UPDATE AD_Column SET AD_Reference_ID=22,Updated=TO_TIMESTAMP('2022-11-11 22:36:42','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55772
;

-- Nov 11, 2022, 10:36:43 PM CET
INSERT INTO t_alter_column values('a_asset_group_acct','UseLifeYears','NUMERIC',null,'NULL')
;

-- Nov 11, 2022, 10:36:49 PM CET
UPDATE AD_Column SET AD_Reference_ID=22, IsToolbarButton='N',Updated=TO_TIMESTAMP('2022-11-11 22:36:49','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59281
;

-- Nov 11, 2022, 10:36:50 PM CET
INSERT INTO t_alter_column values('a_depreciation_workfile','UseLifeYears','NUMERIC',null,'0')
;

-- Nov 11, 2022, 10:36:50 PM CET
UPDATE A_Depreciation_Workfile SET UseLifeYears=0 WHERE UseLifeYears IS NULL
;

-- Nov 11, 2022, 10:37:01 PM CET
UPDATE AD_Column SET AD_Reference_ID=22,Updated=TO_TIMESTAMP('2022-11-11 22:37:01','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=8046
;

-- Nov 11, 2022, 10:37:02 PM CET
INSERT INTO t_alter_column values('a_asset','UseLifeYears','NUMERIC',null,'NULL')
;

-- Nov 11, 2022, 10:42:59 PM CET
UPDATE AD_Column SET AD_Reference_ID=22, IsToolbarButton='N',Updated=TO_TIMESTAMP('2022-11-11 22:42:59','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59408
;

-- Nov 11, 2022, 10:43:01 PM CET
INSERT INTO t_alter_column values('a_asset_group_acct','UseLifeYears_F','NUMERIC',null,'0')
;

-- Nov 11, 2022, 10:43:01 PM CET
UPDATE A_Asset_Group_Acct SET UseLifeYears_F=0 WHERE UseLifeYears_F IS NULL
;

-- Nov 11, 2022, 10:43:08 PM CET
UPDATE AD_Column SET AD_Reference_ID=22, IsToolbarButton='N',Updated=TO_TIMESTAMP('2022-11-11 22:43:08','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59283
;

-- Nov 11, 2022, 10:43:09 PM CET
INSERT INTO t_alter_column values('a_depreciation_workfile','UseLifeYears_F','NUMERIC',null,'0')
;

-- Nov 11, 2022, 10:43:09 PM CET
UPDATE A_Depreciation_Workfile SET UseLifeYears_F=0 WHERE UseLifeYears_F IS NULL
;

-- Nov 11, 2022, 10:44:51 PM CET
UPDATE AD_Column SET AD_Reference_ID=22, IsToolbarButton='N',Updated=TO_TIMESTAMP('2022-11-11 22:44:51','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=59279
;

-- Nov 11, 2022, 10:44:52 PM CET
INSERT INTO t_alter_column values('a_depreciation_workfile','A_Asset_Life_Years_F','NUMERIC',null,'0')
;

-- Nov 11, 2022, 10:44:52 PM CET
UPDATE A_Depreciation_Workfile SET A_Asset_Life_Years_F=0 WHERE A_Asset_Life_Years_F IS NULL
;

-- Nov 11, 2022, 10:44:59 PM CET
UPDATE AD_Column SET AD_Reference_ID=22,Updated=TO_TIMESTAMP('2022-11-11 22:44:59','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55997
;

-- Nov 11, 2022, 10:45:01 PM CET
INSERT INTO t_alter_column values('i_asset','A_Asset_Life_Years','NUMERIC',null,'NULL')
;

-- Nov 11, 2022, 10:45:06 PM CET
UPDATE AD_Column SET AD_Reference_ID=22,Updated=TO_TIMESTAMP('2022-11-11 22:45:06','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_Column_ID=55418
;

-- Nov 11, 2022, 10:45:08 PM CET
INSERT INTO t_alter_column values('a_depreciation_workfile','A_Asset_Life_Years','NUMERIC',null,'0')
;

-- Nov 11, 2022, 10:45:08 PM CET
UPDATE A_Depreciation_Workfile SET A_Asset_Life_Years=0 WHERE A_Asset_Life_Years IS NULL
;


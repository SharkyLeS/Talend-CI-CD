
package bobi.maj_bobi_marque_darty_0_1;

import routines.DataOperation;
import routines.TalendDataGenerator;
import routines.HBASEroutines;
import routines.Relational;
import routines.Mathematical;
import routines.DartyRoutines;
import routines.SQLike;
import routines.Numeric;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.StringHandling;
import routines.TalendDate;
import routines.Date_Darty_to_Timestamp;
import routines.system.*;
import routines.system.api.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Comparator;
 




	//the import part of tJava_1
	//import java.util.List;
//import java.util.List;
//import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


@SuppressWarnings("unused")

/**
 * Job: MAJ_BOBI_MARQUE_DARTY Purpose: <br>
 * Description:  <br>
 * @author HADJI, Ali
 * @version 7.3.1.20200219_1130
 * @status 
 */
public class MAJ_BOBI_MARQUE_DARTY implements TalendJob {
	static {System.setProperty("TalendJob.log", "MAJ_BOBI_MARQUE_DARTY.log");}

	

	
	private static org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(MAJ_BOBI_MARQUE_DARTY.class);
	

protected static void logIgnoredError(String message, Throwable cause) {
       log.error(message, cause);

}


	public final Object obj = new Object();

	// for transmiting parameters purpose
	private Object valueObject = null;

	public Object getValueObject() {
		return this.valueObject;
	}

	public void setValueObject(Object valueObject) {
		this.valueObject = valueObject;
	}
	
	private final static String defaultCharset = java.nio.charset.Charset.defaultCharset().name();

	
	private final static String utf8Charset = "UTF-8";
	//contains type for every context property
	public class PropertiesWithType extends java.util.Properties {
		private static final long serialVersionUID = 1L;
		private java.util.Map<String,String> propertyTypes = new java.util.HashMap<>();
		
		public PropertiesWithType(java.util.Properties properties){
			super(properties);
		}
		public PropertiesWithType(){
			super();
		}
		
		public void setContextType(String key, String type) {
			propertyTypes.put(key,type);
		}
	
		public String getContextType(String key) {
			return propertyTypes.get(key);
		}
	}
	
	// create and load default properties
	private java.util.Properties defaultProps = new java.util.Properties();
	// create application properties with default
	public class ContextProperties extends PropertiesWithType {

		private static final long serialVersionUID = 1L;

		public ContextProperties(java.util.Properties properties){
			super(properties);
		}
		public ContextProperties(){
			super();
		}

		public void synchronizeContext(){
			
			if(AMC_DARTY_db_AdditionalParams != null){
				
					this.setProperty("AMC_DARTY_db_AdditionalParams", AMC_DARTY_db_AdditionalParams.toString());
				
			}
			
			if(AMC_DARTY_db_Login != null){
				
					this.setProperty("AMC_DARTY_db_Login", AMC_DARTY_db_Login.toString());
				
			}
			
			if(AMC_DARTY_db_Password != null){
				
					this.setProperty("AMC_DARTY_db_Password", AMC_DARTY_db_Password.toString());
				
			}
			
			if(AMC_DARTY_db_Port != null){
				
					this.setProperty("AMC_DARTY_db_Port", AMC_DARTY_db_Port.toString());
				
			}
			
			if(AMC_DARTY_db_Schema != null){
				
					this.setProperty("AMC_DARTY_db_Schema", AMC_DARTY_db_Schema.toString());
				
			}
			
			if(AMC_DARTY_db_Server != null){
				
					this.setProperty("AMC_DARTY_db_Server", AMC_DARTY_db_Server.toString());
				
			}
			
			if(AMC_DARTY_db_Sid != null){
				
					this.setProperty("AMC_DARTY_db_Sid", AMC_DARTY_db_Sid.toString());
				
			}
			
			if(C01_ClusterDarty_HDFS_Group != null){
				
					this.setProperty("C01_ClusterDarty_HDFS_Group", C01_ClusterDarty_HDFS_Group.toString());
				
			}
			
			if(C01_ClusterDarty_HDFS_Temp_Folder != null){
				
					this.setProperty("C01_ClusterDarty_HDFS_Temp_Folder", C01_ClusterDarty_HDFS_Temp_Folder.toString());
				
			}
			
			if(C01_ClusterDarty_HDFS_User_Name != null){
				
					this.setProperty("C01_ClusterDarty_HDFS_User_Name", C01_ClusterDarty_HDFS_User_Name.toString());
				
			}
			
			if(C01_ClusterDarty_JobtrackerURI != null){
				
					this.setProperty("C01_ClusterDarty_JobtrackerURI", C01_ClusterDarty_JobtrackerURI.toString());
				
			}
			
			if(C01_ClusterDarty_NamenodeURI != null){
				
					this.setProperty("C01_ClusterDarty_NamenodeURI", C01_ClusterDarty_NamenodeURI.toString());
				
			}
			
			if(C01_ClusterDarty_Zookeeper_Host != null){
				
					this.setProperty("C01_ClusterDarty_Zookeeper_Host", C01_ClusterDarty_Zookeeper_Host.toString());
				
			}
			
			if(C01_ClusterDarty_Zookeeper_Port != null){
				
					this.setProperty("C01_ClusterDarty_Zookeeper_Port", C01_ClusterDarty_Zookeeper_Port.toString());
				
			}
			
			if(C10_Hive_connection_Hive_DbDwh_Name != null){
				
					this.setProperty("C10_Hive_connection_Hive_DbDwh_Name", C10_Hive_connection_Hive_DbDwh_Name.toString());
				
			}
			
			if(C10_Hive_connection_Hive_DbHisto_Name != null){
				
					this.setProperty("C10_Hive_connection_Hive_DbHisto_Name", C10_Hive_connection_Hive_DbHisto_Name.toString());
				
			}
			
			if(C10_Hive_connection_Hive_DbNominal_Name != null){
				
					this.setProperty("C10_Hive_connection_Hive_DbNominal_Name", C10_Hive_connection_Hive_DbNominal_Name.toString());
				
			}
			
			if(C10_Hive_connection_Hive_Host != null){
				
					this.setProperty("C10_Hive_connection_Hive_Host", C10_Hive_connection_Hive_Host.toString());
				
			}
			
			if(C10_Hive_connection_Hive_Password != null){
				
					this.setProperty("C10_Hive_connection_Hive_Password", C10_Hive_connection_Hive_Password.toString());
				
			}
			
			if(C10_Hive_connection_Hive_Port != null){
				
					this.setProperty("C10_Hive_connection_Hive_Port", C10_Hive_connection_Hive_Port.toString());
				
			}
			
			if(C10_Hive_connection_Hive_User_Name != null){
				
					this.setProperty("C10_Hive_connection_Hive_User_Name", C10_Hive_connection_Hive_User_Name.toString());
				
			}
			
			if(C100_Tables_RTAC01_HBase != null){
				
					this.setProperty("C100_Tables_RTAC01_HBase", C100_Tables_RTAC01_HBase.toString());
				
			}
			
			if(C100_Tables_RTAC01_MqFile != null){
				
					this.setProperty("C100_Tables_RTAC01_MqFile", C100_Tables_RTAC01_MqFile.toString());
				
			}
			
			if(C100_Tables_RTAC02_HBase != null){
				
					this.setProperty("C100_Tables_RTAC02_HBase", C100_Tables_RTAC02_HBase.toString());
				
			}
			
			if(C100_Tables_RTAC02_MqFile != null){
				
					this.setProperty("C100_Tables_RTAC02_MqFile", C100_Tables_RTAC02_MqFile.toString());
				
			}
			
			if(C100_Tables_RTEM51_HBase != null){
				
					this.setProperty("C100_Tables_RTEM51_HBase", C100_Tables_RTEM51_HBase.toString());
				
			}
			
			if(C100_Tables_RTEM51_MqFile != null){
				
					this.setProperty("C100_Tables_RTEM51_MqFile", C100_Tables_RTEM51_MqFile.toString());
				
			}
			
			if(C100_Tables_RTEM52_HBase != null){
				
					this.setProperty("C100_Tables_RTEM52_HBase", C100_Tables_RTEM52_HBase.toString());
				
			}
			
			if(C100_Tables_RTEM52_MqFile != null){
				
					this.setProperty("C100_Tables_RTEM52_MqFile", C100_Tables_RTEM52_MqFile.toString());
				
			}
			
			if(C100_Tables_RTEM53_HBase != null){
				
					this.setProperty("C100_Tables_RTEM53_HBase", C100_Tables_RTEM53_HBase.toString());
				
			}
			
			if(C100_Tables_RTEM53_MqFile != null){
				
					this.setProperty("C100_Tables_RTEM53_MqFile", C100_Tables_RTEM53_MqFile.toString());
				
			}
			
			if(C100_Tables_RTEM54_HBase != null){
				
					this.setProperty("C100_Tables_RTEM54_HBase", C100_Tables_RTEM54_HBase.toString());
				
			}
			
			if(C100_Tables_RTEM54_MqFile != null){
				
					this.setProperty("C100_Tables_RTEM54_MqFile", C100_Tables_RTEM54_MqFile.toString());
				
			}
			
			if(C100_Tables_RTEM55_HBase != null){
				
					this.setProperty("C100_Tables_RTEM55_HBase", C100_Tables_RTEM55_HBase.toString());
				
			}
			
			if(C100_Tables_RTEM55_MqFile != null){
				
					this.setProperty("C100_Tables_RTEM55_MqFile", C100_Tables_RTEM55_MqFile.toString());
				
			}
			
			if(C100_Tables_RTPC01_HBase != null){
				
					this.setProperty("C100_Tables_RTPC01_HBase", C100_Tables_RTPC01_HBase.toString());
				
			}
			
			if(C100_Tables_RTPC01_MqFile != null){
				
					this.setProperty("C100_Tables_RTPC01_MqFile", C100_Tables_RTPC01_MqFile.toString());
				
			}
			
			if(C100_Tables_RTPC02_HBase != null){
				
					this.setProperty("C100_Tables_RTPC02_HBase", C100_Tables_RTPC02_HBase.toString());
				
			}
			
			if(C100_Tables_RTPC02_MqFile != null){
				
					this.setProperty("C100_Tables_RTPC02_MqFile", C100_Tables_RTPC02_MqFile.toString());
				
			}
			
			if(C130_ElasticSearch_Apport_Retrait != null){
				
					this.setProperty("C130_ElasticSearch_Apport_Retrait", C130_ElasticSearch_Apport_Retrait.toString());
				
			}
			
			if(C130_ElasticSearch_Authorization != null){
				
					this.setProperty("C130_ElasticSearch_Authorization", C130_ElasticSearch_Authorization.toString());
				
			}
			
			if(C130_ElasticSearch_AuthValue != null){
				
					this.setProperty("C130_ElasticSearch_AuthValue", C130_ElasticSearch_AuthValue.toString());
				
			}
			
			if(C130_ElasticSearch_Cadeaux != null){
				
					this.setProperty("C130_ElasticSearch_Cadeaux", C130_ElasticSearch_Cadeaux.toString());
				
			}
			
			if(C130_ElasticSearch_Decompte != null){
				
					this.setProperty("C130_ElasticSearch_Decompte", C130_ElasticSearch_Decompte.toString());
				
			}
			
			if(C130_ElasticSearch_Encaissements != null){
				
					this.setProperty("C130_ElasticSearch_Encaissements", C130_ElasticSearch_Encaissements.toString());
				
			}
			
			if(C130_ElasticSearch_HostRunTime != null){
				
					this.setProperty("C130_ElasticSearch_HostRunTime", C130_ElasticSearch_HostRunTime.toString());
				
			}
			
			if(C130_ElasticSearch_PortRunTime != null){
				
					this.setProperty("C130_ElasticSearch_PortRunTime", C130_ElasticSearch_PortRunTime.toString());
				
			}
			
			if(C130_ElasticSearch_PwdRunTime != null){
				
					this.setProperty("C130_ElasticSearch_PwdRunTime", C130_ElasticSearch_PwdRunTime.toString());
				
			}
			
			if(C130_ElasticSearch_serv != null){
				
					this.setProperty("C130_ElasticSearch_serv", C130_ElasticSearch_serv.toString());
				
			}
			
			if(C130_ElasticSearch_URL != null){
				
					this.setProperty("C130_ElasticSearch_URL", C130_ElasticSearch_URL.toString());
				
			}
			
			if(C130_ElasticSearch_UserRunTime != null){
				
					this.setProperty("C130_ElasticSearch_UserRunTime", C130_ElasticSearch_UserRunTime.toString());
				
			}
			
			if(C130_ElasticSearch_Vente != null){
				
					this.setProperty("C130_ElasticSearch_Vente", C130_ElasticSearch_Vente.toString());
				
			}
			
			if(C130_ElasticSearch_WYNN_Entree_Mag != null){
				
					this.setProperty("C130_ElasticSearch_WYNN_Entree_Mag", C130_ElasticSearch_WYNN_Entree_Mag.toString());
				
			}
			
			if(C130_ElasticSearch_WYNN_Lignes_vente != null){
				
					this.setProperty("C130_ElasticSearch_WYNN_Lignes_vente", C130_ElasticSearch_WYNN_Lignes_vente.toString());
				
			}
			
			if(new1 != null){
				
					this.setProperty("new1", new1.toString());
				
			}
			
			if(C30_Directory_HDFS_Archive != null){
				
					this.setProperty("C30_Directory_HDFS_Archive", C30_Directory_HDFS_Archive.toString());
				
			}
			
			if(C30_Directory_HDFS_Conf != null){
				
					this.setProperty("C30_Directory_HDFS_Conf", C30_Directory_HDFS_Conf.toString());
				
			}
			
			if(C30_Directory_HDFS_Dezip != null){
				
					this.setProperty("C30_Directory_HDFS_Dezip", C30_Directory_HDFS_Dezip.toString());
				
			}
			
			if(C30_Directory_HDFS_Dwh != null){
				
					this.setProperty("C30_Directory_HDFS_Dwh", C30_Directory_HDFS_Dwh.toString());
				
			}
			
			if(C30_Directory_HDFS_Input != null){
				
					this.setProperty("C30_Directory_HDFS_Input", C30_Directory_HDFS_Input.toString());
				
			}
			
			if(C30_Directory_HDFS_Json != null){
				
					this.setProperty("C30_Directory_HDFS_Json", C30_Directory_HDFS_Json.toString());
				
			}
			
			if(C30_Directory_HDFS_Mq != null){
				
					this.setProperty("C30_Directory_HDFS_Mq", C30_Directory_HDFS_Mq.toString());
				
			}
			
			if(C30_Directory_HDFS_MQ_Error != null){
				
					this.setProperty("C30_Directory_HDFS_MQ_Error", C30_Directory_HDFS_MQ_Error.toString());
				
			}
			
			if(C30_Directory_HDFS_NCG != null){
				
					this.setProperty("C30_Directory_HDFS_NCG", C30_Directory_HDFS_NCG.toString());
				
			}
			
			if(C30_Directory_HDFS_PCM != null){
				
					this.setProperty("C30_Directory_HDFS_PCM", C30_Directory_HDFS_PCM.toString());
				
			}
			
			if(C30_Directory_HDFS_Pig != null){
				
					this.setProperty("C30_Directory_HDFS_Pig", C30_Directory_HDFS_Pig.toString());
				
			}
			
			if(C30_Directory_HDFS_Racine != null){
				
					this.setProperty("C30_Directory_HDFS_Racine", C30_Directory_HDFS_Racine.toString());
				
			}
			
			if(C30_Directory_HDFS_REF != null){
				
					this.setProperty("C30_Directory_HDFS_REF", C30_Directory_HDFS_REF.toString());
				
			}
			
			if(C30_Directory_HDFS_Rejets != null){
				
					this.setProperty("C30_Directory_HDFS_Rejets", C30_Directory_HDFS_Rejets.toString());
				
			}
			
			if(C30_Directory_HDFS_Reprise != null){
				
					this.setProperty("C30_Directory_HDFS_Reprise", C30_Directory_HDFS_Reprise.toString());
				
			}
			
			if(C30_Directory_HDFS_Tmp != null){
				
					this.setProperty("C30_Directory_HDFS_Tmp", C30_Directory_HDFS_Tmp.toString());
				
			}
			
			if(C30_Directory_HDFS_Transac != null){
				
					this.setProperty("C30_Directory_HDFS_Transac", C30_Directory_HDFS_Transac.toString());
				
			}
			
			if(C30_Directory_HDFS_Work != null){
				
					this.setProperty("C30_Directory_HDFS_Work", C30_Directory_HDFS_Work.toString());
				
			}
			
			if(C30_Directory_HIVE_Racine != null){
				
					this.setProperty("C30_Directory_HIVE_Racine", C30_Directory_HIVE_Racine.toString());
				
			}
			
			if(C30_Directory_INPUT_DWH != null){
				
					this.setProperty("C30_Directory_INPUT_DWH", C30_Directory_INPUT_DWH.toString());
				
			}
			
			if(C30_Directory_INPUT_FUNC_LOG != null){
				
					this.setProperty("C30_Directory_INPUT_FUNC_LOG", C30_Directory_INPUT_FUNC_LOG.toString());
				
			}
			
			if(C30_Directory_INPUT_NCG != null){
				
					this.setProperty("C30_Directory_INPUT_NCG", C30_Directory_INPUT_NCG.toString());
				
			}
			
			if(C30_Directory_INPUT_QLIK != null){
				
					this.setProperty("C30_Directory_INPUT_QLIK", C30_Directory_INPUT_QLIK.toString());
				
			}
			
			if(C30_Directory_INPUT_TMP != null){
				
					this.setProperty("C30_Directory_INPUT_TMP", C30_Directory_INPUT_TMP.toString());
				
			}
			
			if(C30_Directory_INPUT_Transac_NCG != null){
				
					this.setProperty("C30_Directory_INPUT_Transac_NCG", C30_Directory_INPUT_Transac_NCG.toString());
				
			}
			
			if(C40_FileName_EndOfFile_Histo != null){
				
					this.setProperty("C40_FileName_EndOfFile_Histo", C40_FileName_EndOfFile_Histo.toString());
				
			}
			
			if(C40_FileName_EndOfFile_Histo_Nominal_Queue != null){
				
					this.setProperty("C40_FileName_EndOfFile_Histo_Nominal_Queue", C40_FileName_EndOfFile_Histo_Nominal_Queue.toString());
				
			}
			
			if(C40_FilesName_ARCHIVE_HDFS_SUFFIX != null){
				
					this.setProperty("C40_FilesName_ARCHIVE_HDFS_SUFFIX", C40_FilesName_ARCHIVE_HDFS_SUFFIX.toString());
				
			}
			
			if(C40_FilesName_HISTO_Delimiter_Denormalize != null){
				
					this.setProperty("C40_FilesName_HISTO_Delimiter_Denormalize", C40_FilesName_HISTO_Delimiter_Denormalize.toString());
				
			}
			
			if(C40_FilesName_HISTO_Extension_src != null){
				
					this.setProperty("C40_FilesName_HISTO_Extension_src", C40_FilesName_HISTO_Extension_src.toString());
				
			}
			
			if(C40_FilesName_HISTO_Extension_tmp != null){
				
					this.setProperty("C40_FilesName_HISTO_Extension_tmp", C40_FilesName_HISTO_Extension_tmp.toString());
				
			}
			
			if(C40_FilesName_HISTO_Mask_Src != null){
				
					this.setProperty("C40_FilesName_HISTO_Mask_Src", C40_FilesName_HISTO_Mask_Src.toString());
				
			}
			
			if(C40_FilesName_HISTO_Mask_tmp != null){
				
					this.setProperty("C40_FilesName_HISTO_Mask_tmp", C40_FilesName_HISTO_Mask_tmp.toString());
				
			}
			
			if(C40_FilesName_RepriseHistoProperties != null){
				
					this.setProperty("C40_FilesName_RepriseHistoProperties", C40_FilesName_RepriseHistoProperties.toString());
				
			}
			
			if(C50_DB2_flowTable != null){
				
					this.setProperty("C50_DB2_flowTable", C50_DB2_flowTable.toString());
				
			}
			
			if(C50_DB2_hostname != null){
				
					this.setProperty("C50_DB2_hostname", C50_DB2_hostname.toString());
				
			}
			
			if(C50_DB2_instance != null){
				
					this.setProperty("C50_DB2_instance", C50_DB2_instance.toString());
				
			}
			
			if(C50_DB2_logTable != null){
				
					this.setProperty("C50_DB2_logTable", C50_DB2_logTable.toString());
				
			}
			
			if(C50_DB2_port != null){
				
					this.setProperty("C50_DB2_port", C50_DB2_port.toString());
				
			}
			
			if(C50_DB2_pwd != null){
				
					this.setProperty("C50_DB2_pwd", C50_DB2_pwd.toString());
				
			}
			
			if(C50_DB2_schema != null){
				
					this.setProperty("C50_DB2_schema", C50_DB2_schema.toString());
				
			}
			
			if(C50_DB2_statTable != null){
				
					this.setProperty("C50_DB2_statTable", C50_DB2_statTable.toString());
				
			}
			
			if(C50_DB2_user != null){
				
					this.setProperty("C50_DB2_user", C50_DB2_user.toString());
				
			}
			
			if(C60_FilesName_DWH_H_Articles != null){
				
					this.setProperty("C60_FilesName_DWH_H_Articles", C60_FilesName_DWH_H_Articles.toString());
				
			}
			
			if(C60_FilesName_DWH_H_Orga != null){
				
					this.setProperty("C60_FilesName_DWH_H_Orga", C60_FilesName_DWH_H_Orga.toString());
				
			}
			
			if(C60_FilesName_DWH_H_Prestas != null){
				
					this.setProperty("C60_FilesName_DWH_H_Prestas", C60_FilesName_DWH_H_Prestas.toString());
				
			}
			
			if(C60_FilesName_DWH_RTGA01 != null){
				
					this.setProperty("C60_FilesName_DWH_RTGA01", C60_FilesName_DWH_RTGA01.toString());
				
			}
			
			if(C60_FilesName_DWH_RTGA75 != null){
				
					this.setProperty("C60_FilesName_DWH_RTGA75", C60_FilesName_DWH_RTGA75.toString());
				
			}
			
			if(C60_FilesName_DWH_RTGG40 != null){
				
					this.setProperty("C60_FilesName_DWH_RTGG40", C60_FilesName_DWH_RTGG40.toString());
				
			}
			
			if(C60_FilesName_DWH_RTGV31 != null){
				
					this.setProperty("C60_FilesName_DWH_RTGV31", C60_FilesName_DWH_RTGV31.toString());
				
			}
			
			if(C60_FilesName_DWR_TORG != null){
				
					this.setProperty("C60_FilesName_DWR_TORG", C60_FilesName_DWR_TORG.toString());
				
			}
			
			if(C60_FilesName_DWR_TPRESTA != null){
				
					this.setProperty("C60_FilesName_DWR_TPRESTA", C60_FilesName_DWR_TPRESTA.toString());
				
			}
			
			if(C60_FilesName_DWR_TPRODUIT != null){
				
					this.setProperty("C60_FilesName_DWR_TPRODUIT", C60_FilesName_DWR_TPRODUIT.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTGV02 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTGV02", C60_FilesName_HISTO_RTGV02.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTGV10 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTGV10", C60_FilesName_HISTO_RTGV10.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTGV14 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTGV14", C60_FilesName_HISTO_RTGV14.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT01 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT01", C60_FilesName_HISTO_RTVT01.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT02 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT02", C60_FilesName_HISTO_RTVT02.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT03 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT03", C60_FilesName_HISTO_RTVT03.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT08 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT08", C60_FilesName_HISTO_RTVT08.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT11 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT11", C60_FilesName_HISTO_RTVT11.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT12 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT12", C60_FilesName_HISTO_RTVT12.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT13 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT13", C60_FilesName_HISTO_RTVT13.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT14 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT14", C60_FilesName_HISTO_RTVT14.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT15 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT15", C60_FilesName_HISTO_RTVT15.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT16 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT16", C60_FilesName_HISTO_RTVT16.toString());
				
			}
			
			if(C60_FilesName_HISTO_RTVT17 != null){
				
					this.setProperty("C60_FilesName_HISTO_RTVT17", C60_FilesName_HISTO_RTVT17.toString());
				
			}
			
			if(C80_MQDarty_NCG_CONNECTION_Canal != null){
				
					this.setProperty("C80_MQDarty_NCG_CONNECTION_Canal", C80_MQDarty_NCG_CONNECTION_Canal.toString());
				
			}
			
			if(C80_MQDarty_NCG_CONNECTION_Port != null){
				
					this.setProperty("C80_MQDarty_NCG_CONNECTION_Port", C80_MQDarty_NCG_CONNECTION_Port.toString());
				
			}
			
			if(C80_MQDarty_NCG_CONNECTION_Pwd != null){
				
					this.setProperty("C80_MQDarty_NCG_CONNECTION_Pwd", C80_MQDarty_NCG_CONNECTION_Pwd.toString());
				
			}
			
			if(C80_MQDarty_NCG_CONNECTION_QueueManager != null){
				
					this.setProperty("C80_MQDarty_NCG_CONNECTION_QueueManager", C80_MQDarty_NCG_CONNECTION_QueueManager.toString());
				
			}
			
			if(C80_MQDarty_NCG_CONNECTION_Server != null){
				
					this.setProperty("C80_MQDarty_NCG_CONNECTION_Server", C80_MQDarty_NCG_CONNECTION_Server.toString());
				
			}
			
			if(C80_MQDarty_NCG_CONNECTION_User != null){
				
					this.setProperty("C80_MQDarty_NCG_CONNECTION_User", C80_MQDarty_NCG_CONNECTION_User.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_Canal != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_Canal", C80_MQDarty_NCG_Error_Canal.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_Port != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_Port", C80_MQDarty_NCG_Error_Port.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_Pwd != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_Pwd", C80_MQDarty_NCG_Error_Pwd.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_QueueManager != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_QueueManager", C80_MQDarty_NCG_Error_QueueManager.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_QueueName", C80_MQDarty_NCG_Error_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_Server != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_Server", C80_MQDarty_NCG_Error_Server.toString());
				
			}
			
			if(C80_MQDarty_NCG_Error_User != null){
				
					this.setProperty("C80_MQDarty_NCG_Error_User", C80_MQDarty_NCG_Error_User.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_FilesName_RTAC03 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_FilesName_RTAC03", C80_MQDarty_NCG_RTAC03_FilesName_RTAC03.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_GRP_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_GRP_QueueName", C80_MQDarty_NCG_RTAC03_GRP_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_HBase", C80_MQDarty_NCG_RTAC03_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_Modele", C80_MQDarty_NCG_RTAC03_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_NbMessage", C80_MQDarty_NCG_RTAC03_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_TimeOut", C80_MQDarty_NCG_RTAC03_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTAC03_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTAC03_TraitementName", C80_MQDarty_NCG_RTAC03_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_FilesName_RTGV02 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_FilesName_RTGV02", C80_MQDarty_NCG_RTGV02_FilesName_RTGV02.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_HBase", C80_MQDarty_NCG_RTGV02_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_Modele", C80_MQDarty_NCG_RTGV02_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_NbMessage", C80_MQDarty_NCG_RTGV02_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_QueueName", C80_MQDarty_NCG_RTGV02_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_TimeOut", C80_MQDarty_NCG_RTGV02_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV02_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV02_TraitementName", C80_MQDarty_NCG_RTGV02_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_FilesName_RTGV03 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_FilesName_RTGV03", C80_MQDarty_NCG_RTGV03_FilesName_RTGV03.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_HBase", C80_MQDarty_NCG_RTGV03_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_Modele", C80_MQDarty_NCG_RTGV03_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_NbMessage", C80_MQDarty_NCG_RTGV03_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_QueueName", C80_MQDarty_NCG_RTGV03_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_TimeOut", C80_MQDarty_NCG_RTGV03_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV03_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV03_TraitementName", C80_MQDarty_NCG_RTGV03_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_FilesName_RTGV04 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_FilesName_RTGV04", C80_MQDarty_NCG_RTGV04_FilesName_RTGV04.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_HBase", C80_MQDarty_NCG_RTGV04_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_Modele", C80_MQDarty_NCG_RTGV04_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_NbMessage", C80_MQDarty_NCG_RTGV04_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_QueueName", C80_MQDarty_NCG_RTGV04_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_TimeOut", C80_MQDarty_NCG_RTGV04_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV04_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV04_TraitementName", C80_MQDarty_NCG_RTGV04_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_FilesName_RTGV10 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_FilesName_RTGV10", C80_MQDarty_NCG_RTGV10_FilesName_RTGV10.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_HBase", C80_MQDarty_NCG_RTGV10_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_Modele", C80_MQDarty_NCG_RTGV10_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_NbMessage", C80_MQDarty_NCG_RTGV10_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_QueueName", C80_MQDarty_NCG_RTGV10_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_TimeOut", C80_MQDarty_NCG_RTGV10_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV10_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV10_TraitementName", C80_MQDarty_NCG_RTGV10_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_FilesName_RTGV11 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11", C80_MQDarty_NCG_RTGV11_FilesName_RTGV11.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive", C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes", C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive", C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_HBase", C80_MQDarty_NCG_RTGV11_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_Modele", C80_MQDarty_NCG_RTGV11_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_NbMessage", C80_MQDarty_NCG_RTGV11_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_NbProcessingFile != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_NbProcessingFile", C80_MQDarty_NCG_RTGV11_NbProcessingFile.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_QueueName", C80_MQDarty_NCG_RTGV11_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_TimeOut", C80_MQDarty_NCG_RTGV11_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV11_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV11_TraitementName", C80_MQDarty_NCG_RTGV11_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_FilesName_RTGV14 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_FilesName_RTGV14", C80_MQDarty_NCG_RTGV14_FilesName_RTGV14.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_HBase", C80_MQDarty_NCG_RTGV14_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_Modele", C80_MQDarty_NCG_RTGV14_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_NbMessage", C80_MQDarty_NCG_RTGV14_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_QueueName", C80_MQDarty_NCG_RTGV14_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_TimeOut", C80_MQDarty_NCG_RTGV14_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV14_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV14_TraitementName", C80_MQDarty_NCG_RTGV14_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_FilesName_RTGV15 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_FilesName_RTGV15", C80_MQDarty_NCG_RTGV15_FilesName_RTGV15.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_HBase", C80_MQDarty_NCG_RTGV15_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_Modele", C80_MQDarty_NCG_RTGV15_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_NbMessage", C80_MQDarty_NCG_RTGV15_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_QueueName", C80_MQDarty_NCG_RTGV15_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_TimeOut", C80_MQDarty_NCG_RTGV15_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTGV15_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTGV15_TraitementName", C80_MQDarty_NCG_RTGV15_TraitementName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_FilesName_RTTL04 != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_FilesName_RTTL04", C80_MQDarty_NCG_RTTL04_FilesName_RTTL04.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_HBase != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_HBase", C80_MQDarty_NCG_RTTL04_HBase.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_Modele != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_Modele", C80_MQDarty_NCG_RTTL04_Modele.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_NbMessage != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_NbMessage", C80_MQDarty_NCG_RTTL04_NbMessage.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_QueueName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_QueueName", C80_MQDarty_NCG_RTTL04_QueueName.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_TimeOut != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_TimeOut", C80_MQDarty_NCG_RTTL04_TimeOut.toString());
				
			}
			
			if(C80_MQDarty_NCG_RTTL04_TraitementName != null){
				
					this.setProperty("C80_MQDarty_NCG_RTTL04_TraitementName", C80_MQDarty_NCG_RTTL04_TraitementName.toString());
				
			}
			
			if(CtxPathFile != null){
				
					this.setProperty("CtxPathFile", CtxPathFile.toString());
				
			}
			
			if(DartyEncoding != null){
				
					this.setProperty("DartyEncoding", DartyEncoding.toString());
				
			}
			
			if(Dir_conf != null){
				
					this.setProperty("Dir_conf", Dir_conf.toString());
				
			}
			
			if(FilePath_StopNgo_Json != null){
				
					this.setProperty("FilePath_StopNgo_Json", FilePath_StopNgo_Json.toString());
				
			}
			
			if(FilePath_StopNgo_Nominal != null){
				
					this.setProperty("FilePath_StopNgo_Nominal", FilePath_StopNgo_Nominal.toString());
				
			}
			
			if(ProfondeurHisto != null){
				
					this.setProperty("ProfondeurHisto", ProfondeurHisto.toString());
				
			}
			
			if(ShardingGV11 != null){
				
					this.setProperty("ShardingGV11", ShardingGV11.toString());
				
			}
			
			if(TimerCheckLoop != null){
				
					this.setProperty("TimerCheckLoop", TimerCheckLoop.toString());
				
			}
			
			if(TimerLoopStopNGo != null){
				
					this.setProperty("TimerLoopStopNGo", TimerLoopStopNGo.toString());
				
			}
			
			if(CLOCAL_Cartes_Cadeaux_JSON != null){
				
					this.setProperty("CLOCAL_Cartes_Cadeaux_JSON", CLOCAL_Cartes_Cadeaux_JSON.toString());
				
			}
			
			if(FilesName_Json_Cartes_Cadeaux != null){
				
					this.setProperty("FilesName_Json_Cartes_Cadeaux", FilesName_Json_Cartes_Cadeaux.toString());
				
			}
			
			if(C30_File_Json_Apport_Retrait != null){
				
					this.setProperty("C30_File_Json_Apport_Retrait", C30_File_Json_Apport_Retrait.toString());
				
			}
			
			if(C30_FilesName_Json_Decompte != null){
				
					this.setProperty("C30_FilesName_Json_Decompte", C30_FilesName_Json_Decompte.toString());
				
			}
			
			if(CLOCAL_apport_retrait_JSON != null){
				
					this.setProperty("CLOCAL_apport_retrait_JSON", CLOCAL_apport_retrait_JSON.toString());
				
			}
			
			if(CLOCAL_decompte_JSON != null){
				
					this.setProperty("CLOCAL_decompte_JSON", CLOCAL_decompte_JSON.toString());
				
			}
			
			if(CLOCAL_entete_encaissement_JSON != null){
				
					this.setProperty("CLOCAL_entete_encaissement_JSON", CLOCAL_entete_encaissement_JSON.toString());
				
			}
			
			if(CLOCAL_lignes_encaissement_JSON != null){
				
					this.setProperty("CLOCAL_lignes_encaissement_JSON", CLOCAL_lignes_encaissement_JSON.toString());
				
			}
			
			if(CLOCAL_MQ_Ref_Filename_AR != null){
				
					this.setProperty("CLOCAL_MQ_Ref_Filename_AR", CLOCAL_MQ_Ref_Filename_AR.toString());
				
			}
			
			if(CLOCAL_MQ_Ref_Filename_DE != null){
				
					this.setProperty("CLOCAL_MQ_Ref_Filename_DE", CLOCAL_MQ_Ref_Filename_DE.toString());
				
			}
			
			if(CLOCAL_OutputJsonFileName_AR != null){
				
					this.setProperty("CLOCAL_OutputJsonFileName_AR", CLOCAL_OutputJsonFileName_AR.toString());
				
			}
			
			if(CLOCAL_OutputJsonFileName_DE != null){
				
					this.setProperty("CLOCAL_OutputJsonFileName_DE", CLOCAL_OutputJsonFileName_DE.toString());
				
			}
			
			if(CLOCAL_Prefix_Temp_Files_AR != null){
				
					this.setProperty("CLOCAL_Prefix_Temp_Files_AR", CLOCAL_Prefix_Temp_Files_AR.toString());
				
			}
			
			if(CLOCAL_Prefix_Temp_Files_DE != null){
				
					this.setProperty("CLOCAL_Prefix_Temp_Files_DE", CLOCAL_Prefix_Temp_Files_DE.toString());
				
			}
			
			if(CLOCAL_reglements_JSON != null){
				
					this.setProperty("CLOCAL_reglements_JSON", CLOCAL_reglements_JSON.toString());
				
			}
			
			if(FilesName_Json_Encaissements != null){
				
					this.setProperty("FilesName_Json_Encaissements", FilesName_Json_Encaissements.toString());
				
			}
			
			if(C30_FilesName_Json_Ventes != null){
				
					this.setProperty("C30_FilesName_Json_Ventes", C30_FilesName_Json_Ventes.toString());
				
			}
			
			if(CLOCAL_Adresse_JSON != null){
				
					this.setProperty("CLOCAL_Adresse_JSON", CLOCAL_Adresse_JSON.toString());
				
			}
			
			if(CLOCAL_Email_JSON != null){
				
					this.setProperty("CLOCAL_Email_JSON", CLOCAL_Email_JSON.toString());
				
			}
			
			if(CLOCAL_Encaissement_JSON != null){
				
					this.setProperty("CLOCAL_Encaissement_JSON", CLOCAL_Encaissement_JSON.toString());
				
			}
			
			if(CLOCAL_Entete_vente_JSON != null){
				
					this.setProperty("CLOCAL_Entete_vente_JSON", CLOCAL_Entete_vente_JSON.toString());
				
			}
			
			if(CLOCAL_Lignes_vente_JSON != null){
				
					this.setProperty("CLOCAL_Lignes_vente_JSON", CLOCAL_Lignes_vente_JSON.toString());
				
			}
			
			if(CLOCAL_Masque != null){
				
					this.setProperty("CLOCAL_Masque", CLOCAL_Masque.toString());
				
			}
			
			if(CLOCAL_Options_JSON != null){
				
					this.setProperty("CLOCAL_Options_JSON", CLOCAL_Options_JSON.toString());
				
			}
			
			if(CLOCAL_Prefix_Temp_Files != null){
				
					this.setProperty("CLOCAL_Prefix_Temp_Files", CLOCAL_Prefix_Temp_Files.toString());
				
			}
			
			if(CLOCAL_Reprise != null){
				
					this.setProperty("CLOCAL_Reprise", CLOCAL_Reprise.toString());
				
			}
			
			if(CLOCAL_Retours_JSON != null){
				
					this.setProperty("CLOCAL_Retours_JSON", CLOCAL_Retours_JSON.toString());
				
			}
			
			if(CLOCAL_Vadd_JSON != null){
				
					this.setProperty("CLOCAL_Vadd_JSON", CLOCAL_Vadd_JSON.toString());
				
			}
			
			if(C30_File_Json_Lignes_LV != null){
				
					this.setProperty("C30_File_Json_Lignes_LV", C30_File_Json_Lignes_LV.toString());
				
			}
			
			if(CLOCAL_NomBloc_JSON_EM != null){
				
					this.setProperty("CLOCAL_NomBloc_JSON_EM", CLOCAL_NomBloc_JSON_EM.toString());
				
			}
			
			if(CLOCAL_NomBloc_JSON_LV != null){
				
					this.setProperty("CLOCAL_NomBloc_JSON_LV", CLOCAL_NomBloc_JSON_LV.toString());
				
			}
			
			if(File_Json_RTAC03 != null){
				
					this.setProperty("File_Json_RTAC03", File_Json_RTAC03.toString());
				
			}
			
			if(keyFileName_EM != null){
				
					this.setProperty("keyFileName_EM", keyFileName_EM.toString());
				
			}
			
			if(keyFileName_LV != null){
				
					this.setProperty("keyFileName_LV", keyFileName_LV.toString());
				
			}
			
			if(keyFileName_LV_BatchHive != null){
				
					this.setProperty("keyFileName_LV_BatchHive", keyFileName_LV_BatchHive.toString());
				
			}
			
			if(qVenteFileName_EM != null){
				
					this.setProperty("qVenteFileName_EM", qVenteFileName_EM.toString());
				
			}
			
			if(PCM_ClassName != null){
				
					this.setProperty("PCM_ClassName", PCM_ClassName.toString());
				
			}
			
			if(PCM_DriverJar != null){
				
					this.setProperty("PCM_DriverJar", PCM_DriverJar.toString());
				
			}
			
			if(PCM_JdbcUrl != null){
				
					this.setProperty("PCM_JdbcUrl", PCM_JdbcUrl.toString());
				
			}
			
			if(PCM_Login != null){
				
					this.setProperty("PCM_Login", PCM_Login.toString());
				
			}
			
			if(PCM_MappingFile != null){
				
					this.setProperty("PCM_MappingFile", PCM_MappingFile.toString());
				
			}
			
			if(PCM_Password != null){
				
					this.setProperty("PCM_Password", PCM_Password.toString());
				
			}
			
			if(DB2_host != null){
				
					this.setProperty("DB2_host", DB2_host.toString());
				
			}
			
			if(DB2_instance != null){
				
					this.setProperty("DB2_instance", DB2_instance.toString());
				
			}
			
			if(DB2_login != null){
				
					this.setProperty("DB2_login", DB2_login.toString());
				
			}
			
			if(DB2_port != null){
				
					this.setProperty("DB2_port", DB2_port.toString());
				
			}
			
			if(DB2_pwd != null){
				
					this.setProperty("DB2_pwd", DB2_pwd.toString());
				
			}
			
			if(DB2_schema != null){
				
					this.setProperty("DB2_schema", DB2_schema.toString());
				
			}
			
			if(Local_Logs_Directory != null){
				
					this.setProperty("Local_Logs_Directory", Local_Logs_Directory.toString());
				
			}
			
			if(Local_Logs_FileName != null){
				
					this.setProperty("Local_Logs_FileName", Local_Logs_FileName.toString());
				
			}
			
			if(Local_Meters_FileName != null){
				
					this.setProperty("Local_Meters_FileName", Local_Meters_FileName.toString());
				
			}
			
			if(Local_Stats_FileName != null){
				
					this.setProperty("Local_Stats_FileName", Local_Stats_FileName.toString());
				
			}
			
			if(ficPropertiesName != null){
				
					this.setProperty("ficPropertiesName", ficPropertiesName.toString());
				
			}
			
			if(MARIADB_Connect_Host != null){
				
					this.setProperty("MARIADB_Connect_Host", MARIADB_Connect_Host.toString());
				
			}
			
			if(MARIADB_Connect_Port != null){
				
					this.setProperty("MARIADB_Connect_Port", MARIADB_Connect_Port.toString());
				
			}
			
			if(MARIADB_Connect_Database != null){
				
					this.setProperty("MARIADB_Connect_Database", MARIADB_Connect_Database.toString());
				
			}
			
			if(MARIADB_Connect_User_Name != null){
				
					this.setProperty("MARIADB_Connect_User_Name", MARIADB_Connect_User_Name.toString());
				
			}
			
			if(MARIADB_Connect_User_Password != null){
				
					this.setProperty("MARIADB_Connect_User_Password", MARIADB_Connect_User_Password.toString());
				
			}
			
		}

public String AMC_DARTY_db_AdditionalParams;
public String getAMC_DARTY_db_AdditionalParams(){
	return this.AMC_DARTY_db_AdditionalParams;
}
public String AMC_DARTY_db_Login;
public String getAMC_DARTY_db_Login(){
	return this.AMC_DARTY_db_Login;
}
public java.lang.String AMC_DARTY_db_Password;
public java.lang.String getAMC_DARTY_db_Password(){
	return this.AMC_DARTY_db_Password;
}
public String AMC_DARTY_db_Port;
public String getAMC_DARTY_db_Port(){
	return this.AMC_DARTY_db_Port;
}
public String AMC_DARTY_db_Schema;
public String getAMC_DARTY_db_Schema(){
	return this.AMC_DARTY_db_Schema;
}
public String AMC_DARTY_db_Server;
public String getAMC_DARTY_db_Server(){
	return this.AMC_DARTY_db_Server;
}
public String AMC_DARTY_db_Sid;
public String getAMC_DARTY_db_Sid(){
	return this.AMC_DARTY_db_Sid;
}
public String C01_ClusterDarty_HDFS_Group;
public String getC01_ClusterDarty_HDFS_Group(){
	return this.C01_ClusterDarty_HDFS_Group;
}
public String C01_ClusterDarty_HDFS_Temp_Folder;
public String getC01_ClusterDarty_HDFS_Temp_Folder(){
	return this.C01_ClusterDarty_HDFS_Temp_Folder;
}
public String C01_ClusterDarty_HDFS_User_Name;
public String getC01_ClusterDarty_HDFS_User_Name(){
	return this.C01_ClusterDarty_HDFS_User_Name;
}
public String C01_ClusterDarty_JobtrackerURI;
public String getC01_ClusterDarty_JobtrackerURI(){
	return this.C01_ClusterDarty_JobtrackerURI;
}
public String C01_ClusterDarty_NamenodeURI;
public String getC01_ClusterDarty_NamenodeURI(){
	return this.C01_ClusterDarty_NamenodeURI;
}
public String C01_ClusterDarty_Zookeeper_Host;
public String getC01_ClusterDarty_Zookeeper_Host(){
	return this.C01_ClusterDarty_Zookeeper_Host;
}
public String C01_ClusterDarty_Zookeeper_Port;
public String getC01_ClusterDarty_Zookeeper_Port(){
	return this.C01_ClusterDarty_Zookeeper_Port;
}
public String C10_Hive_connection_Hive_DbDwh_Name;
public String getC10_Hive_connection_Hive_DbDwh_Name(){
	return this.C10_Hive_connection_Hive_DbDwh_Name;
}
public String C10_Hive_connection_Hive_DbHisto_Name;
public String getC10_Hive_connection_Hive_DbHisto_Name(){
	return this.C10_Hive_connection_Hive_DbHisto_Name;
}
public String C10_Hive_connection_Hive_DbNominal_Name;
public String getC10_Hive_connection_Hive_DbNominal_Name(){
	return this.C10_Hive_connection_Hive_DbNominal_Name;
}
public String C10_Hive_connection_Hive_Host;
public String getC10_Hive_connection_Hive_Host(){
	return this.C10_Hive_connection_Hive_Host;
}
public String C10_Hive_connection_Hive_Password;
public String getC10_Hive_connection_Hive_Password(){
	return this.C10_Hive_connection_Hive_Password;
}
public String C10_Hive_connection_Hive_Port;
public String getC10_Hive_connection_Hive_Port(){
	return this.C10_Hive_connection_Hive_Port;
}
public String C10_Hive_connection_Hive_User_Name;
public String getC10_Hive_connection_Hive_User_Name(){
	return this.C10_Hive_connection_Hive_User_Name;
}
public String C100_Tables_RTAC01_HBase;
public String getC100_Tables_RTAC01_HBase(){
	return this.C100_Tables_RTAC01_HBase;
}
public String C100_Tables_RTAC01_MqFile;
public String getC100_Tables_RTAC01_MqFile(){
	return this.C100_Tables_RTAC01_MqFile;
}
public String C100_Tables_RTAC02_HBase;
public String getC100_Tables_RTAC02_HBase(){
	return this.C100_Tables_RTAC02_HBase;
}
public String C100_Tables_RTAC02_MqFile;
public String getC100_Tables_RTAC02_MqFile(){
	return this.C100_Tables_RTAC02_MqFile;
}
public String C100_Tables_RTEM51_HBase;
public String getC100_Tables_RTEM51_HBase(){
	return this.C100_Tables_RTEM51_HBase;
}
public String C100_Tables_RTEM51_MqFile;
public String getC100_Tables_RTEM51_MqFile(){
	return this.C100_Tables_RTEM51_MqFile;
}
public String C100_Tables_RTEM52_HBase;
public String getC100_Tables_RTEM52_HBase(){
	return this.C100_Tables_RTEM52_HBase;
}
public String C100_Tables_RTEM52_MqFile;
public String getC100_Tables_RTEM52_MqFile(){
	return this.C100_Tables_RTEM52_MqFile;
}
public String C100_Tables_RTEM53_HBase;
public String getC100_Tables_RTEM53_HBase(){
	return this.C100_Tables_RTEM53_HBase;
}
public String C100_Tables_RTEM53_MqFile;
public String getC100_Tables_RTEM53_MqFile(){
	return this.C100_Tables_RTEM53_MqFile;
}
public String C100_Tables_RTEM54_HBase;
public String getC100_Tables_RTEM54_HBase(){
	return this.C100_Tables_RTEM54_HBase;
}
public String C100_Tables_RTEM54_MqFile;
public String getC100_Tables_RTEM54_MqFile(){
	return this.C100_Tables_RTEM54_MqFile;
}
public String C100_Tables_RTEM55_HBase;
public String getC100_Tables_RTEM55_HBase(){
	return this.C100_Tables_RTEM55_HBase;
}
public String C100_Tables_RTEM55_MqFile;
public String getC100_Tables_RTEM55_MqFile(){
	return this.C100_Tables_RTEM55_MqFile;
}
public String C100_Tables_RTPC01_HBase;
public String getC100_Tables_RTPC01_HBase(){
	return this.C100_Tables_RTPC01_HBase;
}
public String C100_Tables_RTPC01_MqFile;
public String getC100_Tables_RTPC01_MqFile(){
	return this.C100_Tables_RTPC01_MqFile;
}
public String C100_Tables_RTPC02_HBase;
public String getC100_Tables_RTPC02_HBase(){
	return this.C100_Tables_RTPC02_HBase;
}
public String C100_Tables_RTPC02_MqFile;
public String getC100_Tables_RTPC02_MqFile(){
	return this.C100_Tables_RTPC02_MqFile;
}
public String C130_ElasticSearch_Apport_Retrait;
public String getC130_ElasticSearch_Apport_Retrait(){
	return this.C130_ElasticSearch_Apport_Retrait;
}
public String C130_ElasticSearch_Authorization;
public String getC130_ElasticSearch_Authorization(){
	return this.C130_ElasticSearch_Authorization;
}
public String C130_ElasticSearch_AuthValue;
public String getC130_ElasticSearch_AuthValue(){
	return this.C130_ElasticSearch_AuthValue;
}
public String C130_ElasticSearch_Cadeaux;
public String getC130_ElasticSearch_Cadeaux(){
	return this.C130_ElasticSearch_Cadeaux;
}
public String C130_ElasticSearch_Decompte;
public String getC130_ElasticSearch_Decompte(){
	return this.C130_ElasticSearch_Decompte;
}
public String C130_ElasticSearch_Encaissements;
public String getC130_ElasticSearch_Encaissements(){
	return this.C130_ElasticSearch_Encaissements;
}
public String C130_ElasticSearch_HostRunTime;
public String getC130_ElasticSearch_HostRunTime(){
	return this.C130_ElasticSearch_HostRunTime;
}
public String C130_ElasticSearch_PortRunTime;
public String getC130_ElasticSearch_PortRunTime(){
	return this.C130_ElasticSearch_PortRunTime;
}
public String C130_ElasticSearch_PwdRunTime;
public String getC130_ElasticSearch_PwdRunTime(){
	return this.C130_ElasticSearch_PwdRunTime;
}
public String C130_ElasticSearch_serv;
public String getC130_ElasticSearch_serv(){
	return this.C130_ElasticSearch_serv;
}
public String C130_ElasticSearch_URL;
public String getC130_ElasticSearch_URL(){
	return this.C130_ElasticSearch_URL;
}
public String C130_ElasticSearch_UserRunTime;
public String getC130_ElasticSearch_UserRunTime(){
	return this.C130_ElasticSearch_UserRunTime;
}
public String C130_ElasticSearch_Vente;
public String getC130_ElasticSearch_Vente(){
	return this.C130_ElasticSearch_Vente;
}
public String C130_ElasticSearch_WYNN_Entree_Mag;
public String getC130_ElasticSearch_WYNN_Entree_Mag(){
	return this.C130_ElasticSearch_WYNN_Entree_Mag;
}
public String C130_ElasticSearch_WYNN_Lignes_vente;
public String getC130_ElasticSearch_WYNN_Lignes_vente(){
	return this.C130_ElasticSearch_WYNN_Lignes_vente;
}
public String new1;
public String getNew1(){
	return this.new1;
}
public String C30_Directory_HDFS_Archive;
public String getC30_Directory_HDFS_Archive(){
	return this.C30_Directory_HDFS_Archive;
}
public String C30_Directory_HDFS_Conf;
public String getC30_Directory_HDFS_Conf(){
	return this.C30_Directory_HDFS_Conf;
}
public String C30_Directory_HDFS_Dezip;
public String getC30_Directory_HDFS_Dezip(){
	return this.C30_Directory_HDFS_Dezip;
}
public String C30_Directory_HDFS_Dwh;
public String getC30_Directory_HDFS_Dwh(){
	return this.C30_Directory_HDFS_Dwh;
}
public String C30_Directory_HDFS_Input;
public String getC30_Directory_HDFS_Input(){
	return this.C30_Directory_HDFS_Input;
}
public String C30_Directory_HDFS_Json;
public String getC30_Directory_HDFS_Json(){
	return this.C30_Directory_HDFS_Json;
}
public String C30_Directory_HDFS_Mq;
public String getC30_Directory_HDFS_Mq(){
	return this.C30_Directory_HDFS_Mq;
}
public String C30_Directory_HDFS_MQ_Error;
public String getC30_Directory_HDFS_MQ_Error(){
	return this.C30_Directory_HDFS_MQ_Error;
}
public String C30_Directory_HDFS_NCG;
public String getC30_Directory_HDFS_NCG(){
	return this.C30_Directory_HDFS_NCG;
}
public String C30_Directory_HDFS_PCM;
public String getC30_Directory_HDFS_PCM(){
	return this.C30_Directory_HDFS_PCM;
}
public String C30_Directory_HDFS_Pig;
public String getC30_Directory_HDFS_Pig(){
	return this.C30_Directory_HDFS_Pig;
}
public String C30_Directory_HDFS_Racine;
public String getC30_Directory_HDFS_Racine(){
	return this.C30_Directory_HDFS_Racine;
}
public String C30_Directory_HDFS_REF;
public String getC30_Directory_HDFS_REF(){
	return this.C30_Directory_HDFS_REF;
}
public String C30_Directory_HDFS_Rejets;
public String getC30_Directory_HDFS_Rejets(){
	return this.C30_Directory_HDFS_Rejets;
}
public String C30_Directory_HDFS_Reprise;
public String getC30_Directory_HDFS_Reprise(){
	return this.C30_Directory_HDFS_Reprise;
}
public String C30_Directory_HDFS_Tmp;
public String getC30_Directory_HDFS_Tmp(){
	return this.C30_Directory_HDFS_Tmp;
}
public String C30_Directory_HDFS_Transac;
public String getC30_Directory_HDFS_Transac(){
	return this.C30_Directory_HDFS_Transac;
}
public String C30_Directory_HDFS_Work;
public String getC30_Directory_HDFS_Work(){
	return this.C30_Directory_HDFS_Work;
}
public String C30_Directory_HIVE_Racine;
public String getC30_Directory_HIVE_Racine(){
	return this.C30_Directory_HIVE_Racine;
}
public String C30_Directory_INPUT_DWH;
public String getC30_Directory_INPUT_DWH(){
	return this.C30_Directory_INPUT_DWH;
}
public String C30_Directory_INPUT_FUNC_LOG;
public String getC30_Directory_INPUT_FUNC_LOG(){
	return this.C30_Directory_INPUT_FUNC_LOG;
}
public String C30_Directory_INPUT_NCG;
public String getC30_Directory_INPUT_NCG(){
	return this.C30_Directory_INPUT_NCG;
}
public String C30_Directory_INPUT_QLIK;
public String getC30_Directory_INPUT_QLIK(){
	return this.C30_Directory_INPUT_QLIK;
}
public String C30_Directory_INPUT_TMP;
public String getC30_Directory_INPUT_TMP(){
	return this.C30_Directory_INPUT_TMP;
}
public String C30_Directory_INPUT_Transac_NCG;
public String getC30_Directory_INPUT_Transac_NCG(){
	return this.C30_Directory_INPUT_Transac_NCG;
}
public String C40_FileName_EndOfFile_Histo;
public String getC40_FileName_EndOfFile_Histo(){
	return this.C40_FileName_EndOfFile_Histo;
}
public String C40_FileName_EndOfFile_Histo_Nominal_Queue;
public String getC40_FileName_EndOfFile_Histo_Nominal_Queue(){
	return this.C40_FileName_EndOfFile_Histo_Nominal_Queue;
}
public String C40_FilesName_ARCHIVE_HDFS_SUFFIX;
public String getC40_FilesName_ARCHIVE_HDFS_SUFFIX(){
	return this.C40_FilesName_ARCHIVE_HDFS_SUFFIX;
}
public String C40_FilesName_HISTO_Delimiter_Denormalize;
public String getC40_FilesName_HISTO_Delimiter_Denormalize(){
	return this.C40_FilesName_HISTO_Delimiter_Denormalize;
}
public String C40_FilesName_HISTO_Extension_src;
public String getC40_FilesName_HISTO_Extension_src(){
	return this.C40_FilesName_HISTO_Extension_src;
}
public String C40_FilesName_HISTO_Extension_tmp;
public String getC40_FilesName_HISTO_Extension_tmp(){
	return this.C40_FilesName_HISTO_Extension_tmp;
}
public String C40_FilesName_HISTO_Mask_Src;
public String getC40_FilesName_HISTO_Mask_Src(){
	return this.C40_FilesName_HISTO_Mask_Src;
}
public String C40_FilesName_HISTO_Mask_tmp;
public String getC40_FilesName_HISTO_Mask_tmp(){
	return this.C40_FilesName_HISTO_Mask_tmp;
}
public String C40_FilesName_RepriseHistoProperties;
public String getC40_FilesName_RepriseHistoProperties(){
	return this.C40_FilesName_RepriseHistoProperties;
}
public String C50_DB2_flowTable;
public String getC50_DB2_flowTable(){
	return this.C50_DB2_flowTable;
}
public String C50_DB2_hostname;
public String getC50_DB2_hostname(){
	return this.C50_DB2_hostname;
}
public String C50_DB2_instance;
public String getC50_DB2_instance(){
	return this.C50_DB2_instance;
}
public String C50_DB2_logTable;
public String getC50_DB2_logTable(){
	return this.C50_DB2_logTable;
}
public String C50_DB2_port;
public String getC50_DB2_port(){
	return this.C50_DB2_port;
}
public String C50_DB2_pwd;
public String getC50_DB2_pwd(){
	return this.C50_DB2_pwd;
}
public String C50_DB2_schema;
public String getC50_DB2_schema(){
	return this.C50_DB2_schema;
}
public String C50_DB2_statTable;
public String getC50_DB2_statTable(){
	return this.C50_DB2_statTable;
}
public String C50_DB2_user;
public String getC50_DB2_user(){
	return this.C50_DB2_user;
}
public String C60_FilesName_DWH_H_Articles;
public String getC60_FilesName_DWH_H_Articles(){
	return this.C60_FilesName_DWH_H_Articles;
}
public String C60_FilesName_DWH_H_Orga;
public String getC60_FilesName_DWH_H_Orga(){
	return this.C60_FilesName_DWH_H_Orga;
}
public String C60_FilesName_DWH_H_Prestas;
public String getC60_FilesName_DWH_H_Prestas(){
	return this.C60_FilesName_DWH_H_Prestas;
}
public String C60_FilesName_DWH_RTGA01;
public String getC60_FilesName_DWH_RTGA01(){
	return this.C60_FilesName_DWH_RTGA01;
}
public String C60_FilesName_DWH_RTGA75;
public String getC60_FilesName_DWH_RTGA75(){
	return this.C60_FilesName_DWH_RTGA75;
}
public String C60_FilesName_DWH_RTGG40;
public String getC60_FilesName_DWH_RTGG40(){
	return this.C60_FilesName_DWH_RTGG40;
}
public String C60_FilesName_DWH_RTGV31;
public String getC60_FilesName_DWH_RTGV31(){
	return this.C60_FilesName_DWH_RTGV31;
}
public String C60_FilesName_DWR_TORG;
public String getC60_FilesName_DWR_TORG(){
	return this.C60_FilesName_DWR_TORG;
}
public String C60_FilesName_DWR_TPRESTA;
public String getC60_FilesName_DWR_TPRESTA(){
	return this.C60_FilesName_DWR_TPRESTA;
}
public String C60_FilesName_DWR_TPRODUIT;
public String getC60_FilesName_DWR_TPRODUIT(){
	return this.C60_FilesName_DWR_TPRODUIT;
}
public String C60_FilesName_HISTO_RTGV02;
public String getC60_FilesName_HISTO_RTGV02(){
	return this.C60_FilesName_HISTO_RTGV02;
}
public String C60_FilesName_HISTO_RTGV10;
public String getC60_FilesName_HISTO_RTGV10(){
	return this.C60_FilesName_HISTO_RTGV10;
}
public String C60_FilesName_HISTO_RTGV14;
public String getC60_FilesName_HISTO_RTGV14(){
	return this.C60_FilesName_HISTO_RTGV14;
}
public String C60_FilesName_HISTO_RTVT01;
public String getC60_FilesName_HISTO_RTVT01(){
	return this.C60_FilesName_HISTO_RTVT01;
}
public String C60_FilesName_HISTO_RTVT02;
public String getC60_FilesName_HISTO_RTVT02(){
	return this.C60_FilesName_HISTO_RTVT02;
}
public String C60_FilesName_HISTO_RTVT03;
public String getC60_FilesName_HISTO_RTVT03(){
	return this.C60_FilesName_HISTO_RTVT03;
}
public String C60_FilesName_HISTO_RTVT08;
public String getC60_FilesName_HISTO_RTVT08(){
	return this.C60_FilesName_HISTO_RTVT08;
}
public String C60_FilesName_HISTO_RTVT11;
public String getC60_FilesName_HISTO_RTVT11(){
	return this.C60_FilesName_HISTO_RTVT11;
}
public String C60_FilesName_HISTO_RTVT12;
public String getC60_FilesName_HISTO_RTVT12(){
	return this.C60_FilesName_HISTO_RTVT12;
}
public String C60_FilesName_HISTO_RTVT13;
public String getC60_FilesName_HISTO_RTVT13(){
	return this.C60_FilesName_HISTO_RTVT13;
}
public String C60_FilesName_HISTO_RTVT14;
public String getC60_FilesName_HISTO_RTVT14(){
	return this.C60_FilesName_HISTO_RTVT14;
}
public String C60_FilesName_HISTO_RTVT15;
public String getC60_FilesName_HISTO_RTVT15(){
	return this.C60_FilesName_HISTO_RTVT15;
}
public String C60_FilesName_HISTO_RTVT16;
public String getC60_FilesName_HISTO_RTVT16(){
	return this.C60_FilesName_HISTO_RTVT16;
}
public String C60_FilesName_HISTO_RTVT17;
public String getC60_FilesName_HISTO_RTVT17(){
	return this.C60_FilesName_HISTO_RTVT17;
}
public String C80_MQDarty_NCG_CONNECTION_Canal;
public String getC80_MQDarty_NCG_CONNECTION_Canal(){
	return this.C80_MQDarty_NCG_CONNECTION_Canal;
}
public Integer C80_MQDarty_NCG_CONNECTION_Port;
public Integer getC80_MQDarty_NCG_CONNECTION_Port(){
	return this.C80_MQDarty_NCG_CONNECTION_Port;
}
public String C80_MQDarty_NCG_CONNECTION_Pwd;
public String getC80_MQDarty_NCG_CONNECTION_Pwd(){
	return this.C80_MQDarty_NCG_CONNECTION_Pwd;
}
public String C80_MQDarty_NCG_CONNECTION_QueueManager;
public String getC80_MQDarty_NCG_CONNECTION_QueueManager(){
	return this.C80_MQDarty_NCG_CONNECTION_QueueManager;
}
public String C80_MQDarty_NCG_CONNECTION_Server;
public String getC80_MQDarty_NCG_CONNECTION_Server(){
	return this.C80_MQDarty_NCG_CONNECTION_Server;
}
public String C80_MQDarty_NCG_CONNECTION_User;
public String getC80_MQDarty_NCG_CONNECTION_User(){
	return this.C80_MQDarty_NCG_CONNECTION_User;
}
public String C80_MQDarty_NCG_Error_Canal;
public String getC80_MQDarty_NCG_Error_Canal(){
	return this.C80_MQDarty_NCG_Error_Canal;
}
public String C80_MQDarty_NCG_Error_Port;
public String getC80_MQDarty_NCG_Error_Port(){
	return this.C80_MQDarty_NCG_Error_Port;
}
public String C80_MQDarty_NCG_Error_Pwd;
public String getC80_MQDarty_NCG_Error_Pwd(){
	return this.C80_MQDarty_NCG_Error_Pwd;
}
public String C80_MQDarty_NCG_Error_QueueManager;
public String getC80_MQDarty_NCG_Error_QueueManager(){
	return this.C80_MQDarty_NCG_Error_QueueManager;
}
public String C80_MQDarty_NCG_Error_QueueName;
public String getC80_MQDarty_NCG_Error_QueueName(){
	return this.C80_MQDarty_NCG_Error_QueueName;
}
public String C80_MQDarty_NCG_Error_Server;
public String getC80_MQDarty_NCG_Error_Server(){
	return this.C80_MQDarty_NCG_Error_Server;
}
public String C80_MQDarty_NCG_Error_User;
public String getC80_MQDarty_NCG_Error_User(){
	return this.C80_MQDarty_NCG_Error_User;
}
public String C80_MQDarty_NCG_RTAC03_FilesName_RTAC03;
public String getC80_MQDarty_NCG_RTAC03_FilesName_RTAC03(){
	return this.C80_MQDarty_NCG_RTAC03_FilesName_RTAC03;
}
public String C80_MQDarty_NCG_RTAC03_GRP_QueueName;
public String getC80_MQDarty_NCG_RTAC03_GRP_QueueName(){
	return this.C80_MQDarty_NCG_RTAC03_GRP_QueueName;
}
public String C80_MQDarty_NCG_RTAC03_HBase;
public String getC80_MQDarty_NCG_RTAC03_HBase(){
	return this.C80_MQDarty_NCG_RTAC03_HBase;
}
public String C80_MQDarty_NCG_RTAC03_Modele;
public String getC80_MQDarty_NCG_RTAC03_Modele(){
	return this.C80_MQDarty_NCG_RTAC03_Modele;
}
public Integer C80_MQDarty_NCG_RTAC03_NbMessage;
public Integer getC80_MQDarty_NCG_RTAC03_NbMessage(){
	return this.C80_MQDarty_NCG_RTAC03_NbMessage;
}
public Integer C80_MQDarty_NCG_RTAC03_TimeOut;
public Integer getC80_MQDarty_NCG_RTAC03_TimeOut(){
	return this.C80_MQDarty_NCG_RTAC03_TimeOut;
}
public String C80_MQDarty_NCG_RTAC03_TraitementName;
public String getC80_MQDarty_NCG_RTAC03_TraitementName(){
	return this.C80_MQDarty_NCG_RTAC03_TraitementName;
}
public String C80_MQDarty_NCG_RTGV02_FilesName_RTGV02;
public String getC80_MQDarty_NCG_RTGV02_FilesName_RTGV02(){
	return this.C80_MQDarty_NCG_RTGV02_FilesName_RTGV02;
}
public String C80_MQDarty_NCG_RTGV02_HBase;
public String getC80_MQDarty_NCG_RTGV02_HBase(){
	return this.C80_MQDarty_NCG_RTGV02_HBase;
}
public String C80_MQDarty_NCG_RTGV02_Modele;
public String getC80_MQDarty_NCG_RTGV02_Modele(){
	return this.C80_MQDarty_NCG_RTGV02_Modele;
}
public Integer C80_MQDarty_NCG_RTGV02_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV02_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV02_NbMessage;
}
public String C80_MQDarty_NCG_RTGV02_QueueName;
public String getC80_MQDarty_NCG_RTGV02_QueueName(){
	return this.C80_MQDarty_NCG_RTGV02_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV02_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV02_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV02_TimeOut;
}
public String C80_MQDarty_NCG_RTGV02_TraitementName;
public String getC80_MQDarty_NCG_RTGV02_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV02_TraitementName;
}
public String C80_MQDarty_NCG_RTGV03_FilesName_RTGV03;
public String getC80_MQDarty_NCG_RTGV03_FilesName_RTGV03(){
	return this.C80_MQDarty_NCG_RTGV03_FilesName_RTGV03;
}
public String C80_MQDarty_NCG_RTGV03_HBase;
public String getC80_MQDarty_NCG_RTGV03_HBase(){
	return this.C80_MQDarty_NCG_RTGV03_HBase;
}
public String C80_MQDarty_NCG_RTGV03_Modele;
public String getC80_MQDarty_NCG_RTGV03_Modele(){
	return this.C80_MQDarty_NCG_RTGV03_Modele;
}
public Integer C80_MQDarty_NCG_RTGV03_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV03_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV03_NbMessage;
}
public String C80_MQDarty_NCG_RTGV03_QueueName;
public String getC80_MQDarty_NCG_RTGV03_QueueName(){
	return this.C80_MQDarty_NCG_RTGV03_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV03_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV03_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV03_TimeOut;
}
public String C80_MQDarty_NCG_RTGV03_TraitementName;
public String getC80_MQDarty_NCG_RTGV03_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV03_TraitementName;
}
public String C80_MQDarty_NCG_RTGV04_FilesName_RTGV04;
public String getC80_MQDarty_NCG_RTGV04_FilesName_RTGV04(){
	return this.C80_MQDarty_NCG_RTGV04_FilesName_RTGV04;
}
public String C80_MQDarty_NCG_RTGV04_HBase;
public String getC80_MQDarty_NCG_RTGV04_HBase(){
	return this.C80_MQDarty_NCG_RTGV04_HBase;
}
public String C80_MQDarty_NCG_RTGV04_Modele;
public String getC80_MQDarty_NCG_RTGV04_Modele(){
	return this.C80_MQDarty_NCG_RTGV04_Modele;
}
public Integer C80_MQDarty_NCG_RTGV04_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV04_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV04_NbMessage;
}
public String C80_MQDarty_NCG_RTGV04_QueueName;
public String getC80_MQDarty_NCG_RTGV04_QueueName(){
	return this.C80_MQDarty_NCG_RTGV04_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV04_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV04_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV04_TimeOut;
}
public String C80_MQDarty_NCG_RTGV04_TraitementName;
public String getC80_MQDarty_NCG_RTGV04_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV04_TraitementName;
}
public String C80_MQDarty_NCG_RTGV10_FilesName_RTGV10;
public String getC80_MQDarty_NCG_RTGV10_FilesName_RTGV10(){
	return this.C80_MQDarty_NCG_RTGV10_FilesName_RTGV10;
}
public String C80_MQDarty_NCG_RTGV10_HBase;
public String getC80_MQDarty_NCG_RTGV10_HBase(){
	return this.C80_MQDarty_NCG_RTGV10_HBase;
}
public String C80_MQDarty_NCG_RTGV10_Modele;
public String getC80_MQDarty_NCG_RTGV10_Modele(){
	return this.C80_MQDarty_NCG_RTGV10_Modele;
}
public Integer C80_MQDarty_NCG_RTGV10_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV10_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV10_NbMessage;
}
public String C80_MQDarty_NCG_RTGV10_QueueName;
public String getC80_MQDarty_NCG_RTGV10_QueueName(){
	return this.C80_MQDarty_NCG_RTGV10_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV10_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV10_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV10_TimeOut;
}
public String C80_MQDarty_NCG_RTGV10_TraitementName;
public String getC80_MQDarty_NCG_RTGV10_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV10_TraitementName;
}
public String C80_MQDarty_NCG_RTGV11_FilesName_RTGV11;
public String getC80_MQDarty_NCG_RTGV11_FilesName_RTGV11(){
	return this.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11;
}
public String C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive;
public String getC80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive(){
	return this.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive;
}
public String C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes;
public String getC80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes(){
	return this.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes;
}
public String C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive;
public String getC80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive(){
	return this.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive;
}
public String C80_MQDarty_NCG_RTGV11_HBase;
public String getC80_MQDarty_NCG_RTGV11_HBase(){
	return this.C80_MQDarty_NCG_RTGV11_HBase;
}
public String C80_MQDarty_NCG_RTGV11_Modele;
public String getC80_MQDarty_NCG_RTGV11_Modele(){
	return this.C80_MQDarty_NCG_RTGV11_Modele;
}
public Integer C80_MQDarty_NCG_RTGV11_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV11_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV11_NbMessage;
}
public Integer C80_MQDarty_NCG_RTGV11_NbProcessingFile;
public Integer getC80_MQDarty_NCG_RTGV11_NbProcessingFile(){
	return this.C80_MQDarty_NCG_RTGV11_NbProcessingFile;
}
public String C80_MQDarty_NCG_RTGV11_QueueName;
public String getC80_MQDarty_NCG_RTGV11_QueueName(){
	return this.C80_MQDarty_NCG_RTGV11_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV11_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV11_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV11_TimeOut;
}
public String C80_MQDarty_NCG_RTGV11_TraitementName;
public String getC80_MQDarty_NCG_RTGV11_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV11_TraitementName;
}
public String C80_MQDarty_NCG_RTGV14_FilesName_RTGV14;
public String getC80_MQDarty_NCG_RTGV14_FilesName_RTGV14(){
	return this.C80_MQDarty_NCG_RTGV14_FilesName_RTGV14;
}
public String C80_MQDarty_NCG_RTGV14_HBase;
public String getC80_MQDarty_NCG_RTGV14_HBase(){
	return this.C80_MQDarty_NCG_RTGV14_HBase;
}
public String C80_MQDarty_NCG_RTGV14_Modele;
public String getC80_MQDarty_NCG_RTGV14_Modele(){
	return this.C80_MQDarty_NCG_RTGV14_Modele;
}
public Integer C80_MQDarty_NCG_RTGV14_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV14_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV14_NbMessage;
}
public String C80_MQDarty_NCG_RTGV14_QueueName;
public String getC80_MQDarty_NCG_RTGV14_QueueName(){
	return this.C80_MQDarty_NCG_RTGV14_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV14_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV14_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV14_TimeOut;
}
public String C80_MQDarty_NCG_RTGV14_TraitementName;
public String getC80_MQDarty_NCG_RTGV14_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV14_TraitementName;
}
public String C80_MQDarty_NCG_RTGV15_FilesName_RTGV15;
public String getC80_MQDarty_NCG_RTGV15_FilesName_RTGV15(){
	return this.C80_MQDarty_NCG_RTGV15_FilesName_RTGV15;
}
public String C80_MQDarty_NCG_RTGV15_HBase;
public String getC80_MQDarty_NCG_RTGV15_HBase(){
	return this.C80_MQDarty_NCG_RTGV15_HBase;
}
public String C80_MQDarty_NCG_RTGV15_Modele;
public String getC80_MQDarty_NCG_RTGV15_Modele(){
	return this.C80_MQDarty_NCG_RTGV15_Modele;
}
public Integer C80_MQDarty_NCG_RTGV15_NbMessage;
public Integer getC80_MQDarty_NCG_RTGV15_NbMessage(){
	return this.C80_MQDarty_NCG_RTGV15_NbMessage;
}
public String C80_MQDarty_NCG_RTGV15_QueueName;
public String getC80_MQDarty_NCG_RTGV15_QueueName(){
	return this.C80_MQDarty_NCG_RTGV15_QueueName;
}
public Integer C80_MQDarty_NCG_RTGV15_TimeOut;
public Integer getC80_MQDarty_NCG_RTGV15_TimeOut(){
	return this.C80_MQDarty_NCG_RTGV15_TimeOut;
}
public String C80_MQDarty_NCG_RTGV15_TraitementName;
public String getC80_MQDarty_NCG_RTGV15_TraitementName(){
	return this.C80_MQDarty_NCG_RTGV15_TraitementName;
}
public String C80_MQDarty_NCG_RTTL04_FilesName_RTTL04;
public String getC80_MQDarty_NCG_RTTL04_FilesName_RTTL04(){
	return this.C80_MQDarty_NCG_RTTL04_FilesName_RTTL04;
}
public String C80_MQDarty_NCG_RTTL04_HBase;
public String getC80_MQDarty_NCG_RTTL04_HBase(){
	return this.C80_MQDarty_NCG_RTTL04_HBase;
}
public String C80_MQDarty_NCG_RTTL04_Modele;
public String getC80_MQDarty_NCG_RTTL04_Modele(){
	return this.C80_MQDarty_NCG_RTTL04_Modele;
}
public Integer C80_MQDarty_NCG_RTTL04_NbMessage;
public Integer getC80_MQDarty_NCG_RTTL04_NbMessage(){
	return this.C80_MQDarty_NCG_RTTL04_NbMessage;
}
public String C80_MQDarty_NCG_RTTL04_QueueName;
public String getC80_MQDarty_NCG_RTTL04_QueueName(){
	return this.C80_MQDarty_NCG_RTTL04_QueueName;
}
public Integer C80_MQDarty_NCG_RTTL04_TimeOut;
public Integer getC80_MQDarty_NCG_RTTL04_TimeOut(){
	return this.C80_MQDarty_NCG_RTTL04_TimeOut;
}
public String C80_MQDarty_NCG_RTTL04_TraitementName;
public String getC80_MQDarty_NCG_RTTL04_TraitementName(){
	return this.C80_MQDarty_NCG_RTTL04_TraitementName;
}
public String CtxPathFile;
public String getCtxPathFile(){
	return this.CtxPathFile;
}
public String DartyEncoding;
public String getDartyEncoding(){
	return this.DartyEncoding;
}
public String Dir_conf;
public String getDir_conf(){
	return this.Dir_conf;
}
public String FilePath_StopNgo_Json;
public String getFilePath_StopNgo_Json(){
	return this.FilePath_StopNgo_Json;
}
public String FilePath_StopNgo_Nominal;
public String getFilePath_StopNgo_Nominal(){
	return this.FilePath_StopNgo_Nominal;
}
public String ProfondeurHisto;
public String getProfondeurHisto(){
	return this.ProfondeurHisto;
}
public String ShardingGV11;
public String getShardingGV11(){
	return this.ShardingGV11;
}
public String TimerCheckLoop;
public String getTimerCheckLoop(){
	return this.TimerCheckLoop;
}
public String TimerLoopStopNGo;
public String getTimerLoopStopNGo(){
	return this.TimerLoopStopNGo;
}
public String CLOCAL_Cartes_Cadeaux_JSON;
public String getCLOCAL_Cartes_Cadeaux_JSON(){
	return this.CLOCAL_Cartes_Cadeaux_JSON;
}
public String FilesName_Json_Cartes_Cadeaux;
public String getFilesName_Json_Cartes_Cadeaux(){
	return this.FilesName_Json_Cartes_Cadeaux;
}
public String C30_File_Json_Apport_Retrait;
public String getC30_File_Json_Apport_Retrait(){
	return this.C30_File_Json_Apport_Retrait;
}
public String C30_FilesName_Json_Decompte;
public String getC30_FilesName_Json_Decompte(){
	return this.C30_FilesName_Json_Decompte;
}
public String CLOCAL_apport_retrait_JSON;
public String getCLOCAL_apport_retrait_JSON(){
	return this.CLOCAL_apport_retrait_JSON;
}
public String CLOCAL_decompte_JSON;
public String getCLOCAL_decompte_JSON(){
	return this.CLOCAL_decompte_JSON;
}
public String CLOCAL_entete_encaissement_JSON;
public String getCLOCAL_entete_encaissement_JSON(){
	return this.CLOCAL_entete_encaissement_JSON;
}
public String CLOCAL_lignes_encaissement_JSON;
public String getCLOCAL_lignes_encaissement_JSON(){
	return this.CLOCAL_lignes_encaissement_JSON;
}
public String CLOCAL_MQ_Ref_Filename_AR;
public String getCLOCAL_MQ_Ref_Filename_AR(){
	return this.CLOCAL_MQ_Ref_Filename_AR;
}
public String CLOCAL_MQ_Ref_Filename_DE;
public String getCLOCAL_MQ_Ref_Filename_DE(){
	return this.CLOCAL_MQ_Ref_Filename_DE;
}
public String CLOCAL_OutputJsonFileName_AR;
public String getCLOCAL_OutputJsonFileName_AR(){
	return this.CLOCAL_OutputJsonFileName_AR;
}
public String CLOCAL_OutputJsonFileName_DE;
public String getCLOCAL_OutputJsonFileName_DE(){
	return this.CLOCAL_OutputJsonFileName_DE;
}
public String CLOCAL_Prefix_Temp_Files_AR;
public String getCLOCAL_Prefix_Temp_Files_AR(){
	return this.CLOCAL_Prefix_Temp_Files_AR;
}
public String CLOCAL_Prefix_Temp_Files_DE;
public String getCLOCAL_Prefix_Temp_Files_DE(){
	return this.CLOCAL_Prefix_Temp_Files_DE;
}
public String CLOCAL_reglements_JSON;
public String getCLOCAL_reglements_JSON(){
	return this.CLOCAL_reglements_JSON;
}
public String FilesName_Json_Encaissements;
public String getFilesName_Json_Encaissements(){
	return this.FilesName_Json_Encaissements;
}
public String C30_FilesName_Json_Ventes;
public String getC30_FilesName_Json_Ventes(){
	return this.C30_FilesName_Json_Ventes;
}
public String CLOCAL_Adresse_JSON;
public String getCLOCAL_Adresse_JSON(){
	return this.CLOCAL_Adresse_JSON;
}
public String CLOCAL_Email_JSON;
public String getCLOCAL_Email_JSON(){
	return this.CLOCAL_Email_JSON;
}
public String CLOCAL_Encaissement_JSON;
public String getCLOCAL_Encaissement_JSON(){
	return this.CLOCAL_Encaissement_JSON;
}
public String CLOCAL_Entete_vente_JSON;
public String getCLOCAL_Entete_vente_JSON(){
	return this.CLOCAL_Entete_vente_JSON;
}
public String CLOCAL_Lignes_vente_JSON;
public String getCLOCAL_Lignes_vente_JSON(){
	return this.CLOCAL_Lignes_vente_JSON;
}
public String CLOCAL_Masque;
public String getCLOCAL_Masque(){
	return this.CLOCAL_Masque;
}
public String CLOCAL_Options_JSON;
public String getCLOCAL_Options_JSON(){
	return this.CLOCAL_Options_JSON;
}
public String CLOCAL_Prefix_Temp_Files;
public String getCLOCAL_Prefix_Temp_Files(){
	return this.CLOCAL_Prefix_Temp_Files;
}
public String CLOCAL_Reprise;
public String getCLOCAL_Reprise(){
	return this.CLOCAL_Reprise;
}
public String CLOCAL_Retours_JSON;
public String getCLOCAL_Retours_JSON(){
	return this.CLOCAL_Retours_JSON;
}
public String CLOCAL_Vadd_JSON;
public String getCLOCAL_Vadd_JSON(){
	return this.CLOCAL_Vadd_JSON;
}
public String C30_File_Json_Lignes_LV;
public String getC30_File_Json_Lignes_LV(){
	return this.C30_File_Json_Lignes_LV;
}
public String CLOCAL_NomBloc_JSON_EM;
public String getCLOCAL_NomBloc_JSON_EM(){
	return this.CLOCAL_NomBloc_JSON_EM;
}
public String CLOCAL_NomBloc_JSON_LV;
public String getCLOCAL_NomBloc_JSON_LV(){
	return this.CLOCAL_NomBloc_JSON_LV;
}
public String File_Json_RTAC03;
public String getFile_Json_RTAC03(){
	return this.File_Json_RTAC03;
}
public String keyFileName_EM;
public String getKeyFileName_EM(){
	return this.keyFileName_EM;
}
public String keyFileName_LV;
public String getKeyFileName_LV(){
	return this.keyFileName_LV;
}
public String keyFileName_LV_BatchHive;
public String getKeyFileName_LV_BatchHive(){
	return this.keyFileName_LV_BatchHive;
}
public String qVenteFileName_EM;
public String getQVenteFileName_EM(){
	return this.qVenteFileName_EM;
}
public String PCM_ClassName;
public String getPCM_ClassName(){
	return this.PCM_ClassName;
}
public String PCM_DriverJar;
public String getPCM_DriverJar(){
	return this.PCM_DriverJar;
}
public String PCM_JdbcUrl;
public String getPCM_JdbcUrl(){
	return this.PCM_JdbcUrl;
}
public String PCM_Login;
public String getPCM_Login(){
	return this.PCM_Login;
}
public String PCM_MappingFile;
public String getPCM_MappingFile(){
	return this.PCM_MappingFile;
}
public java.lang.String PCM_Password;
public java.lang.String getPCM_Password(){
	return this.PCM_Password;
}
public String DB2_host;
public String getDB2_host(){
	return this.DB2_host;
}
public String DB2_instance;
public String getDB2_instance(){
	return this.DB2_instance;
}
public String DB2_login;
public String getDB2_login(){
	return this.DB2_login;
}
public String DB2_port;
public String getDB2_port(){
	return this.DB2_port;
}
public String DB2_pwd;
public String getDB2_pwd(){
	return this.DB2_pwd;
}
public String DB2_schema;
public String getDB2_schema(){
	return this.DB2_schema;
}
public String Local_Logs_Directory;
public String getLocal_Logs_Directory(){
	return this.Local_Logs_Directory;
}
public String Local_Logs_FileName;
public String getLocal_Logs_FileName(){
	return this.Local_Logs_FileName;
}
public String Local_Meters_FileName;
public String getLocal_Meters_FileName(){
	return this.Local_Meters_FileName;
}
public String Local_Stats_FileName;
public String getLocal_Stats_FileName(){
	return this.Local_Stats_FileName;
}
public String ficPropertiesName;
public String getFicPropertiesName(){
	return this.ficPropertiesName;
}
public String MARIADB_Connect_Host;
public String getMARIADB_Connect_Host(){
	return this.MARIADB_Connect_Host;
}
public String MARIADB_Connect_Port;
public String getMARIADB_Connect_Port(){
	return this.MARIADB_Connect_Port;
}
public String MARIADB_Connect_Database;
public String getMARIADB_Connect_Database(){
	return this.MARIADB_Connect_Database;
}
public String MARIADB_Connect_User_Name;
public String getMARIADB_Connect_User_Name(){
	return this.MARIADB_Connect_User_Name;
}
public String MARIADB_Connect_User_Password;
public String getMARIADB_Connect_User_Password(){
	return this.MARIADB_Connect_User_Password;
}
	}
	protected ContextProperties context = new ContextProperties(); // will be instanciated by MS.
	public ContextProperties getContext() {
		return this.context;
	}
	private final String jobVersion = "0.1";
	private final String jobName = "MAJ_BOBI_MARQUE_DARTY";
	private final String projectName = "BOBI";
	public Integer errorCode = null;
	private String currentComponent = "";
	
		private final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
        private final static java.util.Map<String, Object> junitGlobalMap = new java.util.HashMap<String, Object>();
	
		private final java.util.Map<String, Long> start_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Long> end_Hash = new java.util.HashMap<String, Long>();
		private final java.util.Map<String, Boolean> ok_Hash = new java.util.HashMap<String, Boolean>();
		public  final java.util.List<String[]> globalBuffer = new java.util.ArrayList<String[]>();
	

private RunStat runStat = new RunStat();

	// OSGi DataSource
	private final static String KEY_DB_DATASOURCES = "KEY_DB_DATASOURCES";
	
	private final static String KEY_DB_DATASOURCES_RAW = "KEY_DB_DATASOURCES_RAW";

	public void setDataSources(java.util.Map<String, javax.sql.DataSource> dataSources) {
		java.util.Map<String, routines.system.TalendDataSource> talendDataSources = new java.util.HashMap<String, routines.system.TalendDataSource>();
		for (java.util.Map.Entry<String, javax.sql.DataSource> dataSourceEntry : dataSources.entrySet()) {
			talendDataSources.put(dataSourceEntry.getKey(), new routines.system.TalendDataSource(dataSourceEntry.getValue()));
		}
		globalMap.put(KEY_DB_DATASOURCES, talendDataSources);
		globalMap.put(KEY_DB_DATASOURCES_RAW, new java.util.HashMap<String, javax.sql.DataSource>(dataSources));
	}

	JobStructureCatcherUtils talendJobLog = new JobStructureCatcherUtils(jobName, "_8nCnwP_eEeW7Z_neqJaoHw", "0.1");
	org.talend.job.audit.JobAuditLogger auditLogger_talendJobLog = null;

private final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
private final java.io.PrintStream errorMessagePS = new java.io.PrintStream(new java.io.BufferedOutputStream(baos));

public String getExceptionStackTrace() {
	if ("failure".equals(this.getStatus())) {
		errorMessagePS.flush();
		return baos.toString();
	}
	return null;
}

private Exception exception;

public Exception getException() {
	if ("failure".equals(this.getStatus())) {
		return this.exception;
	}
	return null;
}

private class TalendException extends Exception {

	private static final long serialVersionUID = 1L;

	private java.util.Map<String, Object> globalMap = null;
	private Exception e = null;
	private String currentComponent = null;
	private String virtualComponentName = null;
	
	public void setVirtualComponentName (String virtualComponentName){
		this.virtualComponentName = virtualComponentName;
	}

	private TalendException(Exception e, String errorComponent, final java.util.Map<String, Object> globalMap) {
		this.currentComponent= errorComponent;
		this.globalMap = globalMap;
		this.e = e;
	}

	public Exception getException() {
		return this.e;
	}

	public String getCurrentComponent() {
		return this.currentComponent;
	}

	
    public String getExceptionCauseMessage(Exception e){
        Throwable cause = e;
        String message = null;
        int i = 10;
        while (null != cause && 0 < i--) {
            message = cause.getMessage();
            if (null == message) {
                cause = cause.getCause();
            } else {
                break;          
            }
        }
        if (null == message) {
            message = e.getClass().getName();
        }   
        return message;
    }

	@Override
	public void printStackTrace() {
		if (!(e instanceof TalendException || e instanceof TDieException)) {
			if(virtualComponentName!=null && currentComponent.indexOf(virtualComponentName+"_")==0){
				globalMap.put(virtualComponentName+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			}
			globalMap.put(currentComponent+"_ERROR_MESSAGE",getExceptionCauseMessage(e));
			System.err.println("Exception in component " + currentComponent + " (" + jobName + ")");
		}
		if (!(e instanceof TDieException)) {
			if(e instanceof TalendException){
				e.printStackTrace();
			} else {
				e.printStackTrace();
				e.printStackTrace(errorMessagePS);
				MAJ_BOBI_MARQUE_DARTY.this.exception = e;
			}
		}
		if (!(e instanceof TalendException)) {
		try {
			for (java.lang.reflect.Method m : this.getClass().getEnclosingClass().getMethods()) {
				if (m.getName().compareTo(currentComponent + "_error") == 0) {
					m.invoke(MAJ_BOBI_MARQUE_DARTY.this, new Object[] { e , currentComponent, globalMap});
					break;
				}
			}

			if(!(e instanceof TDieException)){
			}
		} catch (Exception e) {
			this.e.printStackTrace();
		}
		}
	}
}

			public void tPrejob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPrejob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJava_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJava_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void JBL_LoadingConf_1_tFileInputProperties_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					JBL_LoadingConf_1_tFileInputProperties_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void JBL_LoadingConf_1_tContextLoad_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
					JBL_LoadingConf_1_tFileInputProperties_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tWarn_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tWarn_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void JBL_LoadingConf_1_tDie_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					JBL_LoadingConf_1_tDie_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJDBCConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlConnection_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMysqlConnection_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPostjob_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tPostjob_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJDBCClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlClose_1_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMysqlClose_1_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJDBCInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlOutput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_6_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlOutput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tJDBCInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMap_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlOutput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlOutput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlCommit_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tMysqlCommit_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlInput_5_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlInput_4_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlInput_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlInput_3_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tMysqlInput_8_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Select_BR_ID_2_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Select_Brand_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_3_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Select_BR_L1_Max_ID_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Select_BR_L1_ID_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tAdvancedHash_Select_BR_Max_ID_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					tJDBCInput_2_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void talendJobLog_error(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {
				
				end_Hash.put(errorComponent, System.currentTimeMillis());
				
				status = "failure";
				
					talendJobLog_onSubJobError(exception, errorComponent, globalMap);
			}
			
			public void tPrejob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJava_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void JBL_LoadingConf_1_tFileInputProperties_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "ERROR", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

				try {
					
						if(this.execStat){
							runStat.updateStatOnConnection("JBL_LoadingConf_1_OnSubjobError1", 0, "error");
						}
					
					errorCode = null;
					JBL_LoadingConf_1_tDie_1Process(globalMap);
					if (!"failure".equals(status)) {
						status = "end";
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void tWarn_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void JBL_LoadingConf_1_tDie_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJDBCConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tMysqlConnection_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tPostjob_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJDBCClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tMysqlClose_1_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJDBCInput_2_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tJDBCInput_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void tMysqlCommit_3_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}
			public void talendJobLog_onSubJobError(Exception exception, String errorComponent, final java.util.Map<String, Object> globalMap) throws TalendException {

resumeUtil.addLog("SYSTEM_LOG", "NODE:"+ errorComponent, "", Thread.currentThread().getId()+ "", "FATAL", "", exception.getMessage(), ResumeUtil.getExceptionStackTrace(exception),"");

			}




	





	
public void tPrejob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPrejob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPrejob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPrejob_1", false);
		start_Hash.put("tPrejob_1", System.currentTimeMillis());
		
	
	currentComponent="tPrejob_1";

	
		int tos_count_tPrejob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPrejob_1", "tPrejob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPrejob_1 begin ] stop
 */
	
	/**
	 * [tPrejob_1 main ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 


	tos_count_tPrejob_1++;

/**
 * [tPrejob_1 main ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPrejob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 process_data_end ] stop
 */
	
	/**
	 * [tPrejob_1 end ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 

ok_Hash.put("tPrejob_1", true);
end_Hash.put("tPrejob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk4", 0, "ok");
				}
				tJava_1Process(globalMap);



/**
 * [tPrejob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPrejob_1 finally ] start
	 */

	

	
	
	currentComponent="tPrejob_1";

	

 



/**
 * [tPrejob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPrejob_1_SUBPROCESS_STATE", 1);
	}
	

public void tJava_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJava_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tJava_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJava_1", false);
		start_Hash.put("tJava_1", System.currentTimeMillis());
		
	
	currentComponent="tJava_1";

	
		int tos_count_tJava_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJava_1", "tJava");
				talendJobLogProcess(globalMap);
			}
			


context.ficPropertiesName = context.Dir_conf+"/"+ context.CtxPathFile;
 



/**
 * [tJava_1 begin ] stop
 */
	
	/**
	 * [tJava_1 main ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 


	tos_count_tJava_1++;

/**
 * [tJava_1 main ] stop
 */
	
	/**
	 * [tJava_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_begin ] stop
 */
	
	/**
	 * [tJava_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 process_data_end ] stop
 */
	
	/**
	 * [tJava_1 end ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 

ok_Hash.put("tJava_1", true);
end_Hash.put("tJava_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk5", 0, "ok");
				}
				JBL_LoadingConf_1_tFileInputProperties_1Process(globalMap);



/**
 * [tJava_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJava_1 finally ] start
	 */

	

	
	
	currentComponent="tJava_1";

	

 



/**
 * [tJava_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJava_1_SUBPROCESS_STATE", 1);
	}
	


public static class JBL_LoadingConf_1_row1Struct implements routines.system.IPersistableRow<JBL_LoadingConf_1_row1Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public String key;

				public String getKey () {
					return this.key;
				}
				
			    public String value;

				public String getValue () {
					return this.value;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.key = readString(dis);
					
					this.value = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.key,dos);
					
					// String
				
						writeString(this.value,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("key="+key);
		sb.append(",value="+value);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(key == null){
        					sb.append("<null>");
        				}else{
            				sb.append(key);
            			}
            		
        			sb.append("|");
        		
        				if(value == null){
        					sb.append("<null>");
        				}else{
            				sb.append(value);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(JBL_LoadingConf_1_row1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void JBL_LoadingConf_1_tFileInputProperties_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("JBL_LoadingConf_1_tFileInputProperties_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		JBL_LoadingConf_1_row1Struct JBL_LoadingConf_1_row1 = new JBL_LoadingConf_1_row1Struct();




	
	/**
	 * [JBL_LoadingConf_1_tContextLoad_1 begin ] start
	 */

	

	
		
		ok_Hash.put("JBL_LoadingConf_1_tContextLoad_1", false);
		start_Hash.put("JBL_LoadingConf_1_tContextLoad_1", System.currentTimeMillis());
		
	
	currentComponent="JBL_LoadingConf_1_tContextLoad_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"JBL_LoadingConf_1_row1");
			
		int tos_count_JBL_LoadingConf_1_tContextLoad_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("JBL_LoadingConf_1_tContextLoad_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_JBL_LoadingConf_1_tContextLoad_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_JBL_LoadingConf_1_tContextLoad_1 = new StringBuilder();
                    log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("Parameters:");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("LOAD_NEW_VARIABLE" + " = " + "Warning");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("NOT_LOAD_OLD_VARIABLE" + " = " + "Warning");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("PRINT_OPERATIONS" + " = " + "false");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("DISABLE_ERROR" + " = " + "false");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("DISABLE_WARNINGS" + " = " + "true");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("DISABLE_INFO" + " = " + "true");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append("DIEONERROR" + " = " + "true");
                        log4jParamters_JBL_LoadingConf_1_tContextLoad_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("JBL_LoadingConf_1_tContextLoad_1 - "  + (log4jParamters_JBL_LoadingConf_1_tContextLoad_1) );
                    } 
                } 
            new BytesLimit65535_JBL_LoadingConf_1_tContextLoad_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("JBL_LoadingConf_1_tContextLoad_1", "tContextLoad");
				talendJobLogProcess(globalMap);
			}
			
	java.util.List<String> assignList_JBL_LoadingConf_1_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> newPropertyList_JBL_LoadingConf_1_tContextLoad_1 = new java.util.ArrayList<String>();
	java.util.List<String> noAssignList_JBL_LoadingConf_1_tContextLoad_1 = new java.util.ArrayList<String>();
	int nb_line_JBL_LoadingConf_1_tContextLoad_1 = 0;

 



/**
 * [JBL_LoadingConf_1_tContextLoad_1 begin ] stop
 */



	
	/**
	 * [JBL_LoadingConf_1_tFileInputProperties_1 begin ] start
	 */

	

	
		
		ok_Hash.put("JBL_LoadingConf_1_tFileInputProperties_1", false);
		start_Hash.put("JBL_LoadingConf_1_tFileInputProperties_1", System.currentTimeMillis());
		
	
	currentComponent="JBL_LoadingConf_1_tFileInputProperties_1";

	
		int tos_count_JBL_LoadingConf_1_tFileInputProperties_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("JBL_LoadingConf_1_tFileInputProperties_1", "tFileInputProperties");
				talendJobLogProcess(globalMap);
			}
			

	java.io.File file_JBL_LoadingConf_1_tFileInputProperties_1 = new java.io.File(context.ficPropertiesName);
	int nb_line_JBL_LoadingConf_1_tFileInputProperties_1 = 0;				log.debug("JBL_LoadingConf_1_tFileInputProperties_1 - Retrieving records from the datasource.");
			
	java.util.Properties properties_JBL_LoadingConf_1_tFileInputProperties_1 = new java.util.Properties();
	java.io.FileInputStream fis_JBL_LoadingConf_1_tFileInputProperties_1=new java.io.FileInputStream(file_JBL_LoadingConf_1_tFileInputProperties_1);
   	try{
		properties_JBL_LoadingConf_1_tFileInputProperties_1.load(fis_JBL_LoadingConf_1_tFileInputProperties_1);
		java.util.Enumeration enumeration_JBL_LoadingConf_1_tFileInputProperties_1 = properties_JBL_LoadingConf_1_tFileInputProperties_1.propertyNames();
		while (enumeration_JBL_LoadingConf_1_tFileInputProperties_1.hasMoreElements()) {
			nb_line_JBL_LoadingConf_1_tFileInputProperties_1++;
				log.debug("JBL_LoadingConf_1_tFileInputProperties_1 - Retrieving the record " + (nb_line_JBL_LoadingConf_1_tFileInputProperties_1) + ".");
			
			JBL_LoadingConf_1_row1.key = (String)enumeration_JBL_LoadingConf_1_tFileInputProperties_1.nextElement();
			JBL_LoadingConf_1_row1.value = (String)properties_JBL_LoadingConf_1_tFileInputProperties_1.getProperty(JBL_LoadingConf_1_row1.key);

 



/**
 * [JBL_LoadingConf_1_tFileInputProperties_1 begin ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tFileInputProperties_1 main ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tFileInputProperties_1";

	

 


	tos_count_JBL_LoadingConf_1_tFileInputProperties_1++;

/**
 * [JBL_LoadingConf_1_tFileInputProperties_1 main ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tFileInputProperties_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tFileInputProperties_1";

	

 



/**
 * [JBL_LoadingConf_1_tFileInputProperties_1 process_data_begin ] stop
 */

	
	/**
	 * [JBL_LoadingConf_1_tContextLoad_1 main ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tContextLoad_1";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"JBL_LoadingConf_1_row1");
			
    			if(log.isTraceEnabled()){
    				log.trace("JBL_LoadingConf_1_row1 - " + (JBL_LoadingConf_1_row1==null? "": JBL_LoadingConf_1_row1.toLogString()));
    			}
    		
        //////////////////////////
        String tmp_key_JBL_LoadingConf_1_tContextLoad_1 = null;
                    String key_JBL_LoadingConf_1_tContextLoad_1 = null;
                      if (JBL_LoadingConf_1_row1.key != null){
                          tmp_key_JBL_LoadingConf_1_tContextLoad_1 = JBL_LoadingConf_1_row1.key.trim();
                        if ((tmp_key_JBL_LoadingConf_1_tContextLoad_1.startsWith("#") || tmp_key_JBL_LoadingConf_1_tContextLoad_1.startsWith("!") )){
                          tmp_key_JBL_LoadingConf_1_tContextLoad_1 = null;
                        } else {
                          JBL_LoadingConf_1_row1.key = tmp_key_JBL_LoadingConf_1_tContextLoad_1;
                        }
                      }
                        if(JBL_LoadingConf_1_row1.key != null) {
                    key_JBL_LoadingConf_1_tContextLoad_1 =
                        JBL_LoadingConf_1_row1.key;
                        }
                    String value_JBL_LoadingConf_1_tContextLoad_1 = null;
                        if(JBL_LoadingConf_1_row1.value != null) {
                    value_JBL_LoadingConf_1_tContextLoad_1 =
                        JBL_LoadingConf_1_row1.value;
                        }
				
				String currentValue_JBL_LoadingConf_1_tContextLoad_1 = value_JBL_LoadingConf_1_tContextLoad_1;
										
						if ((key_JBL_LoadingConf_1_tContextLoad_1 != null) && ("AMC_DARTY_db_Password".equals(key_JBL_LoadingConf_1_tContextLoad_1)) ) currentValue_JBL_LoadingConf_1_tContextLoad_1 = currentValue_JBL_LoadingConf_1_tContextLoad_1.replaceAll(".", "*");						
						if ((key_JBL_LoadingConf_1_tContextLoad_1 != null) && ("PCM_Password".equals(key_JBL_LoadingConf_1_tContextLoad_1)) ) currentValue_JBL_LoadingConf_1_tContextLoad_1 = currentValue_JBL_LoadingConf_1_tContextLoad_1.replaceAll(".", "*");

  if (tmp_key_JBL_LoadingConf_1_tContextLoad_1 != null){
  try{
        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_AdditionalParams".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_AdditionalParams=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_Login".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_Login=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_Password".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_Password=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_Port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_Port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_Schema".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_Schema=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_Server".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_Server=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "AMC_DARTY_db_Sid".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.AMC_DARTY_db_Sid=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_HDFS_Group".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_HDFS_Group=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_HDFS_Temp_Folder".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_HDFS_Temp_Folder=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_HDFS_User_Name".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_HDFS_User_Name=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_JobtrackerURI".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_JobtrackerURI=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_NamenodeURI".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_NamenodeURI=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_Zookeeper_Host".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_Zookeeper_Host=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C01_ClusterDarty_Zookeeper_Port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C01_ClusterDarty_Zookeeper_Port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_DbDwh_Name".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_DbDwh_Name=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_DbHisto_Name".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_DbHisto_Name=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_DbNominal_Name".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_DbNominal_Name=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_Host".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_Host=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_Password".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_Password=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_Port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_Port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C10_Hive_connection_Hive_User_Name".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C10_Hive_connection_Hive_User_Name=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTAC01_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTAC01_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTAC01_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTAC01_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTAC02_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTAC02_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTAC02_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTAC02_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM51_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM51_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM51_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM51_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM52_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM52_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM52_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM52_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM53_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM53_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM53_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM53_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM54_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM54_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM54_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM54_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM55_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM55_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTEM55_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTEM55_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTPC01_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTPC01_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTPC01_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTPC01_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTPC02_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTPC02_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C100_Tables_RTPC02_MqFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C100_Tables_RTPC02_MqFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_Apport_Retrait".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_Apport_Retrait=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_Authorization".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_Authorization=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_AuthValue".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_AuthValue=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_Cadeaux".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_Cadeaux=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_Decompte".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_Decompte=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_Encaissements".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_Encaissements=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_HostRunTime".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_HostRunTime=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_PortRunTime".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_PortRunTime=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_PwdRunTime".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_PwdRunTime=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_serv".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_serv=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_URL".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_URL=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_UserRunTime".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_UserRunTime=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_Vente".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_Vente=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_WYNN_Entree_Mag".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_WYNN_Entree_Mag=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C130_ElasticSearch_WYNN_Lignes_vente".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C130_ElasticSearch_WYNN_Lignes_vente=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "new1".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.new1=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Archive".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Archive=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Conf".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Conf=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Dezip".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Dezip=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Dwh".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Dwh=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Input".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Input=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Json".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Json=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Mq".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Mq=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_MQ_Error".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_MQ_Error=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_NCG".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_NCG=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_PCM".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_PCM=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Pig".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Pig=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Racine".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Racine=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_REF".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_REF=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Rejets".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Rejets=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Reprise".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Reprise=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Tmp".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Tmp=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Transac".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Transac=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HDFS_Work".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HDFS_Work=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_HIVE_Racine".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_HIVE_Racine=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_INPUT_DWH".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_INPUT_DWH=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_INPUT_FUNC_LOG".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_INPUT_FUNC_LOG=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_INPUT_NCG".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_INPUT_NCG=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_INPUT_QLIK".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_INPUT_QLIK=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_INPUT_TMP".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_INPUT_TMP=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_Directory_INPUT_Transac_NCG".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_Directory_INPUT_Transac_NCG=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FileName_EndOfFile_Histo".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FileName_EndOfFile_Histo=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FileName_EndOfFile_Histo_Nominal_Queue".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FileName_EndOfFile_Histo_Nominal_Queue=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_ARCHIVE_HDFS_SUFFIX".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_ARCHIVE_HDFS_SUFFIX=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_HISTO_Delimiter_Denormalize".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_HISTO_Delimiter_Denormalize=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_HISTO_Extension_src".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_HISTO_Extension_src=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_HISTO_Extension_tmp".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_HISTO_Extension_tmp=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_HISTO_Mask_Src".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_HISTO_Mask_Src=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_HISTO_Mask_tmp".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_HISTO_Mask_tmp=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C40_FilesName_RepriseHistoProperties".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C40_FilesName_RepriseHistoProperties=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_flowTable".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_flowTable=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_hostname".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_hostname=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_instance".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_instance=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_logTable".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_logTable=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_pwd".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_pwd=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_schema".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_schema=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_statTable".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_statTable=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C50_DB2_user".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C50_DB2_user=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_H_Articles".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_H_Articles=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_H_Orga".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_H_Orga=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_H_Prestas".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_H_Prestas=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_RTGA01".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_RTGA01=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_RTGA75".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_RTGA75=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_RTGG40".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_RTGG40=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWH_RTGV31".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWH_RTGV31=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWR_TORG".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWR_TORG=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWR_TPRESTA".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWR_TPRESTA=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_DWR_TPRODUIT".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_DWR_TPRODUIT=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTGV02".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTGV02=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTGV10".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTGV10=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTGV14".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTGV14=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT01".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT01=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT02".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT02=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT03".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT03=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT08".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT08=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT11".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT11=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT12".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT12=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT13".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT13=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT14".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT14=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT15".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT15=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT16".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT16=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C60_FilesName_HISTO_RTVT17".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C60_FilesName_HISTO_RTVT17=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_CONNECTION_Canal".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_CONNECTION_Canal=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_CONNECTION_Port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_CONNECTION_Port=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_CONNECTION_Pwd".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_CONNECTION_Pwd=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_CONNECTION_QueueManager".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_CONNECTION_QueueManager=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_CONNECTION_Server".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_CONNECTION_Server=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_CONNECTION_User".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_CONNECTION_User=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_Canal".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_Canal=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_Port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_Port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_Pwd".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_Pwd=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_QueueManager".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_QueueManager=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_Server".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_Server=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_Error_User".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_Error_User=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_FilesName_RTAC03".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTAC03_FilesName_RTAC03=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_GRP_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTAC03_GRP_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTAC03_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTAC03_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTAC03_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTAC03_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTAC03_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTAC03_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_FilesName_RTGV02".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV02_FilesName_RTGV02=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV02_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV02_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV02_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV02_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV02_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV02_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV02_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_FilesName_RTGV03".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV03_FilesName_RTGV03=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV03_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV03_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV03_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV03_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV03_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV03_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV03_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_FilesName_RTGV04".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV04_FilesName_RTGV04=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV04_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV04_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV04_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV04_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV04_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV04_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV04_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_FilesName_RTGV10".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV10_FilesName_RTGV10=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV10_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV10_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV10_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV10_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV10_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV10_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV10_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_FilesName_RTGV11".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV11_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_NbProcessingFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV11_NbProcessingFile=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV11_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV11_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV11_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_FilesName_RTGV14".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV14_FilesName_RTGV14=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV14_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV14_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV14_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV14_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV14_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV14_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV14_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_FilesName_RTGV15".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV15_FilesName_RTGV15=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV15_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV15_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV15_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV15_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTGV15_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTGV15_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTGV15_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_FilesName_RTTL04".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTTL04_FilesName_RTTL04=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_HBase".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTTL04_HBase=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_Modele".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTTL04_Modele=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_NbMessage".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTTL04_NbMessage=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_QueueName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTTL04_QueueName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_TimeOut".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {

                context.C80_MQDarty_NCG_RTTL04_TimeOut=Integer.parseInt(value_JBL_LoadingConf_1_tContextLoad_1);

        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C80_MQDarty_NCG_RTTL04_TraitementName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C80_MQDarty_NCG_RTTL04_TraitementName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CtxPathFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CtxPathFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DartyEncoding".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DartyEncoding=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "Dir_conf".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.Dir_conf=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "FilePath_StopNgo_Json".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.FilePath_StopNgo_Json=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "FilePath_StopNgo_Nominal".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.FilePath_StopNgo_Nominal=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "ProfondeurHisto".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.ProfondeurHisto=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "ShardingGV11".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.ShardingGV11=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "TimerCheckLoop".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.TimerCheckLoop=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "TimerLoopStopNGo".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.TimerLoopStopNGo=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Cartes_Cadeaux_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Cartes_Cadeaux_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "FilesName_Json_Cartes_Cadeaux".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.FilesName_Json_Cartes_Cadeaux=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_File_Json_Apport_Retrait".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_File_Json_Apport_Retrait=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_FilesName_Json_Decompte".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_FilesName_Json_Decompte=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_apport_retrait_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_apport_retrait_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_decompte_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_decompte_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_entete_encaissement_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_entete_encaissement_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_lignes_encaissement_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_lignes_encaissement_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_MQ_Ref_Filename_AR".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_MQ_Ref_Filename_AR=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_MQ_Ref_Filename_DE".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_MQ_Ref_Filename_DE=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_OutputJsonFileName_AR".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_OutputJsonFileName_AR=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_OutputJsonFileName_DE".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_OutputJsonFileName_DE=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Prefix_Temp_Files_AR".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Prefix_Temp_Files_AR=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Prefix_Temp_Files_DE".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Prefix_Temp_Files_DE=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_reglements_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_reglements_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "FilesName_Json_Encaissements".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.FilesName_Json_Encaissements=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_FilesName_Json_Ventes".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_FilesName_Json_Ventes=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Adresse_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Adresse_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Email_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Email_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Encaissement_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Encaissement_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Entete_vente_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Entete_vente_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Lignes_vente_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Lignes_vente_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Masque".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Masque=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Options_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Options_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Prefix_Temp_Files".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Prefix_Temp_Files=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Reprise".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Reprise=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Retours_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Retours_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_Vadd_JSON".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_Vadd_JSON=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "C30_File_Json_Lignes_LV".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.C30_File_Json_Lignes_LV=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_NomBloc_JSON_EM".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_NomBloc_JSON_EM=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "CLOCAL_NomBloc_JSON_LV".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.CLOCAL_NomBloc_JSON_LV=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "File_Json_RTAC03".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.File_Json_RTAC03=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "keyFileName_EM".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.keyFileName_EM=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "keyFileName_LV".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.keyFileName_LV=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "keyFileName_LV_BatchHive".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.keyFileName_LV_BatchHive=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "qVenteFileName_EM".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.qVenteFileName_EM=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "PCM_ClassName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.PCM_ClassName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "PCM_DriverJar".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.PCM_DriverJar=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "PCM_JdbcUrl".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.PCM_JdbcUrl=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "PCM_Login".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.PCM_Login=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "PCM_MappingFile".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.PCM_MappingFile=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "PCM_Password".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.PCM_Password=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DB2_host".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DB2_host=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DB2_instance".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DB2_instance=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DB2_login".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DB2_login=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DB2_port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DB2_port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DB2_pwd".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DB2_pwd=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "DB2_schema".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.DB2_schema=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "Local_Logs_Directory".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.Local_Logs_Directory=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "Local_Logs_FileName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.Local_Logs_FileName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "Local_Meters_FileName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.Local_Meters_FileName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "Local_Stats_FileName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.Local_Stats_FileName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "ficPropertiesName".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.ficPropertiesName=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "MARIADB_Connect_Host".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.MARIADB_Connect_Host=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "MARIADB_Connect_Port".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.MARIADB_Connect_Port=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "MARIADB_Connect_Database".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.MARIADB_Connect_Database=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "MARIADB_Connect_User_Name".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.MARIADB_Connect_User_Name=value_JBL_LoadingConf_1_tContextLoad_1;
        }

        if(key_JBL_LoadingConf_1_tContextLoad_1!=null && "MARIADB_Connect_User_Password".equals(key_JBL_LoadingConf_1_tContextLoad_1))
        {
           context.MARIADB_Connect_User_Password=value_JBL_LoadingConf_1_tContextLoad_1;
        }


        if (context.getProperty(key_JBL_LoadingConf_1_tContextLoad_1)!=null)
        {
            assignList_JBL_LoadingConf_1_tContextLoad_1.add(key_JBL_LoadingConf_1_tContextLoad_1);
        }else  {
            newPropertyList_JBL_LoadingConf_1_tContextLoad_1.add(key_JBL_LoadingConf_1_tContextLoad_1);
        }
        if(value_JBL_LoadingConf_1_tContextLoad_1 == null){
            context.setProperty(key_JBL_LoadingConf_1_tContextLoad_1, "");
        }else{
            context.setProperty(key_JBL_LoadingConf_1_tContextLoad_1,value_JBL_LoadingConf_1_tContextLoad_1);
        }
    }catch(java.lang.Exception e){
            log.error("JBL_LoadingConf_1_tContextLoad_1 - Setting a value for the key \"" + key_JBL_LoadingConf_1_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
        System.err.println("Setting a value for the key \"" + key_JBL_LoadingConf_1_tContextLoad_1 + "\" has failed. Error message: " + e.getMessage());
    }
        nb_line_JBL_LoadingConf_1_tContextLoad_1++;
    }
        //////////////////////////

 


	tos_count_JBL_LoadingConf_1_tContextLoad_1++;

/**
 * [JBL_LoadingConf_1_tContextLoad_1 main ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tContextLoad_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tContextLoad_1";

	

 



/**
 * [JBL_LoadingConf_1_tContextLoad_1 process_data_begin ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tContextLoad_1 process_data_end ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tContextLoad_1";

	

 



/**
 * [JBL_LoadingConf_1_tContextLoad_1 process_data_end ] stop
 */



	
	/**
	 * [JBL_LoadingConf_1_tFileInputProperties_1 process_data_end ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tFileInputProperties_1";

	

 



/**
 * [JBL_LoadingConf_1_tFileInputProperties_1 process_data_end ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tFileInputProperties_1 end ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tFileInputProperties_1";

	

		}
	}finally{
		if(fis_JBL_LoadingConf_1_tFileInputProperties_1!=null){
			fis_JBL_LoadingConf_1_tFileInputProperties_1.close();
		}
	}
globalMap.put("JBL_LoadingConf_1_tFileInputProperties_1_NB_LINE", nb_line_JBL_LoadingConf_1_tFileInputProperties_1);
				log.debug("JBL_LoadingConf_1_tFileInputProperties_1 - Retrieved records count: "+ nb_line_JBL_LoadingConf_1_tFileInputProperties_1 + " .");
			
 

ok_Hash.put("JBL_LoadingConf_1_tFileInputProperties_1", true);
end_Hash.put("JBL_LoadingConf_1_tFileInputProperties_1", System.currentTimeMillis());




/**
 * [JBL_LoadingConf_1_tFileInputProperties_1 end ] stop
 */

	
	/**
	 * [JBL_LoadingConf_1_tContextLoad_1 end ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tContextLoad_1";

	
	
	java.util.Enumeration<?> enu_JBL_LoadingConf_1_tContextLoad_1 = context.propertyNames();
    while(enu_JBL_LoadingConf_1_tContextLoad_1.hasMoreElements())
    {           
    	String key_JBL_LoadingConf_1_tContextLoad_1 = (String)enu_JBL_LoadingConf_1_tContextLoad_1.nextElement();
        if(!assignList_JBL_LoadingConf_1_tContextLoad_1.contains(key_JBL_LoadingConf_1_tContextLoad_1) && !newPropertyList_JBL_LoadingConf_1_tContextLoad_1.contains(key_JBL_LoadingConf_1_tContextLoad_1))
        {
            noAssignList_JBL_LoadingConf_1_tContextLoad_1.add(key_JBL_LoadingConf_1_tContextLoad_1);
        }          
    } 

    String newPropertyStr_JBL_LoadingConf_1_tContextLoad_1 = newPropertyList_JBL_LoadingConf_1_tContextLoad_1.toString();
    String newProperty_JBL_LoadingConf_1_tContextLoad_1 = newPropertyStr_JBL_LoadingConf_1_tContextLoad_1.substring(1, newPropertyStr_JBL_LoadingConf_1_tContextLoad_1.length() - 1);
    
    String noAssignStr_JBL_LoadingConf_1_tContextLoad_1 = noAssignList_JBL_LoadingConf_1_tContextLoad_1.toString();
    String noAssign_JBL_LoadingConf_1_tContextLoad_1 = noAssignStr_JBL_LoadingConf_1_tContextLoad_1.substring(1, noAssignStr_JBL_LoadingConf_1_tContextLoad_1.length() - 1);
    
    globalMap.put("JBL_LoadingConf_1_tContextLoad_1_KEY_NOT_INCONTEXT", newProperty_JBL_LoadingConf_1_tContextLoad_1);
    globalMap.put("JBL_LoadingConf_1_tContextLoad_1_KEY_NOT_LOADED", noAssign_JBL_LoadingConf_1_tContextLoad_1);

    globalMap.put("JBL_LoadingConf_1_tContextLoad_1_NB_LINE",nb_line_JBL_LoadingConf_1_tContextLoad_1);

	List<String> parametersToEncrypt_JBL_LoadingConf_1_tContextLoad_1 = new java.util.ArrayList<String>();
	
		parametersToEncrypt_JBL_LoadingConf_1_tContextLoad_1.add("AMC_DARTY_db_Password");
		
		parametersToEncrypt_JBL_LoadingConf_1_tContextLoad_1.add("PCM_Password");
		
	
	resumeUtil.addLog("NODE", "NODE:JBL_LoadingConf_1_tContextLoad_1", "", Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt_JBL_LoadingConf_1_tContextLoad_1));    
    	log.info("JBL_LoadingConf_1_tContextLoad_1 - Loaded contexts count: " + nb_line_JBL_LoadingConf_1_tContextLoad_1 + ".");
    
			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"JBL_LoadingConf_1_row1",2,0,
			 			talendJobLog,"JBL_LoadingConf_1_tFileInputProperties_1","tFileInputProperties","JBL_LoadingConf_1_tContextLoad_1","tContextLoad","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("JBL_LoadingConf_1_tContextLoad_1 - "  + ("Done.") );

ok_Hash.put("JBL_LoadingConf_1_tContextLoad_1", true);
end_Hash.put("JBL_LoadingConf_1_tContextLoad_1", System.currentTimeMillis());




/**
 * [JBL_LoadingConf_1_tContextLoad_1 end ] stop
 */



				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:JBL_LoadingConf_1_tFileInputProperties_1:OnSubjobOk (TRIGGER_OUTPUT_1)", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk9", 0, "ok");
								} 
							
							tWarn_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [JBL_LoadingConf_1_tFileInputProperties_1 finally ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tFileInputProperties_1";

	

 



/**
 * [JBL_LoadingConf_1_tFileInputProperties_1 finally ] stop
 */

	
	/**
	 * [JBL_LoadingConf_1_tContextLoad_1 finally ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tContextLoad_1";

	

 



/**
 * [JBL_LoadingConf_1_tContextLoad_1 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("JBL_LoadingConf_1_tFileInputProperties_1_SUBPROCESS_STATE", 1);
	}
	

public void tWarn_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tWarn_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tWarn_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tWarn_1", false);
		start_Hash.put("tWarn_1", System.currentTimeMillis());
		
	
	currentComponent="tWarn_1";

	
		int tos_count_tWarn_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tWarn_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tWarn_1 = new StringBuilder();
                    log4jParamters_tWarn_1.append("Parameters:");
                            log4jParamters_tWarn_1.append("MESSAGE" + " = " + "\"Connexion à :\"+\"jdbc:hive2://\"+context.C10_Hive_connection_Hive_Host+\":\" +context.C10_Hive_connection_Hive_Port +\"/\"+context.C10_Hive_connection_Hive_DbDwh_Name");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("CODE" + " = " + "42");
                        log4jParamters_tWarn_1.append(" | ");
                            log4jParamters_tWarn_1.append("PRIORITY" + " = " + "3");
                        log4jParamters_tWarn_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + (log4jParamters_tWarn_1) );
                    } 
                } 
            new BytesLimit65535_tWarn_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tWarn_1", "tWarn");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tWarn_1 begin ] stop
 */
	
	/**
	 * [tWarn_1 main ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

		
try {
	
	resumeUtil.addLog("USER_DEF_LOG", "NODE:tWarn_1", "", Thread.currentThread().getId() + "", "INFO","","Connexion à :"+"jdbc:hive2://"+context.C10_Hive_connection_Hive_Host+":" +context.C10_Hive_connection_Hive_Port +"/"+context.C10_Hive_connection_Hive_DbDwh_Name,"", "");
                if(log.isInfoEnabled())
            log.info("tWarn_1 - "  + ("Message: ")  + ("Connexion à :"+"jdbc:hive2://"+context.C10_Hive_connection_Hive_Host+":" +context.C10_Hive_connection_Hive_Port +"/"+context.C10_Hive_connection_Hive_DbDwh_Name)  + (". Code: ")  + (42) );
	globalMap.put("tWarn_1_WARN_MESSAGES", "Connexion à :"+"jdbc:hive2://"+context.C10_Hive_connection_Hive_Host+":" +context.C10_Hive_connection_Hive_Port +"/"+context.C10_Hive_connection_Hive_DbDwh_Name); 
	globalMap.put("tWarn_1_WARN_PRIORITY", 3);
	globalMap.put("tWarn_1_WARN_CODE", 42);
	
} catch (Exception e_tWarn_1) {
	logIgnoredError(String.format("tWarn_1 - tWarn failed to log message due to internal error: %s", e_tWarn_1), e_tWarn_1);
}


 


	tos_count_tWarn_1++;

/**
 * [tWarn_1 main ] stop
 */
	
	/**
	 * [tWarn_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 process_data_begin ] stop
 */
	
	/**
	 * [tWarn_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 process_data_end ] stop
 */
	
	/**
	 * [tWarn_1 end ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tWarn_1 - "  + ("Done.") );

ok_Hash.put("tWarn_1", true);
end_Hash.put("tWarn_1", System.currentTimeMillis());




/**
 * [tWarn_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tWarn_1 finally ] start
	 */

	

	
	
	currentComponent="tWarn_1";

	

 



/**
 * [tWarn_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tWarn_1_SUBPROCESS_STATE", 1);
	}
	

public void JBL_LoadingConf_1_tDie_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("JBL_LoadingConf_1_tDie_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [JBL_LoadingConf_1_tDie_1 begin ] start
	 */

	

	
		
		ok_Hash.put("JBL_LoadingConf_1_tDie_1", false);
		start_Hash.put("JBL_LoadingConf_1_tDie_1", System.currentTimeMillis());
		
	
	currentComponent="JBL_LoadingConf_1_tDie_1";

	
		int tos_count_JBL_LoadingConf_1_tDie_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("JBL_LoadingConf_1_tDie_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_JBL_LoadingConf_1_tDie_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_JBL_LoadingConf_1_tDie_1 = new StringBuilder();
                    log4jParamters_JBL_LoadingConf_1_tDie_1.append("Parameters:");
                            log4jParamters_JBL_LoadingConf_1_tDie_1.append("MESSAGE" + " = " + "\"Impossible de charger le fichier de contexte : \" +context.ficPropertiesName");
                        log4jParamters_JBL_LoadingConf_1_tDie_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tDie_1.append("CODE" + " = " + "4");
                        log4jParamters_JBL_LoadingConf_1_tDie_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tDie_1.append("PRIORITY" + " = " + "5");
                        log4jParamters_JBL_LoadingConf_1_tDie_1.append(" | ");
                            log4jParamters_JBL_LoadingConf_1_tDie_1.append("EXIT_JVM" + " = " + "false");
                        log4jParamters_JBL_LoadingConf_1_tDie_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("JBL_LoadingConf_1_tDie_1 - "  + (log4jParamters_JBL_LoadingConf_1_tDie_1) );
                    } 
                } 
            new BytesLimit65535_JBL_LoadingConf_1_tDie_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("JBL_LoadingConf_1_tDie_1", "tDie");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [JBL_LoadingConf_1_tDie_1 begin ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tDie_1 main ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tDie_1";

	

	try {
	globalMap.put("JBL_LoadingConf_1_tDie_1_DIE_PRIORITY", 5);
	System.err.println("Impossible de charger le fichier de contexte : " +context.ficPropertiesName);
	
		log.error("JBL_LoadingConf_1_tDie_1 - The die message: "+"Impossible de charger le fichier de contexte : " +context.ficPropertiesName);
	
	globalMap.put("JBL_LoadingConf_1_tDie_1_DIE_MESSAGE", "Impossible de charger le fichier de contexte : " +context.ficPropertiesName);
	globalMap.put("JBL_LoadingConf_1_tDie_1_DIE_MESSAGES", "Impossible de charger le fichier de contexte : " +context.ficPropertiesName);
	
	} catch (Exception | Error e_JBL_LoadingConf_1_tDie_1) {
		logIgnoredError(String.format("JBL_LoadingConf_1_tDie_1 - tDie failed to log message due to internal error: %s", e_JBL_LoadingConf_1_tDie_1), e_JBL_LoadingConf_1_tDie_1);
	}
	
	currentComponent = "JBL_LoadingConf_1_tDie_1";
	status = "failure";
        errorCode = new Integer(4);
        globalMap.put("JBL_LoadingConf_1_tDie_1_DIE_CODE", errorCode);        
    
	if(true){	
	    throw new TDieException();
	}

 


	tos_count_JBL_LoadingConf_1_tDie_1++;

/**
 * [JBL_LoadingConf_1_tDie_1 main ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tDie_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tDie_1";

	

 



/**
 * [JBL_LoadingConf_1_tDie_1 process_data_begin ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tDie_1 process_data_end ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tDie_1";

	

 



/**
 * [JBL_LoadingConf_1_tDie_1 process_data_end ] stop
 */
	
	/**
	 * [JBL_LoadingConf_1_tDie_1 end ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tDie_1";

	

 
                if(log.isDebugEnabled())
            log.debug("JBL_LoadingConf_1_tDie_1 - "  + ("Done.") );

ok_Hash.put("JBL_LoadingConf_1_tDie_1", true);
end_Hash.put("JBL_LoadingConf_1_tDie_1", System.currentTimeMillis());




/**
 * [JBL_LoadingConf_1_tDie_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [JBL_LoadingConf_1_tDie_1 finally ] start
	 */

	

	
	
	currentComponent="JBL_LoadingConf_1_tDie_1";

	

 



/**
 * [JBL_LoadingConf_1_tDie_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("JBL_LoadingConf_1_tDie_1_SUBPROCESS_STATE", 1);
	}
	

public void tJDBCConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJDBCConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tJDBCConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJDBCConnection_1", false);
		start_Hash.put("tJDBCConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tJDBCConnection_1";

	
		int tos_count_tJDBCConnection_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJDBCConnection_1", "tJDBCConnection");
				talendJobLogProcess(globalMap);
			}
			


org.talend.components.api.component.ComponentDefinition def_tJDBCConnection_1 =
        new org.talend.components.jdbc.tjdbcconnection.TJDBCConnectionDefinition();

org.talend.components.jdbc.tjdbcconnection.TJDBCConnectionProperties props_tJDBCConnection_1 =
        (org.talend.components.jdbc.tjdbcconnection.TJDBCConnectionProperties) def_tJDBCConnection_1.createRuntimeProperties();
 		                    props_tJDBCConnection_1.setValue("shareConnection",
 		                    false);
 		                    
 		                    props_tJDBCConnection_1.setValue("useDataSource",
 		                    false);
 		                    
 		                    props_tJDBCConnection_1.setValue("useAutoCommit",
 		                    true);
 		                    
 		                    props_tJDBCConnection_1.setValue("autocommit",
 		                    false);
 		                    
 		                    props_tJDBCConnection_1.connection.setValue("jdbcUrl",
 		                    "jdbc:hive2://"+context.C10_Hive_connection_Hive_Host+":" +context.C10_Hive_connection_Hive_Port +"/"+context.C10_Hive_connection_Hive_DbDwh_Name+";auth=noSasl");
 		                    
 		                    props_tJDBCConnection_1.connection.setValue("driverClass",
 		                    "org.apache.hive.jdbc.HiveDriver");
 		                    
 		                    java.util.List<Object> tJDBCConnection_1_connection_driverTable_drivers = new java.util.ArrayList<Object>();
 		                    
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/slf4j-log4j12-1.7.5/6.0.0/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/slf4j-api-1.7.5/6.0.0/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hadoop-common-2.7.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hive-common-0.13.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hive-exec-0.13.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hive-jdbc-0.13.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hive-metastore-0.13.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hive-serde-0.13.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/hive-service-0.13.0/6.0.0-SNAPSHOT/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/httpclient-4.2.5/6.0.0/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/httpcore-4.2.5/6.0.0/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/libthrift-0.9.0/6.0.0/jar");
 		                                
 		                                tJDBCConnection_1_connection_driverTable_drivers.add("mvn:org.talend.libraries/commons-logging-1.1.3(1)/6.0.0-SNAPSHOT/jar");
 		                                
 		                    ((org.talend.daikon.properties.Properties)props_tJDBCConnection_1.connection.driverTable).setValue("drivers",tJDBCConnection_1_connection_driverTable_drivers);
 		                    
 		                    props_tJDBCConnection_1.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    props_tJDBCConnection_1.connection.userPassword.setValue("userId",
 		                    context.C10_Hive_connection_Hive_User_Name);
 		                    
 		                    props_tJDBCConnection_1.connection.userPassword.setValue("password",
 		                    context.C10_Hive_connection_Hive_Password);
 		                    
globalMap.put("tJDBCConnection_1_COMPONENT_RUNTIME_PROPERTIES", props_tJDBCConnection_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "7.3");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.28.2");
java.net.URL mappings_url_tJDBCConnection_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tJDBCConnection_1_MAPPINGS_URL", mappings_url_tJDBCConnection_1);

org.talend.components.api.container.RuntimeContainer container_tJDBCConnection_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tJDBCConnection_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tJDBCConnection_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tJDBCConnection_1 = null;
topology_tJDBCConnection_1 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tJDBCConnection_1 = def_tJDBCConnection_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tJDBCConnection_1, topology_tJDBCConnection_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tJDBCConnection_1 = def_tJDBCConnection_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tJDBCConnection_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tJDBCConnection_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tJDBCConnection_1 = componentRuntime_tJDBCConnection_1.initialize(container_tJDBCConnection_1, props_tJDBCConnection_1);

if (initVr_tJDBCConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tJDBCConnection_1.getMessage());
}

if(componentRuntime_tJDBCConnection_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tJDBCConnection_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tJDBCConnection_1;
	compDriverInitialization_tJDBCConnection_1.runAtDriver(container_tJDBCConnection_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tJDBCConnection_1 = null;
if(componentRuntime_tJDBCConnection_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tJDBCConnection_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tJDBCConnection_1;
	org.talend.daikon.properties.ValidationResult vr_tJDBCConnection_1 = sourceOrSink_tJDBCConnection_1.validate(container_tJDBCConnection_1);
	if (vr_tJDBCConnection_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    	throw new RuntimeException(vr_tJDBCConnection_1.getMessage());
	}
}

 



/**
 * [tJDBCConnection_1 begin ] stop
 */
	
	/**
	 * [tJDBCConnection_1 main ] start
	 */

	

	
	
	currentComponent="tJDBCConnection_1";

	


 


	tos_count_tJDBCConnection_1++;

/**
 * [tJDBCConnection_1 main ] stop
 */
	
	/**
	 * [tJDBCConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJDBCConnection_1";

	


 



/**
 * [tJDBCConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tJDBCConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJDBCConnection_1";

	


 



/**
 * [tJDBCConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tJDBCConnection_1 end ] start
	 */

	

	
	
	currentComponent="tJDBCConnection_1";

	
// end of generic

 

ok_Hash.put("tJDBCConnection_1", true);
end_Hash.put("tJDBCConnection_1", System.currentTimeMillis());




/**
 * [tJDBCConnection_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJDBCConnection_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk12", 0, "ok");
								} 
							
							tMysqlConnection_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJDBCConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tJDBCConnection_1";

	
// finally of generic

 



/**
 * [tJDBCConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJDBCConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tMysqlConnection_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlConnection_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tMysqlConnection_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlConnection_1", false);
		start_Hash.put("tMysqlConnection_1", System.currentTimeMillis());
		
	
	currentComponent="tMysqlConnection_1";

	
		int tos_count_tMysqlConnection_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlConnection_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlConnection_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlConnection_1 = new StringBuilder();
                    log4jParamters_tMysqlConnection_1.append("Parameters:");
                            log4jParamters_tMysqlConnection_1.append("DB_VERSION" + " = " + "MYSQL_5");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("HOST" + " = " + "context.MARIADB_Connect_Host");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("PORT" + " = " + "context.MARIADB_Connect_Port");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("DBNAME" + " = " + "context.MARIADB_Connect_Database");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("PROPERTIES" + " = " + "\"noDatetimeStringSync=true\"");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("USER" + " = " + "context.MARIADB_Connect_User_Name");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("PASS" + " = " + String.valueOf(routines.system.PasswordEncryptUtil.encryptPassword(context.MARIADB_Connect_User_Password)).substring(0, 4) + "...");     
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("USE_SHARED_CONNECTION" + " = " + "false");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("SPECIFY_DATASOURCE_ALIAS" + " = " + "false");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("AUTO_COMMIT" + " = " + "false");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                            log4jParamters_tMysqlConnection_1.append("UNIFIED_COMPONENTS" + " = " + "tMysqlConnection");
                        log4jParamters_tMysqlConnection_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlConnection_1 - "  + (log4jParamters_tMysqlConnection_1) );
                    } 
                } 
            new BytesLimit65535_tMysqlConnection_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlConnection_1", "tMysqlConnection");
				talendJobLogProcess(globalMap);
			}
			
	

	
		String properties_tMysqlConnection_1 = "noDatetimeStringSync=true";
		if (properties_tMysqlConnection_1 == null || properties_tMysqlConnection_1.trim().length() == 0) {
			properties_tMysqlConnection_1 += "rewriteBatchedStatements=true&allowLoadLocalInfile=true";
		}else if (properties_tMysqlConnection_1 != null && !properties_tMysqlConnection_1.contains("rewriteBatchedStatements")) {
			properties_tMysqlConnection_1 += "&rewriteBatchedStatements=true";
		}
		if (properties_tMysqlConnection_1 != null && !properties_tMysqlConnection_1.contains("allowLoadLocalInfile")) {
			properties_tMysqlConnection_1 += "&allowLoadLocalInfile=true";
		}
		
		String url_tMysqlConnection_1 = "jdbc:mysql://" + context.MARIADB_Connect_Host + ":" + context.MARIADB_Connect_Port + "/" + context.MARIADB_Connect_Database + "?" + properties_tMysqlConnection_1;
	String dbUser_tMysqlConnection_1 = context.MARIADB_Connect_User_Name;
	
	
		
	final String decryptedPassword_tMysqlConnection_1 = context.MARIADB_Connect_User_Password; 
		String dbPwd_tMysqlConnection_1 = decryptedPassword_tMysqlConnection_1;
	
	
	java.sql.Connection conn_tMysqlConnection_1 = null;
	
		
			String driverClass_tMysqlConnection_1 = "com.mysql.jdbc.Driver";
			java.lang.Class jdbcclazz_tMysqlConnection_1 = java.lang.Class.forName(driverClass_tMysqlConnection_1);
			globalMap.put("driverClass_tMysqlConnection_1", driverClass_tMysqlConnection_1);
		
	    		log.debug("tMysqlConnection_1 - Driver ClassName: "+driverClass_tMysqlConnection_1+".");
			
	    		log.debug("tMysqlConnection_1 - Connection attempt to '" + url_tMysqlConnection_1 + "' with the username '" + dbUser_tMysqlConnection_1 + "'.");
			
			conn_tMysqlConnection_1 = java.sql.DriverManager.getConnection(url_tMysqlConnection_1,dbUser_tMysqlConnection_1,dbPwd_tMysqlConnection_1);
	    		log.debug("tMysqlConnection_1 - Connection to '" + url_tMysqlConnection_1 + "' has succeeded.");
			

		globalMap.put("conn_tMysqlConnection_1", conn_tMysqlConnection_1);
	if (null != conn_tMysqlConnection_1) {
		
			log.debug("tMysqlConnection_1 - Connection is set auto commit to 'false'.");
			conn_tMysqlConnection_1.setAutoCommit(false);
	}

	globalMap.put("conn_tMysqlConnection_1",conn_tMysqlConnection_1);

	globalMap.put("db_tMysqlConnection_1",context.MARIADB_Connect_Database);
 



/**
 * [tMysqlConnection_1 begin ] stop
 */
	
	/**
	 * [tMysqlConnection_1 main ] start
	 */

	

	
	
	currentComponent="tMysqlConnection_1";

	

 


	tos_count_tMysqlConnection_1++;

/**
 * [tMysqlConnection_1 main ] stop
 */
	
	/**
	 * [tMysqlConnection_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlConnection_1";

	

 



/**
 * [tMysqlConnection_1 process_data_begin ] stop
 */
	
	/**
	 * [tMysqlConnection_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlConnection_1";

	

 



/**
 * [tMysqlConnection_1 process_data_end ] stop
 */
	
	/**
	 * [tMysqlConnection_1 end ] start
	 */

	

	
	
	currentComponent="tMysqlConnection_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tMysqlConnection_1 - "  + ("Done.") );

ok_Hash.put("tMysqlConnection_1", true);
end_Hash.put("tMysqlConnection_1", System.currentTimeMillis());




/**
 * [tMysqlConnection_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlConnection_1 finally ] start
	 */

	

	
	
	currentComponent="tMysqlConnection_1";

	

 



/**
 * [tMysqlConnection_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlConnection_1_SUBPROCESS_STATE", 1);
	}
	

public void tPostjob_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tPostjob_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tPostjob_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tPostjob_1", false);
		start_Hash.put("tPostjob_1", System.currentTimeMillis());
		
	
	currentComponent="tPostjob_1";

	
		int tos_count_tPostjob_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tPostjob_1", "tPostjob");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tPostjob_1 begin ] stop
 */
	
	/**
	 * [tPostjob_1 main ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 


	tos_count_tPostjob_1++;

/**
 * [tPostjob_1 main ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_begin ] stop
 */
	
	/**
	 * [tPostjob_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 process_data_end ] stop
 */
	
	/**
	 * [tPostjob_1 end ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 

ok_Hash.put("tPostjob_1", true);
end_Hash.put("tPostjob_1", System.currentTimeMillis());

				if(execStat){   
   	 				runStat.updateStatOnConnection("OnComponentOk6", 0, "ok");
				}
				tJDBCClose_1Process(globalMap);



/**
 * [tPostjob_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tPostjob_1 finally ] start
	 */

	

	
	
	currentComponent="tPostjob_1";

	

 



/**
 * [tPostjob_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tPostjob_1_SUBPROCESS_STATE", 1);
	}
	

public void tJDBCClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJDBCClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		


	
	/**
	 * [tJDBCClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tJDBCClose_1", false);
		start_Hash.put("tJDBCClose_1", System.currentTimeMillis());
		
	
	currentComponent="tJDBCClose_1";

	
		int tos_count_tJDBCClose_1 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJDBCClose_1", "tJDBCClose");
				talendJobLogProcess(globalMap);
			}
			


org.talend.components.api.component.ComponentDefinition def_tJDBCClose_1 =
        new org.talend.components.jdbc.tjdbcclose.TJDBCCloseDefinition();

org.talend.components.jdbc.tjdbcclose.TJDBCCloseProperties props_tJDBCClose_1 =
        (org.talend.components.jdbc.tjdbcclose.TJDBCCloseProperties) def_tJDBCClose_1.createRuntimeProperties();
 		                    props_tJDBCClose_1.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tJDBCClose_1.referencedComponent.setValue("componentInstanceId",
 		                    "tJDBCConnection_1");
 		                    
 		                    props_tJDBCClose_1.referencedComponent.setValue("referenceDefinitionName",
 		                    "tJDBCConnection");
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tJDBCClose_1.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tJDBCClose_1 = props_tJDBCClose_1.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tJDBCClose_1 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tJDBCClose_1 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tJDBCClose_1 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tJDBCClose_1.referencedComponent.setReference(referencedComponentProperties_tJDBCClose_1);
        }
    }
globalMap.put("tJDBCClose_1_COMPONENT_RUNTIME_PROPERTIES", props_tJDBCClose_1);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "7.3");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.28.2");
java.net.URL mappings_url_tJDBCClose_1= this.getClass().getResource("/xmlMappings");
globalMap.put("tJDBCClose_1_MAPPINGS_URL", mappings_url_tJDBCClose_1);

org.talend.components.api.container.RuntimeContainer container_tJDBCClose_1 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tJDBCClose_1";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tJDBCClose_1 = 0;

org.talend.components.api.component.ConnectorTopology topology_tJDBCClose_1 = null;
topology_tJDBCClose_1 = org.talend.components.api.component.ConnectorTopology.NONE;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tJDBCClose_1 = def_tJDBCClose_1.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tJDBCClose_1, topology_tJDBCClose_1);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tJDBCClose_1 = def_tJDBCClose_1.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tJDBCClose_1 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tJDBCClose_1.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tJDBCClose_1 = componentRuntime_tJDBCClose_1.initialize(container_tJDBCClose_1, props_tJDBCClose_1);

if (initVr_tJDBCClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tJDBCClose_1.getMessage());
}

if(componentRuntime_tJDBCClose_1 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tJDBCClose_1 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tJDBCClose_1;
	compDriverInitialization_tJDBCClose_1.runAtDriver(container_tJDBCClose_1);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tJDBCClose_1 = null;
if(componentRuntime_tJDBCClose_1 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tJDBCClose_1 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tJDBCClose_1;
	org.talend.daikon.properties.ValidationResult vr_tJDBCClose_1 = sourceOrSink_tJDBCClose_1.validate(container_tJDBCClose_1);
	if (vr_tJDBCClose_1.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    	throw new RuntimeException(vr_tJDBCClose_1.getMessage());
	}
}

 



/**
 * [tJDBCClose_1 begin ] stop
 */
	
	/**
	 * [tJDBCClose_1 main ] start
	 */

	

	
	
	currentComponent="tJDBCClose_1";

	


 


	tos_count_tJDBCClose_1++;

/**
 * [tJDBCClose_1 main ] stop
 */
	
	/**
	 * [tJDBCClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJDBCClose_1";

	


 



/**
 * [tJDBCClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tJDBCClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tJDBCClose_1";

	


 



/**
 * [tJDBCClose_1 process_data_end ] stop
 */
	
	/**
	 * [tJDBCClose_1 end ] start
	 */

	

	
	
	currentComponent="tJDBCClose_1";

	
// end of generic

 

ok_Hash.put("tJDBCClose_1", true);
end_Hash.put("tJDBCClose_1", System.currentTimeMillis());




/**
 * [tJDBCClose_1 end ] stop
 */
				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJDBCClose_1:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk13", 0, "ok");
								} 
							
							tMysqlClose_1Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tJDBCClose_1 finally ] start
	 */

	

	
	
	currentComponent="tJDBCClose_1";

	
// finally of generic

 



/**
 * [tJDBCClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJDBCClose_1_SUBPROCESS_STATE", 1);
	}
	

public void tMysqlClose_1Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlClose_1_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tMysqlClose_1 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlClose_1", false);
		start_Hash.put("tMysqlClose_1", System.currentTimeMillis());
		
	
	currentComponent="tMysqlClose_1";

	
		int tos_count_tMysqlClose_1 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlClose_1 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlClose_1{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlClose_1 = new StringBuilder();
                    log4jParamters_tMysqlClose_1.append("Parameters:");
                            log4jParamters_tMysqlClose_1.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlClose_1.append(" | ");
                            log4jParamters_tMysqlClose_1.append("UNIFIED_COMPONENTS" + " = " + "tMysqlClose");
                        log4jParamters_tMysqlClose_1.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlClose_1 - "  + (log4jParamters_tMysqlClose_1) );
                    } 
                } 
            new BytesLimit65535_tMysqlClose_1().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlClose_1", "tMysqlClose");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tMysqlClose_1 begin ] stop
 */
	
	/**
	 * [tMysqlClose_1 main ] start
	 */

	

	
	
	currentComponent="tMysqlClose_1";

	

	java.sql.Connection conn_tMysqlClose_1 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");

	if(conn_tMysqlClose_1 != null && !conn_tMysqlClose_1.isClosed())
	{
		
	    		log.debug("tMysqlClose_1 - Closing the connection 'tMysqlConnection_1' to the database.");
			
			conn_tMysqlClose_1.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tMysqlConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tMysqlClose_1 - Connection 'tMysqlConnection_1' to the database closed.");
			
	}

 


	tos_count_tMysqlClose_1++;

/**
 * [tMysqlClose_1 main ] stop
 */
	
	/**
	 * [tMysqlClose_1 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlClose_1";

	

 



/**
 * [tMysqlClose_1 process_data_begin ] stop
 */
	
	/**
	 * [tMysqlClose_1 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlClose_1";

	

 



/**
 * [tMysqlClose_1 process_data_end ] stop
 */
	
	/**
	 * [tMysqlClose_1 end ] start
	 */

	

	
	
	currentComponent="tMysqlClose_1";

	

 
                if(log.isDebugEnabled())
            log.debug("tMysqlClose_1 - "  + ("Done.") );

ok_Hash.put("tMysqlClose_1", true);
end_Hash.put("tMysqlClose_1", System.currentTimeMillis());




/**
 * [tMysqlClose_1 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlClose_1 finally ] start
	 */

	

	
	
	currentComponent="tMysqlClose_1";

	

 



/**
 * [tMysqlClose_1 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlClose_1_SUBPROCESS_STATE", 1);
	}
	


public static class Insert_BrandStruct implements routines.system.IPersistableRow<Insert_BrandStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public Integer BR_ID;

				public Integer getBR_ID () {
					return this.BR_ID;
				}
				
			    public String OC_CODE;

				public String getOC_CODE () {
					return this.OC_CODE;
				}
				
			    public String BR_OC_ID;

				public String getBR_OC_ID () {
					return this.BR_OC_ID;
				}
				
			    public String BR_OC_NAME;

				public String getBR_OC_NAME () {
					return this.BR_OC_NAME;
				}
				
			    public Integer BR_LEVEL1_ID;

				public Integer getBR_LEVEL1_ID () {
					return this.BR_LEVEL1_ID;
				}
				
			    public String CREATED_BY;

				public String getCREATED_BY () {
					return this.CREATED_BY;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
						this.BR_ID = readInteger(dis);
					
					this.OC_CODE = readString(dis);
					
					this.BR_OC_ID = readString(dis);
					
					this.BR_OC_NAME = readString(dis);
					
						this.BR_LEVEL1_ID = readInteger(dis);
					
					this.CREATED_BY = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.BR_ID,dos);
					
					// String
				
						writeString(this.OC_CODE,dos);
					
					// String
				
						writeString(this.BR_OC_ID,dos);
					
					// String
				
						writeString(this.BR_OC_NAME,dos);
					
					// Integer
				
						writeInteger(this.BR_LEVEL1_ID,dos);
					
					// String
				
						writeString(this.CREATED_BY,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_ID="+String.valueOf(BR_ID));
		sb.append(",OC_CODE="+OC_CODE);
		sb.append(",BR_OC_ID="+BR_OC_ID);
		sb.append(",BR_OC_NAME="+BR_OC_NAME);
		sb.append(",BR_LEVEL1_ID="+String.valueOf(BR_LEVEL1_ID));
		sb.append(",CREATED_BY="+CREATED_BY);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_ID);
            			}
            		
        			sb.append("|");
        		
        				if(OC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(BR_OC_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_OC_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_OC_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_OC_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(BR_LEVEL1_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_LEVEL1_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATED_BY);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Insert_BrandStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Pre_Insert_BrandStruct implements routines.system.IPersistableRow<Pre_Insert_BrandStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public Integer BR_LEVEL1_ID;

				public Integer getBR_LEVEL1_ID () {
					return this.BR_LEVEL1_ID;
				}
				
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				
			    public String BR_QLIK_NAME;

				public String getBR_QLIK_NAME () {
					return this.BR_QLIK_NAME;
				}
				
			    public Integer BR_LEVEL2_ID;

				public Integer getBR_LEVEL2_ID () {
					return this.BR_LEVEL2_ID;
				}
				
			    public String CREATED_BY;

				public String getCREATED_BY () {
					return this.CREATED_BY;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
						this.BR_LEVEL1_ID = readInteger(dis);
					
					this.BR_QLIK_ID = readString(dis);
					
					this.BR_QLIK_NAME = readString(dis);
					
						this.BR_LEVEL2_ID = readInteger(dis);
					
					this.CREATED_BY = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.BR_LEVEL1_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_NAME,dos);
					
					// Integer
				
						writeInteger(this.BR_LEVEL2_ID,dos);
					
					// String
				
						writeString(this.CREATED_BY,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_LEVEL1_ID="+String.valueOf(BR_LEVEL1_ID));
		sb.append(",BR_QLIK_ID="+BR_QLIK_ID);
		sb.append(",BR_QLIK_NAME="+BR_QLIK_NAME);
		sb.append(",BR_LEVEL2_ID="+String.valueOf(BR_LEVEL2_ID));
		sb.append(",CREATED_BY="+CREATED_BY);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_LEVEL1_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_LEVEL1_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(BR_LEVEL2_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_LEVEL2_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATED_BY);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Pre_Insert_BrandStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Insert_Brand_L1Struct implements routines.system.IPersistableRow<Insert_Brand_L1Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public Integer BR_LEVEL1_ID;

				public Integer getBR_LEVEL1_ID () {
					return this.BR_LEVEL1_ID;
				}
				
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				
			    public String BR_QLIK_NAME;

				public String getBR_QLIK_NAME () {
					return this.BR_QLIK_NAME;
				}
				
			    public Integer BR_LEVEL2_ID;

				public Integer getBR_LEVEL2_ID () {
					return this.BR_LEVEL2_ID;
				}
				
			    public String CREATED_BY;

				public String getCREATED_BY () {
					return this.CREATED_BY;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
						this.BR_LEVEL1_ID = readInteger(dis);
					
					this.BR_QLIK_ID = readString(dis);
					
					this.BR_QLIK_NAME = readString(dis);
					
						this.BR_LEVEL2_ID = readInteger(dis);
					
					this.CREATED_BY = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.BR_LEVEL1_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_NAME,dos);
					
					// Integer
				
						writeInteger(this.BR_LEVEL2_ID,dos);
					
					// String
				
						writeString(this.CREATED_BY,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_LEVEL1_ID="+String.valueOf(BR_LEVEL1_ID));
		sb.append(",BR_QLIK_ID="+BR_QLIK_ID);
		sb.append(",BR_QLIK_NAME="+BR_QLIK_NAME);
		sb.append(",BR_LEVEL2_ID="+String.valueOf(BR_LEVEL2_ID));
		sb.append(",CREATED_BY="+CREATED_BY);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_LEVEL1_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_LEVEL1_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(BR_LEVEL2_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_LEVEL2_ID);
            			}
            		
        			sb.append("|");
        		
        				if(CREATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(CREATED_BY);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Insert_Brand_L1Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Select_HiveBrandStruct implements routines.system.IPersistableRow<Select_HiveBrandStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public String cmarq;

				public String getCmarq () {
					return this.cmarq;
				}
				
			    public String lmarq;

				public String getLmarq () {
					return this.lmarq;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.cmarq = readString(dis);
					
					this.lmarq = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.cmarq,dos);
					
					// String
				
						writeString(this.lmarq,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("cmarq="+cmarq);
		sb.append(",lmarq="+lmarq);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(cmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(cmarq);
            			}
            		
        			sb.append("|");
        		
        				if(lmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(lmarq);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_HiveBrandStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tJDBCInput_2Struct implements routines.system.IPersistableRow<after_tJDBCInput_2Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public String cmarq;

				public String getCmarq () {
					return this.cmarq;
				}
				
			    public String lmarq;

				public String getLmarq () {
					return this.lmarq;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.cmarq = readString(dis);
					
					this.lmarq = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.cmarq,dos);
					
					// String
				
						writeString(this.lmarq,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("cmarq="+cmarq);
		sb.append(",lmarq="+lmarq);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(cmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(cmarq);
            			}
            		
        			sb.append("|");
        		
        				if(lmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(lmarq);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tJDBCInput_2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tJDBCInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJDBCInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tMysqlInput_2Process(globalMap);
		tMysqlInput_3Process(globalMap);
		tMysqlInput_8Process(globalMap);

		Select_HiveBrandStruct Select_HiveBrand = new Select_HiveBrandStruct();
Insert_Brand_L1Struct Insert_Brand_L1 = new Insert_Brand_L1Struct();
Pre_Insert_BrandStruct Pre_Insert_Brand = new Pre_Insert_BrandStruct();
Insert_BrandStruct Insert_Brand = new Insert_BrandStruct();







	
	/**
	 * [tMysqlOutput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlOutput_4", false);
		start_Hash.put("tMysqlOutput_4", System.currentTimeMillis());
		
	
	currentComponent="tMysqlOutput_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Insert_Brand");
			
		int tos_count_tMysqlOutput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlOutput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlOutput_4 = new StringBuilder();
                    log4jParamters_tMysqlOutput_4.append("Parameters:");
                            log4jParamters_tMysqlOutput_4.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("TABLE" + " = " + "\"BRAND\"");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("EXTENDINSERT" + " = " + "true");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("NB_ROWS_PER_INSERT" + " = " + "100");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("ON_DUPLICATE_KEY_UPDATE" + " = " + "false");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                            log4jParamters_tMysqlOutput_4.append("UNIFIED_COMPONENTS" + " = " + "tMysqlOutput");
                        log4jParamters_tMysqlOutput_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + (log4jParamters_tMysqlOutput_4) );
                    } 
                } 
            new BytesLimit65535_tMysqlOutput_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlOutput_4", "tMysqlOutput");
				talendJobLogProcess(globalMap);
			}
			






int nb_line_tMysqlOutput_4 = 0;
int nb_line_update_tMysqlOutput_4 = 0;
int nb_line_inserted_tMysqlOutput_4 = 0;
int nb_line_deleted_tMysqlOutput_4 = 0;
int nb_line_rejected_tMysqlOutput_4 = 0;

int deletedCount_tMysqlOutput_4=0;
int updatedCount_tMysqlOutput_4=0;
int insertedCount_tMysqlOutput_4=0;

int rejectedCount_tMysqlOutput_4=0;

String tableName_tMysqlOutput_4 = "BRAND";
boolean whetherReject_tMysqlOutput_4 = false;

java.util.Calendar calendar_tMysqlOutput_4 = java.util.Calendar.getInstance();
calendar_tMysqlOutput_4.set(1, 0, 1, 0, 0, 0);
long year1_tMysqlOutput_4 = calendar_tMysqlOutput_4.getTime().getTime();
calendar_tMysqlOutput_4.set(10000, 0, 1, 0, 0, 0);
long year10000_tMysqlOutput_4 = calendar_tMysqlOutput_4.getTime().getTime();
long date_tMysqlOutput_4;

java.sql.Connection conn_tMysqlOutput_4 = null;
	conn_tMysqlOutput_4 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Uses an existing connection with username '")  + (conn_tMysqlOutput_4.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tMysqlOutput_4.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Connection is set auto commit to '")  + (conn_tMysqlOutput_4.getAutoCommit())  + ("'.") );

int count_tMysqlOutput_4=0;
    	

				String insert_tMysqlOutput_4 = "INSERT INTO `" + "BRAND" + "` (`BR_ID`,`OC_CODE`,`BR_OC_ID`,`BR_OC_NAME`,`BR_LEVEL1_ID`,`CREATED_BY`) VALUES (?,?,?,?,?,?)";
		        int batchSize_tMysqlOutput_4 = 100;
	   			int batchSizeCounter_tMysqlOutput_4=0;
		            
		        java.sql.PreparedStatement pstmt_tMysqlOutput_4 = conn_tMysqlOutput_4.prepareStatement(insert_tMysqlOutput_4);
		        resourceMap.put("pstmt_tMysqlOutput_4", pstmt_tMysqlOutput_4);


 



/**
 * [tMysqlOutput_4 begin ] stop
 */



	
	/**
	 * [tMap_6 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_6", false);
		start_Hash.put("tMap_6", System.currentTimeMillis());
		
	
	currentComponent="tMap_6";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Pre_Insert_Brand");
			
		int tos_count_tMap_6 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_6{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_6 = new StringBuilder();
                    log4jParamters_tMap_6.append("Parameters:");
                            log4jParamters_tMap_6.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_6.append(" | ");
                            log4jParamters_tMap_6.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
                        log4jParamters_tMap_6.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + (log4jParamters_tMap_6) );
                    } 
                } 
            new BytesLimit65535_tMap_6().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_6", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_Pre_Insert_Brand_tMap_6 = 0;
		
		int count_Select_BR_Max_ID_tMap_6 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_Max_IDStruct> tHash_Lookup_Select_BR_Max_ID = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_Max_IDStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_Max_IDStruct>) 
					globalMap.get( "tHash_Lookup_Select_BR_Max_ID" ))
					;					
					
	
		tHash_Lookup_Select_BR_Max_ID.initGet();
	

Select_BR_Max_IDStruct Select_BR_Max_IDHashKey = new Select_BR_Max_IDStruct();
Select_BR_Max_IDStruct Select_BR_Max_IDDefault = new Select_BR_Max_IDStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_6__Struct  {
}
Var__tMap_6__Struct Var__tMap_6 = new Var__tMap_6__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_Insert_Brand_tMap_6 = 0;
				
Insert_BrandStruct Insert_Brand_tmp = new Insert_BrandStruct();
// ###############################

        
        



        









 



/**
 * [tMap_6 begin ] stop
 */



	
	/**
	 * [tMysqlOutput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlOutput_2", false);
		start_Hash.put("tMysqlOutput_2", System.currentTimeMillis());
		
	
	currentComponent="tMysqlOutput_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Insert_Brand_L1");
			
		int tos_count_tMysqlOutput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlOutput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlOutput_2 = new StringBuilder();
                    log4jParamters_tMysqlOutput_2.append("Parameters:");
                            log4jParamters_tMysqlOutput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("DATA_ACTION" + " = " + "INSERT");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("EXTENDINSERT" + " = " + "true");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("NB_ROWS_PER_INSERT" + " = " + "100");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("ON_DUPLICATE_KEY_UPDATE" + " = " + "false");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                            log4jParamters_tMysqlOutput_2.append("UNIFIED_COMPONENTS" + " = " + "tMysqlOutput");
                        log4jParamters_tMysqlOutput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + (log4jParamters_tMysqlOutput_2) );
                    } 
                } 
            new BytesLimit65535_tMysqlOutput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlOutput_2", "tMysqlOutput");
				talendJobLogProcess(globalMap);
			}
			






int nb_line_tMysqlOutput_2 = 0;
int nb_line_update_tMysqlOutput_2 = 0;
int nb_line_inserted_tMysqlOutput_2 = 0;
int nb_line_deleted_tMysqlOutput_2 = 0;
int nb_line_rejected_tMysqlOutput_2 = 0;

int deletedCount_tMysqlOutput_2=0;
int updatedCount_tMysqlOutput_2=0;
int insertedCount_tMysqlOutput_2=0;

int rejectedCount_tMysqlOutput_2=0;

String tableName_tMysqlOutput_2 = "BRAND_LEVEL1";
boolean whetherReject_tMysqlOutput_2 = false;

java.util.Calendar calendar_tMysqlOutput_2 = java.util.Calendar.getInstance();
calendar_tMysqlOutput_2.set(1, 0, 1, 0, 0, 0);
long year1_tMysqlOutput_2 = calendar_tMysqlOutput_2.getTime().getTime();
calendar_tMysqlOutput_2.set(10000, 0, 1, 0, 0, 0);
long year10000_tMysqlOutput_2 = calendar_tMysqlOutput_2.getTime().getTime();
long date_tMysqlOutput_2;

java.sql.Connection conn_tMysqlOutput_2 = null;
	conn_tMysqlOutput_2 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Uses an existing connection with username '")  + (conn_tMysqlOutput_2.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tMysqlOutput_2.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Connection is set auto commit to '")  + (conn_tMysqlOutput_2.getAutoCommit())  + ("'.") );

int count_tMysqlOutput_2=0;
    	

				String insert_tMysqlOutput_2 = "INSERT INTO `" + "BRAND_LEVEL1" + "` (`BR_LEVEL1_ID`,`BR_QLIK_ID`,`BR_QLIK_NAME`,`BR_LEVEL2_ID`,`CREATED_BY`) VALUES (?,?,?,?,?)";
		        int batchSize_tMysqlOutput_2 = 100;
	   			int batchSizeCounter_tMysqlOutput_2=0;
		            
		        java.sql.PreparedStatement pstmt_tMysqlOutput_2 = conn_tMysqlOutput_2.prepareStatement(insert_tMysqlOutput_2);
		        resourceMap.put("pstmt_tMysqlOutput_2", pstmt_tMysqlOutput_2);


 



/**
 * [tMysqlOutput_2 begin ] stop
 */



	
	/**
	 * [tMap_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_2", false);
		start_Hash.put("tMap_2", System.currentTimeMillis());
		
	
	currentComponent="tMap_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_HiveBrand");
			
		int tos_count_tMap_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_2 = new StringBuilder();
                    log4jParamters_tMap_2.append("Parameters:");
                            log4jParamters_tMap_2.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_2.append(" | ");
                            log4jParamters_tMap_2.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
                        log4jParamters_tMap_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + (log4jParamters_tMap_2) );
                    } 
                } 
            new BytesLimit65535_tMap_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_2", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_Select_HiveBrand_tMap_2 = 0;
		
		int count_Select_BR_L1_Max_ID_tMap_2 = 0;
		
		int count_Select_BR_L1_ID_tMap_2 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_Max_IDStruct> tHash_Lookup_Select_BR_L1_Max_ID = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_Max_IDStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_Max_IDStruct>) 
					globalMap.get( "tHash_Lookup_Select_BR_L1_Max_ID" ))
					;					
					
	
		tHash_Lookup_Select_BR_L1_Max_ID.initGet();
	

Select_BR_L1_Max_IDStruct Select_BR_L1_Max_IDHashKey = new Select_BR_L1_Max_IDStruct();
Select_BR_L1_Max_IDStruct Select_BR_L1_Max_IDDefault = new Select_BR_L1_Max_IDStruct();
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_IDStruct> tHash_Lookup_Select_BR_L1_ID = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_IDStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_IDStruct>) 
					globalMap.get( "tHash_Lookup_Select_BR_L1_ID" ))
					;					
					
	

Select_BR_L1_IDStruct Select_BR_L1_IDHashKey = new Select_BR_L1_IDStruct();
Select_BR_L1_IDStruct Select_BR_L1_IDDefault = new Select_BR_L1_IDStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_2__Struct  {
}
Var__tMap_2__Struct Var__tMap_2 = new Var__tMap_2__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_Insert_Brand_L1_tMap_2 = 0;
				
Insert_Brand_L1Struct Insert_Brand_L1_tmp = new Insert_Brand_L1Struct();
// ###############################

        
        



        









 



/**
 * [tMap_2 begin ] stop
 */



	
	/**
	 * [tJDBCInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tJDBCInput_2", false);
		start_Hash.put("tJDBCInput_2", System.currentTimeMillis());
		
	
	currentComponent="tJDBCInput_2";

	
		int tos_count_tJDBCInput_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJDBCInput_2", "tJDBCInput");
				talendJobLogProcess(globalMap);
			}
			


org.talend.components.api.component.ComponentDefinition def_tJDBCInput_2 =
        new org.talend.components.jdbc.tjdbcinput.TJDBCInputDefinition();

org.talend.components.jdbc.tjdbcinput.TJDBCInputProperties props_tJDBCInput_2 =
        (org.talend.components.jdbc.tjdbcinput.TJDBCInputProperties) def_tJDBCInput_2.createRuntimeProperties();
 		                    props_tJDBCInput_2.setValue("sql",
 		                    "\nSELECT \nDISTINCT \ncmarq, \nlmarq \nFROM HDWH.h_article_dwh \nwhere f_current=1 \norder by cmarq \n");
 		                    
 		                    props_tJDBCInput_2.setValue("useCursor",
 		                    false);
 		                    
 		                    props_tJDBCInput_2.setValue("trimStringOrCharColumns",
 		                    false);
 		                    
 		                    props_tJDBCInput_2.setValue("enableDBMapping",
 		                    false);
 		                    
 		                    props_tJDBCInput_2.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tJDBCInput_2.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tJDBCInput_2.referencedComponent.setValue("componentInstanceId",
 		                    "tJDBCConnection_1");
 		                    
 		                    props_tJDBCInput_2.referencedComponent.setValue("referenceDefinitionName",
 		                    "tJDBCConnection");
 		                    
 		                    props_tJDBCInput_2.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tJDBCInput_2_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tJDBCInput_2\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"cmarq\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"cmarq\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"0\",\"di.table.label\":\"cmarq\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"lmarq\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"lmarq\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"0\",\"di.table.label\":\"lmarq\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tJDBCInput_2\",\"di.table.label\":\"tJDBCInput_2\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tJDBCInput_2_1_fisrt sst_tJDBCInput_2_1_fisrt = new SchemaSettingTool_tJDBCInput_2_1_fisrt();
 		                    
 		                    props_tJDBCInput_2.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tJDBCInput_2_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tJDBCInput_2.tableSelection.setValue("tablename",
 		                    "HDWH.h_article_dwh");
 		                    
 		                    java.util.List<Object> tJDBCInput_2_trimTable_trim = new java.util.ArrayList<Object>();
 		                    
 		                                tJDBCInput_2_trimTable_trim.add(false);
 		                                
 		                                tJDBCInput_2_trimTable_trim.add(false);
 		                                
 		                    ((org.talend.daikon.properties.Properties)props_tJDBCInput_2.trimTable).setValue("trim",tJDBCInput_2_trimTable_trim);
 		                    
 		                    java.util.List<Object> tJDBCInput_2_trimTable_columnName = new java.util.ArrayList<Object>();
 		                    
 		                            tJDBCInput_2_trimTable_columnName.add("cmarq");
 		                            
 		                            tJDBCInput_2_trimTable_columnName.add("lmarq");
 		                            
 		                    ((org.talend.daikon.properties.Properties)props_tJDBCInput_2.trimTable).setValue("columnName",tJDBCInput_2_trimTable_columnName);
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tJDBCInput_2.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tJDBCInput_2 = props_tJDBCInput_2.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tJDBCInput_2 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tJDBCInput_2 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tJDBCInput_2 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tJDBCInput_2.referencedComponent.setReference(referencedComponentProperties_tJDBCInput_2);
        }
    }
globalMap.put("tJDBCInput_2_COMPONENT_RUNTIME_PROPERTIES", props_tJDBCInput_2);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "7.3");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.28.2");
java.net.URL mappings_url_tJDBCInput_2= this.getClass().getResource("/xmlMappings");
globalMap.put("tJDBCInput_2_MAPPINGS_URL", mappings_url_tJDBCInput_2);

org.talend.components.api.container.RuntimeContainer container_tJDBCInput_2 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tJDBCInput_2";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tJDBCInput_2 = 0;

org.talend.components.api.component.ConnectorTopology topology_tJDBCInput_2 = null;
topology_tJDBCInput_2 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tJDBCInput_2 = def_tJDBCInput_2.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tJDBCInput_2, topology_tJDBCInput_2);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tJDBCInput_2 = def_tJDBCInput_2.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tJDBCInput_2 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tJDBCInput_2.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tJDBCInput_2 = componentRuntime_tJDBCInput_2.initialize(container_tJDBCInput_2, props_tJDBCInput_2);

if (initVr_tJDBCInput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tJDBCInput_2.getMessage());
}

if(componentRuntime_tJDBCInput_2 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tJDBCInput_2 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tJDBCInput_2;
	compDriverInitialization_tJDBCInput_2.runAtDriver(container_tJDBCInput_2);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tJDBCInput_2 = null;
if(componentRuntime_tJDBCInput_2 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tJDBCInput_2 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tJDBCInput_2;
	org.talend.daikon.properties.ValidationResult vr_tJDBCInput_2 = sourceOrSink_tJDBCInput_2.validate(container_tJDBCInput_2);
	if (vr_tJDBCInput_2.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    	throw new RuntimeException(vr_tJDBCInput_2.getMessage());
	}
}

    org.talend.components.api.component.runtime.Source source_tJDBCInput_2 =
            (org.talend.components.api.component.runtime.Source)sourceOrSink_tJDBCInput_2;
    org.talend.components.api.component.runtime.Reader reader_tJDBCInput_2 =
            source_tJDBCInput_2.createReader(container_tJDBCInput_2);
	reader_tJDBCInput_2 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tJDBCInput_2, container_tJDBCInput_2);

        boolean multi_output_is_allowed_tJDBCInput_2 = false;
        org.talend.components.api.component.Connector c_tJDBCInput_2 = null;
        for (org.talend.components.api.component.Connector currentConnector : props_tJDBCInput_2.getAvailableConnectors(null, true)) {
            if (currentConnector.getName().equals("MAIN")) {
                c_tJDBCInput_2 = currentConnector;
            }

            if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                multi_output_is_allowed_tJDBCInput_2 = true;
            }
        }
        org.apache.avro.Schema schema_tJDBCInput_2 = props_tJDBCInput_2.getSchema(c_tJDBCInput_2, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tJDBCInput_2 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tJDBCInput_2, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tJDBCInput_2 = null;

    // Iterate through the incoming data.
    boolean available_tJDBCInput_2 = reader_tJDBCInput_2.start();

    resourceMap.put("reader_tJDBCInput_2", reader_tJDBCInput_2);

    for (; available_tJDBCInput_2; available_tJDBCInput_2 = reader_tJDBCInput_2.advance()) {
    	nb_line_tJDBCInput_2++;

    	
        if (multi_output_is_allowed_tJDBCInput_2) {
                Select_HiveBrand = null;

        }

        try {
            Object data_tJDBCInput_2 = reader_tJDBCInput_2.getCurrent();

                if(multi_output_is_allowed_tJDBCInput_2) {
                    Select_HiveBrand = new Select_HiveBrandStruct();
                }

        // Construct the factory once when the first data arrives.
        if (factory_tJDBCInput_2 == null) {
            factory_tJDBCInput_2 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tJDBCInput_2.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tJDBCInput_2.setWrapped(factory_tJDBCInput_2.convertToAvro(data_tJDBCInput_2));
                Object columnValue_0_tJDBCInput_2 = outgoingEnforcer_tJDBCInput_2.get(0);
                        Select_HiveBrand.cmarq = (String) (columnValue_0_tJDBCInput_2);
                Object columnValue_1_tJDBCInput_2 = outgoingEnforcer_tJDBCInput_2.get(1);
                        Select_HiveBrand.lmarq = (String) (columnValue_1_tJDBCInput_2);
        } catch (org.talend.components.api.exception.DataRejectException e_tJDBCInput_2) {
        	java.util.Map<String,Object> info_tJDBCInput_2 = e_tJDBCInput_2.getRejectInfo();
            	//TODO use a method instead of getting method by the special key "error/errorMessage"
            	Object errorMessage_tJDBCInput_2 = null;
            	if(info_tJDBCInput_2.containsKey("error")){
            		errorMessage_tJDBCInput_2 = info_tJDBCInput_2.get("error");
        		}else if(info_tJDBCInput_2.containsKey("errorMessage")){
            		errorMessage_tJDBCInput_2 = info_tJDBCInput_2.get("errorMessage");
        		}else{
        			errorMessage_tJDBCInput_2 = "Rejected but error message missing";
        		}
        		errorMessage_tJDBCInput_2 = "Row "+ nb_line_tJDBCInput_2 + ": "+errorMessage_tJDBCInput_2;
    			System.err.println(errorMessage_tJDBCInput_2);
            	// If the record is reject, the main line record should put NULL
            	Select_HiveBrand = null;
    }
                java.lang.Iterable<?> outgoingMainRecordsList_tJDBCInput_2 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tJDBCInput_2 = null;


 



/**
 * [tJDBCInput_2 begin ] stop
 */
	
	/**
	 * [tJDBCInput_2 main ] start
	 */

	

	
	
	currentComponent="tJDBCInput_2";

	


 


	tos_count_tJDBCInput_2++;

/**
 * [tJDBCInput_2 main ] stop
 */
	
	/**
	 * [tJDBCInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJDBCInput_2";

	


 



/**
 * [tJDBCInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tMap_2 main ] start
	 */

	

	
	
	currentComponent="tMap_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_HiveBrand");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_HiveBrand - " + (Select_HiveBrand==null? "": Select_HiveBrand.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_2 = false;
		
        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_2 = false;
		  boolean mainRowRejected_tMap_2 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "Select_BR_L1_Max_ID" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopSelect_BR_L1_Max_ID = false;
       		  	    	
       		  	    	
 							Select_BR_L1_Max_IDStruct Select_BR_L1_Max_IDObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								

								
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Select_BR_L1_Max_ID.lookup( Select_BR_L1_Max_IDHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Select_BR_L1_Max_ID.hasNext()) { // G_TM_M_090

  								
		  				
	  								
						
									
	
		  								forceLoopSelect_BR_L1_Max_ID = true;
	  					
  									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
								
								else { // G 20 - G 21
   									forceLoopSelect_BR_L1_Max_ID = true;
			           		  	} // G 21
                    		  	
                    		

							Select_BR_L1_Max_IDStruct Select_BR_L1_Max_ID = null;
                    		  	 
							

								while ((tHash_Lookup_Select_BR_L1_Max_ID != null && tHash_Lookup_Select_BR_L1_Max_ID.hasNext()) || forceLoopSelect_BR_L1_Max_ID) { // G_TM_M_043

								
									 // CALL close loop of lookup 'Select_BR_L1_Max_ID'
									
                    		  	 
							   
                    		  	 
	       		  	    	Select_BR_L1_Max_IDStruct fromLookup_Select_BR_L1_Max_ID = null;
							Select_BR_L1_Max_ID = Select_BR_L1_Max_IDDefault;
										 
							
								
								if(!forceLoopSelect_BR_L1_Max_ID) { // G 46
								
							
								 
							
								
								fromLookup_Select_BR_L1_Max_ID = tHash_Lookup_Select_BR_L1_Max_ID.next();

							

							if(fromLookup_Select_BR_L1_Max_ID != null) {
								Select_BR_L1_Max_ID = fromLookup_Select_BR_L1_Max_ID;
							}
							
							
							
			  							
								
	                    		  	
		                    
	                    	
	                    		} // G 46
	                    		  	
								forceLoopSelect_BR_L1_Max_ID = false;
									 	
							
	            	
	           	
	            	
	            	
	            

				///////////////////////////////////////////////
				// Starting Lookup Table "Select_BR_L1_ID" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopSelect_BR_L1_ID = false;
       		  	    	
       		  	    	
 							Select_BR_L1_IDStruct Select_BR_L1_IDObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_2) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_2 = false;
								
                        		    		    Select_BR_L1_IDHashKey.BR_QLIK_ID = Select_HiveBrand.cmarq ;
                        		    		

								
		                        	Select_BR_L1_IDHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Select_BR_L1_ID.lookup( Select_BR_L1_IDHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Select_BR_L1_ID.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_2 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_Select_BR_L1_ID != null && tHash_Lookup_Select_BR_L1_ID.getCount(Select_BR_L1_IDHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'Select_BR_L1_ID' and it contains more one result from keys :  Select_BR_L1_ID.BR_QLIK_ID = '" + Select_BR_L1_IDHashKey.BR_QLIK_ID + "'");
								} // G 071
							

							Select_BR_L1_IDStruct Select_BR_L1_ID = null;
                    		  	 
							   
                    		  	 
	       		  	    	Select_BR_L1_IDStruct fromLookup_Select_BR_L1_ID = null;
							Select_BR_L1_ID = Select_BR_L1_IDDefault;
										 
							
								 
							
							
								if (tHash_Lookup_Select_BR_L1_ID !=null && tHash_Lookup_Select_BR_L1_ID.hasNext()) { // G 099
								
							
								
								fromLookup_Select_BR_L1_ID = tHash_Lookup_Select_BR_L1_ID.next();

							
							
								} // G 099
							
							

							if(fromLookup_Select_BR_L1_ID != null) {
								Select_BR_L1_ID = fromLookup_Select_BR_L1_ID;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_2__Struct Var = Var__tMap_2;// ###############################
        // ###############################
        // # Output tables

Insert_Brand_L1 = null;

if(!rejectedInnerJoin_tMap_2 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Insert_Brand_L1'
// # Filter conditions 
if( rejectedInnerJoin_tMap_2 ) {
count_Insert_Brand_L1_tMap_2++;

Insert_Brand_L1_tmp.BR_LEVEL1_ID = Select_BR_L1_Max_ID.BR_L1_MAX_ID +  Numeric.sequence("s_Brand_1",1,1) ;
Insert_Brand_L1_tmp.BR_QLIK_ID = Select_HiveBrand.cmarq ;
Insert_Brand_L1_tmp.BR_QLIK_NAME = Select_HiveBrand.lmarq ;
Insert_Brand_L1_tmp.BR_LEVEL2_ID = 20000000;
Insert_Brand_L1_tmp.CREATED_BY = "TALEND";
Insert_Brand_L1 = Insert_Brand_L1_tmp;
log.debug("tMap_2 - Outputting the record " + count_Insert_Brand_L1_tMap_2 + " of the output table 'Insert_Brand_L1'.");

} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_2 = false;










 


	tos_count_tMap_2++;

/**
 * [tMap_2 main ] stop
 */
	
	/**
	 * [tMap_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_begin ] stop
 */
// Start of branch "Insert_Brand_L1"
if(Insert_Brand_L1 != null) { 



	
	/**
	 * [tMysqlOutput_2 main ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Insert_Brand_L1");
			
    			if(log.isTraceEnabled()){
    				log.trace("Insert_Brand_L1 - " + (Insert_Brand_L1==null? "": Insert_Brand_L1.toLogString()));
    			}
    		



            Pre_Insert_Brand = null;
        whetherReject_tMysqlOutput_2 = false;
                            if(Insert_Brand_L1.BR_LEVEL1_ID == null) {
pstmt_tMysqlOutput_2.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tMysqlOutput_2.setInt(1, Insert_Brand_L1.BR_LEVEL1_ID);
}

                            if(Insert_Brand_L1.BR_QLIK_ID == null) {
pstmt_tMysqlOutput_2.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_2.setString(2, Insert_Brand_L1.BR_QLIK_ID);
}

                            if(Insert_Brand_L1.BR_QLIK_NAME == null) {
pstmt_tMysqlOutput_2.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_2.setString(3, Insert_Brand_L1.BR_QLIK_NAME);
}

                            if(Insert_Brand_L1.BR_LEVEL2_ID == null) {
pstmt_tMysqlOutput_2.setNull(4, java.sql.Types.INTEGER);
} else {pstmt_tMysqlOutput_2.setInt(4, Insert_Brand_L1.BR_LEVEL2_ID);
}

                            if(Insert_Brand_L1.CREATED_BY == null) {
pstmt_tMysqlOutput_2.setNull(5, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_2.setString(5, Insert_Brand_L1.CREATED_BY);
}

                    pstmt_tMysqlOutput_2.addBatch();
                    nb_line_tMysqlOutput_2++;

						
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Adding the record ")  + (nb_line_tMysqlOutput_2)  + (" to the ")  + ("INSERT")  + (" batch.") );
                      batchSizeCounter_tMysqlOutput_2++;
            if(!whetherReject_tMysqlOutput_2) {
                            Pre_Insert_Brand = new Pre_Insert_BrandStruct();
                                Pre_Insert_Brand.BR_LEVEL1_ID = Insert_Brand_L1.BR_LEVEL1_ID;
                                Pre_Insert_Brand.BR_QLIK_ID = Insert_Brand_L1.BR_QLIK_ID;
                                Pre_Insert_Brand.BR_QLIK_NAME = Insert_Brand_L1.BR_QLIK_NAME;
                                Pre_Insert_Brand.BR_LEVEL2_ID = Insert_Brand_L1.BR_LEVEL2_ID;
                                Pre_Insert_Brand.CREATED_BY = Insert_Brand_L1.CREATED_BY;
            }
                if ( batchSize_tMysqlOutput_2 <= batchSizeCounter_tMysqlOutput_2) {
                try {
                        int countSum_tMysqlOutput_2 = 0;
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
                        for(int countEach_tMysqlOutput_2: pstmt_tMysqlOutput_2.executeBatch()) {
                            countSum_tMysqlOutput_2 += (countEach_tMysqlOutput_2 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
                        }
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
                        insertedCount_tMysqlOutput_2 += countSum_tMysqlOutput_2;
                }catch (java.sql.BatchUpdateException e){
                    int countSum_tMysqlOutput_2 = 0;
                    for(int countEach_tMysqlOutput_2: e.getUpdateCounts()) {
                        countSum_tMysqlOutput_2 += (countEach_tMysqlOutput_2 < 0 ? 0 : countEach_tMysqlOutput_2);
                    }
                    insertedCount_tMysqlOutput_2 += countSum_tMysqlOutput_2;
                    System.err.println(e.getMessage());
            log.error("tMysqlOutput_2 - "  + (e.getMessage()) );
                }

                batchSizeCounter_tMysqlOutput_2 = 0;
            }

 


	tos_count_tMysqlOutput_2++;

/**
 * [tMysqlOutput_2 main ] stop
 */
	
	/**
	 * [tMysqlOutput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_2";

	

 



/**
 * [tMysqlOutput_2 process_data_begin ] stop
 */
// Start of branch "Pre_Insert_Brand"
if(Pre_Insert_Brand != null) { 



	
	/**
	 * [tMap_6 main ] start
	 */

	

	
	
	currentComponent="tMap_6";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Pre_Insert_Brand");
			
    			if(log.isTraceEnabled()){
    				log.trace("Pre_Insert_Brand - " + (Pre_Insert_Brand==null? "": Pre_Insert_Brand.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_6 = false;
		
        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_6 = false;
		  boolean mainRowRejected_tMap_6 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "Select_BR_Max_ID" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopSelect_BR_Max_ID = false;
       		  	    	
       		  	    	
 							Select_BR_Max_IDStruct Select_BR_Max_IDObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_6) { // G_TM_M_020

								

								
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Select_BR_Max_ID.lookup( Select_BR_Max_IDHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Select_BR_Max_ID.hasNext()) { // G_TM_M_090

  								
		  				
	  								
						
									
	
		  								forceLoopSelect_BR_Max_ID = true;
	  					
  									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
								
								else { // G 20 - G 21
   									forceLoopSelect_BR_Max_ID = true;
			           		  	} // G 21
                    		  	
                    		

							Select_BR_Max_IDStruct Select_BR_Max_ID = null;
                    		  	 
							

								while ((tHash_Lookup_Select_BR_Max_ID != null && tHash_Lookup_Select_BR_Max_ID.hasNext()) || forceLoopSelect_BR_Max_ID) { // G_TM_M_043

								
									 // CALL close loop of lookup 'Select_BR_Max_ID'
									
                    		  	 
							   
                    		  	 
	       		  	    	Select_BR_Max_IDStruct fromLookup_Select_BR_Max_ID = null;
							Select_BR_Max_ID = Select_BR_Max_IDDefault;
										 
							
								
								if(!forceLoopSelect_BR_Max_ID) { // G 46
								
							
								 
							
								
								fromLookup_Select_BR_Max_ID = tHash_Lookup_Select_BR_Max_ID.next();

							

							if(fromLookup_Select_BR_Max_ID != null) {
								Select_BR_Max_ID = fromLookup_Select_BR_Max_ID;
							}
							
							
							
			  							
								
	                    		  	
		                    
	                    	
	                    		} // G 46
	                    		  	
								forceLoopSelect_BR_Max_ID = false;
									 	
							
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_6__Struct Var = Var__tMap_6;// ###############################
        // ###############################
        // # Output tables

Insert_Brand = null;


// # Output table : 'Insert_Brand'
count_Insert_Brand_tMap_6++;

Insert_Brand_tmp.BR_ID = Select_BR_Max_ID.BR_MAX_ID +  Numeric.sequence("s_Brand_2",1,1) ;
Insert_Brand_tmp.OC_CODE = "004";
Insert_Brand_tmp.BR_OC_ID = Pre_Insert_Brand.BR_QLIK_ID ;
Insert_Brand_tmp.BR_OC_NAME = Pre_Insert_Brand.BR_QLIK_NAME ;
Insert_Brand_tmp.BR_LEVEL1_ID = Pre_Insert_Brand.BR_LEVEL1_ID ;
Insert_Brand_tmp.CREATED_BY = "TALEND";
Insert_Brand = Insert_Brand_tmp;
log.debug("tMap_6 - Outputting the record " + count_Insert_Brand_tMap_6 + " of the output table 'Insert_Brand'.");

// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_6 = false;










 


	tos_count_tMap_6++;

/**
 * [tMap_6 main ] stop
 */
	
	/**
	 * [tMap_6 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_begin ] stop
 */
// Start of branch "Insert_Brand"
if(Insert_Brand != null) { 



	
	/**
	 * [tMysqlOutput_4 main ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Insert_Brand");
			
    			if(log.isTraceEnabled()){
    				log.trace("Insert_Brand - " + (Insert_Brand==null? "": Insert_Brand.toLogString()));
    			}
    		



        whetherReject_tMysqlOutput_4 = false;
                            if(Insert_Brand.BR_ID == null) {
pstmt_tMysqlOutput_4.setNull(1, java.sql.Types.INTEGER);
} else {pstmt_tMysqlOutput_4.setInt(1, Insert_Brand.BR_ID);
}

                            if(Insert_Brand.OC_CODE == null) {
pstmt_tMysqlOutput_4.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_4.setString(2, Insert_Brand.OC_CODE);
}

                            if(Insert_Brand.BR_OC_ID == null) {
pstmt_tMysqlOutput_4.setNull(3, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_4.setString(3, Insert_Brand.BR_OC_ID);
}

                            if(Insert_Brand.BR_OC_NAME == null) {
pstmt_tMysqlOutput_4.setNull(4, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_4.setString(4, Insert_Brand.BR_OC_NAME);
}

                            if(Insert_Brand.BR_LEVEL1_ID == null) {
pstmt_tMysqlOutput_4.setNull(5, java.sql.Types.INTEGER);
} else {pstmt_tMysqlOutput_4.setInt(5, Insert_Brand.BR_LEVEL1_ID);
}

                            if(Insert_Brand.CREATED_BY == null) {
pstmt_tMysqlOutput_4.setNull(6, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_4.setString(6, Insert_Brand.CREATED_BY);
}

                    pstmt_tMysqlOutput_4.addBatch();
                    nb_line_tMysqlOutput_4++;

						
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Adding the record ")  + (nb_line_tMysqlOutput_4)  + (" to the ")  + ("INSERT")  + (" batch.") );
                      batchSizeCounter_tMysqlOutput_4++;
                if ( batchSize_tMysqlOutput_4 <= batchSizeCounter_tMysqlOutput_4) {
                try {
                        int countSum_tMysqlOutput_4 = 0;
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
                        for(int countEach_tMysqlOutput_4: pstmt_tMysqlOutput_4.executeBatch()) {
                            countSum_tMysqlOutput_4 += (countEach_tMysqlOutput_4 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
                        }
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
                        insertedCount_tMysqlOutput_4 += countSum_tMysqlOutput_4;
                }catch (java.sql.BatchUpdateException e){
                    int countSum_tMysqlOutput_4 = 0;
                    for(int countEach_tMysqlOutput_4: e.getUpdateCounts()) {
                        countSum_tMysqlOutput_4 += (countEach_tMysqlOutput_4 < 0 ? 0 : countEach_tMysqlOutput_4);
                    }
                    insertedCount_tMysqlOutput_4 += countSum_tMysqlOutput_4;
                    System.err.println(e.getMessage());
            log.error("tMysqlOutput_4 - "  + (e.getMessage()) );
                }

                batchSizeCounter_tMysqlOutput_4 = 0;
            }

 


	tos_count_tMysqlOutput_4++;

/**
 * [tMysqlOutput_4 main ] stop
 */
	
	/**
	 * [tMysqlOutput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_4";

	

 



/**
 * [tMysqlOutput_4 process_data_begin ] stop
 */
	
	/**
	 * [tMysqlOutput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_4";

	

 



/**
 * [tMysqlOutput_4 process_data_end ] stop
 */

} // End of branch "Insert_Brand"



	
		} // close loop of lookup 'Select_BR_Max_ID' // G_TM_M_043
	
	
	/**
	 * [tMap_6 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 process_data_end ] stop
 */

} // End of branch "Pre_Insert_Brand"




	
	/**
	 * [tMysqlOutput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_2";

	

 



/**
 * [tMysqlOutput_2 process_data_end ] stop
 */

} // End of branch "Insert_Brand_L1"



	
		} // close loop of lookup 'Select_BR_L1_Max_ID' // G_TM_M_043
	
	
	/**
	 * [tMap_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 process_data_end ] stop
 */



	
	/**
	 * [tJDBCInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tJDBCInput_2";

	


 



/**
 * [tJDBCInput_2 process_data_end ] stop
 */
	
	/**
	 * [tJDBCInput_2 end ] start
	 */

	

	
	
	currentComponent="tJDBCInput_2";

	
// end of generic


resourceMap.put("finish_tJDBCInput_2", Boolean.TRUE);

    } // while
    reader_tJDBCInput_2.close();
    final java.util.Map<String, Object> resultMap_tJDBCInput_2 = reader_tJDBCInput_2.getReturnValues();
if(resultMap_tJDBCInput_2!=null) {
	for(java.util.Map.Entry<String,Object> entry_tJDBCInput_2 : resultMap_tJDBCInput_2.entrySet()) {
		switch(entry_tJDBCInput_2.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tJDBCInput_2.setComponentData("tJDBCInput_2", "ERROR_MESSAGE", entry_tJDBCInput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tJDBCInput_2.setComponentData("tJDBCInput_2", "NB_LINE", entry_tJDBCInput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tJDBCInput_2.setComponentData("tJDBCInput_2", "NB_SUCCESS", entry_tJDBCInput_2.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tJDBCInput_2.setComponentData("tJDBCInput_2", "NB_REJECT", entry_tJDBCInput_2.getValue());
			break;
		default :
            StringBuilder studio_key_tJDBCInput_2 = new StringBuilder();
            for (int i_tJDBCInput_2 = 0; i_tJDBCInput_2 < entry_tJDBCInput_2.getKey().length(); i_tJDBCInput_2++) {
                char ch_tJDBCInput_2 = entry_tJDBCInput_2.getKey().charAt(i_tJDBCInput_2);
                if(Character.isUpperCase(ch_tJDBCInput_2) && i_tJDBCInput_2> 0) {
                	studio_key_tJDBCInput_2.append('_');
                }
                studio_key_tJDBCInput_2.append(ch_tJDBCInput_2);
            }
			container_tJDBCInput_2.setComponentData("tJDBCInput_2", studio_key_tJDBCInput_2.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tJDBCInput_2.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tJDBCInput_2", true);
end_Hash.put("tJDBCInput_2", System.currentTimeMillis());




/**
 * [tJDBCInput_2 end ] stop
 */

	
	/**
	 * [tMap_2 end ] start
	 */

	

	
	
	currentComponent="tMap_2";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_Select_BR_L1_Max_ID != null) {
						tHash_Lookup_Select_BR_L1_Max_ID.endGet();
					}
					globalMap.remove( "tHash_Lookup_Select_BR_L1_Max_ID" );

					
					
				
					if(tHash_Lookup_Select_BR_L1_ID != null) {
						tHash_Lookup_Select_BR_L1_ID.endGet();
					}
					globalMap.remove( "tHash_Lookup_Select_BR_L1_ID" );

					
					
				
// ###############################      
				log.debug("tMap_2 - Written records count in the table 'Insert_Brand_L1': " + count_Insert_Brand_L1_tMap_2 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_HiveBrand",2,0,
			 			talendJobLog,"tJDBCInput_2","tJDBCInput","tMap_2","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_2 - "  + ("Done.") );

ok_Hash.put("tMap_2", true);
end_Hash.put("tMap_2", System.currentTimeMillis());




/**
 * [tMap_2 end ] stop
 */

	
	/**
	 * [tMysqlOutput_2 end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_2";

	



                try {
                		if (batchSizeCounter_tMysqlOutput_2 != 0) {
							int countSum_tMysqlOutput_2 = 0;
							
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
							for(int countEach_tMysqlOutput_2: pstmt_tMysqlOutput_2.executeBatch()) {
								countSum_tMysqlOutput_2 += (countEach_tMysqlOutput_2 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
							}
							
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
	            	    	
	            	    		insertedCount_tMysqlOutput_2 += countSum_tMysqlOutput_2;
	            	    	
            	    	}

                }catch (java.sql.BatchUpdateException e){
                	
                	int countSum_tMysqlOutput_2 = 0;
					for(int countEach_tMysqlOutput_2: e.getUpdateCounts()) {
						countSum_tMysqlOutput_2 += (countEach_tMysqlOutput_2 < 0 ? 0 : countEach_tMysqlOutput_2);
					}
					
            	    insertedCount_tMysqlOutput_2 += countSum_tMysqlOutput_2;
	    	    	
            log.error("tMysqlOutput_2 - "  + (e.getMessage()) );
					globalMap.put(currentComponent+"_ERROR_MESSAGE",e.getMessage());
                	System.err.println(e.getMessage());
                	
                }
                batchSizeCounter_tMysqlOutput_2 = 0;
    		
	

        if(pstmt_tMysqlOutput_2 != null) {
			
				pstmt_tMysqlOutput_2.close();
				resourceMap.remove("pstmt_tMysqlOutput_2");
			
        }
    resourceMap.put("statementClosed_tMysqlOutput_2", true);

	nb_line_deleted_tMysqlOutput_2=nb_line_deleted_tMysqlOutput_2+ deletedCount_tMysqlOutput_2;
	nb_line_update_tMysqlOutput_2=nb_line_update_tMysqlOutput_2 + updatedCount_tMysqlOutput_2;
	nb_line_inserted_tMysqlOutput_2=nb_line_inserted_tMysqlOutput_2 + insertedCount_tMysqlOutput_2;
	nb_line_rejected_tMysqlOutput_2=nb_line_rejected_tMysqlOutput_2 + rejectedCount_tMysqlOutput_2;
	
        globalMap.put("tMysqlOutput_2_NB_LINE",nb_line_tMysqlOutput_2);
        globalMap.put("tMysqlOutput_2_NB_LINE_UPDATED",nb_line_update_tMysqlOutput_2);
        globalMap.put("tMysqlOutput_2_NB_LINE_INSERTED",nb_line_inserted_tMysqlOutput_2);
        globalMap.put("tMysqlOutput_2_NB_LINE_DELETED",nb_line_deleted_tMysqlOutput_2);
        globalMap.put("tMysqlOutput_2_NB_LINE_REJECTED", nb_line_rejected_tMysqlOutput_2);
    
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tMysqlOutput_2)  + (" record(s).") );

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Insert_Brand_L1",2,0,
			 			talendJobLog,"tMap_2","tMap","tMysqlOutput_2","tMysqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_2 - "  + ("Done.") );

ok_Hash.put("tMysqlOutput_2", true);
end_Hash.put("tMysqlOutput_2", System.currentTimeMillis());




/**
 * [tMysqlOutput_2 end ] stop
 */

	
	/**
	 * [tMap_6 end ] start
	 */

	

	
	
	currentComponent="tMap_6";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_Select_BR_Max_ID != null) {
						tHash_Lookup_Select_BR_Max_ID.endGet();
					}
					globalMap.remove( "tHash_Lookup_Select_BR_Max_ID" );

					
					
				
// ###############################      
				log.debug("tMap_6 - Written records count in the table 'Insert_Brand': " + count_Insert_Brand_tMap_6 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Pre_Insert_Brand",2,0,
			 			talendJobLog,"tMysqlOutput_2","tMysqlOutput","tMap_6","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_6 - "  + ("Done.") );

ok_Hash.put("tMap_6", true);
end_Hash.put("tMap_6", System.currentTimeMillis());




/**
 * [tMap_6 end ] stop
 */

	
	/**
	 * [tMysqlOutput_4 end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_4";

	



                try {
                		if (batchSizeCounter_tMysqlOutput_4 != 0) {
							int countSum_tMysqlOutput_4 = 0;
							
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Executing the ")  + ("INSERT")  + (" batch.") );
							for(int countEach_tMysqlOutput_4: pstmt_tMysqlOutput_4.executeBatch()) {
								countSum_tMysqlOutput_4 += (countEach_tMysqlOutput_4 == java.sql.Statement.EXECUTE_FAILED ? 0 : 1);
							}
							
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("The ")  + ("INSERT")  + (" batch execution has succeeded.") );
	            	    	
	            	    		insertedCount_tMysqlOutput_4 += countSum_tMysqlOutput_4;
	            	    	
            	    	}

                }catch (java.sql.BatchUpdateException e){
                	
                	int countSum_tMysqlOutput_4 = 0;
					for(int countEach_tMysqlOutput_4: e.getUpdateCounts()) {
						countSum_tMysqlOutput_4 += (countEach_tMysqlOutput_4 < 0 ? 0 : countEach_tMysqlOutput_4);
					}
					
            	    insertedCount_tMysqlOutput_4 += countSum_tMysqlOutput_4;
	    	    	
            log.error("tMysqlOutput_4 - "  + (e.getMessage()) );
					globalMap.put(currentComponent+"_ERROR_MESSAGE",e.getMessage());
                	System.err.println(e.getMessage());
                	
                }
                batchSizeCounter_tMysqlOutput_4 = 0;
    		
	

        if(pstmt_tMysqlOutput_4 != null) {
			
				pstmt_tMysqlOutput_4.close();
				resourceMap.remove("pstmt_tMysqlOutput_4");
			
        }
    resourceMap.put("statementClosed_tMysqlOutput_4", true);

	nb_line_deleted_tMysqlOutput_4=nb_line_deleted_tMysqlOutput_4+ deletedCount_tMysqlOutput_4;
	nb_line_update_tMysqlOutput_4=nb_line_update_tMysqlOutput_4 + updatedCount_tMysqlOutput_4;
	nb_line_inserted_tMysqlOutput_4=nb_line_inserted_tMysqlOutput_4 + insertedCount_tMysqlOutput_4;
	nb_line_rejected_tMysqlOutput_4=nb_line_rejected_tMysqlOutput_4 + rejectedCount_tMysqlOutput_4;
	
        globalMap.put("tMysqlOutput_4_NB_LINE",nb_line_tMysqlOutput_4);
        globalMap.put("tMysqlOutput_4_NB_LINE_UPDATED",nb_line_update_tMysqlOutput_4);
        globalMap.put("tMysqlOutput_4_NB_LINE_INSERTED",nb_line_inserted_tMysqlOutput_4);
        globalMap.put("tMysqlOutput_4_NB_LINE_DELETED",nb_line_deleted_tMysqlOutput_4);
        globalMap.put("tMysqlOutput_4_NB_LINE_REJECTED", nb_line_rejected_tMysqlOutput_4);
    
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Has ")  + ("inserted")  + (" ")  + (nb_line_inserted_tMysqlOutput_4)  + (" record(s).") );

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Insert_Brand",2,0,
			 			talendJobLog,"tMap_6","tMap","tMysqlOutput_4","tMysqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_4 - "  + ("Done.") );

ok_Hash.put("tMysqlOutput_4", true);
end_Hash.put("tMysqlOutput_4", System.currentTimeMillis());




/**
 * [tMysqlOutput_4 end ] stop
 */












				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJDBCInput_2:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk15", 0, "ok");
								} 
							
							tJDBCInput_3Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_6"
					     			globalMap.remove("tHash_Lookup_Select_BR_Max_ID"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_Select_BR_L1_Max_ID"); 
				     			
					     			//free memory for "tMap_2"
					     			globalMap.remove("tHash_Lookup_Select_BR_L1_ID"); 
				     			
				try{
					
	
	/**
	 * [tJDBCInput_2 finally ] start
	 */

	

	
	
	currentComponent="tJDBCInput_2";

	
// finally of generic


if(resourceMap.get("finish_tJDBCInput_2")==null){
    if(resourceMap.get("reader_tJDBCInput_2")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tJDBCInput_2")).close();
		} catch (java.io.IOException e_tJDBCInput_2) {
			String errorMessage_tJDBCInput_2 = "failed to release the resource in tJDBCInput_2 :" + e_tJDBCInput_2.getMessage();
			System.err.println(errorMessage_tJDBCInput_2);
		}
	}
}
 



/**
 * [tJDBCInput_2 finally ] stop
 */

	
	/**
	 * [tMap_2 finally ] start
	 */

	

	
	
	currentComponent="tMap_2";

	

 



/**
 * [tMap_2 finally ] stop
 */

	
	/**
	 * [tMysqlOutput_2 finally ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_2";

	



    if (resourceMap.get("statementClosed_tMysqlOutput_2") == null) {
                java.sql.PreparedStatement pstmtToClose_tMysqlOutput_2 = null;
                if ((pstmtToClose_tMysqlOutput_2 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tMysqlOutput_2")) != null) {
                    pstmtToClose_tMysqlOutput_2.close();
                }
    }
 



/**
 * [tMysqlOutput_2 finally ] stop
 */

	
	/**
	 * [tMap_6 finally ] start
	 */

	

	
	
	currentComponent="tMap_6";

	

 



/**
 * [tMap_6 finally ] stop
 */

	
	/**
	 * [tMysqlOutput_4 finally ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_4";

	



    if (resourceMap.get("statementClosed_tMysqlOutput_4") == null) {
                java.sql.PreparedStatement pstmtToClose_tMysqlOutput_4 = null;
                if ((pstmtToClose_tMysqlOutput_4 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tMysqlOutput_4")) != null) {
                    pstmtToClose_tMysqlOutput_4.close();
                }
    }
 



/**
 * [tMysqlOutput_4 finally ] stop
 */












				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJDBCInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class Update_Brand_L1Struct implements routines.system.IPersistableRow<Update_Brand_L1Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				
			    public String BR_QLIK_NAME;

				public String getBR_QLIK_NAME () {
					return this.BR_QLIK_NAME;
				}
				
			    public String UPDATED_BY;

				public String getUPDATED_BY () {
					return this.UPDATED_BY;
				}
				
			    public java.util.Date UPDATED_DATE;

				public java.util.Date getUPDATED_DATE () {
					return this.UPDATED_DATE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BR_QLIK_ID == null) ? 0 : this.BR_QLIK_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Update_Brand_L1Struct other = (Update_Brand_L1Struct) obj;
		
						if (this.BR_QLIK_ID == null) {
							if (other.BR_QLIK_ID != null)
								return false;
						
						} else if (!this.BR_QLIK_ID.equals(other.BR_QLIK_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(Update_Brand_L1Struct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            other.BR_QLIK_NAME = this.BR_QLIK_NAME;
	            other.UPDATED_BY = this.UPDATED_BY;
	            other.UPDATED_DATE = this.UPDATED_DATE;
	            
	}

	public void copyKeysDataTo(Update_Brand_L1Struct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.BR_QLIK_ID = readString(dis);
					
					this.BR_QLIK_NAME = readString(dis);
					
					this.UPDATED_BY = readString(dis);
					
					this.UPDATED_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_NAME,dos);
					
					// String
				
						writeString(this.UPDATED_BY,dos);
					
					// java.util.Date
				
						writeDate(this.UPDATED_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_QLIK_ID="+BR_QLIK_ID);
		sb.append(",BR_QLIK_NAME="+BR_QLIK_NAME);
		sb.append(",UPDATED_BY="+UPDATED_BY);
		sb.append(",UPDATED_DATE="+String.valueOf(UPDATED_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(UPDATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UPDATED_BY);
            			}
            		
        			sb.append("|");
        		
        				if(UPDATED_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UPDATED_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Update_Brand_L1Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BR_QLIK_ID, other.BR_QLIK_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Update_BrandStruct implements routines.system.IPersistableRow<Update_BrandStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String OC_CODE;

				public String getOC_CODE () {
					return this.OC_CODE;
				}
				
			    public String BR_OC_ID;

				public String getBR_OC_ID () {
					return this.BR_OC_ID;
				}
				
			    public String BR_OC_NAME;

				public String getBR_OC_NAME () {
					return this.BR_OC_NAME;
				}
				
			    public String UPDATED_BY;

				public String getUPDATED_BY () {
					return this.UPDATED_BY;
				}
				
			    public java.util.Date UPDATED_DATE;

				public java.util.Date getUPDATED_DATE () {
					return this.UPDATED_DATE;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.OC_CODE == null) ? 0 : this.OC_CODE.hashCode());
					
						result = prime * result + ((this.BR_OC_ID == null) ? 0 : this.BR_OC_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Update_BrandStruct other = (Update_BrandStruct) obj;
		
						if (this.OC_CODE == null) {
							if (other.OC_CODE != null)
								return false;
						
						} else if (!this.OC_CODE.equals(other.OC_CODE))
						
							return false;
					
						if (this.BR_OC_ID == null) {
							if (other.BR_OC_ID != null)
								return false;
						
						} else if (!this.BR_OC_ID.equals(other.BR_OC_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(Update_BrandStruct other) {

		other.OC_CODE = this.OC_CODE;
	            other.BR_OC_ID = this.BR_OC_ID;
	            other.BR_OC_NAME = this.BR_OC_NAME;
	            other.UPDATED_BY = this.UPDATED_BY;
	            other.UPDATED_DATE = this.UPDATED_DATE;
	            
	}

	public void copyKeysDataTo(Update_BrandStruct other) {

		other.OC_CODE = this.OC_CODE;
	            	other.BR_OC_ID = this.BR_OC_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

	private java.util.Date readDate(ObjectInputStream dis) throws IOException{
		java.util.Date dateReturn = null;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			dateReturn = null;
		} else {
	    	dateReturn = new Date(dis.readLong());
		}
		return dateReturn;
	}

    private void writeDate(java.util.Date date1, ObjectOutputStream dos) throws IOException{
		if(date1 == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeLong(date1.getTime());
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.OC_CODE = readString(dis);
					
					this.BR_OC_ID = readString(dis);
					
					this.BR_OC_NAME = readString(dis);
					
					this.UPDATED_BY = readString(dis);
					
					this.UPDATED_DATE = readDate(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.OC_CODE,dos);
					
					// String
				
						writeString(this.BR_OC_ID,dos);
					
					// String
				
						writeString(this.BR_OC_NAME,dos);
					
					// String
				
						writeString(this.UPDATED_BY,dos);
					
					// java.util.Date
				
						writeDate(this.UPDATED_DATE,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("OC_CODE="+OC_CODE);
		sb.append(",BR_OC_ID="+BR_OC_ID);
		sb.append(",BR_OC_NAME="+BR_OC_NAME);
		sb.append(",UPDATED_BY="+UPDATED_BY);
		sb.append(",UPDATED_DATE="+String.valueOf(UPDATED_DATE));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(OC_CODE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(OC_CODE);
            			}
            		
        			sb.append("|");
        		
        				if(BR_OC_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_OC_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_OC_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_OC_NAME);
            			}
            		
        			sb.append("|");
        		
        				if(UPDATED_BY == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UPDATED_BY);
            			}
            		
        			sb.append("|");
        		
        				if(UPDATED_DATE == null){
        					sb.append("<null>");
        				}else{
            				sb.append(UPDATED_DATE);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Update_BrandStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.OC_CODE, other.OC_CODE);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.BR_OC_ID, other.BR_OC_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class UpdateStruct implements routines.system.IPersistableRow<UpdateStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				
			    public String BR_QLIK_NAME;

				public String getBR_QLIK_NAME () {
					return this.BR_QLIK_NAME;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.BR_QLIK_ID = readString(dis);
					
					this.BR_QLIK_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_QLIK_ID="+BR_QLIK_ID);
		sb.append(",BR_QLIK_NAME="+BR_QLIK_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(UpdateStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class Select_HiveBrand_2Struct implements routines.system.IPersistableRow<Select_HiveBrand_2Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public String cmarq;

				public String getCmarq () {
					return this.cmarq;
				}
				
			    public String lmarq;

				public String getLmarq () {
					return this.lmarq;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.cmarq = readString(dis);
					
					this.lmarq = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.cmarq,dos);
					
					// String
				
						writeString(this.lmarq,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("cmarq="+cmarq);
		sb.append(",lmarq="+lmarq);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(cmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(cmarq);
            			}
            		
        			sb.append("|");
        		
        				if(lmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(lmarq);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_HiveBrand_2Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}

public static class after_tJDBCInput_3Struct implements routines.system.IPersistableRow<after_tJDBCInput_3Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public String cmarq;

				public String getCmarq () {
					return this.cmarq;
				}
				
			    public String lmarq;

				public String getLmarq () {
					return this.lmarq;
				}
				



	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.cmarq = readString(dis);
					
					this.lmarq = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.cmarq,dos);
					
					// String
				
						writeString(this.lmarq,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("cmarq="+cmarq);
		sb.append(",lmarq="+lmarq);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(cmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(cmarq);
            			}
            		
        			sb.append("|");
        		
        				if(lmarq == null){
        					sb.append("<null>");
        				}else{
            				sb.append(lmarq);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(after_tJDBCInput_3Struct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tJDBCInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tJDBCInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;


		tMysqlInput_5Process(globalMap);
		tMysqlInput_4Process(globalMap);

		Select_HiveBrand_2Struct Select_HiveBrand_2 = new Select_HiveBrand_2Struct();
UpdateStruct Update = new UpdateStruct();
Update_Brand_L1Struct Update_Brand_L1 = new Update_Brand_L1Struct();
Update_BrandStruct Update_Brand = new Update_BrandStruct();






	
	/**
	 * [tMysqlOutput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlOutput_3", false);
		start_Hash.put("tMysqlOutput_3", System.currentTimeMillis());
		
	
	currentComponent="tMysqlOutput_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Update_Brand_L1");
			
		int tos_count_tMysqlOutput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlOutput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlOutput_3 = new StringBuilder();
                    log4jParamters_tMysqlOutput_3.append("Parameters:");
                            log4jParamters_tMysqlOutput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("DATA_ACTION" + " = " + "UPDATE");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("USE_BATCH_SIZE" + " = " + "true");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("BATCH_SIZE" + " = " + "10000");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                            log4jParamters_tMysqlOutput_3.append("UNIFIED_COMPONENTS" + " = " + "tMysqlOutput");
                        log4jParamters_tMysqlOutput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + (log4jParamters_tMysqlOutput_3) );
                    } 
                } 
            new BytesLimit65535_tMysqlOutput_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlOutput_3", "tMysqlOutput");
				talendJobLogProcess(globalMap);
			}
			





        int updateKeyCount_tMysqlOutput_3 = 1;
        if(updateKeyCount_tMysqlOutput_3 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        }

int nb_line_tMysqlOutput_3 = 0;
int nb_line_update_tMysqlOutput_3 = 0;
int nb_line_inserted_tMysqlOutput_3 = 0;
int nb_line_deleted_tMysqlOutput_3 = 0;
int nb_line_rejected_tMysqlOutput_3 = 0;

int deletedCount_tMysqlOutput_3=0;
int updatedCount_tMysqlOutput_3=0;
int insertedCount_tMysqlOutput_3=0;

int rejectedCount_tMysqlOutput_3=0;

String tableName_tMysqlOutput_3 = "BRAND_LEVEL1";
boolean whetherReject_tMysqlOutput_3 = false;

java.util.Calendar calendar_tMysqlOutput_3 = java.util.Calendar.getInstance();
calendar_tMysqlOutput_3.set(1, 0, 1, 0, 0, 0);
long year1_tMysqlOutput_3 = calendar_tMysqlOutput_3.getTime().getTime();
calendar_tMysqlOutput_3.set(10000, 0, 1, 0, 0, 0);
long year10000_tMysqlOutput_3 = calendar_tMysqlOutput_3.getTime().getTime();
long date_tMysqlOutput_3;

java.sql.Connection conn_tMysqlOutput_3 = null;
	conn_tMysqlOutput_3 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Uses an existing connection with username '")  + (conn_tMysqlOutput_3.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tMysqlOutput_3.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Connection is set auto commit to '")  + (conn_tMysqlOutput_3.getAutoCommit())  + ("'.") );
   int batchSize_tMysqlOutput_3 = 10000;
   int batchSizeCounter_tMysqlOutput_3=0;

int count_tMysqlOutput_3=0;
    	
	    String update_tMysqlOutput_3 = "UPDATE `" + "BRAND_LEVEL1" + "` SET `BR_QLIK_NAME` = ?,`UPDATED_BY` = ?,`UPDATED_DATE` = ? WHERE `BR_QLIK_ID` = ?";
	    
	    java.sql.PreparedStatement pstmt_tMysqlOutput_3 = conn_tMysqlOutput_3.prepareStatement(update_tMysqlOutput_3);
	    resourceMap.put("pstmt_tMysqlOutput_3", pstmt_tMysqlOutput_3);
	    

 



/**
 * [tMysqlOutput_3 begin ] stop
 */




	
	/**
	 * [tMysqlOutput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlOutput_5", false);
		start_Hash.put("tMysqlOutput_5", System.currentTimeMillis());
		
	
	currentComponent="tMysqlOutput_5";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Update_Brand");
			
		int tos_count_tMysqlOutput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlOutput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlOutput_5 = new StringBuilder();
                    log4jParamters_tMysqlOutput_5.append("Parameters:");
                            log4jParamters_tMysqlOutput_5.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("TABLE" + " = " + "\"BRAND\"");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("TABLE_ACTION" + " = " + "NONE");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("DATA_ACTION" + " = " + "UPDATE");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("DIE_ON_ERROR" + " = " + "false");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("USE_BATCH_SIZE" + " = " + "true");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("BATCH_SIZE" + " = " + "10000");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("ADD_COLS" + " = " + "[]");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("USE_FIELD_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("USE_HINT_OPTIONS" + " = " + "false");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("ENABLE_DEBUG_MODE" + " = " + "false");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("SUPPORT_NULL_WHERE" + " = " + "false");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                            log4jParamters_tMysqlOutput_5.append("UNIFIED_COMPONENTS" + " = " + "tMysqlOutput");
                        log4jParamters_tMysqlOutput_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + (log4jParamters_tMysqlOutput_5) );
                    } 
                } 
            new BytesLimit65535_tMysqlOutput_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlOutput_5", "tMysqlOutput");
				talendJobLogProcess(globalMap);
			}
			





        int updateKeyCount_tMysqlOutput_5 = 2;
        if(updateKeyCount_tMysqlOutput_5 < 1) {
            throw new RuntimeException("For update, Schema must have a key");
        }

int nb_line_tMysqlOutput_5 = 0;
int nb_line_update_tMysqlOutput_5 = 0;
int nb_line_inserted_tMysqlOutput_5 = 0;
int nb_line_deleted_tMysqlOutput_5 = 0;
int nb_line_rejected_tMysqlOutput_5 = 0;

int deletedCount_tMysqlOutput_5=0;
int updatedCount_tMysqlOutput_5=0;
int insertedCount_tMysqlOutput_5=0;

int rejectedCount_tMysqlOutput_5=0;

String tableName_tMysqlOutput_5 = "BRAND";
boolean whetherReject_tMysqlOutput_5 = false;

java.util.Calendar calendar_tMysqlOutput_5 = java.util.Calendar.getInstance();
calendar_tMysqlOutput_5.set(1, 0, 1, 0, 0, 0);
long year1_tMysqlOutput_5 = calendar_tMysqlOutput_5.getTime().getTime();
calendar_tMysqlOutput_5.set(10000, 0, 1, 0, 0, 0);
long year10000_tMysqlOutput_5 = calendar_tMysqlOutput_5.getTime().getTime();
long date_tMysqlOutput_5;

java.sql.Connection conn_tMysqlOutput_5 = null;
	conn_tMysqlOutput_5 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Uses an existing connection with username '")  + (conn_tMysqlOutput_5.getMetaData().getUserName())  + ("'. Connection URL: ")  + (conn_tMysqlOutput_5.getMetaData().getURL())  + (".") );
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Connection is set auto commit to '")  + (conn_tMysqlOutput_5.getAutoCommit())  + ("'.") );
   int batchSize_tMysqlOutput_5 = 10000;
   int batchSizeCounter_tMysqlOutput_5=0;

int count_tMysqlOutput_5=0;
    	
	    String update_tMysqlOutput_5 = "UPDATE `" + "BRAND" + "` SET `BR_OC_NAME` = ?,`UPDATED_BY` = ?,`UPDATED_DATE` = ? WHERE `OC_CODE` = ? AND `BR_OC_ID` = ?";
	    
	    java.sql.PreparedStatement pstmt_tMysqlOutput_5 = conn_tMysqlOutput_5.prepareStatement(update_tMysqlOutput_5);
	    resourceMap.put("pstmt_tMysqlOutput_5", pstmt_tMysqlOutput_5);
	    

 



/**
 * [tMysqlOutput_5 begin ] stop
 */



	
	/**
	 * [tMap_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_4", false);
		start_Hash.put("tMap_4", System.currentTimeMillis());
		
	
	currentComponent="tMap_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Update");
			
		int tos_count_tMap_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_4 = new StringBuilder();
                    log4jParamters_tMap_4.append("Parameters:");
                            log4jParamters_tMap_4.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_4.append(" | ");
                            log4jParamters_tMap_4.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
                        log4jParamters_tMap_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + (log4jParamters_tMap_4) );
                    } 
                } 
            new BytesLimit65535_tMap_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_4", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_Update_tMap_4 = 0;
		
		int count_Select_Brand_tMap_4 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BrandStruct> tHash_Lookup_Select_Brand = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BrandStruct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BrandStruct>) 
					globalMap.get( "tHash_Lookup_Select_Brand" ))
					;					
					
	

Select_BrandStruct Select_BrandHashKey = new Select_BrandStruct();
Select_BrandStruct Select_BrandDefault = new Select_BrandStruct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_4__Struct  {
}
Var__tMap_4__Struct Var__tMap_4 = new Var__tMap_4__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_Update_Brand_L1_tMap_4 = 0;
				
Update_Brand_L1Struct Update_Brand_L1_tmp = new Update_Brand_L1Struct();
				int count_Update_Brand_tMap_4 = 0;
				
Update_BrandStruct Update_Brand_tmp = new Update_BrandStruct();
// ###############################

        
        



        









 



/**
 * [tMap_4 begin ] stop
 */



	
	/**
	 * [tMap_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMap_3", false);
		start_Hash.put("tMap_3", System.currentTimeMillis());
		
	
	currentComponent="tMap_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_HiveBrand_2");
			
		int tos_count_tMap_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMap_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMap_3 = new StringBuilder();
                    log4jParamters_tMap_3.append("Parameters:");
                            log4jParamters_tMap_3.append("LINK_STYLE" + " = " + "AUTO");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("TEMPORARY_DATA_DIRECTORY" + " = " + "");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("ROWS_BUFFER_SIZE" + " = " + "2000000");
                        log4jParamters_tMap_3.append(" | ");
                            log4jParamters_tMap_3.append("CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL" + " = " + "false");
                        log4jParamters_tMap_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + (log4jParamters_tMap_3) );
                    } 
                } 
            new BytesLimit65535_tMap_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMap_3", "tMap");
				talendJobLogProcess(globalMap);
			}
			




// ###############################
// # Lookup's keys initialization
		int count_Select_HiveBrand_2_tMap_3 = 0;
		
		int count_Select_BR_ID_2_tMap_3 = 0;
		
	
		org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_ID_2Struct> tHash_Lookup_Select_BR_ID_2 = (org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_ID_2Struct>) 
				((org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_ID_2Struct>) 
					globalMap.get( "tHash_Lookup_Select_BR_ID_2" ))
					;					
					
	

Select_BR_ID_2Struct Select_BR_ID_2HashKey = new Select_BR_ID_2Struct();
Select_BR_ID_2Struct Select_BR_ID_2Default = new Select_BR_ID_2Struct();
// ###############################        

// ###############################
// # Vars initialization
class  Var__tMap_3__Struct  {
}
Var__tMap_3__Struct Var__tMap_3 = new Var__tMap_3__Struct();
// ###############################

// ###############################
// # Outputs initialization
				int count_Update_tMap_3 = 0;
				
UpdateStruct Update_tmp = new UpdateStruct();
// ###############################

        
        



        









 



/**
 * [tMap_3 begin ] stop
 */



	
	/**
	 * [tJDBCInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tJDBCInput_3", false);
		start_Hash.put("tJDBCInput_3", System.currentTimeMillis());
		
	
	currentComponent="tJDBCInput_3";

	
		int tos_count_tJDBCInput_3 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tJDBCInput_3", "tJDBCInput");
				talendJobLogProcess(globalMap);
			}
			


org.talend.components.api.component.ComponentDefinition def_tJDBCInput_3 =
        new org.talend.components.jdbc.tjdbcinput.TJDBCInputDefinition();

org.talend.components.jdbc.tjdbcinput.TJDBCInputProperties props_tJDBCInput_3 =
        (org.talend.components.jdbc.tjdbcinput.TJDBCInputProperties) def_tJDBCInput_3.createRuntimeProperties();
 		                    props_tJDBCInput_3.setValue("sql",
 		                    "\nSELECT \nDISTINCT \ncmarq, \nlmarq \nFROM HDWH.h_article_dwh \nwhere f_current=1 \norder by cmarq \n");
 		                    
 		                    props_tJDBCInput_3.setValue("useCursor",
 		                    false);
 		                    
 		                    props_tJDBCInput_3.setValue("trimStringOrCharColumns",
 		                    false);
 		                    
 		                    props_tJDBCInput_3.setValue("enableDBMapping",
 		                    false);
 		                    
 		                    props_tJDBCInput_3.setValue("usePreparedStatement",
 		                    false);
 		                    
 		                    props_tJDBCInput_3.referencedComponent.setValue("referenceType",
 		                        org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE);
 		                    
 		                    props_tJDBCInput_3.referencedComponent.setValue("componentInstanceId",
 		                    "tJDBCConnection_1");
 		                    
 		                    props_tJDBCInput_3.referencedComponent.setValue("referenceDefinitionName",
 		                    "tJDBCConnection");
 		                    
 		                    props_tJDBCInput_3.connection.userPassword.setValue("useAuth",
 		                    false);
 		                    
 		                    class SchemaSettingTool_tJDBCInput_3_1_fisrt {
 		                    		
 		                    		String getSchemaValue() {
 		                    				
 		                    						StringBuilder s = new StringBuilder();
                    						
     		                    						a("{\"type\":\"record\",",s);
     		                    						
     		                    						a("\"name\":\"tJDBCInput_3\",\"fields\":[{",s);
     		                    						
     		                    						a("\"name\":\"cmarq\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"cmarq\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"0\",\"di.table.label\":\"cmarq\",\"di.column.relatedEntity\":\"\"},{",s);
     		                    						
     		                    						a("\"name\":\"lmarq\",\"type\":[\"string\",\"null\"],\"di.table.comment\":\"\",\"talend.field.dbType\":\"\",\"talend.field.dbColumnName\":\"lmarq\",\"di.column.talendType\":\"id_String\",\"di.column.isNullable\":\"true\",\"talend.field.pattern\":\"\",\"di.column.relationshipType\":\"\",\"di.column.originalLength\":\"0\",\"di.table.label\":\"lmarq\",\"di.column.relatedEntity\":\"\"}],\"di.table.name\":\"tJDBCInput_3\",\"di.table.label\":\"tJDBCInput_3\"}",s);
     		                    						
     		                    				return s.toString();
     		                    		
 		                    		}
 		                    		
 		                    		void a(String part, StringBuilder strB) {
 		                    				strB.append(part);
 		                    		}
 		                    		
 		                    }
 		                    
 		                    SchemaSettingTool_tJDBCInput_3_1_fisrt sst_tJDBCInput_3_1_fisrt = new SchemaSettingTool_tJDBCInput_3_1_fisrt();
 		                    
 		                    props_tJDBCInput_3.main.setValue("schema",
 		                        new org.apache.avro.Schema.Parser().parse(sst_tJDBCInput_3_1_fisrt.getSchemaValue()));
 		                    
 		                    props_tJDBCInput_3.tableSelection.setValue("tablename",
 		                    "HDWH.h_article_dwh");
 		                    
 		                    java.util.List<Object> tJDBCInput_3_trimTable_trim = new java.util.ArrayList<Object>();
 		                    
 		                                tJDBCInput_3_trimTable_trim.add(false);
 		                                
 		                                tJDBCInput_3_trimTable_trim.add(false);
 		                                
 		                    ((org.talend.daikon.properties.Properties)props_tJDBCInput_3.trimTable).setValue("trim",tJDBCInput_3_trimTable_trim);
 		                    
 		                    java.util.List<Object> tJDBCInput_3_trimTable_columnName = new java.util.ArrayList<Object>();
 		                    
 		                            tJDBCInput_3_trimTable_columnName.add("cmarq");
 		                            
 		                            tJDBCInput_3_trimTable_columnName.add("lmarq");
 		                            
 		                    ((org.talend.daikon.properties.Properties)props_tJDBCInput_3.trimTable).setValue("columnName",tJDBCInput_3_trimTable_columnName);
 		                    
    if (org.talend.components.api.properties.ComponentReferenceProperties.ReferenceType.COMPONENT_INSTANCE == props_tJDBCInput_3.referencedComponent.referenceType.getValue()) {
        final String referencedComponentInstanceId_tJDBCInput_3 = props_tJDBCInput_3.referencedComponent.componentInstanceId.getStringValue();
        if (referencedComponentInstanceId_tJDBCInput_3 != null) {
            org.talend.daikon.properties.Properties referencedComponentProperties_tJDBCInput_3 = (org.talend.daikon.properties.Properties) globalMap.get(
                referencedComponentInstanceId_tJDBCInput_3 + "_COMPONENT_RUNTIME_PROPERTIES");
            props_tJDBCInput_3.referencedComponent.setReference(referencedComponentProperties_tJDBCInput_3);
        }
    }
globalMap.put("tJDBCInput_3_COMPONENT_RUNTIME_PROPERTIES", props_tJDBCInput_3);
globalMap.putIfAbsent("TALEND_PRODUCT_VERSION", "7.3");
globalMap.put("TALEND_COMPONENTS_VERSION", "0.28.2");
java.net.URL mappings_url_tJDBCInput_3= this.getClass().getResource("/xmlMappings");
globalMap.put("tJDBCInput_3_MAPPINGS_URL", mappings_url_tJDBCInput_3);

org.talend.components.api.container.RuntimeContainer container_tJDBCInput_3 = new org.talend.components.api.container.RuntimeContainer() {
    public Object getComponentData(String componentId, String key) {
        return globalMap.get(componentId + "_" + key);
    }

    public void setComponentData(String componentId, String key, Object data) {
        globalMap.put(componentId + "_" + key, data);
    }

    public String getCurrentComponentId() {
        return "tJDBCInput_3";
    }

    public Object getGlobalData(String key) {
    	return globalMap.get(key);
    }
};

int nb_line_tJDBCInput_3 = 0;

org.talend.components.api.component.ConnectorTopology topology_tJDBCInput_3 = null;
topology_tJDBCInput_3 = org.talend.components.api.component.ConnectorTopology.OUTGOING;

org.talend.daikon.runtime.RuntimeInfo runtime_info_tJDBCInput_3 = def_tJDBCInput_3.getRuntimeInfo(
    org.talend.components.api.component.runtime.ExecutionEngine.DI, props_tJDBCInput_3, topology_tJDBCInput_3);
java.util.Set<org.talend.components.api.component.ConnectorTopology> supported_connector_topologies_tJDBCInput_3 = def_tJDBCInput_3.getSupportedConnectorTopologies();

org.talend.components.api.component.runtime.RuntimableRuntime componentRuntime_tJDBCInput_3 = (org.talend.components.api.component.runtime.RuntimableRuntime)(Class.forName(runtime_info_tJDBCInput_3.getRuntimeClassName()).newInstance());
org.talend.daikon.properties.ValidationResult initVr_tJDBCInput_3 = componentRuntime_tJDBCInput_3.initialize(container_tJDBCInput_3, props_tJDBCInput_3);

if (initVr_tJDBCInput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    throw new RuntimeException(initVr_tJDBCInput_3.getMessage());
}

if(componentRuntime_tJDBCInput_3 instanceof org.talend.components.api.component.runtime.ComponentDriverInitialization) {
	org.talend.components.api.component.runtime.ComponentDriverInitialization compDriverInitialization_tJDBCInput_3 = (org.talend.components.api.component.runtime.ComponentDriverInitialization)componentRuntime_tJDBCInput_3;
	compDriverInitialization_tJDBCInput_3.runAtDriver(container_tJDBCInput_3);
}

org.talend.components.api.component.runtime.SourceOrSink sourceOrSink_tJDBCInput_3 = null;
if(componentRuntime_tJDBCInput_3 instanceof org.talend.components.api.component.runtime.SourceOrSink) {
	sourceOrSink_tJDBCInput_3 = (org.talend.components.api.component.runtime.SourceOrSink)componentRuntime_tJDBCInput_3;
	org.talend.daikon.properties.ValidationResult vr_tJDBCInput_3 = sourceOrSink_tJDBCInput_3.validate(container_tJDBCInput_3);
	if (vr_tJDBCInput_3.getStatus() == org.talend.daikon.properties.ValidationResult.Result.ERROR ) {
    	throw new RuntimeException(vr_tJDBCInput_3.getMessage());
	}
}

    org.talend.components.api.component.runtime.Source source_tJDBCInput_3 =
            (org.talend.components.api.component.runtime.Source)sourceOrSink_tJDBCInput_3;
    org.talend.components.api.component.runtime.Reader reader_tJDBCInput_3 =
            source_tJDBCInput_3.createReader(container_tJDBCInput_3);
	reader_tJDBCInput_3 = new org.talend.codegen.flowvariables.runtime.FlowVariablesReader(reader_tJDBCInput_3, container_tJDBCInput_3);

        boolean multi_output_is_allowed_tJDBCInput_3 = false;
        org.talend.components.api.component.Connector c_tJDBCInput_3 = null;
        for (org.talend.components.api.component.Connector currentConnector : props_tJDBCInput_3.getAvailableConnectors(null, true)) {
            if (currentConnector.getName().equals("MAIN")) {
                c_tJDBCInput_3 = currentConnector;
            }

            if (currentConnector.getName().equals("REJECT")) {//it's better to move the code to javajet
                multi_output_is_allowed_tJDBCInput_3 = true;
            }
        }
        org.apache.avro.Schema schema_tJDBCInput_3 = props_tJDBCInput_3.getSchema(c_tJDBCInput_3, true);

        org.talend.codegen.enforcer.OutgoingSchemaEnforcer outgoingEnforcer_tJDBCInput_3 = org.talend.codegen.enforcer.EnforcerCreator.createOutgoingEnforcer(schema_tJDBCInput_3, false);

        // Create a reusable factory that converts the output of the reader to an IndexedRecord.
        org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord> factory_tJDBCInput_3 = null;

    // Iterate through the incoming data.
    boolean available_tJDBCInput_3 = reader_tJDBCInput_3.start();

    resourceMap.put("reader_tJDBCInput_3", reader_tJDBCInput_3);

    for (; available_tJDBCInput_3; available_tJDBCInput_3 = reader_tJDBCInput_3.advance()) {
    	nb_line_tJDBCInput_3++;

    	
        if (multi_output_is_allowed_tJDBCInput_3) {
                Select_HiveBrand_2 = null;

        }

        try {
            Object data_tJDBCInput_3 = reader_tJDBCInput_3.getCurrent();

                if(multi_output_is_allowed_tJDBCInput_3) {
                    Select_HiveBrand_2 = new Select_HiveBrand_2Struct();
                }

        // Construct the factory once when the first data arrives.
        if (factory_tJDBCInput_3 == null) {
            factory_tJDBCInput_3 = (org.talend.daikon.avro.converter.IndexedRecordConverter<Object, ? extends org.apache.avro.generic.IndexedRecord>)
                    new org.talend.daikon.avro.AvroRegistry()
                            .createIndexedRecordConverter(data_tJDBCInput_3.getClass());
        }

        // Enforce the outgoing schema on the input.
        outgoingEnforcer_tJDBCInput_3.setWrapped(factory_tJDBCInput_3.convertToAvro(data_tJDBCInput_3));
                Object columnValue_0_tJDBCInput_3 = outgoingEnforcer_tJDBCInput_3.get(0);
                        Select_HiveBrand_2.cmarq = (String) (columnValue_0_tJDBCInput_3);
                Object columnValue_1_tJDBCInput_3 = outgoingEnforcer_tJDBCInput_3.get(1);
                        Select_HiveBrand_2.lmarq = (String) (columnValue_1_tJDBCInput_3);
        } catch (org.talend.components.api.exception.DataRejectException e_tJDBCInput_3) {
        	java.util.Map<String,Object> info_tJDBCInput_3 = e_tJDBCInput_3.getRejectInfo();
            	//TODO use a method instead of getting method by the special key "error/errorMessage"
            	Object errorMessage_tJDBCInput_3 = null;
            	if(info_tJDBCInput_3.containsKey("error")){
            		errorMessage_tJDBCInput_3 = info_tJDBCInput_3.get("error");
        		}else if(info_tJDBCInput_3.containsKey("errorMessage")){
            		errorMessage_tJDBCInput_3 = info_tJDBCInput_3.get("errorMessage");
        		}else{
        			errorMessage_tJDBCInput_3 = "Rejected but error message missing";
        		}
        		errorMessage_tJDBCInput_3 = "Row "+ nb_line_tJDBCInput_3 + ": "+errorMessage_tJDBCInput_3;
    			System.err.println(errorMessage_tJDBCInput_3);
            	// If the record is reject, the main line record should put NULL
            	Select_HiveBrand_2 = null;
    }
                java.lang.Iterable<?> outgoingMainRecordsList_tJDBCInput_3 = new java.util.ArrayList<Object>();
                java.util.Iterator outgoingMainRecordsIt_tJDBCInput_3 = null;


 



/**
 * [tJDBCInput_3 begin ] stop
 */
	
	/**
	 * [tJDBCInput_3 main ] start
	 */

	

	
	
	currentComponent="tJDBCInput_3";

	


 


	tos_count_tJDBCInput_3++;

/**
 * [tJDBCInput_3 main ] stop
 */
	
	/**
	 * [tJDBCInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tJDBCInput_3";

	


 



/**
 * [tJDBCInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tMap_3 main ] start
	 */

	

	
	
	currentComponent="tMap_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_HiveBrand_2");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_HiveBrand_2 - " + (Select_HiveBrand_2==null? "": Select_HiveBrand_2.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_3 = false;
		
        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_3 = false;
		  boolean mainRowRejected_tMap_3 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "Select_BR_ID_2" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopSelect_BR_ID_2 = false;
       		  	    	
       		  	    	
 							Select_BR_ID_2Struct Select_BR_ID_2ObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_3) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_3 = false;
								
                        		    		    Select_BR_ID_2HashKey.BR_QLIK_ID = Select_HiveBrand_2.cmarq ;
                        		    		

								
		                        	Select_BR_ID_2HashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Select_BR_ID_2.lookup( Select_BR_ID_2HashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Select_BR_ID_2.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_3 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_Select_BR_ID_2 != null && tHash_Lookup_Select_BR_ID_2.getCount(Select_BR_ID_2HashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'Select_BR_ID_2' and it contains more one result from keys :  Select_BR_ID_2.BR_QLIK_ID = '" + Select_BR_ID_2HashKey.BR_QLIK_ID + "'");
								} // G 071
							

							Select_BR_ID_2Struct Select_BR_ID_2 = null;
                    		  	 
							   
                    		  	 
	       		  	    	Select_BR_ID_2Struct fromLookup_Select_BR_ID_2 = null;
							Select_BR_ID_2 = Select_BR_ID_2Default;
										 
							
								 
							
							
								if (tHash_Lookup_Select_BR_ID_2 !=null && tHash_Lookup_Select_BR_ID_2.hasNext()) { // G 099
								
							
								
								fromLookup_Select_BR_ID_2 = tHash_Lookup_Select_BR_ID_2.next();

							
							
								} // G 099
							
							

							if(fromLookup_Select_BR_ID_2 != null) {
								Select_BR_ID_2 = fromLookup_Select_BR_ID_2;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_3__Struct Var = Var__tMap_3;// ###############################
        // ###############################
        // # Output tables

Update = null;

if(!rejectedInnerJoin_tMap_3 ) {

// # Output table : 'Update'
count_Update_tMap_3++;

Update_tmp.BR_QLIK_ID = Select_HiveBrand_2.cmarq ;
Update_tmp.BR_QLIK_NAME = Select_HiveBrand_2.lmarq ;
Update = Update_tmp;
log.debug("tMap_3 - Outputting the record " + count_Update_tMap_3 + " of the output table 'Update'.");

}  // closing inner join bracket (2)
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_3 = false;










 


	tos_count_tMap_3++;

/**
 * [tMap_3 main ] stop
 */
	
	/**
	 * [tMap_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_begin ] stop
 */
// Start of branch "Update"
if(Update != null) { 



	
	/**
	 * [tMap_4 main ] start
	 */

	

	
	
	currentComponent="tMap_4";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Update");
			
    			if(log.isTraceEnabled()){
    				log.trace("Update - " + (Update==null? "": Update.toLogString()));
    			}
    		

		
		
		boolean hasCasePrimitiveKeyWithNull_tMap_4 = false;
		
        // ###############################
        // # Input tables (lookups)
		  boolean rejectedInnerJoin_tMap_4 = false;
		  boolean mainRowRejected_tMap_4 = false;
            				    								  
		

				///////////////////////////////////////////////
				// Starting Lookup Table "Select_Brand" 
				///////////////////////////////////////////////


				
				
                            
 					    boolean forceLoopSelect_Brand = false;
       		  	    	
       		  	    	
 							Select_BrandStruct Select_BrandObjectFromLookup = null;
                          
		           		  	if(!rejectedInnerJoin_tMap_4) { // G_TM_M_020

								
								hasCasePrimitiveKeyWithNull_tMap_4 = false;
								
                        		    		    Select_BrandHashKey.BR_QLIK_ID = Update.BR_QLIK_ID ;
                        		    		
                        		    		    Select_BrandHashKey.BR_QLIK_NAME = Update.BR_QLIK_NAME ;
                        		    		

								
		                        	Select_BrandHashKey.hashCodeDirty = true;
                        		
	  					
	  							
			  					
			  					
	  					
		  							tHash_Lookup_Select_Brand.lookup( Select_BrandHashKey );

	  							

	  							

 								
								  
								  if(!tHash_Lookup_Select_Brand.hasNext()) { // G_TM_M_090

  								
		  				
	  								
			  							rejectedInnerJoin_tMap_4 = true;
	  								
						
									
  									  		
 								
								  
								  } // G_TM_M_090

  								



							} // G_TM_M_020
			           		  	  
							
				           		if(tHash_Lookup_Select_Brand != null && tHash_Lookup_Select_Brand.getCount(Select_BrandHashKey) > 1) { // G 071
			  							
			  						
									 		
									//System.out.println("WARNING: UNIQUE MATCH is configured for the lookup 'Select_Brand' and it contains more one result from keys :  Select_Brand.BR_QLIK_ID = '" + Select_BrandHashKey.BR_QLIK_ID + "', Select_Brand.BR_QLIK_NAME = '" + Select_BrandHashKey.BR_QLIK_NAME + "'");
								} // G 071
							

							Select_BrandStruct Select_Brand = null;
                    		  	 
							   
                    		  	 
	       		  	    	Select_BrandStruct fromLookup_Select_Brand = null;
							Select_Brand = Select_BrandDefault;
										 
							
								 
							
							
								if (tHash_Lookup_Select_Brand !=null && tHash_Lookup_Select_Brand.hasNext()) { // G 099
								
							
								
								fromLookup_Select_Brand = tHash_Lookup_Select_Brand.next();

							
							
								} // G 099
							
							

							if(fromLookup_Select_Brand != null) {
								Select_Brand = fromLookup_Select_Brand;
							}
							
							
							
			  							
								
	                    		  	
		                    
	            	
	            	
	            // ###############################
        { // start of Var scope
        
	        // ###############################
        	// # Vars tables
        
Var__tMap_4__Struct Var = Var__tMap_4;// ###############################
        // ###############################
        // # Output tables

Update_Brand_L1 = null;
Update_Brand = null;

if(!rejectedInnerJoin_tMap_4 ) {
} // closing inner join bracket (1)
// ###### START REJECTS ##### 

// # Output reject table : 'Update_Brand_L1'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
count_Update_Brand_L1_tMap_4++;

Update_Brand_L1_tmp.BR_QLIK_ID = Update.BR_QLIK_ID ;
Update_Brand_L1_tmp.BR_QLIK_NAME = Update.BR_QLIK_NAME ;
Update_Brand_L1_tmp.UPDATED_BY = "TALEND";
Update_Brand_L1_tmp.UPDATED_DATE = TalendDate.getCurrentDate() ;
Update_Brand_L1 = Update_Brand_L1_tmp;
log.debug("tMap_4 - Outputting the record " + count_Update_Brand_L1_tMap_4 + " of the output table 'Update_Brand_L1'.");

} // closing filter/reject

// # Output reject table : 'Update_Brand'
// # Filter conditions 
if( rejectedInnerJoin_tMap_4 ) {
count_Update_Brand_tMap_4++;

Update_Brand_tmp.OC_CODE = "004";
Update_Brand_tmp.BR_OC_ID = Update.BR_QLIK_ID ;
Update_Brand_tmp.BR_OC_NAME = Update.BR_QLIK_NAME ;
Update_Brand_tmp.UPDATED_BY = "TALEND";
Update_Brand_tmp.UPDATED_DATE = TalendDate.getCurrentDate() ;
Update_Brand = Update_Brand_tmp;
log.debug("tMap_4 - Outputting the record " + count_Update_Brand_tMap_4 + " of the output table 'Update_Brand'.");

} // closing filter/reject
// ###############################

} // end of Var scope

rejectedInnerJoin_tMap_4 = false;










 


	tos_count_tMap_4++;

/**
 * [tMap_4 main ] stop
 */
	
	/**
	 * [tMap_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_begin ] stop
 */
// Start of branch "Update_Brand_L1"
if(Update_Brand_L1 != null) { 



	
	/**
	 * [tMysqlOutput_3 main ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_3";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Update_Brand_L1");
			
    			if(log.isTraceEnabled()){
    				log.trace("Update_Brand_L1 - " + (Update_Brand_L1==null? "": Update_Brand_L1.toLogString()));
    			}
    		



        whetherReject_tMysqlOutput_3 = false;
                    if(Update_Brand_L1.BR_QLIK_NAME == null) {
pstmt_tMysqlOutput_3.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_3.setString(1, Update_Brand_L1.BR_QLIK_NAME);
}

                    if(Update_Brand_L1.UPDATED_BY == null) {
pstmt_tMysqlOutput_3.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_3.setString(2, Update_Brand_L1.UPDATED_BY);
}

                    if(Update_Brand_L1.UPDATED_DATE != null) {
date_tMysqlOutput_3 = Update_Brand_L1.UPDATED_DATE.getTime();
if(date_tMysqlOutput_3 < year1_tMysqlOutput_3 || date_tMysqlOutput_3 >= year10000_tMysqlOutput_3) {
pstmt_tMysqlOutput_3.setString(3, "0000-00-00 00:00:00");
} else {pstmt_tMysqlOutput_3.setTimestamp(3, new java.sql.Timestamp(date_tMysqlOutput_3));
}
} else {
pstmt_tMysqlOutput_3.setNull(3, java.sql.Types.DATE);
}


                    if(Update_Brand_L1.BR_QLIK_ID == null) {
pstmt_tMysqlOutput_3.setNull(4 + count_tMysqlOutput_3, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_3.setString(4 + count_tMysqlOutput_3, Update_Brand_L1.BR_QLIK_ID);
}


            pstmt_tMysqlOutput_3.addBatch();
            nb_line_tMysqlOutput_3++;
				
				
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Adding the record ")  + (nb_line_tMysqlOutput_3)  + (" to the ")  + ("UPDATE")  + (" batch.") );
              batchSizeCounter_tMysqlOutput_3++;
                if ( batchSize_tMysqlOutput_3 <= batchSizeCounter_tMysqlOutput_3) {
                try {
                        int countSum_tMysqlOutput_3 = 0;
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Executing the ")  + ("UPDATE")  + (" batch.") );
                        for(int countEach_tMysqlOutput_3: pstmt_tMysqlOutput_3.executeBatch()) {
                            countSum_tMysqlOutput_3 += (countEach_tMysqlOutput_3 < 0 ? 0 : countEach_tMysqlOutput_3);
                        }
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("The ")  + ("UPDATE")  + (" batch execution has succeeded.") );
                        updatedCount_tMysqlOutput_3 += countSum_tMysqlOutput_3;
                        batchSizeCounter_tMysqlOutput_3 = 0;
                }catch (java.sql.BatchUpdateException e){
                    int countSum_tMysqlOutput_3 = 0;
                    for(int countEach_tMysqlOutput_3: e.getUpdateCounts()) {
                        countSum_tMysqlOutput_3 += (countEach_tMysqlOutput_3 < 0 ? 0 : countEach_tMysqlOutput_3);
                    }
                    updatedCount_tMysqlOutput_3 += countSum_tMysqlOutput_3;
                    System.err.println(e.getMessage());
            log.error("tMysqlOutput_3 - "  + (e.getMessage()) );
                }



                }

 


	tos_count_tMysqlOutput_3++;

/**
 * [tMysqlOutput_3 main ] stop
 */
	
	/**
	 * [tMysqlOutput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_3";

	

 



/**
 * [tMysqlOutput_3 process_data_begin ] stop
 */
	
	/**
	 * [tMysqlOutput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_3";

	

 



/**
 * [tMysqlOutput_3 process_data_end ] stop
 */

} // End of branch "Update_Brand_L1"




// Start of branch "Update_Brand"
if(Update_Brand != null) { 



	
	/**
	 * [tMysqlOutput_5 main ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_5";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Update_Brand");
			
    			if(log.isTraceEnabled()){
    				log.trace("Update_Brand - " + (Update_Brand==null? "": Update_Brand.toLogString()));
    			}
    		



        whetherReject_tMysqlOutput_5 = false;
                    if(Update_Brand.BR_OC_NAME == null) {
pstmt_tMysqlOutput_5.setNull(1, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_5.setString(1, Update_Brand.BR_OC_NAME);
}

                    if(Update_Brand.UPDATED_BY == null) {
pstmt_tMysqlOutput_5.setNull(2, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_5.setString(2, Update_Brand.UPDATED_BY);
}

                    if(Update_Brand.UPDATED_DATE != null) {
date_tMysqlOutput_5 = Update_Brand.UPDATED_DATE.getTime();
if(date_tMysqlOutput_5 < year1_tMysqlOutput_5 || date_tMysqlOutput_5 >= year10000_tMysqlOutput_5) {
pstmt_tMysqlOutput_5.setString(3, "0000-00-00 00:00:00");
} else {pstmt_tMysqlOutput_5.setTimestamp(3, new java.sql.Timestamp(date_tMysqlOutput_5));
}
} else {
pstmt_tMysqlOutput_5.setNull(3, java.sql.Types.DATE);
}


                    if(Update_Brand.OC_CODE == null) {
pstmt_tMysqlOutput_5.setNull(4 + count_tMysqlOutput_5, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_5.setString(4 + count_tMysqlOutput_5, Update_Brand.OC_CODE);
}


                    if(Update_Brand.BR_OC_ID == null) {
pstmt_tMysqlOutput_5.setNull(5 + count_tMysqlOutput_5, java.sql.Types.VARCHAR);
} else {pstmt_tMysqlOutput_5.setString(5 + count_tMysqlOutput_5, Update_Brand.BR_OC_ID);
}


            pstmt_tMysqlOutput_5.addBatch();
            nb_line_tMysqlOutput_5++;
				
				
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Adding the record ")  + (nb_line_tMysqlOutput_5)  + (" to the ")  + ("UPDATE")  + (" batch.") );
              batchSizeCounter_tMysqlOutput_5++;
                if ( batchSize_tMysqlOutput_5 <= batchSizeCounter_tMysqlOutput_5) {
                try {
                        int countSum_tMysqlOutput_5 = 0;
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Executing the ")  + ("UPDATE")  + (" batch.") );
                        for(int countEach_tMysqlOutput_5: pstmt_tMysqlOutput_5.executeBatch()) {
                            countSum_tMysqlOutput_5 += (countEach_tMysqlOutput_5 < 0 ? 0 : countEach_tMysqlOutput_5);
                        }
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("The ")  + ("UPDATE")  + (" batch execution has succeeded.") );
                        updatedCount_tMysqlOutput_5 += countSum_tMysqlOutput_5;
                        batchSizeCounter_tMysqlOutput_5 = 0;
                }catch (java.sql.BatchUpdateException e){
                    int countSum_tMysqlOutput_5 = 0;
                    for(int countEach_tMysqlOutput_5: e.getUpdateCounts()) {
                        countSum_tMysqlOutput_5 += (countEach_tMysqlOutput_5 < 0 ? 0 : countEach_tMysqlOutput_5);
                    }
                    updatedCount_tMysqlOutput_5 += countSum_tMysqlOutput_5;
                    System.err.println(e.getMessage());
            log.error("tMysqlOutput_5 - "  + (e.getMessage()) );
                }



                }

 


	tos_count_tMysqlOutput_5++;

/**
 * [tMysqlOutput_5 main ] stop
 */
	
	/**
	 * [tMysqlOutput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_5";

	

 



/**
 * [tMysqlOutput_5 process_data_begin ] stop
 */
	
	/**
	 * [tMysqlOutput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_5";

	

 



/**
 * [tMysqlOutput_5 process_data_end ] stop
 */

} // End of branch "Update_Brand"




	
	/**
	 * [tMap_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 process_data_end ] stop
 */

} // End of branch "Update"




	
	/**
	 * [tMap_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 process_data_end ] stop
 */



	
	/**
	 * [tJDBCInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tJDBCInput_3";

	


 



/**
 * [tJDBCInput_3 process_data_end ] stop
 */
	
	/**
	 * [tJDBCInput_3 end ] start
	 */

	

	
	
	currentComponent="tJDBCInput_3";

	
// end of generic


resourceMap.put("finish_tJDBCInput_3", Boolean.TRUE);

    } // while
    reader_tJDBCInput_3.close();
    final java.util.Map<String, Object> resultMap_tJDBCInput_3 = reader_tJDBCInput_3.getReturnValues();
if(resultMap_tJDBCInput_3!=null) {
	for(java.util.Map.Entry<String,Object> entry_tJDBCInput_3 : resultMap_tJDBCInput_3.entrySet()) {
		switch(entry_tJDBCInput_3.getKey()) {
		case org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE :
			container_tJDBCInput_3.setComponentData("tJDBCInput_3", "ERROR_MESSAGE", entry_tJDBCInput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_TOTAL_RECORD_COUNT :
			container_tJDBCInput_3.setComponentData("tJDBCInput_3", "NB_LINE", entry_tJDBCInput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_SUCCESS_RECORD_COUNT :
			container_tJDBCInput_3.setComponentData("tJDBCInput_3", "NB_SUCCESS", entry_tJDBCInput_3.getValue());
			break;
		case org.talend.components.api.component.ComponentDefinition.RETURN_REJECT_RECORD_COUNT :
			container_tJDBCInput_3.setComponentData("tJDBCInput_3", "NB_REJECT", entry_tJDBCInput_3.getValue());
			break;
		default :
            StringBuilder studio_key_tJDBCInput_3 = new StringBuilder();
            for (int i_tJDBCInput_3 = 0; i_tJDBCInput_3 < entry_tJDBCInput_3.getKey().length(); i_tJDBCInput_3++) {
                char ch_tJDBCInput_3 = entry_tJDBCInput_3.getKey().charAt(i_tJDBCInput_3);
                if(Character.isUpperCase(ch_tJDBCInput_3) && i_tJDBCInput_3> 0) {
                	studio_key_tJDBCInput_3.append('_');
                }
                studio_key_tJDBCInput_3.append(ch_tJDBCInput_3);
            }
			container_tJDBCInput_3.setComponentData("tJDBCInput_3", studio_key_tJDBCInput_3.toString().toUpperCase(java.util.Locale.ENGLISH), entry_tJDBCInput_3.getValue());
			break;
		}
	}
}

 

ok_Hash.put("tJDBCInput_3", true);
end_Hash.put("tJDBCInput_3", System.currentTimeMillis());




/**
 * [tJDBCInput_3 end ] stop
 */

	
	/**
	 * [tMap_3 end ] start
	 */

	

	
	
	currentComponent="tMap_3";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_Select_BR_ID_2 != null) {
						tHash_Lookup_Select_BR_ID_2.endGet();
					}
					globalMap.remove( "tHash_Lookup_Select_BR_ID_2" );

					
					
				
// ###############################      
				log.debug("tMap_3 - Written records count in the table 'Update': " + count_Update_tMap_3 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_HiveBrand_2",2,0,
			 			talendJobLog,"tJDBCInput_3","tJDBCInput","tMap_3","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_3 - "  + ("Done.") );

ok_Hash.put("tMap_3", true);
end_Hash.put("tMap_3", System.currentTimeMillis());




/**
 * [tMap_3 end ] stop
 */

	
	/**
	 * [tMap_4 end ] start
	 */

	

	
	
	currentComponent="tMap_4";

	


// ###############################
// # Lookup hashes releasing
					if(tHash_Lookup_Select_Brand != null) {
						tHash_Lookup_Select_Brand.endGet();
					}
					globalMap.remove( "tHash_Lookup_Select_Brand" );

					
					
				
// ###############################      
				log.debug("tMap_4 - Written records count in the table 'Update_Brand_L1': " + count_Update_Brand_L1_tMap_4 + ".");
				log.debug("tMap_4 - Written records count in the table 'Update_Brand': " + count_Update_Brand_tMap_4 + ".");





			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Update",2,0,
			 			talendJobLog,"tMap_3","tMap","tMap_4","tMap","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMap_4 - "  + ("Done.") );

ok_Hash.put("tMap_4", true);
end_Hash.put("tMap_4", System.currentTimeMillis());




/**
 * [tMap_4 end ] stop
 */

	
	/**
	 * [tMysqlOutput_3 end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_3";

	



	
    try {
    	if(pstmt_tMysqlOutput_3 != null){
			int countSum_tMysqlOutput_3 = 0;
			
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Executing the ")  + ("UPDATE")  + (" batch.") );
			for(int countEach_tMysqlOutput_3: pstmt_tMysqlOutput_3.executeBatch()) {
				countSum_tMysqlOutput_3 += (countEach_tMysqlOutput_3 < 0 ? 0 : countEach_tMysqlOutput_3);
			}
			
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("The ")  + ("UPDATE")  + (" batch execution has succeeded.") );
	    	
	    		updatedCount_tMysqlOutput_3 += countSum_tMysqlOutput_3;
	    	
	    }
    }catch (java.sql.BatchUpdateException e){
    	
    	int countSum_tMysqlOutput_3 = 0;
		for(int countEach_tMysqlOutput_3: e.getUpdateCounts()) {
			countSum_tMysqlOutput_3 += (countEach_tMysqlOutput_3 < 0 ? 0 : countEach_tMysqlOutput_3);
		}
		
    	updatedCount_tMysqlOutput_3 += countSum_tMysqlOutput_3;
    	
            log.error("tMysqlOutput_3 - "  + (e.getMessage()) );
    	System.err.println(e.getMessage());
    	
	}

        if(pstmt_tMysqlOutput_3 != null) {
			
				pstmt_tMysqlOutput_3.close();
				resourceMap.remove("pstmt_tMysqlOutput_3");
			
        }
    resourceMap.put("statementClosed_tMysqlOutput_3", true);

	nb_line_deleted_tMysqlOutput_3=nb_line_deleted_tMysqlOutput_3+ deletedCount_tMysqlOutput_3;
	nb_line_update_tMysqlOutput_3=nb_line_update_tMysqlOutput_3 + updatedCount_tMysqlOutput_3;
	nb_line_inserted_tMysqlOutput_3=nb_line_inserted_tMysqlOutput_3 + insertedCount_tMysqlOutput_3;
	nb_line_rejected_tMysqlOutput_3=nb_line_rejected_tMysqlOutput_3 + rejectedCount_tMysqlOutput_3;
	
        globalMap.put("tMysqlOutput_3_NB_LINE",nb_line_tMysqlOutput_3);
        globalMap.put("tMysqlOutput_3_NB_LINE_UPDATED",nb_line_update_tMysqlOutput_3);
        globalMap.put("tMysqlOutput_3_NB_LINE_INSERTED",nb_line_inserted_tMysqlOutput_3);
        globalMap.put("tMysqlOutput_3_NB_LINE_DELETED",nb_line_deleted_tMysqlOutput_3);
        globalMap.put("tMysqlOutput_3_NB_LINE_REJECTED", nb_line_rejected_tMysqlOutput_3);
    
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Has ")  + ("updated")  + (" ")  + (nb_line_update_tMysqlOutput_3)  + (" record(s).") );

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Update_Brand_L1",2,0,
			 			talendJobLog,"tMap_4","tMap","tMysqlOutput_3","tMysqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_3 - "  + ("Done.") );

ok_Hash.put("tMysqlOutput_3", true);
end_Hash.put("tMysqlOutput_3", System.currentTimeMillis());




/**
 * [tMysqlOutput_3 end ] stop
 */




	
	/**
	 * [tMysqlOutput_5 end ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_5";

	



	
    try {
    	if(pstmt_tMysqlOutput_5 != null){
			int countSum_tMysqlOutput_5 = 0;
			
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Executing the ")  + ("UPDATE")  + (" batch.") );
			for(int countEach_tMysqlOutput_5: pstmt_tMysqlOutput_5.executeBatch()) {
				countSum_tMysqlOutput_5 += (countEach_tMysqlOutput_5 < 0 ? 0 : countEach_tMysqlOutput_5);
			}
			
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("The ")  + ("UPDATE")  + (" batch execution has succeeded.") );
	    	
	    		updatedCount_tMysqlOutput_5 += countSum_tMysqlOutput_5;
	    	
	    }
    }catch (java.sql.BatchUpdateException e){
    	
    	int countSum_tMysqlOutput_5 = 0;
		for(int countEach_tMysqlOutput_5: e.getUpdateCounts()) {
			countSum_tMysqlOutput_5 += (countEach_tMysqlOutput_5 < 0 ? 0 : countEach_tMysqlOutput_5);
		}
		
    	updatedCount_tMysqlOutput_5 += countSum_tMysqlOutput_5;
    	
            log.error("tMysqlOutput_5 - "  + (e.getMessage()) );
    	System.err.println(e.getMessage());
    	
	}

        if(pstmt_tMysqlOutput_5 != null) {
			
				pstmt_tMysqlOutput_5.close();
				resourceMap.remove("pstmt_tMysqlOutput_5");
			
        }
    resourceMap.put("statementClosed_tMysqlOutput_5", true);

	nb_line_deleted_tMysqlOutput_5=nb_line_deleted_tMysqlOutput_5+ deletedCount_tMysqlOutput_5;
	nb_line_update_tMysqlOutput_5=nb_line_update_tMysqlOutput_5 + updatedCount_tMysqlOutput_5;
	nb_line_inserted_tMysqlOutput_5=nb_line_inserted_tMysqlOutput_5 + insertedCount_tMysqlOutput_5;
	nb_line_rejected_tMysqlOutput_5=nb_line_rejected_tMysqlOutput_5 + rejectedCount_tMysqlOutput_5;
	
        globalMap.put("tMysqlOutput_5_NB_LINE",nb_line_tMysqlOutput_5);
        globalMap.put("tMysqlOutput_5_NB_LINE_UPDATED",nb_line_update_tMysqlOutput_5);
        globalMap.put("tMysqlOutput_5_NB_LINE_INSERTED",nb_line_inserted_tMysqlOutput_5);
        globalMap.put("tMysqlOutput_5_NB_LINE_DELETED",nb_line_deleted_tMysqlOutput_5);
        globalMap.put("tMysqlOutput_5_NB_LINE_REJECTED", nb_line_rejected_tMysqlOutput_5);
    
	
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Has ")  + ("updated")  + (" ")  + (nb_line_update_tMysqlOutput_5)  + (" record(s).") );

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Update_Brand",2,0,
			 			talendJobLog,"tMap_4","tMap","tMysqlOutput_5","tMysqlOutput","output")) {
						talendJobLogProcess(globalMap);
					}
				
 
                if(log.isDebugEnabled())
            log.debug("tMysqlOutput_5 - "  + ("Done.") );

ok_Hash.put("tMysqlOutput_5", true);
end_Hash.put("tMysqlOutput_5", System.currentTimeMillis());




/**
 * [tMysqlOutput_5 end ] stop
 */









				}//end the resume

				
				    			if(resumeEntryMethodName == null || globalResumeTicket){
				    				resumeUtil.addLog("CHECKPOINT", "CONNECTION:SUBJOB_OK:tJDBCInput_3:OnSubjobOk", "", Thread.currentThread().getId() + "", "", "", "", "", "");
								}	    				    			
					    	
								if(execStat){    	
									runStat.updateStatOnConnection("OnSubjobOk14", 0, "ok");
								} 
							
							tMysqlCommit_3Process(globalMap); 
						



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
					     			//free memory for "tMap_4"
					     			globalMap.remove("tHash_Lookup_Select_Brand"); 
				     			
					     			//free memory for "tMap_3"
					     			globalMap.remove("tHash_Lookup_Select_BR_ID_2"); 
				     			
				try{
					
	
	/**
	 * [tJDBCInput_3 finally ] start
	 */

	

	
	
	currentComponent="tJDBCInput_3";

	
// finally of generic


if(resourceMap.get("finish_tJDBCInput_3")==null){
    if(resourceMap.get("reader_tJDBCInput_3")!=null){
		try {
			((org.talend.components.api.component.runtime.Reader)resourceMap.get("reader_tJDBCInput_3")).close();
		} catch (java.io.IOException e_tJDBCInput_3) {
			String errorMessage_tJDBCInput_3 = "failed to release the resource in tJDBCInput_3 :" + e_tJDBCInput_3.getMessage();
			System.err.println(errorMessage_tJDBCInput_3);
		}
	}
}
 



/**
 * [tJDBCInput_3 finally ] stop
 */

	
	/**
	 * [tMap_3 finally ] start
	 */

	

	
	
	currentComponent="tMap_3";

	

 



/**
 * [tMap_3 finally ] stop
 */

	
	/**
	 * [tMap_4 finally ] start
	 */

	

	
	
	currentComponent="tMap_4";

	

 



/**
 * [tMap_4 finally ] stop
 */

	
	/**
	 * [tMysqlOutput_3 finally ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_3";

	



    if (resourceMap.get("statementClosed_tMysqlOutput_3") == null) {
                java.sql.PreparedStatement pstmtToClose_tMysqlOutput_3 = null;
                if ((pstmtToClose_tMysqlOutput_3 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tMysqlOutput_3")) != null) {
                    pstmtToClose_tMysqlOutput_3.close();
                }
    }
 



/**
 * [tMysqlOutput_3 finally ] stop
 */




	
	/**
	 * [tMysqlOutput_5 finally ] start
	 */

	

	
	
	currentComponent="tMysqlOutput_5";

	



    if (resourceMap.get("statementClosed_tMysqlOutput_5") == null) {
                java.sql.PreparedStatement pstmtToClose_tMysqlOutput_5 = null;
                if ((pstmtToClose_tMysqlOutput_5 = (java.sql.PreparedStatement) resourceMap.remove("pstmt_tMysqlOutput_5")) != null) {
                    pstmtToClose_tMysqlOutput_5.close();
                }
    }
 



/**
 * [tMysqlOutput_5 finally ] stop
 */









				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tJDBCInput_3_SUBPROCESS_STATE", 1);
	}
	

public void tMysqlCommit_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlCommit_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [tMysqlCommit_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlCommit_3", false);
		start_Hash.put("tMysqlCommit_3", System.currentTimeMillis());
		
	
	currentComponent="tMysqlCommit_3";

	
		int tos_count_tMysqlCommit_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlCommit_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlCommit_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlCommit_3 = new StringBuilder();
                    log4jParamters_tMysqlCommit_3.append("Parameters:");
                            log4jParamters_tMysqlCommit_3.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlCommit_3.append(" | ");
                            log4jParamters_tMysqlCommit_3.append("CLOSE" + " = " + "true");
                        log4jParamters_tMysqlCommit_3.append(" | ");
                            log4jParamters_tMysqlCommit_3.append("UNIFIED_COMPONENTS" + " = " + "tMysqlCommit");
                        log4jParamters_tMysqlCommit_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlCommit_3 - "  + (log4jParamters_tMysqlCommit_3) );
                    } 
                } 
            new BytesLimit65535_tMysqlCommit_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlCommit_3", "tMysqlCommit");
				talendJobLogProcess(globalMap);
			}
			

 



/**
 * [tMysqlCommit_3 begin ] stop
 */
	
	/**
	 * [tMysqlCommit_3 main ] start
	 */

	

	
	
	currentComponent="tMysqlCommit_3";

	

	java.sql.Connection conn_tMysqlCommit_3 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");

if(conn_tMysqlCommit_3 != null && !conn_tMysqlCommit_3.isClosed()) {
	
		try{
	
			
	    		log.debug("tMysqlCommit_3 - Connection 'tMysqlConnection_1' starting to commit.");
			
			conn_tMysqlCommit_3.commit();
			
	    		log.debug("tMysqlCommit_3 - Connection 'tMysqlConnection_1' commit has succeeded.");
			
	
		}finally{
			
	    		log.debug("tMysqlCommit_3 - Closing the connection 'tMysqlConnection_1' to the database.");
			
			conn_tMysqlCommit_3.close();
			
			if("com.mysql.cj.jdbc.Driver".equals((String)globalMap.get("driverClass_tMysqlConnection_1"))
			    && routines.system.BundleUtils.inOSGi()) {
			        Class.forName("com.mysql.cj.jdbc.AbandonedConnectionCleanupThread").
			            getMethod("checkedShutdown").invoke(null, (Object[]) null);
			}
			
	    		log.debug("tMysqlCommit_3 - Connection 'tMysqlConnection_1' to the database closed.");
			
	    }
	
}

 


	tos_count_tMysqlCommit_3++;

/**
 * [tMysqlCommit_3 main ] stop
 */
	
	/**
	 * [tMysqlCommit_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlCommit_3";

	

 



/**
 * [tMysqlCommit_3 process_data_begin ] stop
 */
	
	/**
	 * [tMysqlCommit_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlCommit_3";

	

 



/**
 * [tMysqlCommit_3 process_data_end ] stop
 */
	
	/**
	 * [tMysqlCommit_3 end ] start
	 */

	

	
	
	currentComponent="tMysqlCommit_3";

	

 
                if(log.isDebugEnabled())
            log.debug("tMysqlCommit_3 - "  + ("Done.") );

ok_Hash.put("tMysqlCommit_3", true);
end_Hash.put("tMysqlCommit_3", System.currentTimeMillis());




/**
 * [tMysqlCommit_3 end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlCommit_3 finally ] start
	 */

	

	
	
	currentComponent="tMysqlCommit_3";

	

 



/**
 * [tMysqlCommit_3 finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlCommit_3_SUBPROCESS_STATE", 1);
	}
	


public static class Select_BR_ID_2Struct implements routines.system.IPersistableComparableLookupRow<Select_BR_ID_2Struct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BR_QLIK_ID == null) ? 0 : this.BR_QLIK_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Select_BR_ID_2Struct other = (Select_BR_ID_2Struct) obj;
		
						if (this.BR_QLIK_ID == null) {
							if (other.BR_QLIK_ID != null)
								return false;
						
						} else if (!this.BR_QLIK_ID.equals(other.BR_QLIK_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(Select_BR_ID_2Struct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            
	}

	public void copyKeysDataTo(Select_BR_ID_2Struct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.BR_QLIK_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		

		

        }

		
        	finally {}

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
        	}
        	finally {}

    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_QLIK_ID="+BR_QLIK_ID);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_BR_ID_2Struct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BR_QLIK_ID, other.BR_QLIK_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMysqlInput_5Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlInput_5_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		Select_BR_ID_2Struct Select_BR_ID_2 = new Select_BR_ID_2Struct();




	
	/**
	 * [tAdvancedHash_Select_BR_ID_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Select_BR_ID_2", false);
		start_Hash.put("tAdvancedHash_Select_BR_ID_2", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Select_BR_ID_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_BR_ID_2");
			
		int tos_count_tAdvancedHash_Select_BR_ID_2 = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_Select_BR_ID_2", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:Select_BR_ID_2
			   		// source node:tMysqlInput_5 - inputs:(after_tJDBCInput_3) outputs:(Select_BR_ID_2,Select_BR_ID_2) | target node:tAdvancedHash_Select_BR_ID_2 - inputs:(Select_BR_ID_2) outputs:()
			   		// linked node: tMap_3 - inputs:(Select_HiveBrand_2,Select_BR_ID_2) outputs:(Update)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Select_BR_ID_2 = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_ID_2Struct> tHash_Lookup_Select_BR_ID_2 =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<Select_BR_ID_2Struct>getLookup(matchingModeEnum_Select_BR_ID_2);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Select_BR_ID_2", tHash_Lookup_Select_BR_ID_2);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Select_BR_ID_2 begin ] stop
 */



	
	/**
	 * [tMysqlInput_5 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlInput_5", false);
		start_Hash.put("tMysqlInput_5", System.currentTimeMillis());
		
	
	currentComponent="tMysqlInput_5";

	
		int tos_count_tMysqlInput_5 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_5 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlInput_5{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlInput_5 = new StringBuilder();
                    log4jParamters_tMysqlInput_5.append("Parameters:");
                            log4jParamters_tMysqlInput_5.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("QUERY" + " = " + "\"  select distinct BR_QLIK_ID from BRAND_LEVEL1  \"");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("BR_QLIK_ID")+"}]");
                        log4jParamters_tMysqlInput_5.append(" | ");
                            log4jParamters_tMysqlInput_5.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tMysqlInput_5.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_5 - "  + (log4jParamters_tMysqlInput_5) );
                    } 
                } 
            new BytesLimit65535_tMysqlInput_5().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlInput_5", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tMysqlInput_5 = java.util.Calendar.getInstance();
		    calendar_tMysqlInput_5.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tMysqlInput_5 = calendar_tMysqlInput_5.getTime();
		    int nb_line_tMysqlInput_5 = 0;
		    java.sql.Connection conn_tMysqlInput_5 = null;
				conn_tMysqlInput_5 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
				
				if(conn_tMysqlInput_5 != null) {
					if(conn_tMysqlInput_5.getMetaData() != null) {
						
							log.debug("tMysqlInput_5 - Uses an existing connection with username '" + conn_tMysqlInput_5.getMetaData().getUserName() + "'. Connection URL: " + conn_tMysqlInput_5.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tMysqlInput_5 = conn_tMysqlInput_5.createStatement();

		    String dbquery_tMysqlInput_5 = "\nselect distinct BR_QLIK_ID from BRAND_LEVEL1\n";
			
                log.debug("tMysqlInput_5 - Executing the query: '"+dbquery_tMysqlInput_5+"'.");
			

            	globalMap.put("tMysqlInput_5_QUERY",dbquery_tMysqlInput_5);
		    java.sql.ResultSet rs_tMysqlInput_5 = null;

		    try {
		    	rs_tMysqlInput_5 = stmt_tMysqlInput_5.executeQuery(dbquery_tMysqlInput_5);
		    	java.sql.ResultSetMetaData rsmd_tMysqlInput_5 = rs_tMysqlInput_5.getMetaData();
		    	int colQtyInRs_tMysqlInput_5 = rsmd_tMysqlInput_5.getColumnCount();

		    String tmpContent_tMysqlInput_5 = null;
		    
		    
		    	log.debug("tMysqlInput_5 - Retrieving records from the database.");
		    
		    while (rs_tMysqlInput_5.next()) {
		        nb_line_tMysqlInput_5++;
		        
							if(colQtyInRs_tMysqlInput_5 < 1) {
								Select_BR_ID_2.BR_QLIK_ID = null;
							} else {
	                         		
        	Select_BR_ID_2.BR_QLIK_ID = routines.system.JDBCUtil.getString(rs_tMysqlInput_5, 1, false);
		                    }
					
						log.debug("tMysqlInput_5 - Retrieving the record " + nb_line_tMysqlInput_5 + ".");
					

 



/**
 * [tMysqlInput_5 begin ] stop
 */
	
	/**
	 * [tMysqlInput_5 main ] start
	 */

	

	
	
	currentComponent="tMysqlInput_5";

	

 


	tos_count_tMysqlInput_5++;

/**
 * [tMysqlInput_5 main ] stop
 */
	
	/**
	 * [tMysqlInput_5 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlInput_5";

	

 



/**
 * [tMysqlInput_5 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_ID_2 main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_ID_2";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_BR_ID_2");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_BR_ID_2 - " + (Select_BR_ID_2==null? "": Select_BR_ID_2.toLogString()));
    			}
    		


			   
			   

					Select_BR_ID_2Struct Select_BR_ID_2_HashRow = new Select_BR_ID_2Struct();
		   	   	   
				
				Select_BR_ID_2_HashRow.BR_QLIK_ID = Select_BR_ID_2.BR_QLIK_ID;
				
			tHash_Lookup_Select_BR_ID_2.put(Select_BR_ID_2_HashRow);
			
            




 


	tos_count_tAdvancedHash_Select_BR_ID_2++;

/**
 * [tAdvancedHash_Select_BR_ID_2 main ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_ID_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_ID_2";

	

 



/**
 * [tAdvancedHash_Select_BR_ID_2 process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_ID_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_ID_2";

	

 



/**
 * [tAdvancedHash_Select_BR_ID_2 process_data_end ] stop
 */



	
	/**
	 * [tMysqlInput_5 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_5";

	

 



/**
 * [tMysqlInput_5 process_data_end ] stop
 */
	
	/**
	 * [tMysqlInput_5 end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_5";

	

	}
}finally{
	if (rs_tMysqlInput_5 != null) {
		rs_tMysqlInput_5.close();
	}
	if (stmt_tMysqlInput_5 != null) {
		stmt_tMysqlInput_5.close();
	}
}

		   globalMap.put("tMysqlInput_5_NB_LINE",nb_line_tMysqlInput_5);
		

	    		log.debug("tMysqlInput_5 - Retrieved records count: "+nb_line_tMysqlInput_5 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_5 - "  + ("Done.") );

ok_Hash.put("tMysqlInput_5", true);
end_Hash.put("tMysqlInput_5", System.currentTimeMillis());




/**
 * [tMysqlInput_5 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_ID_2 end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_ID_2";

	

tHash_Lookup_Select_BR_ID_2.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_BR_ID_2",2,0,
			 			talendJobLog,"tMysqlInput_5","tMysqlInput","tAdvancedHash_Select_BR_ID_2","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_Select_BR_ID_2", true);
end_Hash.put("tAdvancedHash_Select_BR_ID_2", System.currentTimeMillis());




/**
 * [tAdvancedHash_Select_BR_ID_2 end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlInput_5 finally ] start
	 */

	

	
	
	currentComponent="tMysqlInput_5";

	

 



/**
 * [tMysqlInput_5 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_ID_2 finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_ID_2";

	

 



/**
 * [tAdvancedHash_Select_BR_ID_2 finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlInput_5_SUBPROCESS_STATE", 1);
	}
	


public static class Select_BrandStruct implements routines.system.IPersistableComparableLookupRow<Select_BrandStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				
			    public String BR_QLIK_NAME;

				public String getBR_QLIK_NAME () {
					return this.BR_QLIK_NAME;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BR_QLIK_ID == null) ? 0 : this.BR_QLIK_ID.hashCode());
					
						result = prime * result + ((this.BR_QLIK_NAME == null) ? 0 : this.BR_QLIK_NAME.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Select_BrandStruct other = (Select_BrandStruct) obj;
		
						if (this.BR_QLIK_ID == null) {
							if (other.BR_QLIK_ID != null)
								return false;
						
						} else if (!this.BR_QLIK_ID.equals(other.BR_QLIK_ID))
						
							return false;
					
						if (this.BR_QLIK_NAME == null) {
							if (other.BR_QLIK_NAME != null)
								return false;
						
						} else if (!this.BR_QLIK_NAME.equals(other.BR_QLIK_NAME))
						
							return false;
					

		return true;
    }

	public void copyDataTo(Select_BrandStruct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            other.BR_QLIK_NAME = this.BR_QLIK_NAME;
	            
	}

	public void copyKeysDataTo(Select_BrandStruct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            	other.BR_QLIK_NAME = this.BR_QLIK_NAME;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.BR_QLIK_ID = readString(dis);
					
					this.BR_QLIK_NAME = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
					// String
				
						writeString(this.BR_QLIK_NAME,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		

		

        }

		
        	finally {}

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
        	}
        	finally {}

    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_QLIK_ID="+BR_QLIK_ID);
		sb.append(",BR_QLIK_NAME="+BR_QLIK_NAME);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        				if(BR_QLIK_NAME == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_NAME);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_BrandStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BR_QLIK_ID, other.BR_QLIK_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
						returnValue = checkNullsAndCompare(this.BR_QLIK_NAME, other.BR_QLIK_NAME);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMysqlInput_4Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlInput_4_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		Select_BrandStruct Select_Brand = new Select_BrandStruct();




	
	/**
	 * [tAdvancedHash_Select_Brand begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Select_Brand", false);
		start_Hash.put("tAdvancedHash_Select_Brand", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Select_Brand";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_Brand");
			
		int tos_count_tAdvancedHash_Select_Brand = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_Select_Brand", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:Select_Brand
			   		// source node:tMysqlInput_4 - inputs:(after_tJDBCInput_3) outputs:(Select_Brand,Select_Brand) | target node:tAdvancedHash_Select_Brand - inputs:(Select_Brand) outputs:()
			   		// linked node: tMap_4 - inputs:(Update,Select_Brand) outputs:(Update_Brand_L1,Update_Brand)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Select_Brand = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BrandStruct> tHash_Lookup_Select_Brand =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<Select_BrandStruct>getLookup(matchingModeEnum_Select_Brand);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Select_Brand", tHash_Lookup_Select_Brand);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Select_Brand begin ] stop
 */



	
	/**
	 * [tMysqlInput_4 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlInput_4", false);
		start_Hash.put("tMysqlInput_4", System.currentTimeMillis());
		
	
	currentComponent="tMysqlInput_4";

	
		int tos_count_tMysqlInput_4 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_4 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlInput_4{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlInput_4 = new StringBuilder();
                    log4jParamters_tMysqlInput_4.append("Parameters:");
                            log4jParamters_tMysqlInput_4.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("QUERY" + " = " + "\"  select    distinct   BR_QLIK_ID,   BR_QLIK_NAME   from BRAND_LEVEL1  \"");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("BR_QLIK_ID")+"}, {TRIM="+("false")+", SCHEMA_COLUMN="+("BR_QLIK_NAME")+"}]");
                        log4jParamters_tMysqlInput_4.append(" | ");
                            log4jParamters_tMysqlInput_4.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tMysqlInput_4.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_4 - "  + (log4jParamters_tMysqlInput_4) );
                    } 
                } 
            new BytesLimit65535_tMysqlInput_4().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlInput_4", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tMysqlInput_4 = java.util.Calendar.getInstance();
		    calendar_tMysqlInput_4.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tMysqlInput_4 = calendar_tMysqlInput_4.getTime();
		    int nb_line_tMysqlInput_4 = 0;
		    java.sql.Connection conn_tMysqlInput_4 = null;
				conn_tMysqlInput_4 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
				
				if(conn_tMysqlInput_4 != null) {
					if(conn_tMysqlInput_4.getMetaData() != null) {
						
							log.debug("tMysqlInput_4 - Uses an existing connection with username '" + conn_tMysqlInput_4.getMetaData().getUserName() + "'. Connection URL: " + conn_tMysqlInput_4.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tMysqlInput_4 = conn_tMysqlInput_4.createStatement();

		    String dbquery_tMysqlInput_4 = "\nselect  \ndistinct \nBR_QLIK_ID, \nBR_QLIK_NAME \nfrom BRAND_LEVEL1\n";
			
                log.debug("tMysqlInput_4 - Executing the query: '"+dbquery_tMysqlInput_4+"'.");
			

            	globalMap.put("tMysqlInput_4_QUERY",dbquery_tMysqlInput_4);
		    java.sql.ResultSet rs_tMysqlInput_4 = null;

		    try {
		    	rs_tMysqlInput_4 = stmt_tMysqlInput_4.executeQuery(dbquery_tMysqlInput_4);
		    	java.sql.ResultSetMetaData rsmd_tMysqlInput_4 = rs_tMysqlInput_4.getMetaData();
		    	int colQtyInRs_tMysqlInput_4 = rsmd_tMysqlInput_4.getColumnCount();

		    String tmpContent_tMysqlInput_4 = null;
		    
		    
		    	log.debug("tMysqlInput_4 - Retrieving records from the database.");
		    
		    while (rs_tMysqlInput_4.next()) {
		        nb_line_tMysqlInput_4++;
		        
							if(colQtyInRs_tMysqlInput_4 < 1) {
								Select_Brand.BR_QLIK_ID = null;
							} else {
	                         		
        	Select_Brand.BR_QLIK_ID = routines.system.JDBCUtil.getString(rs_tMysqlInput_4, 1, false);
		                    }
							if(colQtyInRs_tMysqlInput_4 < 2) {
								Select_Brand.BR_QLIK_NAME = null;
							} else {
	                         		
        	Select_Brand.BR_QLIK_NAME = routines.system.JDBCUtil.getString(rs_tMysqlInput_4, 2, false);
		                    }
					
						log.debug("tMysqlInput_4 - Retrieving the record " + nb_line_tMysqlInput_4 + ".");
					

 



/**
 * [tMysqlInput_4 begin ] stop
 */
	
	/**
	 * [tMysqlInput_4 main ] start
	 */

	

	
	
	currentComponent="tMysqlInput_4";

	

 


	tos_count_tMysqlInput_4++;

/**
 * [tMysqlInput_4 main ] stop
 */
	
	/**
	 * [tMysqlInput_4 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlInput_4";

	

 



/**
 * [tMysqlInput_4 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_Brand main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_Brand";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_Brand");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_Brand - " + (Select_Brand==null? "": Select_Brand.toLogString()));
    			}
    		


			   
			   

					Select_BrandStruct Select_Brand_HashRow = new Select_BrandStruct();
		   	   	   
				
				Select_Brand_HashRow.BR_QLIK_ID = Select_Brand.BR_QLIK_ID;
				
				Select_Brand_HashRow.BR_QLIK_NAME = Select_Brand.BR_QLIK_NAME;
				
			tHash_Lookup_Select_Brand.put(Select_Brand_HashRow);
			
            




 


	tos_count_tAdvancedHash_Select_Brand++;

/**
 * [tAdvancedHash_Select_Brand main ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_Brand process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_Brand";

	

 



/**
 * [tAdvancedHash_Select_Brand process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_Brand process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_Brand";

	

 



/**
 * [tAdvancedHash_Select_Brand process_data_end ] stop
 */



	
	/**
	 * [tMysqlInput_4 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_4";

	

 



/**
 * [tMysqlInput_4 process_data_end ] stop
 */
	
	/**
	 * [tMysqlInput_4 end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_4";

	

	}
}finally{
	if (rs_tMysqlInput_4 != null) {
		rs_tMysqlInput_4.close();
	}
	if (stmt_tMysqlInput_4 != null) {
		stmt_tMysqlInput_4.close();
	}
}

		   globalMap.put("tMysqlInput_4_NB_LINE",nb_line_tMysqlInput_4);
		

	    		log.debug("tMysqlInput_4 - Retrieved records count: "+nb_line_tMysqlInput_4 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_4 - "  + ("Done.") );

ok_Hash.put("tMysqlInput_4", true);
end_Hash.put("tMysqlInput_4", System.currentTimeMillis());




/**
 * [tMysqlInput_4 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_Brand end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_Brand";

	

tHash_Lookup_Select_Brand.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_Brand",2,0,
			 			talendJobLog,"tMysqlInput_4","tMysqlInput","tAdvancedHash_Select_Brand","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_Select_Brand", true);
end_Hash.put("tAdvancedHash_Select_Brand", System.currentTimeMillis());




/**
 * [tAdvancedHash_Select_Brand end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlInput_4 finally ] start
	 */

	

	
	
	currentComponent="tMysqlInput_4";

	

 



/**
 * [tMysqlInput_4 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_Brand finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_Brand";

	

 



/**
 * [tAdvancedHash_Select_Brand finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlInput_4_SUBPROCESS_STATE", 1);
	}
	


public static class Select_BR_L1_Max_IDStruct implements routines.system.IPersistableRow<Select_BR_L1_Max_IDStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public Integer BR_L1_MAX_ID;

				public Integer getBR_L1_MAX_ID () {
					return this.BR_L1_MAX_ID;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
						this.BR_L1_MAX_ID = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.BR_L1_MAX_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_L1_MAX_ID="+String.valueOf(BR_L1_MAX_ID));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_L1_MAX_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_L1_MAX_ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_BR_L1_Max_IDStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMysqlInput_2Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlInput_2_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		Select_BR_L1_Max_IDStruct Select_BR_L1_Max_ID = new Select_BR_L1_Max_IDStruct();




	
	/**
	 * [tAdvancedHash_Select_BR_L1_Max_ID begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Select_BR_L1_Max_ID", false);
		start_Hash.put("tAdvancedHash_Select_BR_L1_Max_ID", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Select_BR_L1_Max_ID";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_BR_L1_Max_ID");
			
		int tos_count_tAdvancedHash_Select_BR_L1_Max_ID = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_Select_BR_L1_Max_ID", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:Select_BR_L1_Max_ID
			   		// source node:tMysqlInput_2 - inputs:(after_tJDBCInput_2) outputs:(Select_BR_L1_Max_ID,Select_BR_L1_Max_ID) | target node:tAdvancedHash_Select_BR_L1_Max_ID - inputs:(Select_BR_L1_Max_ID) outputs:()
			   		// linked node: tMap_2 - inputs:(Select_HiveBrand,Select_BR_L1_Max_ID,Select_BR_L1_ID) outputs:(Insert_Brand_L1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Select_BR_L1_Max_ID = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_ROWS;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_Max_IDStruct> tHash_Lookup_Select_BR_L1_Max_ID =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<Select_BR_L1_Max_IDStruct>getLookup(matchingModeEnum_Select_BR_L1_Max_ID);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Select_BR_L1_Max_ID", tHash_Lookup_Select_BR_L1_Max_ID);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Select_BR_L1_Max_ID begin ] stop
 */



	
	/**
	 * [tMysqlInput_2 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlInput_2", false);
		start_Hash.put("tMysqlInput_2", System.currentTimeMillis());
		
	
	currentComponent="tMysqlInput_2";

	
		int tos_count_tMysqlInput_2 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_2 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlInput_2{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlInput_2 = new StringBuilder();
                    log4jParamters_tMysqlInput_2.append("Parameters:");
                            log4jParamters_tMysqlInput_2.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("QUERY" + " = " + "\"  select max(BR_LEVEL1_ID) from BRAND_LEVEL1  \"");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("BR_L1_MAX_ID")+"}]");
                        log4jParamters_tMysqlInput_2.append(" | ");
                            log4jParamters_tMysqlInput_2.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tMysqlInput_2.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_2 - "  + (log4jParamters_tMysqlInput_2) );
                    } 
                } 
            new BytesLimit65535_tMysqlInput_2().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlInput_2", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tMysqlInput_2 = java.util.Calendar.getInstance();
		    calendar_tMysqlInput_2.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tMysqlInput_2 = calendar_tMysqlInput_2.getTime();
		    int nb_line_tMysqlInput_2 = 0;
		    java.sql.Connection conn_tMysqlInput_2 = null;
				conn_tMysqlInput_2 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
				
				if(conn_tMysqlInput_2 != null) {
					if(conn_tMysqlInput_2.getMetaData() != null) {
						
							log.debug("tMysqlInput_2 - Uses an existing connection with username '" + conn_tMysqlInput_2.getMetaData().getUserName() + "'. Connection URL: " + conn_tMysqlInput_2.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tMysqlInput_2 = conn_tMysqlInput_2.createStatement();

		    String dbquery_tMysqlInput_2 = "\nselect max(BR_LEVEL1_ID) from BRAND_LEVEL1\n";
			
                log.debug("tMysqlInput_2 - Executing the query: '"+dbquery_tMysqlInput_2+"'.");
			

            	globalMap.put("tMysqlInput_2_QUERY",dbquery_tMysqlInput_2);
		    java.sql.ResultSet rs_tMysqlInput_2 = null;

		    try {
		    	rs_tMysqlInput_2 = stmt_tMysqlInput_2.executeQuery(dbquery_tMysqlInput_2);
		    	java.sql.ResultSetMetaData rsmd_tMysqlInput_2 = rs_tMysqlInput_2.getMetaData();
		    	int colQtyInRs_tMysqlInput_2 = rsmd_tMysqlInput_2.getColumnCount();

		    String tmpContent_tMysqlInput_2 = null;
		    
		    
		    	log.debug("tMysqlInput_2 - Retrieving records from the database.");
		    
		    while (rs_tMysqlInput_2.next()) {
		        nb_line_tMysqlInput_2++;
		        
							if(colQtyInRs_tMysqlInput_2 < 1) {
								Select_BR_L1_Max_ID.BR_L1_MAX_ID = null;
							} else {
		                          
            Select_BR_L1_Max_ID.BR_L1_MAX_ID = rs_tMysqlInput_2.getInt(1);
            if(rs_tMysqlInput_2.wasNull()){
                    Select_BR_L1_Max_ID.BR_L1_MAX_ID = null;
            }
		                    }
					
						log.debug("tMysqlInput_2 - Retrieving the record " + nb_line_tMysqlInput_2 + ".");
					

 



/**
 * [tMysqlInput_2 begin ] stop
 */
	
	/**
	 * [tMysqlInput_2 main ] start
	 */

	

	
	
	currentComponent="tMysqlInput_2";

	

 


	tos_count_tMysqlInput_2++;

/**
 * [tMysqlInput_2 main ] stop
 */
	
	/**
	 * [tMysqlInput_2 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlInput_2";

	

 



/**
 * [tMysqlInput_2 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_L1_Max_ID main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_Max_ID";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_BR_L1_Max_ID");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_BR_L1_Max_ID - " + (Select_BR_L1_Max_ID==null? "": Select_BR_L1_Max_ID.toLogString()));
    			}
    		


			   
			   

					Select_BR_L1_Max_IDStruct Select_BR_L1_Max_ID_HashRow = new Select_BR_L1_Max_IDStruct();
		   	   	   
				
				Select_BR_L1_Max_ID_HashRow.BR_L1_MAX_ID = Select_BR_L1_Max_ID.BR_L1_MAX_ID;
				
			tHash_Lookup_Select_BR_L1_Max_ID.put(Select_BR_L1_Max_ID_HashRow);
			
            




 


	tos_count_tAdvancedHash_Select_BR_L1_Max_ID++;

/**
 * [tAdvancedHash_Select_BR_L1_Max_ID main ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_L1_Max_ID process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_Max_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_L1_Max_ID process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_L1_Max_ID process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_Max_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_L1_Max_ID process_data_end ] stop
 */



	
	/**
	 * [tMysqlInput_2 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_2";

	

 



/**
 * [tMysqlInput_2 process_data_end ] stop
 */
	
	/**
	 * [tMysqlInput_2 end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_2";

	

	}
}finally{
	if (rs_tMysqlInput_2 != null) {
		rs_tMysqlInput_2.close();
	}
	if (stmt_tMysqlInput_2 != null) {
		stmt_tMysqlInput_2.close();
	}
}

		   globalMap.put("tMysqlInput_2_NB_LINE",nb_line_tMysqlInput_2);
		

	    		log.debug("tMysqlInput_2 - Retrieved records count: "+nb_line_tMysqlInput_2 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_2 - "  + ("Done.") );

ok_Hash.put("tMysqlInput_2", true);
end_Hash.put("tMysqlInput_2", System.currentTimeMillis());




/**
 * [tMysqlInput_2 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_L1_Max_ID end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_Max_ID";

	

tHash_Lookup_Select_BR_L1_Max_ID.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_BR_L1_Max_ID",2,0,
			 			talendJobLog,"tMysqlInput_2","tMysqlInput","tAdvancedHash_Select_BR_L1_Max_ID","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_Select_BR_L1_Max_ID", true);
end_Hash.put("tAdvancedHash_Select_BR_L1_Max_ID", System.currentTimeMillis());




/**
 * [tAdvancedHash_Select_BR_L1_Max_ID end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlInput_2 finally ] start
	 */

	

	
	
	currentComponent="tMysqlInput_2";

	

 



/**
 * [tMysqlInput_2 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_L1_Max_ID finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_Max_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_L1_Max_ID finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlInput_2_SUBPROCESS_STATE", 1);
	}
	


public static class Select_BR_L1_IDStruct implements routines.system.IPersistableComparableLookupRow<Select_BR_L1_IDStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
	protected static final int DEFAULT_HASHCODE = 1;
    protected static final int PRIME = 31;
    protected int hashCode = DEFAULT_HASHCODE;
    public boolean hashCodeDirty = true;

    public String loopKey;



	
			    public String BR_QLIK_ID;

				public String getBR_QLIK_ID () {
					return this.BR_QLIK_ID;
				}
				


	@Override
	public int hashCode() {
		if (this.hashCodeDirty) {
			final int prime = PRIME;
			int result = DEFAULT_HASHCODE;
	
						result = prime * result + ((this.BR_QLIK_ID == null) ? 0 : this.BR_QLIK_ID.hashCode());
					
    		this.hashCode = result;
    		this.hashCodeDirty = false;
		}
		return this.hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Select_BR_L1_IDStruct other = (Select_BR_L1_IDStruct) obj;
		
						if (this.BR_QLIK_ID == null) {
							if (other.BR_QLIK_ID != null)
								return false;
						
						} else if (!this.BR_QLIK_ID.equals(other.BR_QLIK_ID))
						
							return false;
					

		return true;
    }

	public void copyDataTo(Select_BR_L1_IDStruct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            
	}

	public void copyKeysDataTo(Select_BR_L1_IDStruct other) {

		other.BR_QLIK_ID = this.BR_QLIK_ID;
	            	
	}




	private String readString(ObjectInputStream dis) throws IOException{
		String strReturn = null;
		int length = 0;
        length = dis.readInt();
		if (length == -1) {
			strReturn = null;
		} else {
			if(length > commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length) {
				if(length < 1024 && commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY.length == 0) {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[1024];
				} else {
   					commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[2 * length];
   				}
			}
			dis.readFully(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length);
			strReturn = new String(commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY, 0, length, utf8Charset);
		}
		return strReturn;
	}

    private void writeString(String str, ObjectOutputStream dos) throws IOException{
		if(str == null) {
            dos.writeInt(-1);
		} else {
            byte[] byteArray = str.getBytes(utf8Charset);
	    	dos.writeInt(byteArray.length);
			dos.write(byteArray);
    	}
    }

    public void readKeysData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
					this.BR_QLIK_ID = readString(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeKeysData(ObjectOutputStream dos) {
        try {

		
					// String
				
						writeString(this.BR_QLIK_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }



    /**
     * Fill Values data by reading ObjectInputStream.
     */
    public void readValuesData(DataInputStream dis, ObjectInputStream ois) {
        try {

			int length = 0;
		

		

        }

		
        	finally {}

    }

    /**
     * Return a byte array which represents Values data.
     */
    public void writeValuesData(DataOutputStream dos, ObjectOutputStream oos) {
        try {

		
        	}
        	finally {}

    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_QLIK_ID="+BR_QLIK_ID);
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_QLIK_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_QLIK_ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_BR_L1_IDStruct other) {

		int returnValue = -1;
		
						returnValue = checkNullsAndCompare(this.BR_QLIK_ID, other.BR_QLIK_ID);
						if(returnValue != 0) {
							return returnValue;
						}

					
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMysqlInput_3Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlInput_3_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		Select_BR_L1_IDStruct Select_BR_L1_ID = new Select_BR_L1_IDStruct();




	
	/**
	 * [tAdvancedHash_Select_BR_L1_ID begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Select_BR_L1_ID", false);
		start_Hash.put("tAdvancedHash_Select_BR_L1_ID", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Select_BR_L1_ID";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_BR_L1_ID");
			
		int tos_count_tAdvancedHash_Select_BR_L1_ID = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_Select_BR_L1_ID", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:Select_BR_L1_ID
			   		// source node:tMysqlInput_3 - inputs:(after_tJDBCInput_2) outputs:(Select_BR_L1_ID,Select_BR_L1_ID) | target node:tAdvancedHash_Select_BR_L1_ID - inputs:(Select_BR_L1_ID) outputs:()
			   		// linked node: tMap_2 - inputs:(Select_HiveBrand,Select_BR_L1_Max_ID,Select_BR_L1_ID) outputs:(Insert_Brand_L1)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Select_BR_L1_ID = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.UNIQUE_MATCH;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_L1_IDStruct> tHash_Lookup_Select_BR_L1_ID =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<Select_BR_L1_IDStruct>getLookup(matchingModeEnum_Select_BR_L1_ID);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Select_BR_L1_ID", tHash_Lookup_Select_BR_L1_ID);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Select_BR_L1_ID begin ] stop
 */



	
	/**
	 * [tMysqlInput_3 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlInput_3", false);
		start_Hash.put("tMysqlInput_3", System.currentTimeMillis());
		
	
	currentComponent="tMysqlInput_3";

	
		int tos_count_tMysqlInput_3 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_3 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlInput_3{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlInput_3 = new StringBuilder();
                    log4jParamters_tMysqlInput_3.append("Parameters:");
                            log4jParamters_tMysqlInput_3.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("QUERY" + " = " + "\"  select distinct BR_QLIK_ID from BRAND_LEVEL1  \"");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("BR_QLIK_ID")+"}]");
                        log4jParamters_tMysqlInput_3.append(" | ");
                            log4jParamters_tMysqlInput_3.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tMysqlInput_3.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_3 - "  + (log4jParamters_tMysqlInput_3) );
                    } 
                } 
            new BytesLimit65535_tMysqlInput_3().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlInput_3", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tMysqlInput_3 = java.util.Calendar.getInstance();
		    calendar_tMysqlInput_3.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tMysqlInput_3 = calendar_tMysqlInput_3.getTime();
		    int nb_line_tMysqlInput_3 = 0;
		    java.sql.Connection conn_tMysqlInput_3 = null;
				conn_tMysqlInput_3 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
				
				if(conn_tMysqlInput_3 != null) {
					if(conn_tMysqlInput_3.getMetaData() != null) {
						
							log.debug("tMysqlInput_3 - Uses an existing connection with username '" + conn_tMysqlInput_3.getMetaData().getUserName() + "'. Connection URL: " + conn_tMysqlInput_3.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tMysqlInput_3 = conn_tMysqlInput_3.createStatement();

		    String dbquery_tMysqlInput_3 = "\nselect distinct BR_QLIK_ID from BRAND_LEVEL1\n";
			
                log.debug("tMysqlInput_3 - Executing the query: '"+dbquery_tMysqlInput_3+"'.");
			

            	globalMap.put("tMysqlInput_3_QUERY",dbquery_tMysqlInput_3);
		    java.sql.ResultSet rs_tMysqlInput_3 = null;

		    try {
		    	rs_tMysqlInput_3 = stmt_tMysqlInput_3.executeQuery(dbquery_tMysqlInput_3);
		    	java.sql.ResultSetMetaData rsmd_tMysqlInput_3 = rs_tMysqlInput_3.getMetaData();
		    	int colQtyInRs_tMysqlInput_3 = rsmd_tMysqlInput_3.getColumnCount();

		    String tmpContent_tMysqlInput_3 = null;
		    
		    
		    	log.debug("tMysqlInput_3 - Retrieving records from the database.");
		    
		    while (rs_tMysqlInput_3.next()) {
		        nb_line_tMysqlInput_3++;
		        
							if(colQtyInRs_tMysqlInput_3 < 1) {
								Select_BR_L1_ID.BR_QLIK_ID = null;
							} else {
	                         		
        	Select_BR_L1_ID.BR_QLIK_ID = routines.system.JDBCUtil.getString(rs_tMysqlInput_3, 1, false);
		                    }
					
						log.debug("tMysqlInput_3 - Retrieving the record " + nb_line_tMysqlInput_3 + ".");
					

 



/**
 * [tMysqlInput_3 begin ] stop
 */
	
	/**
	 * [tMysqlInput_3 main ] start
	 */

	

	
	
	currentComponent="tMysqlInput_3";

	

 


	tos_count_tMysqlInput_3++;

/**
 * [tMysqlInput_3 main ] stop
 */
	
	/**
	 * [tMysqlInput_3 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlInput_3";

	

 



/**
 * [tMysqlInput_3 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_L1_ID main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_ID";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_BR_L1_ID");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_BR_L1_ID - " + (Select_BR_L1_ID==null? "": Select_BR_L1_ID.toLogString()));
    			}
    		


			   
			   

					Select_BR_L1_IDStruct Select_BR_L1_ID_HashRow = new Select_BR_L1_IDStruct();
		   	   	   
				
				Select_BR_L1_ID_HashRow.BR_QLIK_ID = Select_BR_L1_ID.BR_QLIK_ID;
				
			tHash_Lookup_Select_BR_L1_ID.put(Select_BR_L1_ID_HashRow);
			
            




 


	tos_count_tAdvancedHash_Select_BR_L1_ID++;

/**
 * [tAdvancedHash_Select_BR_L1_ID main ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_L1_ID process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_L1_ID process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_L1_ID process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_L1_ID process_data_end ] stop
 */



	
	/**
	 * [tMysqlInput_3 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_3";

	

 



/**
 * [tMysqlInput_3 process_data_end ] stop
 */
	
	/**
	 * [tMysqlInput_3 end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_3";

	

	}
}finally{
	if (rs_tMysqlInput_3 != null) {
		rs_tMysqlInput_3.close();
	}
	if (stmt_tMysqlInput_3 != null) {
		stmt_tMysqlInput_3.close();
	}
}

		   globalMap.put("tMysqlInput_3_NB_LINE",nb_line_tMysqlInput_3);
		

	    		log.debug("tMysqlInput_3 - Retrieved records count: "+nb_line_tMysqlInput_3 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_3 - "  + ("Done.") );

ok_Hash.put("tMysqlInput_3", true);
end_Hash.put("tMysqlInput_3", System.currentTimeMillis());




/**
 * [tMysqlInput_3 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_L1_ID end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_ID";

	

tHash_Lookup_Select_BR_L1_ID.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_BR_L1_ID",2,0,
			 			talendJobLog,"tMysqlInput_3","tMysqlInput","tAdvancedHash_Select_BR_L1_ID","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_Select_BR_L1_ID", true);
end_Hash.put("tAdvancedHash_Select_BR_L1_ID", System.currentTimeMillis());




/**
 * [tAdvancedHash_Select_BR_L1_ID end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlInput_3 finally ] start
	 */

	

	
	
	currentComponent="tMysqlInput_3";

	

 



/**
 * [tMysqlInput_3 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_L1_ID finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_L1_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_L1_ID finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlInput_3_SUBPROCESS_STATE", 1);
	}
	


public static class Select_BR_Max_IDStruct implements routines.system.IPersistableRow<Select_BR_Max_IDStruct> {
    final static byte[] commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];
    static byte[] commonByteArray_BOBI_MAJ_BOBI_MARQUE_DARTY = new byte[0];

	
			    public Integer BR_MAX_ID;

				public Integer getBR_MAX_ID () {
					return this.BR_MAX_ID;
				}
				


	private Integer readInteger(ObjectInputStream dis) throws IOException{
		Integer intReturn;
        int length = 0;
        length = dis.readByte();
		if (length == -1) {
			intReturn = null;
		} else {
	    	intReturn = dis.readInt();
		}
		return intReturn;
	}

	private void writeInteger(Integer intNum, ObjectOutputStream dos) throws IOException{
		if(intNum == null) {
            dos.writeByte(-1);
		} else {
			dos.writeByte(0);
	    	dos.writeInt(intNum);
    	}
	}

    public void readData(ObjectInputStream dis) {

		synchronized(commonByteArrayLock_BOBI_MAJ_BOBI_MARQUE_DARTY) {

        	try {

        		int length = 0;
		
						this.BR_MAX_ID = readInteger(dis);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);

		

        }

		

      }


    }

    public void writeData(ObjectOutputStream dos) {
        try {

		
					// Integer
				
						writeInteger(this.BR_MAX_ID,dos);
					
        	} catch (IOException e) {
	            throw new RuntimeException(e);
        }


    }


    public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("[");
		sb.append("BR_MAX_ID="+String.valueOf(BR_MAX_ID));
	    sb.append("]");

	    return sb.toString();
    }
        public String toLogString(){
        	StringBuilder sb = new StringBuilder();
        	
        				if(BR_MAX_ID == null){
        					sb.append("<null>");
        				}else{
            				sb.append(BR_MAX_ID);
            			}
            		
        			sb.append("|");
        		
        	return sb.toString();
        }

    /**
     * Compare keys
     */
    public int compareTo(Select_BR_Max_IDStruct other) {

		int returnValue = -1;
		
	    return returnValue;
    }


    private int checkNullsAndCompare(Object object1, Object object2) {
        int returnValue = 0;
		if (object1 instanceof Comparable && object2 instanceof Comparable) {
            returnValue = ((Comparable) object1).compareTo(object2);
        } else if (object1 != null && object2 != null) {
            returnValue = compareStrings(object1.toString(), object2.toString());
        } else if (object1 == null && object2 != null) {
            returnValue = 1;
        } else if (object1 != null && object2 == null) {
            returnValue = -1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }

    private int compareStrings(String string1, String string2) {
        return string1.compareTo(string2);
    }


}
public void tMysqlInput_8Process(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("tMysqlInput_8_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;



		Select_BR_Max_IDStruct Select_BR_Max_ID = new Select_BR_Max_IDStruct();




	
	/**
	 * [tAdvancedHash_Select_BR_Max_ID begin ] start
	 */

	

	
		
		ok_Hash.put("tAdvancedHash_Select_BR_Max_ID", false);
		start_Hash.put("tAdvancedHash_Select_BR_Max_ID", System.currentTimeMillis());
		
	
	currentComponent="tAdvancedHash_Select_BR_Max_ID";

	
			runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,0,0,"Select_BR_Max_ID");
			
		int tos_count_tAdvancedHash_Select_BR_Max_ID = 0;
		
			if(enableLogStash) {
				talendJobLog.addCM("tAdvancedHash_Select_BR_Max_ID", "tAdvancedHash");
				talendJobLogProcess(globalMap);
			}
			

			   		// connection name:Select_BR_Max_ID
			   		// source node:tMysqlInput_8 - inputs:(after_tJDBCInput_2) outputs:(Select_BR_Max_ID,Select_BR_Max_ID) | target node:tAdvancedHash_Select_BR_Max_ID - inputs:(Select_BR_Max_ID) outputs:()
			   		// linked node: tMap_6 - inputs:(Pre_Insert_Brand,Select_BR_Max_ID) outputs:(Insert_Brand)
			   
			   		org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE matchingModeEnum_Select_BR_Max_ID = 
			   			org.talend.designer.components.lookup.common.ICommonLookup.MATCHING_MODE.ALL_ROWS;
			   			
			   
	   			org.talend.designer.components.lookup.memory.AdvancedMemoryLookup<Select_BR_Max_IDStruct> tHash_Lookup_Select_BR_Max_ID =org.talend.designer.components.lookup.memory.AdvancedMemoryLookup.
	   						<Select_BR_Max_IDStruct>getLookup(matchingModeEnum_Select_BR_Max_ID);
	   						   
		   	   	   globalMap.put("tHash_Lookup_Select_BR_Max_ID", tHash_Lookup_Select_BR_Max_ID);
		   	   	   
				
           

 



/**
 * [tAdvancedHash_Select_BR_Max_ID begin ] stop
 */



	
	/**
	 * [tMysqlInput_8 begin ] start
	 */

	

	
		
		ok_Hash.put("tMysqlInput_8", false);
		start_Hash.put("tMysqlInput_8", System.currentTimeMillis());
		
	
	currentComponent="tMysqlInput_8";

	
		int tos_count_tMysqlInput_8 = 0;
		
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_8 - "  + ("Start to work.") );
            if (log.isDebugEnabled()) {
                class BytesLimit65535_tMysqlInput_8{
                    public void limitLog4jByte() throws Exception{
                    StringBuilder log4jParamters_tMysqlInput_8 = new StringBuilder();
                    log4jParamters_tMysqlInput_8.append("Parameters:");
                            log4jParamters_tMysqlInput_8.append("USE_EXISTING_CONNECTION" + " = " + "true");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("CONNECTION" + " = " + "tMysqlConnection_1");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("TABLE" + " = " + "\"BRAND_LEVEL1\"");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("QUERYSTORE" + " = " + "\"\"");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("QUERY" + " = " + "\"  select max(BR_ID) from BRAND  \"");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("ENABLE_STREAM" + " = " + "false");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("TRIM_ALL_COLUMN" + " = " + "false");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("TRIM_COLUMN" + " = " + "[{TRIM="+("false")+", SCHEMA_COLUMN="+("BR_MAX_ID")+"}]");
                        log4jParamters_tMysqlInput_8.append(" | ");
                            log4jParamters_tMysqlInput_8.append("UNIFIED_COMPONENTS" + " = " + "tMysqlInput");
                        log4jParamters_tMysqlInput_8.append(" | ");
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_8 - "  + (log4jParamters_tMysqlInput_8) );
                    } 
                } 
            new BytesLimit65535_tMysqlInput_8().limitLog4jByte();
            }
			if(enableLogStash) {
				talendJobLog.addCM("tMysqlInput_8", "tMysqlInput");
				talendJobLogProcess(globalMap);
			}
			
	
	
		    java.util.Calendar calendar_tMysqlInput_8 = java.util.Calendar.getInstance();
		    calendar_tMysqlInput_8.set(0, 0, 0, 0, 0, 0);
		    java.util.Date year0_tMysqlInput_8 = calendar_tMysqlInput_8.getTime();
		    int nb_line_tMysqlInput_8 = 0;
		    java.sql.Connection conn_tMysqlInput_8 = null;
				conn_tMysqlInput_8 = (java.sql.Connection)globalMap.get("conn_tMysqlConnection_1");
				
				if(conn_tMysqlInput_8 != null) {
					if(conn_tMysqlInput_8.getMetaData() != null) {
						
							log.debug("tMysqlInput_8 - Uses an existing connection with username '" + conn_tMysqlInput_8.getMetaData().getUserName() + "'. Connection URL: " + conn_tMysqlInput_8.getMetaData().getURL() + ".");
						
					}
				}
			
		    
			java.sql.Statement stmt_tMysqlInput_8 = conn_tMysqlInput_8.createStatement();

		    String dbquery_tMysqlInput_8 = "\nselect max(BR_ID) from BRAND\n";
			
                log.debug("tMysqlInput_8 - Executing the query: '"+dbquery_tMysqlInput_8+"'.");
			

            	globalMap.put("tMysqlInput_8_QUERY",dbquery_tMysqlInput_8);
		    java.sql.ResultSet rs_tMysqlInput_8 = null;

		    try {
		    	rs_tMysqlInput_8 = stmt_tMysqlInput_8.executeQuery(dbquery_tMysqlInput_8);
		    	java.sql.ResultSetMetaData rsmd_tMysqlInput_8 = rs_tMysqlInput_8.getMetaData();
		    	int colQtyInRs_tMysqlInput_8 = rsmd_tMysqlInput_8.getColumnCount();

		    String tmpContent_tMysqlInput_8 = null;
		    
		    
		    	log.debug("tMysqlInput_8 - Retrieving records from the database.");
		    
		    while (rs_tMysqlInput_8.next()) {
		        nb_line_tMysqlInput_8++;
		        
							if(colQtyInRs_tMysqlInput_8 < 1) {
								Select_BR_Max_ID.BR_MAX_ID = null;
							} else {
		                          
            Select_BR_Max_ID.BR_MAX_ID = rs_tMysqlInput_8.getInt(1);
            if(rs_tMysqlInput_8.wasNull()){
                    Select_BR_Max_ID.BR_MAX_ID = null;
            }
		                    }
					
						log.debug("tMysqlInput_8 - Retrieving the record " + nb_line_tMysqlInput_8 + ".");
					

 



/**
 * [tMysqlInput_8 begin ] stop
 */
	
	/**
	 * [tMysqlInput_8 main ] start
	 */

	

	
	
	currentComponent="tMysqlInput_8";

	

 


	tos_count_tMysqlInput_8++;

/**
 * [tMysqlInput_8 main ] stop
 */
	
	/**
	 * [tMysqlInput_8 process_data_begin ] start
	 */

	

	
	
	currentComponent="tMysqlInput_8";

	

 



/**
 * [tMysqlInput_8 process_data_begin ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_Max_ID main ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_Max_ID";

	
			runStat.updateStatAndLog(execStat,enableLogStash,iterateId,1,1,"Select_BR_Max_ID");
			
    			if(log.isTraceEnabled()){
    				log.trace("Select_BR_Max_ID - " + (Select_BR_Max_ID==null? "": Select_BR_Max_ID.toLogString()));
    			}
    		


			   
			   

					Select_BR_Max_IDStruct Select_BR_Max_ID_HashRow = new Select_BR_Max_IDStruct();
		   	   	   
				
				Select_BR_Max_ID_HashRow.BR_MAX_ID = Select_BR_Max_ID.BR_MAX_ID;
				
			tHash_Lookup_Select_BR_Max_ID.put(Select_BR_Max_ID_HashRow);
			
            




 


	tos_count_tAdvancedHash_Select_BR_Max_ID++;

/**
 * [tAdvancedHash_Select_BR_Max_ID main ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_Max_ID process_data_begin ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_Max_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_Max_ID process_data_begin ] stop
 */
	
	/**
	 * [tAdvancedHash_Select_BR_Max_ID process_data_end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_Max_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_Max_ID process_data_end ] stop
 */



	
	/**
	 * [tMysqlInput_8 process_data_end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_8";

	

 



/**
 * [tMysqlInput_8 process_data_end ] stop
 */
	
	/**
	 * [tMysqlInput_8 end ] start
	 */

	

	
	
	currentComponent="tMysqlInput_8";

	

	}
}finally{
	if (rs_tMysqlInput_8 != null) {
		rs_tMysqlInput_8.close();
	}
	if (stmt_tMysqlInput_8 != null) {
		stmt_tMysqlInput_8.close();
	}
}

		   globalMap.put("tMysqlInput_8_NB_LINE",nb_line_tMysqlInput_8);
		

	    		log.debug("tMysqlInput_8 - Retrieved records count: "+nb_line_tMysqlInput_8 + " .");
			

 
                if(log.isDebugEnabled())
            log.debug("tMysqlInput_8 - "  + ("Done.") );

ok_Hash.put("tMysqlInput_8", true);
end_Hash.put("tMysqlInput_8", System.currentTimeMillis());




/**
 * [tMysqlInput_8 end ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_Max_ID end ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_Max_ID";

	

tHash_Lookup_Select_BR_Max_ID.endPut();

			 		if(runStat.updateStatAndLog(execStat,enableLogStash,resourceMap,iterateId,"Select_BR_Max_ID",2,0,
			 			talendJobLog,"tMysqlInput_8","tMysqlInput","tAdvancedHash_Select_BR_Max_ID","tAdvancedHash","output")) {
						talendJobLogProcess(globalMap);
					}
				
 

ok_Hash.put("tAdvancedHash_Select_BR_Max_ID", true);
end_Hash.put("tAdvancedHash_Select_BR_Max_ID", System.currentTimeMillis());




/**
 * [tAdvancedHash_Select_BR_Max_ID end ] stop
 */



				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [tMysqlInput_8 finally ] start
	 */

	

	
	
	currentComponent="tMysqlInput_8";

	

 



/**
 * [tMysqlInput_8 finally ] stop
 */

	
	/**
	 * [tAdvancedHash_Select_BR_Max_ID finally ] start
	 */

	

	
	
	currentComponent="tAdvancedHash_Select_BR_Max_ID";

	

 



/**
 * [tAdvancedHash_Select_BR_Max_ID finally ] stop
 */



				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("tMysqlInput_8_SUBPROCESS_STATE", 1);
	}
	

public void talendJobLogProcess(final java.util.Map<String, Object> globalMap) throws TalendException {
	globalMap.put("talendJobLog_SUBPROCESS_STATE", 0);

 final boolean execStat = this.execStat;
	
		String iterateId = "";
	
	
	String currentComponent = "";
	java.util.Map<String, Object> resourceMap = new java.util.HashMap<String, Object>();

	try {
			// TDI-39566 avoid throwing an useless Exception
			boolean resumeIt = true;
			if (globalResumeTicket == false && resumeEntryMethodName != null) {
				String currentMethodName = new java.lang.Exception().getStackTrace()[0].getMethodName();
				resumeIt = resumeEntryMethodName.equals(currentMethodName);
			}
			if (resumeIt || globalResumeTicket) { //start the resume
				globalResumeTicket = true;





	
	/**
	 * [talendJobLog begin ] start
	 */

	

	
		
		ok_Hash.put("talendJobLog", false);
		start_Hash.put("talendJobLog", System.currentTimeMillis());
		
	
	currentComponent="talendJobLog";

	
		int tos_count_talendJobLog = 0;
		

	for (JobStructureCatcherUtils.JobStructureCatcherMessage jcm : talendJobLog.getMessages()) {
		org.talend.logging.audit.Context log_context_talendJobLog = null;
		if(jcm.component_name == null) {//job level log
			if(jcm.status == null) {//job start
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version).timestamp(jcm.moment).build();
				auditLogger_talendJobLog.jobstart(log_context_talendJobLog);
			} else {//job end
				long timeMS = jcm.end_time - jcm.start_time;
				String duration = String.format(java.util.Locale.US, "%1$.2fs", (timeMS * 1.0)/1000);
			
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.timestamp(jcm.moment).duration(duration).status(jcm.status).build();
				auditLogger_talendJobLog.jobstop(log_context_talendJobLog);
			}
		} else if(jcm.current_connector == null) {//component log
			log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
				.connectorType(jcm.component_name).connectorId(jcm.component_id).build();
			auditLogger_talendJobLog.runcomponent(log_context_talendJobLog);
		} else {//component connector meter log
			long timeMS = jcm.end_time - jcm.start_time;
			String duration = String.format(java.util.Locale.US, "%1$.2fs", (timeMS * 1.0)/1000);
			
			if(jcm.current_connector_as_input) {//log current component input line
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.connectorType(jcm.component_name).connectorId(jcm.component_id)
					.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
					.rows(jcm.total_row_number).duration(duration).build();
				auditLogger_talendJobLog.flowInput(log_context_talendJobLog);
			} else {//log current component output/reject line
				log_context_talendJobLog = org.talend.job.audit.JobContextBuilder.create().jobName(jcm.job_name).jobId(jcm.job_id).jobVersion(jcm.job_version)
					.connectorType(jcm.component_name).connectorId(jcm.component_id)
					.connectionName(jcm.current_connector).connectionType(jcm.current_connector_type)
					.rows(jcm.total_row_number).duration(duration).build();
				auditLogger_talendJobLog.flowOutput(log_context_talendJobLog);
			}
		}
	}

 



/**
 * [talendJobLog begin ] stop
 */
	
	/**
	 * [talendJobLog main ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 


	tos_count_talendJobLog++;

/**
 * [talendJobLog main ] stop
 */
	
	/**
	 * [talendJobLog process_data_begin ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_begin ] stop
 */
	
	/**
	 * [talendJobLog process_data_end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog process_data_end ] stop
 */
	
	/**
	 * [talendJobLog end ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 

ok_Hash.put("talendJobLog", true);
end_Hash.put("talendJobLog", System.currentTimeMillis());




/**
 * [talendJobLog end ] stop
 */
				}//end the resume

				



	
			}catch(java.lang.Exception e){	
				
				    if(!(e instanceof TalendException)){
					   log.fatal(currentComponent + " " + e.getMessage(),e);
					}
				
				TalendException te = new TalendException(e, currentComponent, globalMap);
				
				throw te;
			}catch(java.lang.Error error){	
				
					runStat.stopThreadStat();
				
				throw error;
			}finally{
				
				try{
					
	
	/**
	 * [talendJobLog finally ] start
	 */

	

	
	
	currentComponent="talendJobLog";

	

 



/**
 * [talendJobLog finally ] stop
 */
				}catch(java.lang.Exception e){	
					//ignore
				}catch(java.lang.Error error){
					//ignore
				}
				resourceMap = null;
			}
		

		globalMap.put("talendJobLog_SUBPROCESS_STATE", 1);
	}
	
    public String resuming_logs_dir_path = null;
    public String resuming_checkpoint_path = null;
    public String parent_part_launcher = null;
    private String resumeEntryMethodName = null;
    private boolean globalResumeTicket = false;

    public boolean watch = false;
    // portStats is null, it means don't execute the statistics
    public Integer portStats = null;
    public int portTraces = 4334;
    public String clientHost;
    public String defaultClientHost = "localhost";
    public String contextStr = "REC_DARTY";
    public boolean isDefaultContext = true;
    public String pid = "0";
    public String rootPid = null;
    public String fatherPid = null;
    public String fatherNode = null;
    public long startTime = 0;
    public boolean isChildJob = false;
    public String log4jLevel = "";
    
    private boolean enableLogStash;

    private boolean execStat = true;

    private ThreadLocal<java.util.Map<String, String>> threadLocal = new ThreadLocal<java.util.Map<String, String>>() {
        protected java.util.Map<String, String> initialValue() {
            java.util.Map<String,String> threadRunResultMap = new java.util.HashMap<String, String>();
            threadRunResultMap.put("errorCode", null);
            threadRunResultMap.put("status", "");
            return threadRunResultMap;
        };
    };


    private PropertiesWithType context_param = new PropertiesWithType();
    public java.util.Map<String, Object> parentContextMap = new java.util.HashMap<String, Object>();

    public String status= "";
    
    private final org.talend.components.common.runtime.SharedConnectionsPool connectionPool = new org.talend.components.common.runtime.SharedConnectionsPool() {
    	public java.sql.Connection getDBConnection(String dbDriver, String url, String userName, String password, String dbConnectionName)
            throws ClassNotFoundException, java.sql.SQLException {
            return SharedDBConnection.getDBConnection(dbDriver, url, userName, password, dbConnectionName);
        }

    	public java.sql.Connection getDBConnection(String dbDriver, String url, String dbConnectionName)
            throws ClassNotFoundException, java.sql.SQLException {
            return SharedDBConnection.getDBConnection(dbDriver, url, dbConnectionName);
        }
    };
    
    private static final String GLOBAL_CONNECTION_POOL_KEY = "GLOBAL_CONNECTION_POOL";
    
    {
    	globalMap.put(GLOBAL_CONNECTION_POOL_KEY, connectionPool);
    }

    public static void main(String[] args){
        final MAJ_BOBI_MARQUE_DARTY MAJ_BOBI_MARQUE_DARTYClass = new MAJ_BOBI_MARQUE_DARTY();

        int exitCode = MAJ_BOBI_MARQUE_DARTYClass.runJobInTOS(args);
	        if(exitCode==0){
		        log.info("TalendJob: 'MAJ_BOBI_MARQUE_DARTY' - Done.");
	        }

        System.exit(exitCode);
    }


    public String[][] runJob(String[] args) {

        int exitCode = runJobInTOS(args);
        String[][] bufferValue = new String[][] { { Integer.toString(exitCode) } };

        return bufferValue;
    }

    public boolean hastBufferOutputComponent() {
		boolean hastBufferOutput = false;
    	
        return hastBufferOutput;
    }

    public int runJobInTOS(String[] args) {
	   	// reset status
	   	status = "";
	   	
        String lastStr = "";
        for (String arg : args) {
            if (arg.equalsIgnoreCase("--context_param")) {
                lastStr = arg;
            } else if (lastStr.equals("")) {
                evalParam(arg);
            } else {
                evalParam(lastStr + " " + arg);
                lastStr = "";
            }
        }
        enableLogStash = "true".equalsIgnoreCase(System.getProperty("monitoring"));

	        if(!"".equals(log4jLevel)){
	        	
				
				
				if("trace".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.TRACE);
				}else if("debug".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.DEBUG);
				}else if("info".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.INFO);
				}else if("warn".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.WARN);
				}else if("error".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.ERROR);
				}else if("fatal".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.FATAL);
				}else if ("off".equalsIgnoreCase(log4jLevel)){
					org.apache.logging.log4j.core.config.Configurator.setLevel(log.getName(), org.apache.logging.log4j.Level.OFF);
				}
				org.apache.logging.log4j.core.config.Configurator.setLevel(org.apache.logging.log4j.LogManager.getRootLogger().getName(), log.getLevel());
				
    	    }
        	log.info("TalendJob: 'MAJ_BOBI_MARQUE_DARTY' - Start.");
    	
    	
    	
			if(enableLogStash) {
				java.util.Properties properties_talendJobLog = new java.util.Properties();
				properties_talendJobLog.setProperty("root.logger", "audit");
				properties_talendJobLog.setProperty("encoding", "UTF-8");
				properties_talendJobLog.setProperty("application.name", "Talend Studio");
				properties_talendJobLog.setProperty("service.name", "Talend Studio Job");
				properties_talendJobLog.setProperty("instance.name", "Talend Studio Job Instance");
				properties_talendJobLog.setProperty("propagate.appender.exceptions", "none");
				properties_talendJobLog.setProperty("log.appender", "file");
				properties_talendJobLog.setProperty("appender.file.path", "audit.json");
				properties_talendJobLog.setProperty("appender.file.maxsize", "52428800");
				properties_talendJobLog.setProperty("appender.file.maxbackup", "20");
				properties_talendJobLog.setProperty("host", "false");

				System.getProperties().stringPropertyNames().stream()
					.filter(it -> it.startsWith("monitoring.audit.logger.properties."))
					.forEach(key -> properties_talendJobLog.setProperty(key.substring("monitoring.audit.logger.properties.".length()), System.getProperty(key)));

				
				
				
				org.apache.logging.log4j.core.config.Configurator.setLevel("audit", org.apache.logging.log4j.Level.DEBUG);
				
				auditLogger_talendJobLog = org.talend.job.audit.JobEventAuditLoggerFactory.createJobAuditLogger(properties_talendJobLog);
			}
		

        if(clientHost == null) {
            clientHost = defaultClientHost;
        }

        if(pid == null || "0".equals(pid)) {
            pid = TalendString.getAsciiRandomString(6);
        }

        if (rootPid==null) {
            rootPid = pid;
        }
        if (fatherPid==null) {
            fatherPid = pid;
        }else{
            isChildJob = true;
        }

        if (portStats != null) {
            // portStats = -1; //for testing
            if (portStats < 0 || portStats > 65535) {
                // issue:10869, the portStats is invalid, so this client socket can't open
                System.err.println("The statistics socket port " + portStats + " is invalid.");
                execStat = false;
            }
        } else {
            execStat = false;
        }

        try {
            //call job/subjob with an existing context, like: --context=production. if without this parameter, there will use the default context instead.
            java.io.InputStream inContext = MAJ_BOBI_MARQUE_DARTY.class.getClassLoader().getResourceAsStream("bobi/maj_bobi_marque_darty_0_1/contexts/" + contextStr + ".properties");
            if (inContext == null) {
                inContext = MAJ_BOBI_MARQUE_DARTY.class.getClassLoader().getResourceAsStream("config/contexts/" + contextStr + ".properties");
            }
            if (inContext != null) {
                //defaultProps is in order to keep the original context value
                if(context != null && context.isEmpty()) {
	                defaultProps.load(inContext);
	                context = new ContextProperties(defaultProps);
                }
                
                inContext.close();
            } else if (!isDefaultContext) {
                //print info and job continue to run, for case: context_param is not empty.
                System.err.println("Could not find the context " + contextStr);
            }

            if(!context_param.isEmpty()) {
                context.putAll(context_param);
				//set types for params from parentJobs
				for (Object key: context_param.keySet()){
					String context_key = key.toString();
					String context_type = context_param.getContextType(context_key);
					context.setContextType(context_key, context_type);

				}
            }
            class ContextProcessing {
                private void processContext_0() {
                        context.setContextType("AMC_DARTY_db_AdditionalParams", "id_String");
                            context.AMC_DARTY_db_AdditionalParams=(String) context.getProperty("AMC_DARTY_db_AdditionalParams");
                        context.setContextType("AMC_DARTY_db_Login", "id_String");
                            context.AMC_DARTY_db_Login=(String) context.getProperty("AMC_DARTY_db_Login");
                        context.setContextType("AMC_DARTY_db_Password", "id_Password");
                            String pwd_AMC_DARTY_db_Password_value = context.getProperty("AMC_DARTY_db_Password");
                            context.AMC_DARTY_db_Password = null;
                            if(pwd_AMC_DARTY_db_Password_value!=null) {
                                if(context_param.containsKey("AMC_DARTY_db_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.AMC_DARTY_db_Password = pwd_AMC_DARTY_db_Password_value;
                                } else if (!pwd_AMC_DARTY_db_Password_value.isEmpty()) {
                                    try {
                                        context.AMC_DARTY_db_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_AMC_DARTY_db_Password_value);
                                        context.put("AMC_DARTY_db_Password",context.AMC_DARTY_db_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        context.setContextType("AMC_DARTY_db_Port", "id_String");
                            context.AMC_DARTY_db_Port=(String) context.getProperty("AMC_DARTY_db_Port");
                        context.setContextType("AMC_DARTY_db_Schema", "id_String");
                            context.AMC_DARTY_db_Schema=(String) context.getProperty("AMC_DARTY_db_Schema");
                        context.setContextType("AMC_DARTY_db_Server", "id_String");
                            context.AMC_DARTY_db_Server=(String) context.getProperty("AMC_DARTY_db_Server");
                        context.setContextType("AMC_DARTY_db_Sid", "id_String");
                            context.AMC_DARTY_db_Sid=(String) context.getProperty("AMC_DARTY_db_Sid");
                        context.setContextType("C01_ClusterDarty_HDFS_Group", "id_String");
                            context.C01_ClusterDarty_HDFS_Group=(String) context.getProperty("C01_ClusterDarty_HDFS_Group");
                        context.setContextType("C01_ClusterDarty_HDFS_Temp_Folder", "id_String");
                            context.C01_ClusterDarty_HDFS_Temp_Folder=(String) context.getProperty("C01_ClusterDarty_HDFS_Temp_Folder");
                        context.setContextType("C01_ClusterDarty_HDFS_User_Name", "id_String");
                            context.C01_ClusterDarty_HDFS_User_Name=(String) context.getProperty("C01_ClusterDarty_HDFS_User_Name");
                        context.setContextType("C01_ClusterDarty_JobtrackerURI", "id_String");
                            context.C01_ClusterDarty_JobtrackerURI=(String) context.getProperty("C01_ClusterDarty_JobtrackerURI");
                        context.setContextType("C01_ClusterDarty_NamenodeURI", "id_String");
                            context.C01_ClusterDarty_NamenodeURI=(String) context.getProperty("C01_ClusterDarty_NamenodeURI");
                        context.setContextType("C01_ClusterDarty_Zookeeper_Host", "id_String");
                            context.C01_ClusterDarty_Zookeeper_Host=(String) context.getProperty("C01_ClusterDarty_Zookeeper_Host");
                        context.setContextType("C01_ClusterDarty_Zookeeper_Port", "id_String");
                            context.C01_ClusterDarty_Zookeeper_Port=(String) context.getProperty("C01_ClusterDarty_Zookeeper_Port");
                        context.setContextType("C10_Hive_connection_Hive_DbDwh_Name", "id_String");
                            context.C10_Hive_connection_Hive_DbDwh_Name=(String) context.getProperty("C10_Hive_connection_Hive_DbDwh_Name");
                        context.setContextType("C10_Hive_connection_Hive_DbHisto_Name", "id_String");
                            context.C10_Hive_connection_Hive_DbHisto_Name=(String) context.getProperty("C10_Hive_connection_Hive_DbHisto_Name");
                        context.setContextType("C10_Hive_connection_Hive_DbNominal_Name", "id_String");
                            context.C10_Hive_connection_Hive_DbNominal_Name=(String) context.getProperty("C10_Hive_connection_Hive_DbNominal_Name");
                        context.setContextType("C10_Hive_connection_Hive_Host", "id_String");
                            context.C10_Hive_connection_Hive_Host=(String) context.getProperty("C10_Hive_connection_Hive_Host");
                        context.setContextType("C10_Hive_connection_Hive_Password", "id_String");
                            context.C10_Hive_connection_Hive_Password=(String) context.getProperty("C10_Hive_connection_Hive_Password");
                        context.setContextType("C10_Hive_connection_Hive_Port", "id_String");
                            context.C10_Hive_connection_Hive_Port=(String) context.getProperty("C10_Hive_connection_Hive_Port");
                        context.setContextType("C10_Hive_connection_Hive_User_Name", "id_String");
                            context.C10_Hive_connection_Hive_User_Name=(String) context.getProperty("C10_Hive_connection_Hive_User_Name");
                        context.setContextType("C100_Tables_RTAC01_HBase", "id_String");
                            context.C100_Tables_RTAC01_HBase=(String) context.getProperty("C100_Tables_RTAC01_HBase");
                        context.setContextType("C100_Tables_RTAC01_MqFile", "id_String");
                            context.C100_Tables_RTAC01_MqFile=(String) context.getProperty("C100_Tables_RTAC01_MqFile");
                        context.setContextType("C100_Tables_RTAC02_HBase", "id_String");
                            context.C100_Tables_RTAC02_HBase=(String) context.getProperty("C100_Tables_RTAC02_HBase");
                        context.setContextType("C100_Tables_RTAC02_MqFile", "id_String");
                            context.C100_Tables_RTAC02_MqFile=(String) context.getProperty("C100_Tables_RTAC02_MqFile");
                        context.setContextType("C100_Tables_RTEM51_HBase", "id_String");
                            context.C100_Tables_RTEM51_HBase=(String) context.getProperty("C100_Tables_RTEM51_HBase");
                        context.setContextType("C100_Tables_RTEM51_MqFile", "id_String");
                            context.C100_Tables_RTEM51_MqFile=(String) context.getProperty("C100_Tables_RTEM51_MqFile");
                        context.setContextType("C100_Tables_RTEM52_HBase", "id_String");
                            context.C100_Tables_RTEM52_HBase=(String) context.getProperty("C100_Tables_RTEM52_HBase");
                        context.setContextType("C100_Tables_RTEM52_MqFile", "id_String");
                            context.C100_Tables_RTEM52_MqFile=(String) context.getProperty("C100_Tables_RTEM52_MqFile");
                        context.setContextType("C100_Tables_RTEM53_HBase", "id_String");
                            context.C100_Tables_RTEM53_HBase=(String) context.getProperty("C100_Tables_RTEM53_HBase");
                        context.setContextType("C100_Tables_RTEM53_MqFile", "id_String");
                            context.C100_Tables_RTEM53_MqFile=(String) context.getProperty("C100_Tables_RTEM53_MqFile");
                        context.setContextType("C100_Tables_RTEM54_HBase", "id_String");
                            context.C100_Tables_RTEM54_HBase=(String) context.getProperty("C100_Tables_RTEM54_HBase");
                        context.setContextType("C100_Tables_RTEM54_MqFile", "id_String");
                            context.C100_Tables_RTEM54_MqFile=(String) context.getProperty("C100_Tables_RTEM54_MqFile");
                        context.setContextType("C100_Tables_RTEM55_HBase", "id_String");
                            context.C100_Tables_RTEM55_HBase=(String) context.getProperty("C100_Tables_RTEM55_HBase");
                        context.setContextType("C100_Tables_RTEM55_MqFile", "id_String");
                            context.C100_Tables_RTEM55_MqFile=(String) context.getProperty("C100_Tables_RTEM55_MqFile");
                        context.setContextType("C100_Tables_RTPC01_HBase", "id_String");
                            context.C100_Tables_RTPC01_HBase=(String) context.getProperty("C100_Tables_RTPC01_HBase");
                        context.setContextType("C100_Tables_RTPC01_MqFile", "id_String");
                            context.C100_Tables_RTPC01_MqFile=(String) context.getProperty("C100_Tables_RTPC01_MqFile");
                        context.setContextType("C100_Tables_RTPC02_HBase", "id_String");
                            context.C100_Tables_RTPC02_HBase=(String) context.getProperty("C100_Tables_RTPC02_HBase");
                        context.setContextType("C100_Tables_RTPC02_MqFile", "id_String");
                            context.C100_Tables_RTPC02_MqFile=(String) context.getProperty("C100_Tables_RTPC02_MqFile");
                        context.setContextType("C130_ElasticSearch_Apport_Retrait", "id_String");
                            context.C130_ElasticSearch_Apport_Retrait=(String) context.getProperty("C130_ElasticSearch_Apport_Retrait");
                        context.setContextType("C130_ElasticSearch_Authorization", "id_String");
                            context.C130_ElasticSearch_Authorization=(String) context.getProperty("C130_ElasticSearch_Authorization");
                        context.setContextType("C130_ElasticSearch_AuthValue", "id_String");
                            context.C130_ElasticSearch_AuthValue=(String) context.getProperty("C130_ElasticSearch_AuthValue");
                        context.setContextType("C130_ElasticSearch_Cadeaux", "id_String");
                            context.C130_ElasticSearch_Cadeaux=(String) context.getProperty("C130_ElasticSearch_Cadeaux");
                        context.setContextType("C130_ElasticSearch_Decompte", "id_String");
                            context.C130_ElasticSearch_Decompte=(String) context.getProperty("C130_ElasticSearch_Decompte");
                        context.setContextType("C130_ElasticSearch_Encaissements", "id_String");
                            context.C130_ElasticSearch_Encaissements=(String) context.getProperty("C130_ElasticSearch_Encaissements");
                        context.setContextType("C130_ElasticSearch_HostRunTime", "id_String");
                            context.C130_ElasticSearch_HostRunTime=(String) context.getProperty("C130_ElasticSearch_HostRunTime");
                        context.setContextType("C130_ElasticSearch_PortRunTime", "id_String");
                            context.C130_ElasticSearch_PortRunTime=(String) context.getProperty("C130_ElasticSearch_PortRunTime");
                        context.setContextType("C130_ElasticSearch_PwdRunTime", "id_String");
                            context.C130_ElasticSearch_PwdRunTime=(String) context.getProperty("C130_ElasticSearch_PwdRunTime");
                        context.setContextType("C130_ElasticSearch_serv", "id_String");
                            context.C130_ElasticSearch_serv=(String) context.getProperty("C130_ElasticSearch_serv");
                        context.setContextType("C130_ElasticSearch_URL", "id_String");
                            context.C130_ElasticSearch_URL=(String) context.getProperty("C130_ElasticSearch_URL");
                        context.setContextType("C130_ElasticSearch_UserRunTime", "id_String");
                            context.C130_ElasticSearch_UserRunTime=(String) context.getProperty("C130_ElasticSearch_UserRunTime");
                        context.setContextType("C130_ElasticSearch_Vente", "id_String");
                            context.C130_ElasticSearch_Vente=(String) context.getProperty("C130_ElasticSearch_Vente");
                        context.setContextType("C130_ElasticSearch_WYNN_Entree_Mag", "id_String");
                            context.C130_ElasticSearch_WYNN_Entree_Mag=(String) context.getProperty("C130_ElasticSearch_WYNN_Entree_Mag");
                        context.setContextType("C130_ElasticSearch_WYNN_Lignes_vente", "id_String");
                            context.C130_ElasticSearch_WYNN_Lignes_vente=(String) context.getProperty("C130_ElasticSearch_WYNN_Lignes_vente");
                        context.setContextType("new1", "id_String");
                            context.new1=(String) context.getProperty("new1");
                        context.setContextType("C30_Directory_HDFS_Archive", "id_String");
                            context.C30_Directory_HDFS_Archive=(String) context.getProperty("C30_Directory_HDFS_Archive");
                        context.setContextType("C30_Directory_HDFS_Conf", "id_String");
                            context.C30_Directory_HDFS_Conf=(String) context.getProperty("C30_Directory_HDFS_Conf");
                        context.setContextType("C30_Directory_HDFS_Dezip", "id_String");
                            context.C30_Directory_HDFS_Dezip=(String) context.getProperty("C30_Directory_HDFS_Dezip");
                        context.setContextType("C30_Directory_HDFS_Dwh", "id_String");
                            context.C30_Directory_HDFS_Dwh=(String) context.getProperty("C30_Directory_HDFS_Dwh");
                        context.setContextType("C30_Directory_HDFS_Input", "id_String");
                            context.C30_Directory_HDFS_Input=(String) context.getProperty("C30_Directory_HDFS_Input");
                        context.setContextType("C30_Directory_HDFS_Json", "id_String");
                            context.C30_Directory_HDFS_Json=(String) context.getProperty("C30_Directory_HDFS_Json");
                        context.setContextType("C30_Directory_HDFS_Mq", "id_String");
                            context.C30_Directory_HDFS_Mq=(String) context.getProperty("C30_Directory_HDFS_Mq");
                        context.setContextType("C30_Directory_HDFS_MQ_Error", "id_String");
                            context.C30_Directory_HDFS_MQ_Error=(String) context.getProperty("C30_Directory_HDFS_MQ_Error");
                        context.setContextType("C30_Directory_HDFS_NCG", "id_String");
                            context.C30_Directory_HDFS_NCG=(String) context.getProperty("C30_Directory_HDFS_NCG");
                        context.setContextType("C30_Directory_HDFS_PCM", "id_String");
                            context.C30_Directory_HDFS_PCM=(String) context.getProperty("C30_Directory_HDFS_PCM");
                        context.setContextType("C30_Directory_HDFS_Pig", "id_String");
                            context.C30_Directory_HDFS_Pig=(String) context.getProperty("C30_Directory_HDFS_Pig");
                        context.setContextType("C30_Directory_HDFS_Racine", "id_String");
                            context.C30_Directory_HDFS_Racine=(String) context.getProperty("C30_Directory_HDFS_Racine");
                        context.setContextType("C30_Directory_HDFS_REF", "id_String");
                            context.C30_Directory_HDFS_REF=(String) context.getProperty("C30_Directory_HDFS_REF");
                        context.setContextType("C30_Directory_HDFS_Rejets", "id_String");
                            context.C30_Directory_HDFS_Rejets=(String) context.getProperty("C30_Directory_HDFS_Rejets");
                        context.setContextType("C30_Directory_HDFS_Reprise", "id_String");
                            context.C30_Directory_HDFS_Reprise=(String) context.getProperty("C30_Directory_HDFS_Reprise");
                        context.setContextType("C30_Directory_HDFS_Tmp", "id_String");
                            context.C30_Directory_HDFS_Tmp=(String) context.getProperty("C30_Directory_HDFS_Tmp");
                        context.setContextType("C30_Directory_HDFS_Transac", "id_String");
                            context.C30_Directory_HDFS_Transac=(String) context.getProperty("C30_Directory_HDFS_Transac");
                        context.setContextType("C30_Directory_HDFS_Work", "id_String");
                            context.C30_Directory_HDFS_Work=(String) context.getProperty("C30_Directory_HDFS_Work");
                        context.setContextType("C30_Directory_HIVE_Racine", "id_String");
                            context.C30_Directory_HIVE_Racine=(String) context.getProperty("C30_Directory_HIVE_Racine");
                        context.setContextType("C30_Directory_INPUT_DWH", "id_String");
                            context.C30_Directory_INPUT_DWH=(String) context.getProperty("C30_Directory_INPUT_DWH");
                        context.setContextType("C30_Directory_INPUT_FUNC_LOG", "id_String");
                            context.C30_Directory_INPUT_FUNC_LOG=(String) context.getProperty("C30_Directory_INPUT_FUNC_LOG");
                        context.setContextType("C30_Directory_INPUT_NCG", "id_String");
                            context.C30_Directory_INPUT_NCG=(String) context.getProperty("C30_Directory_INPUT_NCG");
                        context.setContextType("C30_Directory_INPUT_QLIK", "id_String");
                            context.C30_Directory_INPUT_QLIK=(String) context.getProperty("C30_Directory_INPUT_QLIK");
                        context.setContextType("C30_Directory_INPUT_TMP", "id_String");
                            context.C30_Directory_INPUT_TMP=(String) context.getProperty("C30_Directory_INPUT_TMP");
                        context.setContextType("C30_Directory_INPUT_Transac_NCG", "id_String");
                            context.C30_Directory_INPUT_Transac_NCG=(String) context.getProperty("C30_Directory_INPUT_Transac_NCG");
                        context.setContextType("C40_FileName_EndOfFile_Histo", "id_String");
                            context.C40_FileName_EndOfFile_Histo=(String) context.getProperty("C40_FileName_EndOfFile_Histo");
                        context.setContextType("C40_FileName_EndOfFile_Histo_Nominal_Queue", "id_String");
                            context.C40_FileName_EndOfFile_Histo_Nominal_Queue=(String) context.getProperty("C40_FileName_EndOfFile_Histo_Nominal_Queue");
                        context.setContextType("C40_FilesName_ARCHIVE_HDFS_SUFFIX", "id_String");
                            context.C40_FilesName_ARCHIVE_HDFS_SUFFIX=(String) context.getProperty("C40_FilesName_ARCHIVE_HDFS_SUFFIX");
                        context.setContextType("C40_FilesName_HISTO_Delimiter_Denormalize", "id_String");
                            context.C40_FilesName_HISTO_Delimiter_Denormalize=(String) context.getProperty("C40_FilesName_HISTO_Delimiter_Denormalize");
                        context.setContextType("C40_FilesName_HISTO_Extension_src", "id_String");
                            context.C40_FilesName_HISTO_Extension_src=(String) context.getProperty("C40_FilesName_HISTO_Extension_src");
                        context.setContextType("C40_FilesName_HISTO_Extension_tmp", "id_String");
                            context.C40_FilesName_HISTO_Extension_tmp=(String) context.getProperty("C40_FilesName_HISTO_Extension_tmp");
                        context.setContextType("C40_FilesName_HISTO_Mask_Src", "id_String");
                            context.C40_FilesName_HISTO_Mask_Src=(String) context.getProperty("C40_FilesName_HISTO_Mask_Src");
                        context.setContextType("C40_FilesName_HISTO_Mask_tmp", "id_String");
                            context.C40_FilesName_HISTO_Mask_tmp=(String) context.getProperty("C40_FilesName_HISTO_Mask_tmp");
                        context.setContextType("C40_FilesName_RepriseHistoProperties", "id_String");
                            context.C40_FilesName_RepriseHistoProperties=(String) context.getProperty("C40_FilesName_RepriseHistoProperties");
                        context.setContextType("C50_DB2_flowTable", "id_String");
                            context.C50_DB2_flowTable=(String) context.getProperty("C50_DB2_flowTable");
                        context.setContextType("C50_DB2_hostname", "id_String");
                            context.C50_DB2_hostname=(String) context.getProperty("C50_DB2_hostname");
                        context.setContextType("C50_DB2_instance", "id_String");
                            context.C50_DB2_instance=(String) context.getProperty("C50_DB2_instance");
                        context.setContextType("C50_DB2_logTable", "id_String");
                            context.C50_DB2_logTable=(String) context.getProperty("C50_DB2_logTable");
                        context.setContextType("C50_DB2_port", "id_String");
                            context.C50_DB2_port=(String) context.getProperty("C50_DB2_port");
                        context.setContextType("C50_DB2_pwd", "id_String");
                            context.C50_DB2_pwd=(String) context.getProperty("C50_DB2_pwd");
                        context.setContextType("C50_DB2_schema", "id_String");
                            context.C50_DB2_schema=(String) context.getProperty("C50_DB2_schema");
                        context.setContextType("C50_DB2_statTable", "id_String");
                            context.C50_DB2_statTable=(String) context.getProperty("C50_DB2_statTable");
                        context.setContextType("C50_DB2_user", "id_String");
                            context.C50_DB2_user=(String) context.getProperty("C50_DB2_user");
                        context.setContextType("C60_FilesName_DWH_H_Articles", "id_String");
                            context.C60_FilesName_DWH_H_Articles=(String) context.getProperty("C60_FilesName_DWH_H_Articles");
                        }

                private void processContext_1() {
                        context.setContextType("C60_FilesName_DWH_H_Orga", "id_String");
                            context.C60_FilesName_DWH_H_Orga=(String) context.getProperty("C60_FilesName_DWH_H_Orga");
                        context.setContextType("C60_FilesName_DWH_H_Prestas", "id_String");
                            context.C60_FilesName_DWH_H_Prestas=(String) context.getProperty("C60_FilesName_DWH_H_Prestas");
                        context.setContextType("C60_FilesName_DWH_RTGA01", "id_String");
                            context.C60_FilesName_DWH_RTGA01=(String) context.getProperty("C60_FilesName_DWH_RTGA01");
                        context.setContextType("C60_FilesName_DWH_RTGA75", "id_String");
                            context.C60_FilesName_DWH_RTGA75=(String) context.getProperty("C60_FilesName_DWH_RTGA75");
                        context.setContextType("C60_FilesName_DWH_RTGG40", "id_String");
                            context.C60_FilesName_DWH_RTGG40=(String) context.getProperty("C60_FilesName_DWH_RTGG40");
                        context.setContextType("C60_FilesName_DWH_RTGV31", "id_String");
                            context.C60_FilesName_DWH_RTGV31=(String) context.getProperty("C60_FilesName_DWH_RTGV31");
                        context.setContextType("C60_FilesName_DWR_TORG", "id_String");
                            context.C60_FilesName_DWR_TORG=(String) context.getProperty("C60_FilesName_DWR_TORG");
                        context.setContextType("C60_FilesName_DWR_TPRESTA", "id_String");
                            context.C60_FilesName_DWR_TPRESTA=(String) context.getProperty("C60_FilesName_DWR_TPRESTA");
                        context.setContextType("C60_FilesName_DWR_TPRODUIT", "id_String");
                            context.C60_FilesName_DWR_TPRODUIT=(String) context.getProperty("C60_FilesName_DWR_TPRODUIT");
                        context.setContextType("C60_FilesName_HISTO_RTGV02", "id_String");
                            context.C60_FilesName_HISTO_RTGV02=(String) context.getProperty("C60_FilesName_HISTO_RTGV02");
                        context.setContextType("C60_FilesName_HISTO_RTGV10", "id_String");
                            context.C60_FilesName_HISTO_RTGV10=(String) context.getProperty("C60_FilesName_HISTO_RTGV10");
                        context.setContextType("C60_FilesName_HISTO_RTGV14", "id_String");
                            context.C60_FilesName_HISTO_RTGV14=(String) context.getProperty("C60_FilesName_HISTO_RTGV14");
                        context.setContextType("C60_FilesName_HISTO_RTVT01", "id_String");
                            context.C60_FilesName_HISTO_RTVT01=(String) context.getProperty("C60_FilesName_HISTO_RTVT01");
                        context.setContextType("C60_FilesName_HISTO_RTVT02", "id_String");
                            context.C60_FilesName_HISTO_RTVT02=(String) context.getProperty("C60_FilesName_HISTO_RTVT02");
                        context.setContextType("C60_FilesName_HISTO_RTVT03", "id_String");
                            context.C60_FilesName_HISTO_RTVT03=(String) context.getProperty("C60_FilesName_HISTO_RTVT03");
                        context.setContextType("C60_FilesName_HISTO_RTVT08", "id_String");
                            context.C60_FilesName_HISTO_RTVT08=(String) context.getProperty("C60_FilesName_HISTO_RTVT08");
                        context.setContextType("C60_FilesName_HISTO_RTVT11", "id_String");
                            context.C60_FilesName_HISTO_RTVT11=(String) context.getProperty("C60_FilesName_HISTO_RTVT11");
                        context.setContextType("C60_FilesName_HISTO_RTVT12", "id_String");
                            context.C60_FilesName_HISTO_RTVT12=(String) context.getProperty("C60_FilesName_HISTO_RTVT12");
                        context.setContextType("C60_FilesName_HISTO_RTVT13", "id_String");
                            context.C60_FilesName_HISTO_RTVT13=(String) context.getProperty("C60_FilesName_HISTO_RTVT13");
                        context.setContextType("C60_FilesName_HISTO_RTVT14", "id_String");
                            context.C60_FilesName_HISTO_RTVT14=(String) context.getProperty("C60_FilesName_HISTO_RTVT14");
                        context.setContextType("C60_FilesName_HISTO_RTVT15", "id_String");
                            context.C60_FilesName_HISTO_RTVT15=(String) context.getProperty("C60_FilesName_HISTO_RTVT15");
                        context.setContextType("C60_FilesName_HISTO_RTVT16", "id_String");
                            context.C60_FilesName_HISTO_RTVT16=(String) context.getProperty("C60_FilesName_HISTO_RTVT16");
                        context.setContextType("C60_FilesName_HISTO_RTVT17", "id_String");
                            context.C60_FilesName_HISTO_RTVT17=(String) context.getProperty("C60_FilesName_HISTO_RTVT17");
                        context.setContextType("C80_MQDarty_NCG_CONNECTION_Canal", "id_String");
                            context.C80_MQDarty_NCG_CONNECTION_Canal=(String) context.getProperty("C80_MQDarty_NCG_CONNECTION_Canal");
                        context.setContextType("C80_MQDarty_NCG_CONNECTION_Port", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_CONNECTION_Port=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_CONNECTION_Port"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_CONNECTION_Port", e.getMessage()));
                                context.C80_MQDarty_NCG_CONNECTION_Port=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_CONNECTION_Pwd", "id_String");
                            context.C80_MQDarty_NCG_CONNECTION_Pwd=(String) context.getProperty("C80_MQDarty_NCG_CONNECTION_Pwd");
                        context.setContextType("C80_MQDarty_NCG_CONNECTION_QueueManager", "id_String");
                            context.C80_MQDarty_NCG_CONNECTION_QueueManager=(String) context.getProperty("C80_MQDarty_NCG_CONNECTION_QueueManager");
                        context.setContextType("C80_MQDarty_NCG_CONNECTION_Server", "id_String");
                            context.C80_MQDarty_NCG_CONNECTION_Server=(String) context.getProperty("C80_MQDarty_NCG_CONNECTION_Server");
                        context.setContextType("C80_MQDarty_NCG_CONNECTION_User", "id_String");
                            context.C80_MQDarty_NCG_CONNECTION_User=(String) context.getProperty("C80_MQDarty_NCG_CONNECTION_User");
                        context.setContextType("C80_MQDarty_NCG_Error_Canal", "id_String");
                            context.C80_MQDarty_NCG_Error_Canal=(String) context.getProperty("C80_MQDarty_NCG_Error_Canal");
                        context.setContextType("C80_MQDarty_NCG_Error_Port", "id_String");
                            context.C80_MQDarty_NCG_Error_Port=(String) context.getProperty("C80_MQDarty_NCG_Error_Port");
                        context.setContextType("C80_MQDarty_NCG_Error_Pwd", "id_String");
                            context.C80_MQDarty_NCG_Error_Pwd=(String) context.getProperty("C80_MQDarty_NCG_Error_Pwd");
                        context.setContextType("C80_MQDarty_NCG_Error_QueueManager", "id_String");
                            context.C80_MQDarty_NCG_Error_QueueManager=(String) context.getProperty("C80_MQDarty_NCG_Error_QueueManager");
                        context.setContextType("C80_MQDarty_NCG_Error_QueueName", "id_String");
                            context.C80_MQDarty_NCG_Error_QueueName=(String) context.getProperty("C80_MQDarty_NCG_Error_QueueName");
                        context.setContextType("C80_MQDarty_NCG_Error_Server", "id_String");
                            context.C80_MQDarty_NCG_Error_Server=(String) context.getProperty("C80_MQDarty_NCG_Error_Server");
                        context.setContextType("C80_MQDarty_NCG_Error_User", "id_String");
                            context.C80_MQDarty_NCG_Error_User=(String) context.getProperty("C80_MQDarty_NCG_Error_User");
                        context.setContextType("C80_MQDarty_NCG_RTAC03_FilesName_RTAC03", "id_String");
                            context.C80_MQDarty_NCG_RTAC03_FilesName_RTAC03=(String) context.getProperty("C80_MQDarty_NCG_RTAC03_FilesName_RTAC03");
                        context.setContextType("C80_MQDarty_NCG_RTAC03_GRP_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTAC03_GRP_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTAC03_GRP_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTAC03_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTAC03_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTAC03_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTAC03_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTAC03_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTAC03_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTAC03_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTAC03_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTAC03_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTAC03_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTAC03_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTAC03_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTAC03_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTAC03_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTAC03_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTAC03_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTAC03_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTAC03_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTAC03_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV02_FilesName_RTGV02", "id_String");
                            context.C80_MQDarty_NCG_RTGV02_FilesName_RTGV02=(String) context.getProperty("C80_MQDarty_NCG_RTGV02_FilesName_RTGV02");
                        context.setContextType("C80_MQDarty_NCG_RTGV02_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV02_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV02_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV02_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV02_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV02_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV02_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV02_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV02_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV02_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV02_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV02_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV02_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV02_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV02_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV02_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV02_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV02_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV02_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV02_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV02_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV02_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV03_FilesName_RTGV03", "id_String");
                            context.C80_MQDarty_NCG_RTGV03_FilesName_RTGV03=(String) context.getProperty("C80_MQDarty_NCG_RTGV03_FilesName_RTGV03");
                        context.setContextType("C80_MQDarty_NCG_RTGV03_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV03_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV03_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV03_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV03_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV03_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV03_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV03_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV03_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV03_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV03_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV03_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV03_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV03_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV03_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV03_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV03_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV03_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV03_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV03_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV03_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV03_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV04_FilesName_RTGV04", "id_String");
                            context.C80_MQDarty_NCG_RTGV04_FilesName_RTGV04=(String) context.getProperty("C80_MQDarty_NCG_RTGV04_FilesName_RTGV04");
                        context.setContextType("C80_MQDarty_NCG_RTGV04_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV04_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV04_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV04_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV04_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV04_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV04_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV04_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV04_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV04_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV04_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV04_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV04_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV04_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV04_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV04_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV04_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV04_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV04_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV04_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV04_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV04_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV10_FilesName_RTGV10", "id_String");
                            context.C80_MQDarty_NCG_RTGV10_FilesName_RTGV10=(String) context.getProperty("C80_MQDarty_NCG_RTGV10_FilesName_RTGV10");
                        context.setContextType("C80_MQDarty_NCG_RTGV10_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV10_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV10_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV10_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV10_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV10_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV10_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV10_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV10_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV10_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV10_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV10_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV10_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV10_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV10_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV10_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV10_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV10_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV10_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV10_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV10_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV10_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV11_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV11_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV11_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV11_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV11_NbProcessingFile", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV11_NbProcessingFile=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV11_NbProcessingFile"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV11_NbProcessingFile", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV11_NbProcessingFile=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV11_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV11_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV11_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV11_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV11_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV11_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV11_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV11_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV11_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV14_FilesName_RTGV14", "id_String");
                            context.C80_MQDarty_NCG_RTGV14_FilesName_RTGV14=(String) context.getProperty("C80_MQDarty_NCG_RTGV14_FilesName_RTGV14");
                        context.setContextType("C80_MQDarty_NCG_RTGV14_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV14_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV14_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV14_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV14_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV14_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV14_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV14_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV14_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV14_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV14_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV14_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV14_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV14_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV14_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV14_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV14_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV14_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV14_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV14_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV14_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV14_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTGV15_FilesName_RTGV15", "id_String");
                            context.C80_MQDarty_NCG_RTGV15_FilesName_RTGV15=(String) context.getProperty("C80_MQDarty_NCG_RTGV15_FilesName_RTGV15");
                        context.setContextType("C80_MQDarty_NCG_RTGV15_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTGV15_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTGV15_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTGV15_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTGV15_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTGV15_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTGV15_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV15_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV15_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV15_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV15_NbMessage=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV15_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTGV15_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTGV15_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTGV15_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTGV15_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTGV15_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTGV15_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTGV15_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTGV15_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTGV15_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTGV15_TraitementName");
                        context.setContextType("C80_MQDarty_NCG_RTTL04_FilesName_RTTL04", "id_String");
                            context.C80_MQDarty_NCG_RTTL04_FilesName_RTTL04=(String) context.getProperty("C80_MQDarty_NCG_RTTL04_FilesName_RTTL04");
                        context.setContextType("C80_MQDarty_NCG_RTTL04_HBase", "id_String");
                            context.C80_MQDarty_NCG_RTTL04_HBase=(String) context.getProperty("C80_MQDarty_NCG_RTTL04_HBase");
                        context.setContextType("C80_MQDarty_NCG_RTTL04_Modele", "id_String");
                            context.C80_MQDarty_NCG_RTTL04_Modele=(String) context.getProperty("C80_MQDarty_NCG_RTTL04_Modele");
                        context.setContextType("C80_MQDarty_NCG_RTTL04_NbMessage", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTTL04_NbMessage=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTTL04_NbMessage"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTTL04_NbMessage", e.getMessage()));
                                context.C80_MQDarty_NCG_RTTL04_NbMessage=null;
                            }
                        }

                private void processContext_2() {
                        context.setContextType("C80_MQDarty_NCG_RTTL04_QueueName", "id_String");
                            context.C80_MQDarty_NCG_RTTL04_QueueName=(String) context.getProperty("C80_MQDarty_NCG_RTTL04_QueueName");
                        context.setContextType("C80_MQDarty_NCG_RTTL04_TimeOut", "id_Integer");
                            try{
                                context.C80_MQDarty_NCG_RTTL04_TimeOut=routines.system.ParserUtils.parseTo_Integer (context.getProperty("C80_MQDarty_NCG_RTTL04_TimeOut"));
                            } catch(NumberFormatException e){
                                log.warn(String.format("Null value will be used for context parameter %s: %s", "C80_MQDarty_NCG_RTTL04_TimeOut", e.getMessage()));
                                context.C80_MQDarty_NCG_RTTL04_TimeOut=null;
                            }
                        context.setContextType("C80_MQDarty_NCG_RTTL04_TraitementName", "id_String");
                            context.C80_MQDarty_NCG_RTTL04_TraitementName=(String) context.getProperty("C80_MQDarty_NCG_RTTL04_TraitementName");
                        context.setContextType("CtxPathFile", "id_String");
                            context.CtxPathFile=(String) context.getProperty("CtxPathFile");
                        context.setContextType("DartyEncoding", "id_String");
                            context.DartyEncoding=(String) context.getProperty("DartyEncoding");
                        context.setContextType("Dir_conf", "id_String");
                            context.Dir_conf=(String) context.getProperty("Dir_conf");
                        context.setContextType("FilePath_StopNgo_Json", "id_String");
                            context.FilePath_StopNgo_Json=(String) context.getProperty("FilePath_StopNgo_Json");
                        context.setContextType("FilePath_StopNgo_Nominal", "id_String");
                            context.FilePath_StopNgo_Nominal=(String) context.getProperty("FilePath_StopNgo_Nominal");
                        context.setContextType("ProfondeurHisto", "id_String");
                            context.ProfondeurHisto=(String) context.getProperty("ProfondeurHisto");
                        context.setContextType("ShardingGV11", "id_String");
                            context.ShardingGV11=(String) context.getProperty("ShardingGV11");
                        context.setContextType("TimerCheckLoop", "id_String");
                            context.TimerCheckLoop=(String) context.getProperty("TimerCheckLoop");
                        context.setContextType("TimerLoopStopNGo", "id_String");
                            context.TimerLoopStopNGo=(String) context.getProperty("TimerLoopStopNGo");
                        context.setContextType("CLOCAL_Cartes_Cadeaux_JSON", "id_String");
                            context.CLOCAL_Cartes_Cadeaux_JSON=(String) context.getProperty("CLOCAL_Cartes_Cadeaux_JSON");
                        context.setContextType("FilesName_Json_Cartes_Cadeaux", "id_String");
                            context.FilesName_Json_Cartes_Cadeaux=(String) context.getProperty("FilesName_Json_Cartes_Cadeaux");
                        context.setContextType("C30_File_Json_Apport_Retrait", "id_String");
                            context.C30_File_Json_Apport_Retrait=(String) context.getProperty("C30_File_Json_Apport_Retrait");
                        context.setContextType("C30_FilesName_Json_Decompte", "id_String");
                            context.C30_FilesName_Json_Decompte=(String) context.getProperty("C30_FilesName_Json_Decompte");
                        context.setContextType("CLOCAL_apport_retrait_JSON", "id_String");
                            context.CLOCAL_apport_retrait_JSON=(String) context.getProperty("CLOCAL_apport_retrait_JSON");
                        context.setContextType("CLOCAL_decompte_JSON", "id_String");
                            context.CLOCAL_decompte_JSON=(String) context.getProperty("CLOCAL_decompte_JSON");
                        context.setContextType("CLOCAL_entete_encaissement_JSON", "id_String");
                            context.CLOCAL_entete_encaissement_JSON=(String) context.getProperty("CLOCAL_entete_encaissement_JSON");
                        context.setContextType("CLOCAL_lignes_encaissement_JSON", "id_String");
                            context.CLOCAL_lignes_encaissement_JSON=(String) context.getProperty("CLOCAL_lignes_encaissement_JSON");
                        context.setContextType("CLOCAL_MQ_Ref_Filename_AR", "id_String");
                            context.CLOCAL_MQ_Ref_Filename_AR=(String) context.getProperty("CLOCAL_MQ_Ref_Filename_AR");
                        context.setContextType("CLOCAL_MQ_Ref_Filename_DE", "id_String");
                            context.CLOCAL_MQ_Ref_Filename_DE=(String) context.getProperty("CLOCAL_MQ_Ref_Filename_DE");
                        context.setContextType("CLOCAL_OutputJsonFileName_AR", "id_String");
                            context.CLOCAL_OutputJsonFileName_AR=(String) context.getProperty("CLOCAL_OutputJsonFileName_AR");
                        context.setContextType("CLOCAL_OutputJsonFileName_DE", "id_String");
                            context.CLOCAL_OutputJsonFileName_DE=(String) context.getProperty("CLOCAL_OutputJsonFileName_DE");
                        context.setContextType("CLOCAL_Prefix_Temp_Files_AR", "id_String");
                            context.CLOCAL_Prefix_Temp_Files_AR=(String) context.getProperty("CLOCAL_Prefix_Temp_Files_AR");
                        context.setContextType("CLOCAL_Prefix_Temp_Files_DE", "id_String");
                            context.CLOCAL_Prefix_Temp_Files_DE=(String) context.getProperty("CLOCAL_Prefix_Temp_Files_DE");
                        context.setContextType("CLOCAL_reglements_JSON", "id_String");
                            context.CLOCAL_reglements_JSON=(String) context.getProperty("CLOCAL_reglements_JSON");
                        context.setContextType("FilesName_Json_Encaissements", "id_String");
                            context.FilesName_Json_Encaissements=(String) context.getProperty("FilesName_Json_Encaissements");
                        context.setContextType("C30_FilesName_Json_Ventes", "id_String");
                            context.C30_FilesName_Json_Ventes=(String) context.getProperty("C30_FilesName_Json_Ventes");
                        context.setContextType("CLOCAL_Adresse_JSON", "id_String");
                            context.CLOCAL_Adresse_JSON=(String) context.getProperty("CLOCAL_Adresse_JSON");
                        context.setContextType("CLOCAL_Email_JSON", "id_String");
                            context.CLOCAL_Email_JSON=(String) context.getProperty("CLOCAL_Email_JSON");
                        context.setContextType("CLOCAL_Encaissement_JSON", "id_String");
                            context.CLOCAL_Encaissement_JSON=(String) context.getProperty("CLOCAL_Encaissement_JSON");
                        context.setContextType("CLOCAL_Entete_vente_JSON", "id_String");
                            context.CLOCAL_Entete_vente_JSON=(String) context.getProperty("CLOCAL_Entete_vente_JSON");
                        context.setContextType("CLOCAL_Lignes_vente_JSON", "id_String");
                            context.CLOCAL_Lignes_vente_JSON=(String) context.getProperty("CLOCAL_Lignes_vente_JSON");
                        context.setContextType("CLOCAL_Masque", "id_String");
                            context.CLOCAL_Masque=(String) context.getProperty("CLOCAL_Masque");
                        context.setContextType("CLOCAL_Options_JSON", "id_String");
                            context.CLOCAL_Options_JSON=(String) context.getProperty("CLOCAL_Options_JSON");
                        context.setContextType("CLOCAL_Prefix_Temp_Files", "id_String");
                            context.CLOCAL_Prefix_Temp_Files=(String) context.getProperty("CLOCAL_Prefix_Temp_Files");
                        context.setContextType("CLOCAL_Reprise", "id_String");
                            context.CLOCAL_Reprise=(String) context.getProperty("CLOCAL_Reprise");
                        context.setContextType("CLOCAL_Retours_JSON", "id_String");
                            context.CLOCAL_Retours_JSON=(String) context.getProperty("CLOCAL_Retours_JSON");
                        context.setContextType("CLOCAL_Vadd_JSON", "id_String");
                            context.CLOCAL_Vadd_JSON=(String) context.getProperty("CLOCAL_Vadd_JSON");
                        context.setContextType("C30_File_Json_Lignes_LV", "id_String");
                            context.C30_File_Json_Lignes_LV=(String) context.getProperty("C30_File_Json_Lignes_LV");
                        context.setContextType("CLOCAL_NomBloc_JSON_EM", "id_String");
                            context.CLOCAL_NomBloc_JSON_EM=(String) context.getProperty("CLOCAL_NomBloc_JSON_EM");
                        context.setContextType("CLOCAL_NomBloc_JSON_LV", "id_String");
                            context.CLOCAL_NomBloc_JSON_LV=(String) context.getProperty("CLOCAL_NomBloc_JSON_LV");
                        context.setContextType("File_Json_RTAC03", "id_String");
                            context.File_Json_RTAC03=(String) context.getProperty("File_Json_RTAC03");
                        context.setContextType("keyFileName_EM", "id_String");
                            context.keyFileName_EM=(String) context.getProperty("keyFileName_EM");
                        context.setContextType("keyFileName_LV", "id_String");
                            context.keyFileName_LV=(String) context.getProperty("keyFileName_LV");
                        context.setContextType("keyFileName_LV_BatchHive", "id_String");
                            context.keyFileName_LV_BatchHive=(String) context.getProperty("keyFileName_LV_BatchHive");
                        context.setContextType("qVenteFileName_EM", "id_String");
                            context.qVenteFileName_EM=(String) context.getProperty("qVenteFileName_EM");
                        context.setContextType("PCM_ClassName", "id_String");
                            context.PCM_ClassName=(String) context.getProperty("PCM_ClassName");
                        context.setContextType("PCM_DriverJar", "id_String");
                            context.PCM_DriverJar=(String) context.getProperty("PCM_DriverJar");
                        context.setContextType("PCM_JdbcUrl", "id_String");
                            context.PCM_JdbcUrl=(String) context.getProperty("PCM_JdbcUrl");
                        context.setContextType("PCM_Login", "id_String");
                            context.PCM_Login=(String) context.getProperty("PCM_Login");
                        context.setContextType("PCM_MappingFile", "id_String");
                            context.PCM_MappingFile=(String) context.getProperty("PCM_MappingFile");
                        context.setContextType("PCM_Password", "id_Password");
                            String pwd_PCM_Password_value = context.getProperty("PCM_Password");
                            context.PCM_Password = null;
                            if(pwd_PCM_Password_value!=null) {
                                if(context_param.containsKey("PCM_Password")) {//no need to decrypt if it come from program argument or parent job runtime
                                    context.PCM_Password = pwd_PCM_Password_value;
                                } else if (!pwd_PCM_Password_value.isEmpty()) {
                                    try {
                                        context.PCM_Password = routines.system.PasswordEncryptUtil.decryptPassword(pwd_PCM_Password_value);
                                        context.put("PCM_Password",context.PCM_Password);
                                    } catch (java.lang.RuntimeException e) {
                                        //do nothing
                                    }
                                }
                            }
                        context.setContextType("DB2_host", "id_String");
                            context.DB2_host=(String) context.getProperty("DB2_host");
                        context.setContextType("DB2_instance", "id_String");
                            context.DB2_instance=(String) context.getProperty("DB2_instance");
                        context.setContextType("DB2_login", "id_String");
                            context.DB2_login=(String) context.getProperty("DB2_login");
                        context.setContextType("DB2_port", "id_String");
                            context.DB2_port=(String) context.getProperty("DB2_port");
                        context.setContextType("DB2_pwd", "id_String");
                            context.DB2_pwd=(String) context.getProperty("DB2_pwd");
                        context.setContextType("DB2_schema", "id_String");
                            context.DB2_schema=(String) context.getProperty("DB2_schema");
                        context.setContextType("Local_Logs_Directory", "id_String");
                            context.Local_Logs_Directory=(String) context.getProperty("Local_Logs_Directory");
                        context.setContextType("Local_Logs_FileName", "id_String");
                            context.Local_Logs_FileName=(String) context.getProperty("Local_Logs_FileName");
                        context.setContextType("Local_Meters_FileName", "id_String");
                            context.Local_Meters_FileName=(String) context.getProperty("Local_Meters_FileName");
                        context.setContextType("Local_Stats_FileName", "id_String");
                            context.Local_Stats_FileName=(String) context.getProperty("Local_Stats_FileName");
                        context.setContextType("ficPropertiesName", "id_String");
                            context.ficPropertiesName=(String) context.getProperty("ficPropertiesName");
                        context.setContextType("MARIADB_Connect_Host", "id_String");
                            context.MARIADB_Connect_Host=(String) context.getProperty("MARIADB_Connect_Host");
                        context.setContextType("MARIADB_Connect_Port", "id_String");
                            context.MARIADB_Connect_Port=(String) context.getProperty("MARIADB_Connect_Port");
                        context.setContextType("MARIADB_Connect_Database", "id_String");
                            context.MARIADB_Connect_Database=(String) context.getProperty("MARIADB_Connect_Database");
                        context.setContextType("MARIADB_Connect_User_Name", "id_String");
                            context.MARIADB_Connect_User_Name=(String) context.getProperty("MARIADB_Connect_User_Name");
                        context.setContextType("MARIADB_Connect_User_Password", "id_String");
                            context.MARIADB_Connect_User_Password=(String) context.getProperty("MARIADB_Connect_User_Password");
                } 
                public void processAllContext() {
                        processContext_0();
                        processContext_1();
                        processContext_2();
                }
            }

            new ContextProcessing().processAllContext();
        } catch (java.io.IOException ie) {
            System.err.println("Could not load context "+contextStr);
            ie.printStackTrace();
        }

        // get context value from parent directly
        if (parentContextMap != null && !parentContextMap.isEmpty()) {if (parentContextMap.containsKey("AMC_DARTY_db_AdditionalParams")) {
                context.AMC_DARTY_db_AdditionalParams = (String) parentContextMap.get("AMC_DARTY_db_AdditionalParams");
            }if (parentContextMap.containsKey("AMC_DARTY_db_Login")) {
                context.AMC_DARTY_db_Login = (String) parentContextMap.get("AMC_DARTY_db_Login");
            }if (parentContextMap.containsKey("AMC_DARTY_db_Password")) {
                context.AMC_DARTY_db_Password = (java.lang.String) parentContextMap.get("AMC_DARTY_db_Password");
            }if (parentContextMap.containsKey("AMC_DARTY_db_Port")) {
                context.AMC_DARTY_db_Port = (String) parentContextMap.get("AMC_DARTY_db_Port");
            }if (parentContextMap.containsKey("AMC_DARTY_db_Schema")) {
                context.AMC_DARTY_db_Schema = (String) parentContextMap.get("AMC_DARTY_db_Schema");
            }if (parentContextMap.containsKey("AMC_DARTY_db_Server")) {
                context.AMC_DARTY_db_Server = (String) parentContextMap.get("AMC_DARTY_db_Server");
            }if (parentContextMap.containsKey("AMC_DARTY_db_Sid")) {
                context.AMC_DARTY_db_Sid = (String) parentContextMap.get("AMC_DARTY_db_Sid");
            }if (parentContextMap.containsKey("C01_ClusterDarty_HDFS_Group")) {
                context.C01_ClusterDarty_HDFS_Group = (String) parentContextMap.get("C01_ClusterDarty_HDFS_Group");
            }if (parentContextMap.containsKey("C01_ClusterDarty_HDFS_Temp_Folder")) {
                context.C01_ClusterDarty_HDFS_Temp_Folder = (String) parentContextMap.get("C01_ClusterDarty_HDFS_Temp_Folder");
            }if (parentContextMap.containsKey("C01_ClusterDarty_HDFS_User_Name")) {
                context.C01_ClusterDarty_HDFS_User_Name = (String) parentContextMap.get("C01_ClusterDarty_HDFS_User_Name");
            }if (parentContextMap.containsKey("C01_ClusterDarty_JobtrackerURI")) {
                context.C01_ClusterDarty_JobtrackerURI = (String) parentContextMap.get("C01_ClusterDarty_JobtrackerURI");
            }if (parentContextMap.containsKey("C01_ClusterDarty_NamenodeURI")) {
                context.C01_ClusterDarty_NamenodeURI = (String) parentContextMap.get("C01_ClusterDarty_NamenodeURI");
            }if (parentContextMap.containsKey("C01_ClusterDarty_Zookeeper_Host")) {
                context.C01_ClusterDarty_Zookeeper_Host = (String) parentContextMap.get("C01_ClusterDarty_Zookeeper_Host");
            }if (parentContextMap.containsKey("C01_ClusterDarty_Zookeeper_Port")) {
                context.C01_ClusterDarty_Zookeeper_Port = (String) parentContextMap.get("C01_ClusterDarty_Zookeeper_Port");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_DbDwh_Name")) {
                context.C10_Hive_connection_Hive_DbDwh_Name = (String) parentContextMap.get("C10_Hive_connection_Hive_DbDwh_Name");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_DbHisto_Name")) {
                context.C10_Hive_connection_Hive_DbHisto_Name = (String) parentContextMap.get("C10_Hive_connection_Hive_DbHisto_Name");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_DbNominal_Name")) {
                context.C10_Hive_connection_Hive_DbNominal_Name = (String) parentContextMap.get("C10_Hive_connection_Hive_DbNominal_Name");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_Host")) {
                context.C10_Hive_connection_Hive_Host = (String) parentContextMap.get("C10_Hive_connection_Hive_Host");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_Password")) {
                context.C10_Hive_connection_Hive_Password = (String) parentContextMap.get("C10_Hive_connection_Hive_Password");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_Port")) {
                context.C10_Hive_connection_Hive_Port = (String) parentContextMap.get("C10_Hive_connection_Hive_Port");
            }if (parentContextMap.containsKey("C10_Hive_connection_Hive_User_Name")) {
                context.C10_Hive_connection_Hive_User_Name = (String) parentContextMap.get("C10_Hive_connection_Hive_User_Name");
            }if (parentContextMap.containsKey("C100_Tables_RTAC01_HBase")) {
                context.C100_Tables_RTAC01_HBase = (String) parentContextMap.get("C100_Tables_RTAC01_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTAC01_MqFile")) {
                context.C100_Tables_RTAC01_MqFile = (String) parentContextMap.get("C100_Tables_RTAC01_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTAC02_HBase")) {
                context.C100_Tables_RTAC02_HBase = (String) parentContextMap.get("C100_Tables_RTAC02_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTAC02_MqFile")) {
                context.C100_Tables_RTAC02_MqFile = (String) parentContextMap.get("C100_Tables_RTAC02_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTEM51_HBase")) {
                context.C100_Tables_RTEM51_HBase = (String) parentContextMap.get("C100_Tables_RTEM51_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTEM51_MqFile")) {
                context.C100_Tables_RTEM51_MqFile = (String) parentContextMap.get("C100_Tables_RTEM51_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTEM52_HBase")) {
                context.C100_Tables_RTEM52_HBase = (String) parentContextMap.get("C100_Tables_RTEM52_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTEM52_MqFile")) {
                context.C100_Tables_RTEM52_MqFile = (String) parentContextMap.get("C100_Tables_RTEM52_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTEM53_HBase")) {
                context.C100_Tables_RTEM53_HBase = (String) parentContextMap.get("C100_Tables_RTEM53_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTEM53_MqFile")) {
                context.C100_Tables_RTEM53_MqFile = (String) parentContextMap.get("C100_Tables_RTEM53_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTEM54_HBase")) {
                context.C100_Tables_RTEM54_HBase = (String) parentContextMap.get("C100_Tables_RTEM54_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTEM54_MqFile")) {
                context.C100_Tables_RTEM54_MqFile = (String) parentContextMap.get("C100_Tables_RTEM54_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTEM55_HBase")) {
                context.C100_Tables_RTEM55_HBase = (String) parentContextMap.get("C100_Tables_RTEM55_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTEM55_MqFile")) {
                context.C100_Tables_RTEM55_MqFile = (String) parentContextMap.get("C100_Tables_RTEM55_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTPC01_HBase")) {
                context.C100_Tables_RTPC01_HBase = (String) parentContextMap.get("C100_Tables_RTPC01_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTPC01_MqFile")) {
                context.C100_Tables_RTPC01_MqFile = (String) parentContextMap.get("C100_Tables_RTPC01_MqFile");
            }if (parentContextMap.containsKey("C100_Tables_RTPC02_HBase")) {
                context.C100_Tables_RTPC02_HBase = (String) parentContextMap.get("C100_Tables_RTPC02_HBase");
            }if (parentContextMap.containsKey("C100_Tables_RTPC02_MqFile")) {
                context.C100_Tables_RTPC02_MqFile = (String) parentContextMap.get("C100_Tables_RTPC02_MqFile");
            }if (parentContextMap.containsKey("C130_ElasticSearch_Apport_Retrait")) {
                context.C130_ElasticSearch_Apport_Retrait = (String) parentContextMap.get("C130_ElasticSearch_Apport_Retrait");
            }if (parentContextMap.containsKey("C130_ElasticSearch_Authorization")) {
                context.C130_ElasticSearch_Authorization = (String) parentContextMap.get("C130_ElasticSearch_Authorization");
            }if (parentContextMap.containsKey("C130_ElasticSearch_AuthValue")) {
                context.C130_ElasticSearch_AuthValue = (String) parentContextMap.get("C130_ElasticSearch_AuthValue");
            }if (parentContextMap.containsKey("C130_ElasticSearch_Cadeaux")) {
                context.C130_ElasticSearch_Cadeaux = (String) parentContextMap.get("C130_ElasticSearch_Cadeaux");
            }if (parentContextMap.containsKey("C130_ElasticSearch_Decompte")) {
                context.C130_ElasticSearch_Decompte = (String) parentContextMap.get("C130_ElasticSearch_Decompte");
            }if (parentContextMap.containsKey("C130_ElasticSearch_Encaissements")) {
                context.C130_ElasticSearch_Encaissements = (String) parentContextMap.get("C130_ElasticSearch_Encaissements");
            }if (parentContextMap.containsKey("C130_ElasticSearch_HostRunTime")) {
                context.C130_ElasticSearch_HostRunTime = (String) parentContextMap.get("C130_ElasticSearch_HostRunTime");
            }if (parentContextMap.containsKey("C130_ElasticSearch_PortRunTime")) {
                context.C130_ElasticSearch_PortRunTime = (String) parentContextMap.get("C130_ElasticSearch_PortRunTime");
            }if (parentContextMap.containsKey("C130_ElasticSearch_PwdRunTime")) {
                context.C130_ElasticSearch_PwdRunTime = (String) parentContextMap.get("C130_ElasticSearch_PwdRunTime");
            }if (parentContextMap.containsKey("C130_ElasticSearch_serv")) {
                context.C130_ElasticSearch_serv = (String) parentContextMap.get("C130_ElasticSearch_serv");
            }if (parentContextMap.containsKey("C130_ElasticSearch_URL")) {
                context.C130_ElasticSearch_URL = (String) parentContextMap.get("C130_ElasticSearch_URL");
            }if (parentContextMap.containsKey("C130_ElasticSearch_UserRunTime")) {
                context.C130_ElasticSearch_UserRunTime = (String) parentContextMap.get("C130_ElasticSearch_UserRunTime");
            }if (parentContextMap.containsKey("C130_ElasticSearch_Vente")) {
                context.C130_ElasticSearch_Vente = (String) parentContextMap.get("C130_ElasticSearch_Vente");
            }if (parentContextMap.containsKey("C130_ElasticSearch_WYNN_Entree_Mag")) {
                context.C130_ElasticSearch_WYNN_Entree_Mag = (String) parentContextMap.get("C130_ElasticSearch_WYNN_Entree_Mag");
            }if (parentContextMap.containsKey("C130_ElasticSearch_WYNN_Lignes_vente")) {
                context.C130_ElasticSearch_WYNN_Lignes_vente = (String) parentContextMap.get("C130_ElasticSearch_WYNN_Lignes_vente");
            }if (parentContextMap.containsKey("new1")) {
                context.new1 = (String) parentContextMap.get("new1");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Archive")) {
                context.C30_Directory_HDFS_Archive = (String) parentContextMap.get("C30_Directory_HDFS_Archive");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Conf")) {
                context.C30_Directory_HDFS_Conf = (String) parentContextMap.get("C30_Directory_HDFS_Conf");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Dezip")) {
                context.C30_Directory_HDFS_Dezip = (String) parentContextMap.get("C30_Directory_HDFS_Dezip");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Dwh")) {
                context.C30_Directory_HDFS_Dwh = (String) parentContextMap.get("C30_Directory_HDFS_Dwh");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Input")) {
                context.C30_Directory_HDFS_Input = (String) parentContextMap.get("C30_Directory_HDFS_Input");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Json")) {
                context.C30_Directory_HDFS_Json = (String) parentContextMap.get("C30_Directory_HDFS_Json");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Mq")) {
                context.C30_Directory_HDFS_Mq = (String) parentContextMap.get("C30_Directory_HDFS_Mq");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_MQ_Error")) {
                context.C30_Directory_HDFS_MQ_Error = (String) parentContextMap.get("C30_Directory_HDFS_MQ_Error");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_NCG")) {
                context.C30_Directory_HDFS_NCG = (String) parentContextMap.get("C30_Directory_HDFS_NCG");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_PCM")) {
                context.C30_Directory_HDFS_PCM = (String) parentContextMap.get("C30_Directory_HDFS_PCM");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Pig")) {
                context.C30_Directory_HDFS_Pig = (String) parentContextMap.get("C30_Directory_HDFS_Pig");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Racine")) {
                context.C30_Directory_HDFS_Racine = (String) parentContextMap.get("C30_Directory_HDFS_Racine");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_REF")) {
                context.C30_Directory_HDFS_REF = (String) parentContextMap.get("C30_Directory_HDFS_REF");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Rejets")) {
                context.C30_Directory_HDFS_Rejets = (String) parentContextMap.get("C30_Directory_HDFS_Rejets");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Reprise")) {
                context.C30_Directory_HDFS_Reprise = (String) parentContextMap.get("C30_Directory_HDFS_Reprise");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Tmp")) {
                context.C30_Directory_HDFS_Tmp = (String) parentContextMap.get("C30_Directory_HDFS_Tmp");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Transac")) {
                context.C30_Directory_HDFS_Transac = (String) parentContextMap.get("C30_Directory_HDFS_Transac");
            }if (parentContextMap.containsKey("C30_Directory_HDFS_Work")) {
                context.C30_Directory_HDFS_Work = (String) parentContextMap.get("C30_Directory_HDFS_Work");
            }if (parentContextMap.containsKey("C30_Directory_HIVE_Racine")) {
                context.C30_Directory_HIVE_Racine = (String) parentContextMap.get("C30_Directory_HIVE_Racine");
            }if (parentContextMap.containsKey("C30_Directory_INPUT_DWH")) {
                context.C30_Directory_INPUT_DWH = (String) parentContextMap.get("C30_Directory_INPUT_DWH");
            }if (parentContextMap.containsKey("C30_Directory_INPUT_FUNC_LOG")) {
                context.C30_Directory_INPUT_FUNC_LOG = (String) parentContextMap.get("C30_Directory_INPUT_FUNC_LOG");
            }if (parentContextMap.containsKey("C30_Directory_INPUT_NCG")) {
                context.C30_Directory_INPUT_NCG = (String) parentContextMap.get("C30_Directory_INPUT_NCG");
            }if (parentContextMap.containsKey("C30_Directory_INPUT_QLIK")) {
                context.C30_Directory_INPUT_QLIK = (String) parentContextMap.get("C30_Directory_INPUT_QLIK");
            }if (parentContextMap.containsKey("C30_Directory_INPUT_TMP")) {
                context.C30_Directory_INPUT_TMP = (String) parentContextMap.get("C30_Directory_INPUT_TMP");
            }if (parentContextMap.containsKey("C30_Directory_INPUT_Transac_NCG")) {
                context.C30_Directory_INPUT_Transac_NCG = (String) parentContextMap.get("C30_Directory_INPUT_Transac_NCG");
            }if (parentContextMap.containsKey("C40_FileName_EndOfFile_Histo")) {
                context.C40_FileName_EndOfFile_Histo = (String) parentContextMap.get("C40_FileName_EndOfFile_Histo");
            }if (parentContextMap.containsKey("C40_FileName_EndOfFile_Histo_Nominal_Queue")) {
                context.C40_FileName_EndOfFile_Histo_Nominal_Queue = (String) parentContextMap.get("C40_FileName_EndOfFile_Histo_Nominal_Queue");
            }if (parentContextMap.containsKey("C40_FilesName_ARCHIVE_HDFS_SUFFIX")) {
                context.C40_FilesName_ARCHIVE_HDFS_SUFFIX = (String) parentContextMap.get("C40_FilesName_ARCHIVE_HDFS_SUFFIX");
            }if (parentContextMap.containsKey("C40_FilesName_HISTO_Delimiter_Denormalize")) {
                context.C40_FilesName_HISTO_Delimiter_Denormalize = (String) parentContextMap.get("C40_FilesName_HISTO_Delimiter_Denormalize");
            }if (parentContextMap.containsKey("C40_FilesName_HISTO_Extension_src")) {
                context.C40_FilesName_HISTO_Extension_src = (String) parentContextMap.get("C40_FilesName_HISTO_Extension_src");
            }if (parentContextMap.containsKey("C40_FilesName_HISTO_Extension_tmp")) {
                context.C40_FilesName_HISTO_Extension_tmp = (String) parentContextMap.get("C40_FilesName_HISTO_Extension_tmp");
            }if (parentContextMap.containsKey("C40_FilesName_HISTO_Mask_Src")) {
                context.C40_FilesName_HISTO_Mask_Src = (String) parentContextMap.get("C40_FilesName_HISTO_Mask_Src");
            }if (parentContextMap.containsKey("C40_FilesName_HISTO_Mask_tmp")) {
                context.C40_FilesName_HISTO_Mask_tmp = (String) parentContextMap.get("C40_FilesName_HISTO_Mask_tmp");
            }if (parentContextMap.containsKey("C40_FilesName_RepriseHistoProperties")) {
                context.C40_FilesName_RepriseHistoProperties = (String) parentContextMap.get("C40_FilesName_RepriseHistoProperties");
            }if (parentContextMap.containsKey("C50_DB2_flowTable")) {
                context.C50_DB2_flowTable = (String) parentContextMap.get("C50_DB2_flowTable");
            }if (parentContextMap.containsKey("C50_DB2_hostname")) {
                context.C50_DB2_hostname = (String) parentContextMap.get("C50_DB2_hostname");
            }if (parentContextMap.containsKey("C50_DB2_instance")) {
                context.C50_DB2_instance = (String) parentContextMap.get("C50_DB2_instance");
            }if (parentContextMap.containsKey("C50_DB2_logTable")) {
                context.C50_DB2_logTable = (String) parentContextMap.get("C50_DB2_logTable");
            }if (parentContextMap.containsKey("C50_DB2_port")) {
                context.C50_DB2_port = (String) parentContextMap.get("C50_DB2_port");
            }if (parentContextMap.containsKey("C50_DB2_pwd")) {
                context.C50_DB2_pwd = (String) parentContextMap.get("C50_DB2_pwd");
            }if (parentContextMap.containsKey("C50_DB2_schema")) {
                context.C50_DB2_schema = (String) parentContextMap.get("C50_DB2_schema");
            }if (parentContextMap.containsKey("C50_DB2_statTable")) {
                context.C50_DB2_statTable = (String) parentContextMap.get("C50_DB2_statTable");
            }if (parentContextMap.containsKey("C50_DB2_user")) {
                context.C50_DB2_user = (String) parentContextMap.get("C50_DB2_user");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_H_Articles")) {
                context.C60_FilesName_DWH_H_Articles = (String) parentContextMap.get("C60_FilesName_DWH_H_Articles");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_H_Orga")) {
                context.C60_FilesName_DWH_H_Orga = (String) parentContextMap.get("C60_FilesName_DWH_H_Orga");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_H_Prestas")) {
                context.C60_FilesName_DWH_H_Prestas = (String) parentContextMap.get("C60_FilesName_DWH_H_Prestas");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_RTGA01")) {
                context.C60_FilesName_DWH_RTGA01 = (String) parentContextMap.get("C60_FilesName_DWH_RTGA01");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_RTGA75")) {
                context.C60_FilesName_DWH_RTGA75 = (String) parentContextMap.get("C60_FilesName_DWH_RTGA75");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_RTGG40")) {
                context.C60_FilesName_DWH_RTGG40 = (String) parentContextMap.get("C60_FilesName_DWH_RTGG40");
            }if (parentContextMap.containsKey("C60_FilesName_DWH_RTGV31")) {
                context.C60_FilesName_DWH_RTGV31 = (String) parentContextMap.get("C60_FilesName_DWH_RTGV31");
            }if (parentContextMap.containsKey("C60_FilesName_DWR_TORG")) {
                context.C60_FilesName_DWR_TORG = (String) parentContextMap.get("C60_FilesName_DWR_TORG");
            }if (parentContextMap.containsKey("C60_FilesName_DWR_TPRESTA")) {
                context.C60_FilesName_DWR_TPRESTA = (String) parentContextMap.get("C60_FilesName_DWR_TPRESTA");
            }if (parentContextMap.containsKey("C60_FilesName_DWR_TPRODUIT")) {
                context.C60_FilesName_DWR_TPRODUIT = (String) parentContextMap.get("C60_FilesName_DWR_TPRODUIT");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTGV02")) {
                context.C60_FilesName_HISTO_RTGV02 = (String) parentContextMap.get("C60_FilesName_HISTO_RTGV02");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTGV10")) {
                context.C60_FilesName_HISTO_RTGV10 = (String) parentContextMap.get("C60_FilesName_HISTO_RTGV10");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTGV14")) {
                context.C60_FilesName_HISTO_RTGV14 = (String) parentContextMap.get("C60_FilesName_HISTO_RTGV14");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT01")) {
                context.C60_FilesName_HISTO_RTVT01 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT01");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT02")) {
                context.C60_FilesName_HISTO_RTVT02 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT02");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT03")) {
                context.C60_FilesName_HISTO_RTVT03 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT03");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT08")) {
                context.C60_FilesName_HISTO_RTVT08 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT08");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT11")) {
                context.C60_FilesName_HISTO_RTVT11 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT11");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT12")) {
                context.C60_FilesName_HISTO_RTVT12 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT12");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT13")) {
                context.C60_FilesName_HISTO_RTVT13 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT13");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT14")) {
                context.C60_FilesName_HISTO_RTVT14 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT14");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT15")) {
                context.C60_FilesName_HISTO_RTVT15 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT15");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT16")) {
                context.C60_FilesName_HISTO_RTVT16 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT16");
            }if (parentContextMap.containsKey("C60_FilesName_HISTO_RTVT17")) {
                context.C60_FilesName_HISTO_RTVT17 = (String) parentContextMap.get("C60_FilesName_HISTO_RTVT17");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_CONNECTION_Canal")) {
                context.C80_MQDarty_NCG_CONNECTION_Canal = (String) parentContextMap.get("C80_MQDarty_NCG_CONNECTION_Canal");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_CONNECTION_Port")) {
                context.C80_MQDarty_NCG_CONNECTION_Port = (Integer) parentContextMap.get("C80_MQDarty_NCG_CONNECTION_Port");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_CONNECTION_Pwd")) {
                context.C80_MQDarty_NCG_CONNECTION_Pwd = (String) parentContextMap.get("C80_MQDarty_NCG_CONNECTION_Pwd");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_CONNECTION_QueueManager")) {
                context.C80_MQDarty_NCG_CONNECTION_QueueManager = (String) parentContextMap.get("C80_MQDarty_NCG_CONNECTION_QueueManager");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_CONNECTION_Server")) {
                context.C80_MQDarty_NCG_CONNECTION_Server = (String) parentContextMap.get("C80_MQDarty_NCG_CONNECTION_Server");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_CONNECTION_User")) {
                context.C80_MQDarty_NCG_CONNECTION_User = (String) parentContextMap.get("C80_MQDarty_NCG_CONNECTION_User");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_Canal")) {
                context.C80_MQDarty_NCG_Error_Canal = (String) parentContextMap.get("C80_MQDarty_NCG_Error_Canal");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_Port")) {
                context.C80_MQDarty_NCG_Error_Port = (String) parentContextMap.get("C80_MQDarty_NCG_Error_Port");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_Pwd")) {
                context.C80_MQDarty_NCG_Error_Pwd = (String) parentContextMap.get("C80_MQDarty_NCG_Error_Pwd");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_QueueManager")) {
                context.C80_MQDarty_NCG_Error_QueueManager = (String) parentContextMap.get("C80_MQDarty_NCG_Error_QueueManager");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_QueueName")) {
                context.C80_MQDarty_NCG_Error_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_Error_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_Server")) {
                context.C80_MQDarty_NCG_Error_Server = (String) parentContextMap.get("C80_MQDarty_NCG_Error_Server");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_Error_User")) {
                context.C80_MQDarty_NCG_Error_User = (String) parentContextMap.get("C80_MQDarty_NCG_Error_User");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_FilesName_RTAC03")) {
                context.C80_MQDarty_NCG_RTAC03_FilesName_RTAC03 = (String) parentContextMap.get("C80_MQDarty_NCG_RTAC03_FilesName_RTAC03");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_GRP_QueueName")) {
                context.C80_MQDarty_NCG_RTAC03_GRP_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTAC03_GRP_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_HBase")) {
                context.C80_MQDarty_NCG_RTAC03_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTAC03_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_Modele")) {
                context.C80_MQDarty_NCG_RTAC03_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTAC03_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_NbMessage")) {
                context.C80_MQDarty_NCG_RTAC03_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTAC03_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_TimeOut")) {
                context.C80_MQDarty_NCG_RTAC03_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTAC03_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTAC03_TraitementName")) {
                context.C80_MQDarty_NCG_RTAC03_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTAC03_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_FilesName_RTGV02")) {
                context.C80_MQDarty_NCG_RTGV02_FilesName_RTGV02 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV02_FilesName_RTGV02");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_HBase")) {
                context.C80_MQDarty_NCG_RTGV02_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV02_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_Modele")) {
                context.C80_MQDarty_NCG_RTGV02_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV02_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV02_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV02_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_QueueName")) {
                context.C80_MQDarty_NCG_RTGV02_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV02_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV02_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV02_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV02_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV02_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV02_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_FilesName_RTGV03")) {
                context.C80_MQDarty_NCG_RTGV03_FilesName_RTGV03 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV03_FilesName_RTGV03");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_HBase")) {
                context.C80_MQDarty_NCG_RTGV03_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV03_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_Modele")) {
                context.C80_MQDarty_NCG_RTGV03_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV03_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV03_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV03_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_QueueName")) {
                context.C80_MQDarty_NCG_RTGV03_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV03_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV03_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV03_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV03_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV03_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV03_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_FilesName_RTGV04")) {
                context.C80_MQDarty_NCG_RTGV04_FilesName_RTGV04 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV04_FilesName_RTGV04");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_HBase")) {
                context.C80_MQDarty_NCG_RTGV04_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV04_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_Modele")) {
                context.C80_MQDarty_NCG_RTGV04_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV04_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV04_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV04_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_QueueName")) {
                context.C80_MQDarty_NCG_RTGV04_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV04_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV04_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV04_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV04_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV04_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV04_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_FilesName_RTGV10")) {
                context.C80_MQDarty_NCG_RTGV10_FilesName_RTGV10 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV10_FilesName_RTGV10");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_HBase")) {
                context.C80_MQDarty_NCG_RTGV10_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV10_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_Modele")) {
                context.C80_MQDarty_NCG_RTGV10_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV10_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV10_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV10_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_QueueName")) {
                context.C80_MQDarty_NCG_RTGV10_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV10_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV10_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV10_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV10_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV10_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV10_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11")) {
                context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive")) {
                context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Hive");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes")) {
                context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive")) {
                context.C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_FilesName_RTGV11_Lignes_Hive");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_HBase")) {
                context.C80_MQDarty_NCG_RTGV11_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_Modele")) {
                context.C80_MQDarty_NCG_RTGV11_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV11_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV11_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_NbProcessingFile")) {
                context.C80_MQDarty_NCG_RTGV11_NbProcessingFile = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV11_NbProcessingFile");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_QueueName")) {
                context.C80_MQDarty_NCG_RTGV11_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV11_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV11_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV11_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV11_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV11_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_FilesName_RTGV14")) {
                context.C80_MQDarty_NCG_RTGV14_FilesName_RTGV14 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV14_FilesName_RTGV14");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_HBase")) {
                context.C80_MQDarty_NCG_RTGV14_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV14_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_Modele")) {
                context.C80_MQDarty_NCG_RTGV14_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV14_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV14_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV14_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_QueueName")) {
                context.C80_MQDarty_NCG_RTGV14_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV14_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV14_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV14_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV14_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV14_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV14_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_FilesName_RTGV15")) {
                context.C80_MQDarty_NCG_RTGV15_FilesName_RTGV15 = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV15_FilesName_RTGV15");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_HBase")) {
                context.C80_MQDarty_NCG_RTGV15_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV15_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_Modele")) {
                context.C80_MQDarty_NCG_RTGV15_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV15_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_NbMessage")) {
                context.C80_MQDarty_NCG_RTGV15_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV15_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_QueueName")) {
                context.C80_MQDarty_NCG_RTGV15_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV15_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_TimeOut")) {
                context.C80_MQDarty_NCG_RTGV15_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTGV15_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTGV15_TraitementName")) {
                context.C80_MQDarty_NCG_RTGV15_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTGV15_TraitementName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_FilesName_RTTL04")) {
                context.C80_MQDarty_NCG_RTTL04_FilesName_RTTL04 = (String) parentContextMap.get("C80_MQDarty_NCG_RTTL04_FilesName_RTTL04");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_HBase")) {
                context.C80_MQDarty_NCG_RTTL04_HBase = (String) parentContextMap.get("C80_MQDarty_NCG_RTTL04_HBase");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_Modele")) {
                context.C80_MQDarty_NCG_RTTL04_Modele = (String) parentContextMap.get("C80_MQDarty_NCG_RTTL04_Modele");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_NbMessage")) {
                context.C80_MQDarty_NCG_RTTL04_NbMessage = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTTL04_NbMessage");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_QueueName")) {
                context.C80_MQDarty_NCG_RTTL04_QueueName = (String) parentContextMap.get("C80_MQDarty_NCG_RTTL04_QueueName");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_TimeOut")) {
                context.C80_MQDarty_NCG_RTTL04_TimeOut = (Integer) parentContextMap.get("C80_MQDarty_NCG_RTTL04_TimeOut");
            }if (parentContextMap.containsKey("C80_MQDarty_NCG_RTTL04_TraitementName")) {
                context.C80_MQDarty_NCG_RTTL04_TraitementName = (String) parentContextMap.get("C80_MQDarty_NCG_RTTL04_TraitementName");
            }if (parentContextMap.containsKey("CtxPathFile")) {
                context.CtxPathFile = (String) parentContextMap.get("CtxPathFile");
            }if (parentContextMap.containsKey("DartyEncoding")) {
                context.DartyEncoding = (String) parentContextMap.get("DartyEncoding");
            }if (parentContextMap.containsKey("Dir_conf")) {
                context.Dir_conf = (String) parentContextMap.get("Dir_conf");
            }if (parentContextMap.containsKey("FilePath_StopNgo_Json")) {
                context.FilePath_StopNgo_Json = (String) parentContextMap.get("FilePath_StopNgo_Json");
            }if (parentContextMap.containsKey("FilePath_StopNgo_Nominal")) {
                context.FilePath_StopNgo_Nominal = (String) parentContextMap.get("FilePath_StopNgo_Nominal");
            }if (parentContextMap.containsKey("ProfondeurHisto")) {
                context.ProfondeurHisto = (String) parentContextMap.get("ProfondeurHisto");
            }if (parentContextMap.containsKey("ShardingGV11")) {
                context.ShardingGV11 = (String) parentContextMap.get("ShardingGV11");
            }if (parentContextMap.containsKey("TimerCheckLoop")) {
                context.TimerCheckLoop = (String) parentContextMap.get("TimerCheckLoop");
            }if (parentContextMap.containsKey("TimerLoopStopNGo")) {
                context.TimerLoopStopNGo = (String) parentContextMap.get("TimerLoopStopNGo");
            }if (parentContextMap.containsKey("CLOCAL_Cartes_Cadeaux_JSON")) {
                context.CLOCAL_Cartes_Cadeaux_JSON = (String) parentContextMap.get("CLOCAL_Cartes_Cadeaux_JSON");
            }if (parentContextMap.containsKey("FilesName_Json_Cartes_Cadeaux")) {
                context.FilesName_Json_Cartes_Cadeaux = (String) parentContextMap.get("FilesName_Json_Cartes_Cadeaux");
            }if (parentContextMap.containsKey("C30_File_Json_Apport_Retrait")) {
                context.C30_File_Json_Apport_Retrait = (String) parentContextMap.get("C30_File_Json_Apport_Retrait");
            }if (parentContextMap.containsKey("C30_FilesName_Json_Decompte")) {
                context.C30_FilesName_Json_Decompte = (String) parentContextMap.get("C30_FilesName_Json_Decompte");
            }if (parentContextMap.containsKey("CLOCAL_apport_retrait_JSON")) {
                context.CLOCAL_apport_retrait_JSON = (String) parentContextMap.get("CLOCAL_apport_retrait_JSON");
            }if (parentContextMap.containsKey("CLOCAL_decompte_JSON")) {
                context.CLOCAL_decompte_JSON = (String) parentContextMap.get("CLOCAL_decompte_JSON");
            }if (parentContextMap.containsKey("CLOCAL_entete_encaissement_JSON")) {
                context.CLOCAL_entete_encaissement_JSON = (String) parentContextMap.get("CLOCAL_entete_encaissement_JSON");
            }if (parentContextMap.containsKey("CLOCAL_lignes_encaissement_JSON")) {
                context.CLOCAL_lignes_encaissement_JSON = (String) parentContextMap.get("CLOCAL_lignes_encaissement_JSON");
            }if (parentContextMap.containsKey("CLOCAL_MQ_Ref_Filename_AR")) {
                context.CLOCAL_MQ_Ref_Filename_AR = (String) parentContextMap.get("CLOCAL_MQ_Ref_Filename_AR");
            }if (parentContextMap.containsKey("CLOCAL_MQ_Ref_Filename_DE")) {
                context.CLOCAL_MQ_Ref_Filename_DE = (String) parentContextMap.get("CLOCAL_MQ_Ref_Filename_DE");
            }if (parentContextMap.containsKey("CLOCAL_OutputJsonFileName_AR")) {
                context.CLOCAL_OutputJsonFileName_AR = (String) parentContextMap.get("CLOCAL_OutputJsonFileName_AR");
            }if (parentContextMap.containsKey("CLOCAL_OutputJsonFileName_DE")) {
                context.CLOCAL_OutputJsonFileName_DE = (String) parentContextMap.get("CLOCAL_OutputJsonFileName_DE");
            }if (parentContextMap.containsKey("CLOCAL_Prefix_Temp_Files_AR")) {
                context.CLOCAL_Prefix_Temp_Files_AR = (String) parentContextMap.get("CLOCAL_Prefix_Temp_Files_AR");
            }if (parentContextMap.containsKey("CLOCAL_Prefix_Temp_Files_DE")) {
                context.CLOCAL_Prefix_Temp_Files_DE = (String) parentContextMap.get("CLOCAL_Prefix_Temp_Files_DE");
            }if (parentContextMap.containsKey("CLOCAL_reglements_JSON")) {
                context.CLOCAL_reglements_JSON = (String) parentContextMap.get("CLOCAL_reglements_JSON");
            }if (parentContextMap.containsKey("FilesName_Json_Encaissements")) {
                context.FilesName_Json_Encaissements = (String) parentContextMap.get("FilesName_Json_Encaissements");
            }if (parentContextMap.containsKey("C30_FilesName_Json_Ventes")) {
                context.C30_FilesName_Json_Ventes = (String) parentContextMap.get("C30_FilesName_Json_Ventes");
            }if (parentContextMap.containsKey("CLOCAL_Adresse_JSON")) {
                context.CLOCAL_Adresse_JSON = (String) parentContextMap.get("CLOCAL_Adresse_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Email_JSON")) {
                context.CLOCAL_Email_JSON = (String) parentContextMap.get("CLOCAL_Email_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Encaissement_JSON")) {
                context.CLOCAL_Encaissement_JSON = (String) parentContextMap.get("CLOCAL_Encaissement_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Entete_vente_JSON")) {
                context.CLOCAL_Entete_vente_JSON = (String) parentContextMap.get("CLOCAL_Entete_vente_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Lignes_vente_JSON")) {
                context.CLOCAL_Lignes_vente_JSON = (String) parentContextMap.get("CLOCAL_Lignes_vente_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Masque")) {
                context.CLOCAL_Masque = (String) parentContextMap.get("CLOCAL_Masque");
            }if (parentContextMap.containsKey("CLOCAL_Options_JSON")) {
                context.CLOCAL_Options_JSON = (String) parentContextMap.get("CLOCAL_Options_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Prefix_Temp_Files")) {
                context.CLOCAL_Prefix_Temp_Files = (String) parentContextMap.get("CLOCAL_Prefix_Temp_Files");
            }if (parentContextMap.containsKey("CLOCAL_Reprise")) {
                context.CLOCAL_Reprise = (String) parentContextMap.get("CLOCAL_Reprise");
            }if (parentContextMap.containsKey("CLOCAL_Retours_JSON")) {
                context.CLOCAL_Retours_JSON = (String) parentContextMap.get("CLOCAL_Retours_JSON");
            }if (parentContextMap.containsKey("CLOCAL_Vadd_JSON")) {
                context.CLOCAL_Vadd_JSON = (String) parentContextMap.get("CLOCAL_Vadd_JSON");
            }if (parentContextMap.containsKey("C30_File_Json_Lignes_LV")) {
                context.C30_File_Json_Lignes_LV = (String) parentContextMap.get("C30_File_Json_Lignes_LV");
            }if (parentContextMap.containsKey("CLOCAL_NomBloc_JSON_EM")) {
                context.CLOCAL_NomBloc_JSON_EM = (String) parentContextMap.get("CLOCAL_NomBloc_JSON_EM");
            }if (parentContextMap.containsKey("CLOCAL_NomBloc_JSON_LV")) {
                context.CLOCAL_NomBloc_JSON_LV = (String) parentContextMap.get("CLOCAL_NomBloc_JSON_LV");
            }if (parentContextMap.containsKey("File_Json_RTAC03")) {
                context.File_Json_RTAC03 = (String) parentContextMap.get("File_Json_RTAC03");
            }if (parentContextMap.containsKey("keyFileName_EM")) {
                context.keyFileName_EM = (String) parentContextMap.get("keyFileName_EM");
            }if (parentContextMap.containsKey("keyFileName_LV")) {
                context.keyFileName_LV = (String) parentContextMap.get("keyFileName_LV");
            }if (parentContextMap.containsKey("keyFileName_LV_BatchHive")) {
                context.keyFileName_LV_BatchHive = (String) parentContextMap.get("keyFileName_LV_BatchHive");
            }if (parentContextMap.containsKey("qVenteFileName_EM")) {
                context.qVenteFileName_EM = (String) parentContextMap.get("qVenteFileName_EM");
            }if (parentContextMap.containsKey("PCM_ClassName")) {
                context.PCM_ClassName = (String) parentContextMap.get("PCM_ClassName");
            }if (parentContextMap.containsKey("PCM_DriverJar")) {
                context.PCM_DriverJar = (String) parentContextMap.get("PCM_DriverJar");
            }if (parentContextMap.containsKey("PCM_JdbcUrl")) {
                context.PCM_JdbcUrl = (String) parentContextMap.get("PCM_JdbcUrl");
            }if (parentContextMap.containsKey("PCM_Login")) {
                context.PCM_Login = (String) parentContextMap.get("PCM_Login");
            }if (parentContextMap.containsKey("PCM_MappingFile")) {
                context.PCM_MappingFile = (String) parentContextMap.get("PCM_MappingFile");
            }if (parentContextMap.containsKey("PCM_Password")) {
                context.PCM_Password = (java.lang.String) parentContextMap.get("PCM_Password");
            }if (parentContextMap.containsKey("DB2_host")) {
                context.DB2_host = (String) parentContextMap.get("DB2_host");
            }if (parentContextMap.containsKey("DB2_instance")) {
                context.DB2_instance = (String) parentContextMap.get("DB2_instance");
            }if (parentContextMap.containsKey("DB2_login")) {
                context.DB2_login = (String) parentContextMap.get("DB2_login");
            }if (parentContextMap.containsKey("DB2_port")) {
                context.DB2_port = (String) parentContextMap.get("DB2_port");
            }if (parentContextMap.containsKey("DB2_pwd")) {
                context.DB2_pwd = (String) parentContextMap.get("DB2_pwd");
            }if (parentContextMap.containsKey("DB2_schema")) {
                context.DB2_schema = (String) parentContextMap.get("DB2_schema");
            }if (parentContextMap.containsKey("Local_Logs_Directory")) {
                context.Local_Logs_Directory = (String) parentContextMap.get("Local_Logs_Directory");
            }if (parentContextMap.containsKey("Local_Logs_FileName")) {
                context.Local_Logs_FileName = (String) parentContextMap.get("Local_Logs_FileName");
            }if (parentContextMap.containsKey("Local_Meters_FileName")) {
                context.Local_Meters_FileName = (String) parentContextMap.get("Local_Meters_FileName");
            }if (parentContextMap.containsKey("Local_Stats_FileName")) {
                context.Local_Stats_FileName = (String) parentContextMap.get("Local_Stats_FileName");
            }if (parentContextMap.containsKey("ficPropertiesName")) {
                context.ficPropertiesName = (String) parentContextMap.get("ficPropertiesName");
            }if (parentContextMap.containsKey("MARIADB_Connect_Host")) {
                context.MARIADB_Connect_Host = (String) parentContextMap.get("MARIADB_Connect_Host");
            }if (parentContextMap.containsKey("MARIADB_Connect_Port")) {
                context.MARIADB_Connect_Port = (String) parentContextMap.get("MARIADB_Connect_Port");
            }if (parentContextMap.containsKey("MARIADB_Connect_Database")) {
                context.MARIADB_Connect_Database = (String) parentContextMap.get("MARIADB_Connect_Database");
            }if (parentContextMap.containsKey("MARIADB_Connect_User_Name")) {
                context.MARIADB_Connect_User_Name = (String) parentContextMap.get("MARIADB_Connect_User_Name");
            }if (parentContextMap.containsKey("MARIADB_Connect_User_Password")) {
                context.MARIADB_Connect_User_Password = (String) parentContextMap.get("MARIADB_Connect_User_Password");
            }
        }

        //Resume: init the resumeUtil
        resumeEntryMethodName = ResumeUtil.getResumeEntryMethodName(resuming_checkpoint_path);
        resumeUtil = new ResumeUtil(resuming_logs_dir_path, isChildJob, rootPid);
        resumeUtil.initCommonInfo(pid, rootPid, fatherPid, projectName, jobName, contextStr, jobVersion);

		List<String> parametersToEncrypt = new java.util.ArrayList<String>();
			parametersToEncrypt.add("AMC_DARTY_db_Password");
			parametersToEncrypt.add("PCM_Password");
        //Resume: jobStart
        resumeUtil.addLog("JOB_STARTED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","","","",resumeUtil.convertToJsonText(context,parametersToEncrypt));

if(execStat) {
    try {
        runStat.openSocket(!isChildJob);
        runStat.setAllPID(rootPid, fatherPid, pid, jobName);
        runStat.startThreadStat(clientHost, portStats);
        runStat.updateStatOnJob(RunStat.JOBSTART, fatherNode);
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    }
}



	
	    java.util.concurrent.ConcurrentHashMap<Object, Object> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<Object, Object>();
	    globalMap.put("concurrentHashMap", concurrentHashMap);
	

    long startUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    long endUsedMemory = 0;
    long end = 0;

    startTime = System.currentTimeMillis();




this.globalResumeTicket = true;//to run tPreJob

try {
errorCode = null;tPrejob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPrejob_1) {
globalMap.put("tPrejob_1_SUBPROCESS_STATE", -1);

e_tPrejob_1.printStackTrace();

}


		if(enableLogStash) {
	        talendJobLog.addJobStartMessage();
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }

this.globalResumeTicket = false;//to run others jobs

try {
errorCode = null;tJDBCConnection_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tJDBCConnection_1) {
globalMap.put("tJDBCConnection_1_SUBPROCESS_STATE", -1);

e_tJDBCConnection_1.printStackTrace();

}
try {
errorCode = null;tJDBCInput_2Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tJDBCInput_2) {
globalMap.put("tJDBCInput_2_SUBPROCESS_STATE", -1);

e_tJDBCInput_2.printStackTrace();

}

this.globalResumeTicket = true;//to run tPostJob

try {
errorCode = null;tPostjob_1Process(globalMap);
if(!"failure".equals(status)) { status = "end"; }
}catch (TalendException e_tPostjob_1) {
globalMap.put("tPostjob_1_SUBPROCESS_STATE", -1);

e_tPostjob_1.printStackTrace();

}



        end = System.currentTimeMillis();

        if (watch) {
            System.out.println((end-startTime)+" milliseconds");
        }

        endUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (false) {
            System.out.println((endUsedMemory - startUsedMemory) + " bytes memory increase when running : MAJ_BOBI_MARQUE_DARTY");
        }
		if(enableLogStash) {
	        talendJobLog.addJobEndMessage(startTime, end, status);
	        try {
	            talendJobLogProcess(globalMap);
	        } catch (java.lang.Exception e) {
	            e.printStackTrace();
	        }
        }



if (execStat) {
    runStat.updateStatOnJob(RunStat.JOBEND, fatherNode);
    runStat.stopThreadStat();
}
    int returnCode = 0;
    if(errorCode == null) {
         returnCode = status != null && status.equals("failure") ? 1 : 0;
    } else {
         returnCode = errorCode.intValue();
    }
    resumeUtil.addLog("JOB_ENDED", "JOB:" + jobName, parent_part_launcher, Thread.currentThread().getId() + "", "","" + returnCode,"","","");

    return returnCode;

  }

    // only for OSGi env
    public void destroy() {
    closeSqlDbConnections();


    }



    private void closeSqlDbConnections() {
        try {
            Object obj_conn;
            obj_conn = globalMap.remove("conn_tJDBCConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
            obj_conn = globalMap.remove("conn_tMysqlConnection_1");
            if (null != obj_conn) {
                ((java.sql.Connection) obj_conn).close();
            }
        } catch (java.lang.Exception e) {
        }
    }











    private java.util.Map<String, Object> getSharedConnections4REST() {
        java.util.Map<String, Object> connections = new java.util.HashMap<String, Object>();
            connections.put("conn_tJDBCConnection_1", globalMap.get("conn_tJDBCConnection_1"));
            connections.put("conn_tMysqlConnection_1", globalMap.get("conn_tMysqlConnection_1"));







        return connections;
    }

    private void evalParam(String arg) {
        if (arg.startsWith("--resuming_logs_dir_path")) {
            resuming_logs_dir_path = arg.substring(25);
        } else if (arg.startsWith("--resuming_checkpoint_path")) {
            resuming_checkpoint_path = arg.substring(27);
        } else if (arg.startsWith("--parent_part_launcher")) {
            parent_part_launcher = arg.substring(23);
        } else if (arg.startsWith("--watch")) {
            watch = true;
        } else if (arg.startsWith("--stat_port=")) {
            String portStatsStr = arg.substring(12);
            if (portStatsStr != null && !portStatsStr.equals("null")) {
                portStats = Integer.parseInt(portStatsStr);
            }
        } else if (arg.startsWith("--trace_port=")) {
            portTraces = Integer.parseInt(arg.substring(13));
        } else if (arg.startsWith("--client_host=")) {
            clientHost = arg.substring(14);
        } else if (arg.startsWith("--context=")) {
            contextStr = arg.substring(10);
            isDefaultContext = false;
        } else if (arg.startsWith("--father_pid=")) {
            fatherPid = arg.substring(13);
        } else if (arg.startsWith("--root_pid=")) {
            rootPid = arg.substring(11);
        } else if (arg.startsWith("--father_node=")) {
            fatherNode = arg.substring(14);
        } else if (arg.startsWith("--pid=")) {
            pid = arg.substring(6);
        } else if (arg.startsWith("--context_type")) {
            String keyValue = arg.substring(15);
			int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.setContextType(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.setContextType(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }

            }

		} else if (arg.startsWith("--context_param")) {
            String keyValue = arg.substring(16);
            int index = -1;
            if (keyValue != null && (index = keyValue.indexOf('=')) > -1) {
                if (fatherPid==null) {
                    context_param.put(keyValue.substring(0, index), replaceEscapeChars(keyValue.substring(index + 1)));
                } else { // the subjob won't escape the especial chars
                    context_param.put(keyValue.substring(0, index), keyValue.substring(index + 1) );
                }
            }
        } else if (arg.startsWith("--log4jLevel=")) {
            log4jLevel = arg.substring(13);
		} else if (arg.startsWith("--monitoring") && arg.contains("=")) {//for trunjob call
		    final int equal = arg.indexOf('=');
			final String key = arg.substring("--".length(), equal);
			System.setProperty(key, arg.substring(equal + 1));
		}
    }
    
    private static final String NULL_VALUE_EXPRESSION_IN_COMMAND_STRING_FOR_CHILD_JOB_ONLY = "<TALEND_NULL>";

    private final String[][] escapeChars = {
        {"\\\\","\\"},{"\\n","\n"},{"\\'","\'"},{"\\r","\r"},
        {"\\f","\f"},{"\\b","\b"},{"\\t","\t"}
        };
    private String replaceEscapeChars (String keyValue) {

		if (keyValue == null || ("").equals(keyValue.trim())) {
			return keyValue;
		}

		StringBuilder result = new StringBuilder();
		int currIndex = 0;
		while (currIndex < keyValue.length()) {
			int index = -1;
			// judege if the left string includes escape chars
			for (String[] strArray : escapeChars) {
				index = keyValue.indexOf(strArray[0],currIndex);
				if (index>=0) {

					result.append(keyValue.substring(currIndex, index + strArray[0].length()).replace(strArray[0], strArray[1]));
					currIndex = index + strArray[0].length();
					break;
				}
			}
			// if the left string doesn't include escape chars, append the left into the result
			if (index < 0) {
				result.append(keyValue.substring(currIndex));
				currIndex = currIndex + keyValue.length();
			}
		}

		return result.toString();
    }

    public Integer getErrorCode() {
        return errorCode;
    }


    public String getStatus() {
        return status;
    }

    ResumeUtil resumeUtil = null;
}
/************************************************************************************************
 *     662943 characters generated by Talend Real-time Big Data Platform 
 *     on the 20 août 2020 18:11:39 CEST
 ************************************************************************************************/
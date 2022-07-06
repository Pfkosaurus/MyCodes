package com.org.testy;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.UUID;

public class testy {

	public static void main(String[] args)
	{
		getMethotREST();
	}
		

		public static void rozdelNaViacIdocov() 
		{
			String inData;
			inData = "{\"incoterms\":\"FCA\",\"fileName\":\"20220301_071331_SENATOR_TnTnC_S22AMUC0322414_USIA9_8552491.dat\",\"security_status\":\"UNSECURE\",\"event_location\":\"USMIA\",\"consignee_name\":\"BMW of North America LLC\",\"origin\":\"DEDFG\",\"destination\":\"USLTX\",\"leg_origin\":\"DEFRA\",\"event_type\":\"Arrival of plane at airport 2\",\"number_of_pieces\":\"3\",\"service_code\":\"B\",\"id\":\"senator_20220301_071331_SENATOR_TnTnC_S22AMUC0322414_USIA9_8552491.dat_2\",\"providerName\":\"senator\",\"costs_per_shipment\":\"713.8300\",\"timestamp\":\"01.03.2022 00:30-05:00\",\"leg_carrier\":\"865\",\"shipper_reference_transport_no\":\"3011291137\",\"shipment\":\"MUC00322414\",\"leg_destination\":\"USMIA\",\"delay_code\":\"BM12;SV04\",\"chargeable_weight\":\"484.5000\",\"mawb\":\"86513136093\",\"leg_mb\":\"13136093\",\"business_unit\":\"After-Sales\",\"volume\":\"2.9110\",\"actual_weight\":\"72.7000\",\"leg_eta\":\"28.02.2022 23:35-05:00\",\"eta_final_destination\":\"04.03.2022 08:00-06:00\",\"leg_etd\":\"28.02.2022 15:20+01:00\",\"leg_flight_no\":\"M72511\",\"lineNumber\":\"2\",\"shipper_name\":\"BMW AG\",\"shipper_reference_hu\":\"1;2;3\"}";
			String wholeValues = inData.substring(inData.indexOf("\"shipper_reference_hu\":\"")+24, inData.lastIndexOf('"'));		
			
			
			if(wholeValues.matches("^[;]+$"))
			{
				String newMessage = inData.replace(wholeValues, "");//replace ;;;; to blank
				System.out.println(newMessage);
				//out.propagate
			}
			else
			{
				String valuesLastCharacter = wholeValues.substring(wholeValues.length() - 1);
				if(valuesLastCharacter.matches("^[;]+$"))
				{				
					String outData= null;		
					String[] parts= wholeValues.split(";");
						
					int count1 = wholeValues.split(";",-1).length -1;
					for(int i = 0; i<=count1 -1; i++)
					{
						String output = parts[i];					
						outData = output;			
						int count = wholeValues.split(";",-1).length -1;//calculated how many block is in JSON input
						count = count +1;					
						String newMessage = inData.replace(wholeValues, outData); // replace one value with another
						System.out.println(newMessage);	//this is copy of message, except values are updated 
							
					}
				}
				else
				{
					String outData= null;		
					String[] parts= wholeValues.split(";");
						
					int count1 = wholeValues.split(";",-1).length -1;
					for(int i = 0; i<=count1; i++)
					{
						String output = parts[i];					
						outData = output;			
						int count = wholeValues.split(";",-1).length -1;//calculated how many block is in JSON input
						count = count +1;
						String newMessage = inData.replace(wholeValues, outData); // replace one value with another
						System.out.println(newMessage);	//this is copy of message, except values are updated 
							
					}	
				}
			}
		}
		
		public static void obsahujeIbaCislo(){
			String input = "3005165123";
			if (input.matches("[0-9]+"))
			{
				System.out.println("obsahuje");
			}
			else
			{
				System.out.println("neposielat dalej");
			}
		}
		
		public static void zoberCislo() {
			
			String inData = "{\"incoterms\":\"EXW\",\"fileName\":\"20220218_081453_SENATOR_TnTnC_S22AYYZ0002762_DEMUC_8408837.dat\",\"security_status\":\"UNKNOWN\",\"event_location\":\"CAPTH\",\"consignee_name\":\"BMW AG Werk 6.6\",\"origin\":\"CAPTH\",\"destination\":\"DEWKD\",\"leg_origin\":\"CAPTH\",\"event_type\":\"Cargo received Origin\",\"number_of_pieces\":\"1\",\"service_code\":\"B\",\"id\":\"senator_20220218_081453_SENATOR_TnTnC_S22AYYZ0002762_DEMUC_8408837.dat_2\",\"providerName\":\"senator\",\"costs_per_shipment\":\"304.0200\",\"timestamp\":\"16.02.2022 16:00-05:00\",\"leg_carrier\":\"\",\"shipper_reference_transport_no\":\"34567890\",\"shipment\":\"YYZ00002762\",\"leg_destination\":\"CAYYZ\",\"delay_code\":\"BM08;FC01\",\"chargeable_weight\":\"166.5000\",\"mawb\":\"01421152563\",\"leg_mb\":\"\",\"business_unit\":\"PNW1\",\"volume\":\"0.9970\",\"actual_weight\":\"15.0000\",\"leg_eta\":\"\",\"eta_final_destination\":\"23.02.2022 12:00+01:00\",\"leg_etd\":\"16.02.2022 16:00-05:00\",\"leg_flight_no\":\"\",\"lineNumber\":\"2\",\"shipper_name\":\"18748313\",\"shipper_reference_hu\":\"00000000\"}";

			String result = inData.substring(inData.indexOf("shipper_reference_transport_no")+33, inData.lastIndexOf("\",\"shipment"));
			long  resultNumber = Long.parseLong(result);
			long  min = 3000000000L;
			long  max = 3999999999L;
			if(result.startsWith("3")&&resultNumber<=max&&resultNumber>=min) 
			{
				
			}
			else
			{
				
			}
		}
		
		public static void transacionID()
		{
			String inDataJSON = ":{\"incoterms\":\"FCA\",\"fileName\":\"20220301_071331_SENATOR_TnTnC_S22AMUC0322414_USIA9_8552491.dat\",\"security_status\":\"UNSECURE\",\"event_location\":\"USMIA\",\"consignee_name\":\"BMW of North America LLC\",\"origin\":\"DEDFG\",\"destination\":\"USLTX\",\"leg_origin\":\"DEFRA\",\"event_type\":\"Arrival of plane at airport 2\",\"number_of_pieces\":\"3\",\"service_code\":\"B\",\"id\":\"senator_20220301_071331_SENATOR_TnTnC_S22AMUC0322414_USIA9_8552491.dat_2\",\"providerName\":\"senator\",\"costs_per_shipment\":\"713.8300\",\"timestamp\":\"01.03.2022 00:30-05:00\",\"leg_carrier\":\"865\",\"shipper_reference_transport_no\":\"3011291137\",\"shipment\":\"MUC00322414\",\"leg_destination\":\"USMIA\",\"delay_code\":\"BM12;SV04\",\"chargeable_weight\":\"484.5000\",\"mawb\":\"86513136093\",\"leg_mb\":\"13136093\",\"business_unit\":\"After-Sales\",\"volume\":\"2.9110\",\"actual_weight\":\"72.7000\",\"leg_eta\":\"28.02.2022 23:35-05:00\",\"eta_final_destination\":\"04.03.2022 08:00-06:00\",\"leg_etd\":\"28.02.2022 15:20+01:00\",\"leg_flight_no\":\"M72511\",\"lineNumber\":\"2\",\"shipper_name\":\"BMW AG\",\"shipper_reference_hu\":\"1902081307538;1906000087735;1902081260096\"}";
			String inDataXMLS = "<fileName>20220301_071331_SENATOR_TnTnC_S22AMUC0322414_USIA9_8552491.dat</fileName>";
			String inDataIDOCS = "<FILENAME>20220301_071331_SENATOR_TnTnC_S22AMUC0322414_USIA9_8552491.dat</FILENAME>";
			
			inDataJSON = inDataJSON.substring(inDataJSON.indexOf("fileName\":\"")+11, inDataJSON.lastIndexOf("\"security_status\""));
			inDataJSON = inDataJSON.replaceAll("[-+.^:,\"_]","");//pre SeaFreight Inbound
			
			//inDataXMLS = inDataXMLS.substring(inDataXMLS.indexOf("<fileName>")+10, inDataXMLS.lastIndexOf("</fileName>"));
			//inDataXMLS= inDataXMLS.replaceAll("[-+.^:,\"_]","");//pre Airfreiught Transform
			
			//inDataIDOCS = inDataIDOCS.substring(inDataIDOCS.indexOf("<FILENAME>")+10, inDataIDOCS.lastIndexOf("</FILENAME>"));
			//inDataIDOCS= inDataIDOCS.replaceAll("[-+.^:,\"_]","");//pre Airfreiught Outbound
			
			
			System.out.println(inDataJSON);
			//System.out.println(inDataXMLS);
			//System.out.println(inDataIDOCS);
				
		}
		
		public static void transactio(){
			
			String transId = null;
			transId = UUID.randomUUID().toString().replace("-","");
			transId = "<"+transId+">";
			
			String inData = "TOto je nejaky retazec0";
			String outDataWithUUID= transId+inData;
			System.out.println(outDataWithUUID);
			podmienka();
			dalsiFlow(outDataWithUUID,transId);
			
			
		}
		private static void dalsiFlow(String outDataWithUUID, String transId)
		{
			System.out.println("Prijali sme tento striing: "+outDataWithUUID);
			
			String inData = outDataWithUUID.substring(34);		
			System.out.println(transId+inData);
			
		}
			
		public static void podmienka()
		{
			//String inData = "{\"fileName\":\"20220120.063148.BMWTD.DBH.PORTAL.59399833.csv\",\"controlCount\":\"1\",\"Recipient_id\":\"0016785910\",\"controlRef\":\"545678254\",\"Seg5_Dtp_fnctn_cd_qlfr_1\":\"334\",\"Seg5_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_7\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_2\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_3\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_5\":\"\",\"Sender_id\":\"O0013000045BMW-AG\",\"Seg8_Full_empty_indicator_cd\":\"5\",\"Seg5_Dtp_vl_1\":\"202201200630\",\"Seg5_Dtp_vl_2\":\"\",\"Seg5_Dtp_vl_5\":\"\",\"Seg5_Dtp_vl_6\":\"\",\"Seg5_Dtp_vl_3\":\"\",\"Seg5_Dtp_vl_4\":\"\",\"Seg5_Dtp_vl_9\":\"\",\"VERSION1\":\"\",\"Seg5_Dtp_vl_7\":\"\",\"Seg5_Dtp_vl_8\":\"\",\"Seg5_Cd_lst_rspnsbl_gncy_cd\":\"\",\"lineNumber\":\"2\",\"Seg7_Loc_name_cd_7\":\"\",\"Seg7_Loc_name_cd_6\":\"\",\"Seg8_Measu_attribute_cd_2\":\"\",\"Seg7_Loc_name_cd_8\":\"\",\"Seg8_Measu_attribute_cd_1\":\"VGM\",\"Seg8_Measu_attribute_cd_4\":\"\",\"Seg8_Measu_attribute_cd_3\":\"\",\"Seg7_Loc_name_cd_3\":\"DEWKD\",\"Seg7_Loc_name_cd_2\":\"MYPEN\",\"Seg7_Loc_name_cd_5\":\"\",\"Seg7_Loc_name_cd_4\":\"MYPEN\",\"Seg7_Loc_name_cd_1\":\"DEHAM\",\"UNB_Date\":\"220120\",\"Seg7_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_7\":\"\",\"MSG_LFD_NR\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_4\":\"186\",\"Seg6_Cd_lst_id_cd\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_5\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_2\":\"132\",\"Seg7_Dtp_fnctn_cd_qlfr_3\":\"133\",\"Seg7_Dtp_fnctn_cd_qlfr_1\":\"133\",\"Seg6_Trnsprt_means_id_nm\":\"COSCO SHIPPING LINES\",\"releaseNum\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg7_Dtp_vl_2\":\"202201200631\",\"Seg7_Dtp_vl_1\":\"202201200631\",\"Seg7_Dtp_vl_4\":\"202201200631\",\"Seg7_Dtp_vl_3\":\"202201200631\",\"messageRefNum\":\"1\",\"Seg7_Dtp_vl_6\":\"\",\"Seg7_Dtp_vl_5\":\"\",\"Seg7_Dtp_vl_8\":\"\",\"Seg7_Dtp_vl_7\":\"\",\"Seg7_Code_list_ident_cd_5\":\"\",\"Seg7_Code_list_ident_cd_6\":\"\",\"Seg7_Code_list_ident_cd_3\":\"139\",\"Seg7_Code_list_ident_cd_4\":\"139\",\"Seg5_Status_desc_cd\":\"043\",\"Seg7_Code_list_ident_cd_7\":\"\",\"Seg7_Code_list_ident_cd_8\":\"\",\"Seg8_Meam_attribute_cd_3\":\"\",\"Seg8_Meam_attribute_cd_2\":\"\",\"Seg8_Meam_attribute_cd_1\":\"WT\",\"Seg8_Measu_unit_cd_4\":\"\",\"Seg8_Measu_unit_cd_3\":\"\",\"Seg8_Equ_size_type_desc_code\":\"2210\",\"CONS_LFD_NR\":\"\",\"Seg7_Code_list_ident_cd_1\":\"139\",\"Seg7_Code_list_ident_cd_2\":\"139\",\"Seg8_Meam_attribute_cd_4\":\"\",\"Message_function_code\":\"9\",\"Seg8_Measu_unit_cd_2\":\"\",\"Seg8_Measu_unit_cd_1\":\"KGM\",\"controllingAgencyCode\":\"\",\"Seg6_Ves_Cd_lst_id_cd\":\"\",\"UNT_messageRefNum\":\"1\",\"Msg_Dtp_frmt_cd_7\":\"\",\"Seg1_Prty_id_7\":\"\",\"Msg_Dtp_frmt_cd_8\":\"\",\"Seg1_Prty_id_8\":\"\",\"Msg_Dtp_frmt_cd_9\":\"\",\"Seg1_Prty_id_9\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_frmt_cd_3\":\"\",\"Seg1_Prty_id_3\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_frmt_cd_4\":\"\",\"Seg1_Prty_id_4\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_frmt_cd_5\":\"\",\"Seg1_Prty_id_5\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_frmt_cd_6\":\"\",\"Seg1_Prty_id_6\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_4\":\"7\",\"Seg7_Loc_fnctn_cd_qlfr_3\":\"88\",\"Seg5_Loc_name_code\":\"DEWKD\",\"Seg7_Loc_fnctn_cd_qlfr_2\":\"11\",\"Msg_Dtp_frmt_cd_1\":\"\",\"Seg1_Prty_id_1\":\"BMWILS\",\"Seg7_Loc_fnctn_cd_qlfr_1\":\"9\",\"Msg_Dtp_frmt_cd_2\":\"\",\"Seg1_Prty_id_2\":\"\",\"Recipient_qualifier\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_9\":\"\",\"Seg6_Carrier_id\":\"COSCO\",\"Seg8_Meam_val_4\":\"\",\"Seg8_Meam_val_3\":\"\",\"Seg8_Meam_val_2\":\"\",\"Seg8_Meam_val_1\":\"2530.287\",\"Seg6_Trnsprt_means_name\":\"THALASSA AVRA\",\"testIndicator\":\"\",\"Seg7_Code_list_rsp_agency_cd_4\":\"6\",\"Seg7_Code_list_rsp_agency_cd_5\":\"\",\"Seg7_Code_list_rsp_agency_cd_6\":\"\",\"Seg7_Code_list_rsp_agency_cd_7\":\"\",\"Seg7_Code_list_rsp_agency_cd_1\":\"6\",\"Seg7_Code_list_rsp_agency_cd_2\":\"6\",\"Seg7_Code_list_rsp_agency_cd_3\":\"6\",\"STAT_LFD_NR\":\"\",\"Seg7_Code_list_rsp_agency_cd_8\":\"\",\"Seg1_Address_7\":\"\",\"Seg1_Address_6\":\"\",\"Seg1_Address_9\":\"\",\"Seg1_Address_8\":\"\",\"Seg1_Address_3\":\"\",\"Seg1_Country_name_code_8\":\"\",\"Seg1_Address_2\":\"\",\"Seg1_Country_name_code_9\":\"\",\"Seg1_Address_5\":\"\",\"Seg1_Country_name_code_6\":\"\",\"Seg1_Address_4\":\"\",\"Seg1_Country_name_code_7\":\"\",\"Seg1_Country_name_code_4\":\"\",\"Seg1_Country_name_code_5\":\"\",\"Seg1_Country_name_code_2\":\"\",\"Seg1_Country_name_code_3\":\"\",\"id\":\"dbh_20220120.063148.BMWTD.DBH.PORTAL.59399833.csv_2\",\"Seg6_Cd_lst_rspnsbl_gncy_cd\":\"\",\"providerName\":\"dbh\",\"Seg7_Rltd_plc_loc_id_3\":\"DE\",\"Seg7_Rltd_plc_loc_id_4\":\"MY\",\"Seg7_Rltd_plc_loc_id_1\":\"DE\",\"Seg7_Rltd_plc_loc_id_2\":\"MY\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_1\":\"\",\"Seg6_Ntnlty_means_of_trnsprt\":\"\",\"Seg5_Rltd_plc_loc_1_id\":\"DE\",\"UNB_ID\":\"\",\"Seg5_Status_cat_cd\":\"1\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_5\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_4\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_3\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_2\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_9\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_8\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_7\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_6\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_3\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_4\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_1\":\"MS\",\"Seg1_Prty_fnctn_cd_qlfr_2\":\"CA\",\"Seg1_Prty_fnctn_cd_qlfr_7\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_8\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_5\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_frmt_cd_4\":\"\",\"Seg5_Dtp_frmt_cd_5\":\"\",\"Seg8_Cd_lst_rspnsbl_gncy_cd\":\"\",\"Seg5_Dtp_frmt_cd_6\":\"\",\"Seg5_Dtp_frmt_cd_7\":\"\",\"Seg5_Dtp_frmt_cd_1\":\"203\",\"Seg5_Dtp_frmt_cd_2\":\"\",\"Seg5_Dtp_frmt_cd_3\":\"\",\"Seg5_Dtp_frmt_cd_8\":\"\",\"Seg5_Dtp_frmt_cd_9\":\"\",\"UNB_Time\":\"0630\",\"Msg_Dtp_fnctn_cd_qlfr_2\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_1\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg4_Cnsldtn_tm_nmbr\":\"1\",\"Msg_Dtp_fnctn_cd_qlfr_3\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg8_Cd_lst_id_code\":\"\",\"Seg8_Equ_supplier_cd\":\"\",\"Seg1_Cd_lst_id_cd_1\":\"\",\"Seg1_Cd_lst_id_cd_2\":\"\",\"Sender_qualifier\":\"\",\"Seg1_Cd_lst_id_cd_5\":\"\",\"Seg1_Cd_lst_id_cd_6\":\"\",\"Seg1_Cd_lst_id_cd_3\":\"\",\"Seg1_Cd_lst_id_cd_4\":\"\",\"Seg1_Cd_lst_id_cd_9\":\"\",\"Seg1_Cd_lst_id_cd_7\":\"\",\"Seg1_Cd_lst_id_cd_8\":\"\",\"Seg5_Ref_id_7\":\"\",\"Seg5_Ref_id_8\":\"\",\"Seg5_Ref_id_5\":\"314\",\"Seg5_Ref_id_6\":\"59399833\",\"Seg5_Ref_id_3\":\"392242277\",\"Seg5_Ref_id_4\":\"E28CA0007\",\"versionNum\":\"\",\"Seg5_Ref_id_1\":\"314\",\"Seg5_Ref_id_2\":\"6322000350\",\"Seg6_Trnsprt_md_nm_cd\":\"\",\"Seg8_Equ_identification_nmbr\":\"TRHU2811238\",\"Seg5_Ref_fnctn_cd_qlfr_5\":\"ZZZ\",\"Seg5_Ref_fnctn_cd_qlfr_6\":\"XXX\",\"Seg5_Ref_fnctn_cd_qlfr_3\":\"TN\",\"Seg5_Ref_fnctn_cd_qlfr_4\":\"AAJ\",\"Seg5_Ref_fnctn_cd_qlfr_1\":\"BM\",\"Seg5_Ref_fnctn_cd_qlfr_2\":\"BN\",\"messageId\":\"\",\"Seg6_Ves_Cd_lst_rspnsbl_gncy\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_7\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_8\":\"\",\"EQU_LFD_NR\":\"\",\"Seg6_Cnvync_ref_nmbr\":\"046E\",\"segmentCount\":\"137\",\"Seg7_Rltd_plc_loc_id_7\":\"\",\"Seg7_Rltd_plc_loc_id_8\":\"\",\"Seg7_Rltd_plc_loc_id_5\":\"\",\"Seg7_Rltd_plc_loc_id_6\":\"\",\"Seg6_Trnsprt_stg_cd_qlfr\":\"20\",\"Seg5_Cd_lst_id_cd\":\"\",\"Document_name_code\":\"610\",\"UNZ_controlRef\":\"545678254\",\"Msg_Dtp_vl_1\":\"202201200630\",\"Msg_Dtp_vl_2\":\"\",\"Msg_Dtp_vl_3\":\"\",\"Msg_Dtp_vl_4\":\"\",\"Msg_Dtp_vl_5\":\"\",\"Msg_Dtp_vl_6\":\"\",\"Msg_Dtp_vl_7\":\"\",\"Seg5_Loc_fnctn_cd_qlfr\":\"175\",\"Msg_Dtp_vl_8\":\"\",\"Seg8_Equ_type_code_qualifier\":\"CN\",\"Msg_Dtp_vl_9\":\"\"}";
			String inData = "{\"fileName\":\"20220119.232247.BMWTD.DBH.PORTAL.59378330.csv\",\"controlCount\":\"4\",\"Recipient_id\":\"DBH\",\"controlRef\":\"208327\",\"Seg5_Dtp_fnctn_cd_qlfr_1\":\"334\",\"Seg5_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_7\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_2\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_3\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_5\":\"\",\"Sender_id\":\"HAPAG-LLOYD\",\"Seg8_Full_empty_indicator_cd\":\"5\",\"Seg5_Dtp_vl_1\":\"202201191601\",\"Seg5_Dtp_vl_2\":\"\",\"Seg5_Dtp_vl_5\":\"\",\"Seg5_Dtp_vl_6\":\"\",\"Seg5_Dtp_vl_3\":\"\",\"Seg5_Dtp_vl_4\":\"\",\"Seg5_Dtp_vl_9\":\"\",\"VERSION1\":\"\",\"Seg5_Dtp_vl_7\":\"\",\"Seg5_Dtp_vl_8\":\"\",\"Seg5_Cd_lst_rspnsbl_gncy_cd\":\"\",\"lineNumber\":\"2\",\"Seg7_Loc_name_cd_7\":\"\",\"Seg7_Loc_name_cd_6\":\"\",\"Seg8_Measu_attribute_cd_2\":\"\",\"Seg7_Loc_name_cd_8\":\"\",\"Seg8_Measu_attribute_cd_1\":\"\",\"Seg8_Measu_attribute_cd_4\":\"\",\"Seg8_Measu_attribute_cd_3\":\"\",\"Seg7_Loc_name_cd_3\":\"DENTG\",\"Seg7_Loc_name_cd_2\":\"USCHS\",\"Seg7_Loc_name_cd_5\":\"\",\"Seg7_Loc_name_cd_4\":\"USGXX\",\"Seg7_Loc_name_cd_1\":\"DEHAM\",\"UNB_Date\":\"220119\",\"Seg7_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_7\":\"\",\"MSG_LFD_NR\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_4\":\"186\",\"Seg6_Cd_lst_id_cd\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_5\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_2\":\"178\",\"Seg7_Dtp_fnctn_cd_qlfr_3\":\"133\",\"Seg7_Dtp_fnctn_cd_qlfr_1\":\"186\",\"Seg6_Trnsprt_means_id_nm\":\"HAPAG LLOYD\",\"releaseNum\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg7_Dtp_vl_2\":\"202201182000\",\"Seg7_Dtp_vl_1\":\"202201061712\",\"Seg7_Dtp_vl_4\":\"202201180000\",\"Seg7_Dtp_vl_3\":\"202112100000\",\"messageRefNum\":\"1\",\"Seg7_Dtp_vl_6\":\"\",\"Seg7_Dtp_vl_5\":\"\",\"Seg7_Dtp_vl_8\":\"\",\"Seg7_Dtp_vl_7\":\"\",\"Seg7_Code_list_ident_cd_5\":\"\",\"Seg7_Code_list_ident_cd_6\":\"\",\"Seg7_Code_list_ident_cd_3\":\"139\",\"Seg7_Code_list_ident_cd_4\":\"139\",\"Seg5_Status_desc_cd\":\"085\",\"Seg7_Code_list_ident_cd_7\":\"\",\"Seg7_Code_list_ident_cd_8\":\"\",\"Seg8_Meam_attribute_cd_3\":\"\",\"Seg8_Meam_attribute_cd_2\":\"\",\"Seg8_Meam_attribute_cd_1\":\"\",\"Seg8_Measu_unit_cd_4\":\"\",\"Seg8_Measu_unit_cd_3\":\"\",\"Seg8_Equ_size_type_desc_code\":\"45G1\",\"CONS_LFD_NR\":\"\",\"Seg7_Code_list_ident_cd_1\":\"139\",\"Seg7_Code_list_ident_cd_2\":\"139\",\"Seg8_Meam_attribute_cd_4\":\"\",\"Message_function_code\":\"9\",\"Seg8_Measu_unit_cd_2\":\"\",\"Seg8_Measu_unit_cd_1\":\"\",\"controllingAgencyCode\":\"\",\"Seg6_Ves_Cd_lst_id_cd\":\"\",\"UNT_messageRefNum\":\"1\",\"Msg_Dtp_frmt_cd_7\":\"\",\"Seg1_Prty_id_7\":\"\",\"Msg_Dtp_frmt_cd_8\":\"\",\"Seg1_Prty_id_8\":\"\",\"Msg_Dtp_frmt_cd_9\":\"\",\"Seg1_Prty_id_9\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_frmt_cd_3\":\"\",\"Seg1_Prty_id_3\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_frmt_cd_4\":\"\",\"Seg1_Prty_id_4\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_frmt_cd_5\":\"\",\"Seg1_Prty_id_5\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_frmt_cd_6\":\"\",\"Seg1_Prty_id_6\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_4\":\"7\",\"Seg7_Loc_fnctn_cd_qlfr_3\":\"88\",\"Seg5_Loc_name_code\":\"USCHS\",\"Seg7_Loc_fnctn_cd_qlfr_2\":\"11\",\"Msg_Dtp_frmt_cd_1\":\"\",\"Seg1_Prty_id_1\":\"Hapag Lloyd, Hamburg\",\"Seg7_Loc_fnctn_cd_qlfr_1\":\"9\",\"Msg_Dtp_frmt_cd_2\":\"\",\"Seg1_Prty_id_2\":\"Hapag Lloyd, Hamburg\",\"Recipient_qualifier\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_9\":\"\",\"Seg6_Carrier_id\":\"HLCU\",\"Seg8_Meam_val_4\":\"\",\"Seg8_Meam_val_3\":\"\",\"Seg8_Meam_val_2\":\"\",\"Seg8_Meam_val_1\":\"\",\"Seg6_Trnsprt_means_name\":\"MISSOURI EXPRESS\",\"testIndicator\":\"\",\"Seg7_Code_list_rsp_agency_cd_4\":\"6\",\"Seg7_Code_list_rsp_agency_cd_5\":\"\",\"Seg7_Code_list_rsp_agency_cd_6\":\"\",\"Seg7_Code_list_rsp_agency_cd_7\":\"\",\"Seg7_Code_list_rsp_agency_cd_1\":\"6\",\"Seg7_Code_list_rsp_agency_cd_2\":\"6\",\"Seg7_Code_list_rsp_agency_cd_3\":\"6\",\"STAT_LFD_NR\":\"\",\"Seg7_Code_list_rsp_agency_cd_8\":\"\",\"Seg1_Address_7\":\"\",\"Seg1_Address_6\":\"\",\"Seg1_Address_9\":\"\",\"Seg1_Address_8\":\"\",\"Seg1_Address_3\":\"\",\"Seg1_Country_name_code_8\":\"\",\"Seg1_Address_2\":\"\",\"Seg1_Country_name_code_9\":\"\",\"Seg1_Address_5\":\"\",\"Seg1_Country_name_code_6\":\"\",\"Seg1_Address_4\":\"\",\"Seg1_Country_name_code_7\":\"\",\"Seg1_Country_name_code_4\":\"\",\"Seg1_Country_name_code_5\":\"\",\"Seg1_Country_name_code_2\":\"\",\"Seg1_Country_name_code_3\":\"\",\"id\":\"dbh_20220119.232247.BMWTD.DBH.PORTAL.59378330.csv_2\",\"Seg6_Cd_lst_rspnsbl_gncy_cd\":\"\",\"providerName\":\"dbh\",\"Seg7_Rltd_plc_loc_id_3\":\"DE\",\"Seg7_Rltd_plc_loc_id_4\":\"US\",\"Seg7_Rltd_plc_loc_id_1\":\"DE\",\"Seg7_Rltd_plc_loc_id_2\":\"US\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_1\":\"\",\"Seg6_Ntnlty_means_of_trnsprt\":\"\",\"Seg5_Rltd_plc_loc_1_id\":\"US\",\"UNB_ID\":\"\",\"Seg5_Status_cat_cd\":\"1\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_5\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_4\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_3\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_2\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_9\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_8\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_7\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_6\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_3\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_4\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_1\":\"MS\",\"Seg1_Prty_fnctn_cd_qlfr_2\":\"CA\",\"Seg1_Prty_fnctn_cd_qlfr_7\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_8\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_5\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_frmt_cd_4\":\"\",\"Seg5_Dtp_frmt_cd_5\":\"\",\"Seg8_Cd_lst_rspnsbl_gncy_cd\":\"\",\"Seg5_Dtp_frmt_cd_6\":\"\",\"Seg5_Dtp_frmt_cd_7\":\"\",\"Seg5_Dtp_frmt_cd_1\":\"203\",\"Seg5_Dtp_frmt_cd_2\":\"\",\"Seg5_Dtp_frmt_cd_3\":\"\",\"Seg5_Dtp_frmt_cd_8\":\"\",\"Seg5_Dtp_frmt_cd_9\":\"\",\"UNB_Time\":\"2218\",\"Msg_Dtp_fnctn_cd_qlfr_2\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_1\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg4_Cnsldtn_tm_nmbr\":\"1\",\"Msg_Dtp_fnctn_cd_qlfr_3\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg8_Cd_lst_id_code\":\"\",\"Seg8_Equ_supplier_cd\":\"\",\"Seg1_Cd_lst_id_cd_1\":\"\",\"Seg1_Cd_lst_id_cd_2\":\"\",\"Sender_qualifier\":\"\",\"Seg1_Cd_lst_id_cd_5\":\"\",\"Seg1_Cd_lst_id_cd_6\":\"\",\"Seg1_Cd_lst_id_cd_3\":\"\",\"Seg1_Cd_lst_id_cd_4\":\"\",\"Seg1_Cd_lst_id_cd_9\":\"\",\"Seg1_Cd_lst_id_cd_7\":\"\",\"Seg1_Cd_lst_id_cd_8\":\"\",\"Seg5_Ref_id_7\":\"\",\"Seg5_Ref_id_8\":\"\",\"Seg5_Ref_id_5\":\"\",\"Seg5_Ref_id_6\":\"59378330\",\"Seg5_Ref_id_3\":\"2215770\",\"Seg5_Ref_id_4\":\"\",\"versionNum\":\"\",\"Seg5_Ref_id_1\":\"HLCUMUC211108273\",\"Seg5_Ref_id_2\":\"79470667\",\"Seg6_Trnsprt_md_nm_cd\":\"\",\"Seg8_Equ_identification_nmbr\":\"GESU6201558\",\"Seg5_Ref_fnctn_cd_qlfr_5\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_6\":\"XXX\",\"Seg5_Ref_fnctn_cd_qlfr_3\":\"BN\",\"Seg5_Ref_fnctn_cd_qlfr_4\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_1\":\"BM\",\"Seg5_Ref_fnctn_cd_qlfr_2\":\"BN\",\"messageId\":\"\",\"Seg6_Ves_Cd_lst_rspnsbl_gncy\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_7\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_8\":\"\",\"EQU_LFD_NR\":\"\",\"Seg6_Cnvync_ref_nmbr\":\"056W\",\"segmentCount\":\"24\",\"Seg7_Rltd_plc_loc_id_7\":\"\",\"Seg7_Rltd_plc_loc_id_8\":\"\",\"Seg7_Rltd_plc_loc_id_5\":\"\",\"Seg7_Rltd_plc_loc_id_6\":\"\",\"Seg6_Trnsprt_stg_cd_qlfr\":\"20\",\"Seg5_Cd_lst_id_cd\":\"\",\"Document_name_code\":\"23\",\"UNZ_controlRef\":\"208327\",\"Msg_Dtp_vl_1\":\"202201192218\",\"Msg_Dtp_vl_2\":\"\",\"Msg_Dtp_vl_3\":\"\",\"Msg_Dtp_vl_4\":\"\",\"Msg_Dtp_vl_5\":\"\",\"Msg_Dtp_vl_6\":\"\",\"Msg_Dtp_vl_7\":\"\",\"Seg5_Loc_fnctn_cd_qlfr\":\"175\",\"Msg_Dtp_vl_8\":\"\",\"Seg8_Equ_type_code_qualifier\":\"CN\",\"Msg_Dtp_vl_9\":\"\"}";
			//String inData = "{\"fileName\":\"20220119.232247.BMWTD.DBH.PORTAL.59378330.csv\",\"controlCount\":\"4\",\"Recipient_id\":\"DBH\",\"controlRef\":\"208327\",\"Seg5_Dtp_fnctn_cd_qlfr_1\":\"334\",\"Seg5_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_7\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_2\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_3\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_5\":\"\",\"Sender_id\":\"HAPAG-LLOYD\",\"Seg8_Full_empty_indicator_cd\":\"5\",\"Seg5_Dtp_vl_1\":\"202201191601\",\"Seg5_Dtp_vl_2\":\"\",\"Seg5_Dtp_vl_5\":\"\",\"Seg5_Dtp_vl_6\":\"\",\"Seg5_Dtp_vl_3\":\"\",\"Seg5_Dtp_vl_4\":\"\",\"Seg5_Dtp_vl_9\":\"\",\"VERSION1\":\"\",\"Seg5_Dtp_vl_7\":\"\",\"Seg5_Dtp_vl_8\":\"\",\"Seg5_Cd_lst_rspnsbl_gncy_cd\":\"\",\"lineNumber\":\"2\",\"Seg7_Loc_name_cd_7\":\"\",\"Seg7_Loc_name_cd_6\":\"\",\"Seg8_Measu_attribute_cd_2\":\"\",\"Seg7_Loc_name_cd_8\":\"\",\"Seg8_Measu_attribute_cd_1\":\"\",\"Seg8_Measu_attribute_cd_4\":\"\",\"Seg8_Measu_attribute_cd_3\":\"\",\"Seg7_Loc_name_cd_3\":\"DENTG\",\"Seg7_Loc_name_cd_2\":\"USCHS\",\"Seg7_Loc_name_cd_5\":\"\",\"Seg7_Loc_name_cd_4\":\"USGXX\",\"Seg7_Loc_name_cd_1\":\"DEHAM\",\"UNB_Date\":\"220119\",\"Seg7_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_7\":\"\",\"MSG_LFD_NR\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_4\":\"186\",\"Seg6_Cd_lst_id_cd\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_5\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_2\":\"178\",\"Seg7_Dtp_fnctn_cd_qlfr_3\":\"133\",\"Seg7_Dtp_fnctn_cd_qlfr_1\":\"186\",\"Seg6_Trnsprt_means_id_nm\":\"HAPAG LLOYD\",\"releaseNum\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg7_Dtp_vl_2\":\"202201182000\",\"Seg7_Dtp_vl_1\":\"202201061712\",\"Seg7_Dtp_vl_4\":\"202201180000\",\"Seg7_Dtp_vl_3\":\"202112100000\",\"messageRefNum\":\"1\",\"Seg7_Dtp_vl_6\":\"\",\"Seg7_Dtp_vl_5\":\"\",\"Seg7_Dtp_vl_8\":\"\",\"Seg7_Dtp_vl_7\":\"\",\"Seg7_Code_list_ident_cd_5\":\"\",\"Seg7_Code_list_ident_cd_6\":\"\",\"Seg7_Code_list_ident_cd_3\":\"139\",\"Seg7_Code_list_ident_cd_4\":\"139\",\"Seg5_Status_desc_cd\":\"085\",\"Seg7_Code_list_ident_cd_7\":\"\",\"Seg7_Code_list_ident_cd_8\":\"\",\"Seg8_Meam_attribute_cd_3\":\"\",\"Seg8_Meam_attribute_cd_2\":\"\",\"Seg8_Meam_attribute_cd_1\":\"\",\"Seg8_Measu_unit_cd_4\":\"\",\"Seg8_Measu_unit_cd_3\":\"\",\"Seg8_Equ_size_type_desc_code\":\"45G1\",\"CONS_LFD_NR\":\"\",\"Seg7_Code_list_ident_cd_1\":\"139\",\"Seg7_Code_list_ident_cd_2\":\"139\",\"Seg8_Meam_attribute_cd_4\":\"\",\"Message_function_code\":\"9\",\"Seg8_Measu_unit_cd_2\":\"\",\"Seg8_Measu_unit_cd_1\":\"\",\"controllingAgencyCode\":\"\",\"Seg6_Ves_Cd_lst_id_cd\":\"\",\"UNT_messageRefNum\":\"1\",\"Msg_Dtp_frmt_cd_7\":\"\",\"Seg1_Prty_id_7\":\"\",\"Msg_Dtp_frmt_cd_8\":\"\",\"Seg1_Prty_id_8\":\"\",\"Msg_Dtp_frmt_cd_9\":\"\",\"Seg1_Prty_id_9\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_frmt_cd_3\":\"\",\"Seg1_Prty_id_3\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_frmt_cd_4\":\"\",\"Seg1_Prty_id_4\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_frmt_cd_5\":\"\",\"Seg1_Prty_id_5\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_frmt_cd_6\":\"\",\"Seg1_Prty_id_6\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_4\":\"7\",\"Seg7_Loc_fnctn_cd_qlfr_3\":\"88\",\"Seg5_Loc_name_code\":\"USCHS\",\"Seg7_Loc_fnctn_cd_qlfr_2\":\"11\",\"Msg_Dtp_frmt_cd_1\":\"\",\"Seg1_Prty_id_1\":\"Hapag Lloyd, Hamburg\",\"Seg7_Loc_fnctn_cd_qlfr_1\":\"9\",\"Msg_Dtp_frmt_cd_2\":\"\",\"Seg1_Prty_id_2\":\"Hapag Lloyd, Hamburg\",\"Recipient_qualifier\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_9\":\"\",\"Seg6_Carrier_id\":\"HLCU\",\"Seg8_Meam_val_4\":\"\",\"Seg8_Meam_val_3\":\"\",\"Seg8_Meam_val_2\":\"\",\"Seg8_Meam_val_1\":\"\",\"Seg6_Trnsprt_means_name\":\"MISSOURI EXPRESS\",\"testIndicator\":\"\",\"Seg7_Code_list_rsp_agency_cd_4\":\"6\",\"Seg7_Code_list_rsp_agency_cd_5\":\"\",\"Seg7_Code_list_rsp_agency_cd_6\":\"\",\"Seg7_Code_list_rsp_agency_cd_7\":\"\",\"Seg7_Code_list_rsp_agency_cd_1\":\"6\",\"Seg7_Code_list_rsp_agency_cd_2\":\"6\",\"Seg7_Code_list_rsp_agency_cd_3\":\"6\",\"STAT_LFD_NR\":\"\",\"Seg7_Code_list_rsp_agency_cd_8\":\"\",\"Seg1_Address_7\":\"\",\"Seg1_Address_6\":\"\",\"Seg1_Address_9\":\"\",\"Seg1_Address_8\":\"\",\"Seg1_Address_3\":\"\",\"Seg1_Country_name_code_8\":\"\",\"Seg1_Address_2\":\"\",\"Seg1_Country_name_code_9\":\"\",\"Seg1_Address_5\":\"\",\"Seg1_Country_name_code_6\":\"\",\"Seg1_Address_4\":\"\",\"Seg1_Country_name_code_7\":\"\",\"Seg1_Country_name_code_4\":\"\",\"Seg1_Country_name_code_5\":\"\",\"Seg1_Country_name_code_2\":\"\",\"Seg1_Country_name_code_3\":\"\",\"id\":\"dbh_20220119.232247.BMWTD.DBH.PORTAL.59378330.csv_2\",\"Seg6_Cd_lst_rspnsbl_gncy_cd\":\"\",\"providerName\":\"dbh\",\"Seg7_Rltd_plc_loc_id_3\":\"DE\",\"Seg7_Rltd_plc_loc_id_4\":\"US\",\"Seg7_Rltd_plc_loc_id_1\":\"DE\",\"Seg7_Rltd_plc_loc_id_2\":\"US\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_1\":\"\",\"Seg6_Ntnlty_means_of_trnsprt\":\"\",\"Seg5_Rltd_plc_loc_1_id\":\"US\",\"UNB_ID\":\"\",\"Seg5_Status_cat_cd\":\"1\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_5\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_4\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_3\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_2\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_9\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_8\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_7\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_6\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_3\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_4\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_1\":\"MS\",\"Seg1_Prty_fnctn_cd_qlfr_2\":\"CA\",\"Seg1_Prty_fnctn_cd_qlfr_7\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_8\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_5\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_frmt_cd_4\":\"\",\"Seg5_Dtp_frmt_cd_5\":\"\",\"Seg8_Cd_lst_rspnsbl_gncy_cd\":\"\",\"Seg5_Dtp_frmt_cd_6\":\"\",\"Seg5_Dtp_frmt_cd_7\":\"\",\"Seg5_Dtp_frmt_cd_1\":\"203\",\"Seg5_Dtp_frmt_cd_2\":\"\",\"Seg5_Dtp_frmt_cd_3\":\"\",\"Seg5_Dtp_frmt_cd_8\":\"\",\"Seg5_Dtp_frmt_cd_9\":\"\",\"UNB_Time\":\"2218\",\"Msg_Dtp_fnctn_cd_qlfr_2\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_1\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg4_Cnsldtn_tm_nmbr\":\"1\",\"Msg_Dtp_fnctn_cd_qlfr_3\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg8_Cd_lst_id_code\":\"\",\"Seg8_Equ_supplier_cd\":\"\",\"Seg1_Cd_lst_id_cd_1\":\"\",\"Seg1_Cd_lst_id_cd_2\":\"\",\"Sender_qualifier\":\"\",\"Seg1_Cd_lst_id_cd_5\":\"\",\"Seg1_Cd_lst_id_cd_6\":\"\",\"Seg1_Cd_lst_id_cd_3\":\"\",\"Seg1_Cd_lst_id_cd_4\":\"\",\"Seg1_Cd_lst_id_cd_9\":\"\",\"Seg1_Cd_lst_id_cd_7\":\"\",\"Seg1_Cd_lst_id_cd_8\":\"\",\"Seg5_Ref_id_7\":\"\",\"Seg5_Ref_id_8\":\"\",\"Seg5_Ref_id_5\":\"\",\"Seg5_Ref_id_6\":\"59378330\",\"Seg5_Ref_id_3\":\"32215770\",\"Seg5_Ref_id_4\":\"\",\"versionNum\":\"\",\"Seg5_Ref_id_1\":\"HLCUMUC211108273\",\"Seg5_Ref_id_2\":\"79470667\",\"Seg6_Trnsprt_md_nm_cd\":\"\",\"Seg8_Equ_identification_nmbr\":\"GESU6201558\",\"Seg5_Ref_fnctn_cd_qlfr_5\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_6\":\"XXX\",\"Seg5_Ref_fnctn_cd_qlfr_3\":\"BN\",\"Seg5_Ref_fnctn_cd_qlfr_4\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_1\":\"BM\",\"Seg5_Ref_fnctn_cd_qlfr_2\":\"BN\",\"messageId\":\"\",\"Seg6_Ves_Cd_lst_rspnsbl_gncy\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_7\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_8\":\"\",\"EQU_LFD_NR\":\"\",\"Seg6_Cnvync_ref_nmbr\":\"056W\",\"segmentCount\":\"24\",\"Seg7_Rltd_plc_loc_id_7\":\"\",\"Seg7_Rltd_plc_loc_id_8\":\"\",\"Seg7_Rltd_plc_loc_id_5\":\"\",\"Seg7_Rltd_plc_loc_id_6\":\"\",\"Seg6_Trnsprt_stg_cd_qlfr\":\"20\",\"Seg5_Cd_lst_id_cd\":\"\",\"Document_name_code\":\"23\",\"UNZ_controlRef\":\"208327\",\"Msg_Dtp_vl_1\":\"202201192218\",\"Msg_Dtp_vl_2\":\"\",\"Msg_Dtp_vl_3\":\"\",\"Msg_Dtp_vl_4\":\"\",\"Msg_Dtp_vl_5\":\"\",\"Msg_Dtp_vl_6\":\"\",\"Msg_Dtp_vl_7\":\"\",\"Seg5_Loc_fnctn_cd_qlfr\":\"175\",\"Msg_Dtp_vl_8\":\"\",\"Seg8_Equ_type_code_qualifier\":\"CN\",\"Msg_Dtp_vl_9\":\"\"}";
			//String inData = "{\"fileName\":\"20220119.232247.BMWTD.DBH.PORTAL.59378330.csv\",\"controlCount\":\"4\",\"Recipient_id\":\"DBH\",\"controlRef\":\"208327\",\"Seg5_Dtp_fnctn_cd_qlfr_1\":\"334\",\"Seg5_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_7\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_2\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_3\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg5_Dtp_fnctn_cd_qlfr_5\":\"\",\"Sender_id\":\"HAPAG-LLOYD\",\"Seg8_Full_empty_indicator_cd\":\"5\",\"Seg5_Dtp_vl_1\":\"202201191601\",\"Seg5_Dtp_vl_2\":\"\",\"Seg5_Dtp_vl_5\":\"\",\"Seg5_Dtp_vl_6\":\"\",\"Seg5_Dtp_vl_3\":\"\",\"Seg5_Dtp_vl_4\":\"\",\"Seg5_Dtp_vl_9\":\"\",\"VERSION1\":\"\",\"Seg5_Dtp_vl_7\":\"\",\"Seg5_Dtp_vl_8\":\"\",\"Seg5_Cd_lst_rspnsbl_gncy_cd\":\"\",\"lineNumber\":\"2\",\"Seg7_Loc_name_cd_7\":\"\",\"Seg7_Loc_name_cd_6\":\"\",\"Seg8_Measu_attribute_cd_2\":\"\",\"Seg7_Loc_name_cd_8\":\"\",\"Seg8_Measu_attribute_cd_1\":\"\",\"Seg8_Measu_attribute_cd_4\":\"\",\"Seg8_Measu_attribute_cd_3\":\"\",\"Seg7_Loc_name_cd_3\":\"DENTG\",\"Seg7_Loc_name_cd_2\":\"USCHS\",\"Seg7_Loc_name_cd_5\":\"\",\"Seg7_Loc_name_cd_4\":\"USGXX\",\"Seg7_Loc_name_cd_1\":\"DEHAM\",\"UNB_Date\":\"220119\",\"Seg7_Dtp_fnctn_cd_qlfr_6\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_7\":\"\",\"MSG_LFD_NR\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_4\":\"186\",\"Seg6_Cd_lst_id_cd\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_5\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_2\":\"178\",\"Seg7_Dtp_fnctn_cd_qlfr_3\":\"133\",\"Seg7_Dtp_fnctn_cd_qlfr_1\":\"186\",\"Seg6_Trnsprt_means_id_nm\":\"HAPAG LLOYD\",\"releaseNum\":\"\",\"Seg7_Dtp_fnctn_cd_qlfr_8\":\"\",\"Seg7_Dtp_vl_2\":\"202201182000\",\"Seg7_Dtp_vl_1\":\"202201061712\",\"Seg7_Dtp_vl_4\":\"202201180000\",\"Seg7_Dtp_vl_3\":\"202112100000\",\"messageRefNum\":\"1\",\"Seg7_Dtp_vl_6\":\"\",\"Seg7_Dtp_vl_5\":\"\",\"Seg7_Dtp_vl_8\":\"\",\"Seg7_Dtp_vl_7\":\"\",\"Seg7_Code_list_ident_cd_5\":\"\",\"Seg7_Code_list_ident_cd_6\":\"\",\"Seg7_Code_list_ident_cd_3\":\"139\",\"Seg7_Code_list_ident_cd_4\":\"139\",\"Seg5_Status_desc_cd\":\"085\",\"Seg7_Code_list_ident_cd_7\":\"\",\"Seg7_Code_list_ident_cd_8\":\"\",\"Seg8_Meam_attribute_cd_3\":\"\",\"Seg8_Meam_attribute_cd_2\":\"\",\"Seg8_Meam_attribute_cd_1\":\"\",\"Seg8_Measu_unit_cd_4\":\"\",\"Seg8_Measu_unit_cd_3\":\"\",\"Seg8_Equ_size_type_desc_code\":\"45G1\",\"CONS_LFD_NR\":\"\",\"Seg7_Code_list_ident_cd_1\":\"139\",\"Seg7_Code_list_ident_cd_2\":\"139\",\"Seg8_Meam_attribute_cd_4\":\"\",\"Message_function_code\":\"9\",\"Seg8_Measu_unit_cd_2\":\"\",\"Seg8_Measu_unit_cd_1\":\"\",\"controllingAgencyCode\":\"\",\"Seg6_Ves_Cd_lst_id_cd\":\"\",\"UNT_messageRefNum\":\"1\",\"Msg_Dtp_frmt_cd_7\":\"\",\"Seg1_Prty_id_7\":\"\",\"Msg_Dtp_frmt_cd_8\":\"\",\"Seg1_Prty_id_8\":\"\",\"Msg_Dtp_frmt_cd_9\":\"\",\"Seg1_Prty_id_9\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_frmt_cd_3\":\"\",\"Seg1_Prty_id_3\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_frmt_cd_4\":\"\",\"Seg1_Prty_id_4\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_frmt_cd_5\":\"\",\"Seg1_Prty_id_5\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_frmt_cd_6\":\"\",\"Seg1_Prty_id_6\":\"\",\"Seg7_Loc_fnctn_cd_qlfr_4\":\"7\",\"Seg7_Loc_fnctn_cd_qlfr_3\":\"88\",\"Seg5_Loc_name_code\":\"USCHS\",\"Seg7_Loc_fnctn_cd_qlfr_2\":\"11\",\"Msg_Dtp_frmt_cd_1\":\"\",\"Seg1_Prty_id_1\":\"Hapag Lloyd, Hamburg\",\"Seg7_Loc_fnctn_cd_qlfr_1\":\"9\",\"Msg_Dtp_frmt_cd_2\":\"\",\"Seg1_Prty_id_2\":\"Hapag Lloyd, Hamburg\",\"Recipient_qualifier\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_9\":\"\",\"Seg6_Carrier_id\":\"HLCU\",\"Seg8_Meam_val_4\":\"\",\"Seg8_Meam_val_3\":\"\",\"Seg8_Meam_val_2\":\"\",\"Seg8_Meam_val_1\":\"\",\"Seg6_Trnsprt_means_name\":\"MISSOURI EXPRESS\",\"testIndicator\":\"\",\"Seg7_Code_list_rsp_agency_cd_4\":\"6\",\"Seg7_Code_list_rsp_agency_cd_5\":\"\",\"Seg7_Code_list_rsp_agency_cd_6\":\"\",\"Seg7_Code_list_rsp_agency_cd_7\":\"\",\"Seg7_Code_list_rsp_agency_cd_1\":\"6\",\"Seg7_Code_list_rsp_agency_cd_2\":\"6\",\"Seg7_Code_list_rsp_agency_cd_3\":\"6\",\"STAT_LFD_NR\":\"\",\"Seg7_Code_list_rsp_agency_cd_8\":\"\",\"Seg1_Address_7\":\"\",\"Seg1_Address_6\":\"\",\"Seg1_Address_9\":\"\",\"Seg1_Address_8\":\"\",\"Seg1_Address_3\":\"\",\"Seg1_Country_name_code_8\":\"\",\"Seg1_Address_2\":\"\",\"Seg1_Country_name_code_9\":\"\",\"Seg1_Address_5\":\"\",\"Seg1_Country_name_code_6\":\"\",\"Seg1_Address_4\":\"\",\"Seg1_Country_name_code_7\":\"\",\"Seg1_Country_name_code_4\":\"\",\"Seg1_Country_name_code_5\":\"\",\"Seg1_Country_name_code_2\":\"\",\"Seg1_Country_name_code_3\":\"\",\"id\":\"dbh_20220119.232247.BMWTD.DBH.PORTAL.59378330.csv_2\",\"Seg6_Cd_lst_rspnsbl_gncy_cd\":\"\",\"providerName\":\"dbh\",\"Seg7_Rltd_plc_loc_id_3\":\"DE\",\"Seg7_Rltd_plc_loc_id_4\":\"US\",\"Seg7_Rltd_plc_loc_id_1\":\"DE\",\"Seg7_Rltd_plc_loc_id_2\":\"US\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_1\":\"\",\"Seg6_Ntnlty_means_of_trnsprt\":\"\",\"Seg5_Rltd_plc_loc_1_id\":\"US\",\"UNB_ID\":\"\",\"Seg5_Status_cat_cd\":\"1\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_5\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_4\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_3\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_2\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_9\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_8\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_7\":\"\",\"Seg1_Cd_lst_rspnsbl_gncy_cd_6\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_3\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_4\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_1\":\"MS\",\"Seg1_Prty_fnctn_cd_qlfr_2\":\"CA\",\"Seg1_Prty_fnctn_cd_qlfr_7\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_8\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_5\":\"\",\"Seg1_Prty_fnctn_cd_qlfr_6\":\"\",\"Seg5_Dtp_frmt_cd_4\":\"\",\"Seg5_Dtp_frmt_cd_5\":\"\",\"Seg8_Cd_lst_rspnsbl_gncy_cd\":\"\",\"Seg5_Dtp_frmt_cd_6\":\"\",\"Seg5_Dtp_frmt_cd_7\":\"\",\"Seg5_Dtp_frmt_cd_1\":\"203\",\"Seg5_Dtp_frmt_cd_2\":\"\",\"Seg5_Dtp_frmt_cd_3\":\"\",\"Seg5_Dtp_frmt_cd_8\":\"\",\"Seg5_Dtp_frmt_cd_9\":\"\",\"UNB_Time\":\"2218\",\"Msg_Dtp_fnctn_cd_qlfr_2\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_1\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_4\":\"\",\"Seg4_Cnsldtn_tm_nmbr\":\"1\",\"Msg_Dtp_fnctn_cd_qlfr_3\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_6\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_5\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_8\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_7\":\"\",\"Msg_Dtp_fnctn_cd_qlfr_9\":\"\",\"Seg8_Cd_lst_id_code\":\"\",\"Seg8_Equ_supplier_cd\":\"\",\"Seg1_Cd_lst_id_cd_1\":\"\",\"Seg1_Cd_lst_id_cd_2\":\"\",\"Sender_qualifier\":\"\",\"Seg1_Cd_lst_id_cd_5\":\"\",\"Seg1_Cd_lst_id_cd_6\":\"\",\"Seg1_Cd_lst_id_cd_3\":\"\",\"Seg1_Cd_lst_id_cd_4\":\"\",\"Seg1_Cd_lst_id_cd_9\":\"\",\"Seg1_Cd_lst_id_cd_7\":\"\",\"Seg1_Cd_lst_id_cd_8\":\"\",\"Seg5_Ref_id_7\":\"\",\"Seg5_Ref_id_8\":\"\",\"Seg5_Ref_id_5\":\"\",\"Seg5_Ref_id_6\":\"59378330\",\"Seg5_Ref_id_3\":\"92215770\",\"Seg5_Ref_id_4\":\"\",\"versionNum\":\"\",\"Seg5_Ref_id_1\":\"HLCUMUC211108273\",\"Seg5_Ref_id_2\":\"79470667\",\"Seg6_Trnsprt_md_nm_cd\":\"\",\"Seg8_Equ_identification_nmbr\":\"GESU6201558\",\"Seg5_Ref_fnctn_cd_qlfr_5\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_6\":\"XXX\",\"Seg5_Ref_fnctn_cd_qlfr_3\":\"TN\",\"Seg5_Ref_fnctn_cd_qlfr_4\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_1\":\"BM\",\"Seg5_Ref_fnctn_cd_qlfr_2\":\"BN\",\"messageId\":\"\",\"Seg6_Ves_Cd_lst_rspnsbl_gncy\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_7\":\"\",\"Seg5_Ref_fnctn_cd_qlfr_8\":\"\",\"EQU_LFD_NR\":\"\",\"Seg6_Cnvync_ref_nmbr\":\"056W\",\"segmentCount\":\"24\",\"Seg7_Rltd_plc_loc_id_7\":\"\",\"Seg7_Rltd_plc_loc_id_8\":\"\",\"Seg7_Rltd_plc_loc_id_5\":\"\",\"Seg7_Rltd_plc_loc_id_6\":\"\",\"Seg6_Trnsprt_stg_cd_qlfr\":\"20\",\"Seg5_Cd_lst_id_cd\":\"\",\"Document_name_code\":\"23\",\"UNZ_controlRef\":\"208327\",\"Msg_Dtp_vl_1\":\"202201192218\",\"Msg_Dtp_vl_2\":\"\",\"Msg_Dtp_vl_3\":\"\",\"Msg_Dtp_vl_4\":\"\",\"Msg_Dtp_vl_5\":\"\",\"Msg_Dtp_vl_6\":\"\",\"Msg_Dtp_vl_7\":\"\",\"Seg5_Loc_fnctn_cd_qlfr\":\"175\",\"Msg_Dtp_vl_8\":\"\",\"Seg8_Equ_type_code_qualifier\":\"CN\",\"Msg_Dtp_vl_9\":\"\"}";
			if	  (inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_1\":\"TN\"")&inData.contains("\"Seg5_Ref_id_1\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_2\":\"TN\"")&inData.contains("\"Seg5_Ref_id_2\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_3\":\"TN\"")&inData.contains("\"Seg5_Ref_id_3\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_4\":\"TN\"")&inData.contains("\"Seg5_Ref_id_4\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_5\":\"TN\"")&inData.contains("\"Seg5_Ref_id_5\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_6\":\"TN\"")&inData.contains("\"Seg5_Ref_id_6\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_7\":\"TN\"")&inData.contains("\"Seg5_Ref_id_7\":\"3")
		              |inData.contains("\"Seg5_Ref_fnctn_cd_qlfr_8\":\"TN\"")&inData.contains("\"Seg5_Ref_id_8\":\"3"))
		 
					{
						System.out.println("je to ok");
					}
					else
					{
						System.out.println("Input data did not match processing conditions");
					}
		}
		
		public static void regex() {
			// TODO Auto-generated method stub	
			
					String inData = "{\r\n"
							+ "  \"Seg5_Dtp_vl_1\": \"11111\",\r\n"
							+ "  \"Seg7_Loc_name_cd_7\": \"aaa\",\r\n"
							+ "  \"Seg7_Loc_name_cd_6\": \"bbb\",\r\n"
							+ "  \"Seg7_Loc_name_cd_8\": \"ccc\",\r\n"
							+ "}\r\n"
							+ "{\r\n"
							+ "  \"Seg5_Dtp_vl_1\": \"22222\",\r\n"
							+ "  \"Seg7_Loc_name_cd_7\": \"qqq\",\r\n"
							+ "  \"Seg7_Loc_name_cd_6\": \"www\",\r\n"
							+ "  \"Seg7_Loc_name_cd_8\": \"eee\",\r\n"
							+ "}\r\n"
							+ "{\r\n"
							+ "  \"Seg5_Dtp_vl_1\": \"333\",\r\n"
							+ "  \"Seg7_Loc_name_cd_7\": \"sss\",\r\n"
							+ "  \"Seg7_Loc_name_cd_6\": \"ddd\",\r\n"
							+ "  \"Seg7_Loc_name_cd_8\": \"fff\",\r\n"
							+ "}\r\n"
							+ "{\r\n"
							+ "  \"Seg5_Dtp_vl_1\": \"444\",\r\n"
							+ "  \"Seg7_Loc_name_cd_7\": \"zzzz\",\r\n"
							+ "  \"Seg7_Loc_name_cd_6\": \"xxxx\",\r\n"
							+ "  \"Seg7_Loc_name_cd_8\": \"vvvv\",\r\n"
							+ "}\r\n"
							+ "{\r\n"
							+ "  \"Seg5_Dtp_vl_1\": \"555\",\r\n"
							+ "  \"Seg7_Loc_name_cd_7\": \"jkljkl\",\r\n"
							+ "  \"Seg7_Loc_name_cd_6\": \"ghjghjghj\",\r\n"
							+ "  \"Seg7_Loc_name_cd_8\": \"tyutyu\",\r\n"
							+ "}";		
				
					String symbol = "\u007D";//define  }
					String[] parts = inData.split(symbol);//split input messages to parts for every symbol
					int count = inData.split(symbol,-1).length -1;//calculated how many block is in JSON input	
					
					for (int i = 0; i<count; i++) 
					{
						String output = parts[i];
						String outData = output+symbol;
						System.out.println(outData);//output of individual blocks
						//out.propagate(inAssembly);
						System.out.println("toto je samostatny blok");
					}
					
				}	
		
		public static void getMethotREST() 
		{
			//https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=BTC&to_currency=USD&apikey=A1LBQQFOEB4M7FWH
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://www.alphavantage.co/query?function=CURRENCY_EXCHANGE_RATE&from_currency=BTC&to_currency=USD&apikey=A1LBQQFOEB4M7FWH"))
					//.header("function", "CURRENCY_EXCHANGE_RATE")
					//.header("from_currency", "BTC")
					//.header("to_currency", "USD")
					//.header("apikey", "A1LBQQFOEB4M7FWH")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = null;
			try {
				response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(response.body());
			String  a = response.body().toString();
			System.out.println(a);
		}
		
		
		}
		

		
		

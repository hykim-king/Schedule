package com.pcwk.schedule.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.pcwk.cmn.DTO;
import com.pcwk.cmn.LoggerManager;
import com.pcwk.cmn.WorkDiv;

import com.pcwk.schedule.domain.ScheduleVO;


public class SchuduleDao implements WorkDiv<ScheduleVO>, LoggerManager {

	public static List<ScheduleVO>  schuduleList=new ArrayList<>();
	//저장 파일 경로
	public final static String SAVE_FILE_PATH = "E:\\DCOM_0725\\03_JAVA\\old_workspace\\PCWK_Schedule\\src\\com\\pcwk\\schedule\\data\\data.csv";
	
	
	public SchuduleDao() {
		int readStatus = readFile(SAVE_FILE_PATH);
		if(0==readStatus) {
			LOG.debug("파일 읽기 실패");
		}else {
			LOG.debug("파일 읽기 성공");
		}		
	}
	
	/**
	 * books.csv를 읽어서 bookList할당
	 * @param filePath
	 * @return 0(실패)/1(성공)
	 */
	public int readFile(String filePath){
		int flag = 0;
		//try-with-resource
		try(BufferedReader br =new BufferedReader(new FileReader(filePath))) {
			String line = "";
			
			//8994492046-9788994492049,Java의 정석 기초편,남궁성,IT,1  => Book
			int i = 0;
			while( (line = br.readLine()) !=null  ) {

				String[] inArray = line.split(",");				
				ScheduleVO scheduleVO=new ScheduleVO(inArray[0], inArray[1], inArray[2]);
				schuduleList.add(scheduleVO);
			}
			
			if(schuduleList.size()>0)flag++;			
			
		}catch(IOException e) {
			LOG.debug("===============================");
			LOG.debug("=IOException="+e.getMessage());
			LOG.debug("===============================");
		}
		
		
		return flag;
	}
	
    public String autoSid() {
        return String.format("S%05d", (this.schuduleList.size() + 1));
    }
    
    
	@Override
	public List<ScheduleVO> doRetrieve(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doSave(ScheduleVO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doDelete(ScheduleVO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ScheduleVO doSelectOne(ScheduleVO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doUpdate(ScheduleVO dto) {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	

}

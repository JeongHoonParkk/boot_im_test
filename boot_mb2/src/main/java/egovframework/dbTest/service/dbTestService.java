package egovframework.dbTest.service;

import org.springframework.stereotype.Service;

import egovframework.dbTest.service.impl.dbTestMapper;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class dbTestService {

	private final dbTestMapper mapper;
	
	public dbTestService(dbTestMapper dbTestMapper) {
		this.mapper = dbTestMapper;
	}
	
	public dbTestVO selectTableData() {
		log.info("서비스");
		dbTestVO printData = mapper.selectTableData();
		log.info("서비스 끝");
		log.info("printData" + printData);
		return printData;
	}
}

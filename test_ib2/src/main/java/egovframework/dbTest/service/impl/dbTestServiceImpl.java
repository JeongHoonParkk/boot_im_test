package egovframework.dbTest.service.impl;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.springframework.stereotype.Service;

import egovframework.dbTest.service.dbTestService;
import egovframework.dbTest.service.dbTestVO;
import lombok.extern.slf4j.Slf4j;

@Service("dbTestService")
@Slf4j
public class dbTestServiceImpl extends EgovAbstractServiceImpl implements dbTestService {

	@Resource(name = "dbTestDAO")
	private dbTestDAO dbTestDAO;

	@Override
	public dbTestVO selectTableData() throws Exception {
		log.info("서비스 임플");
		return dbTestDAO.selectTableData();
	}

}


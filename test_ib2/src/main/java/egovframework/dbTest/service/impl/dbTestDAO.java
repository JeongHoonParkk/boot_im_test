package egovframework.dbTest.service.impl;

import org.egovframe.rte.psl.dataaccess.EgovAbstractDAO;
import org.springframework.stereotype.Repository;

import egovframework.dbTest.service.dbTestVO;
import lombok.extern.slf4j.Slf4j;

@Repository("dbTestDAO")
public class dbTestDAO extends EgovAbstractDAO {
	public dbTestVO selectTableData() throws Exception {
		dbTestVO db = (dbTestVO) select("dbTestDAO.selectTableData");
		return db;
	}
}




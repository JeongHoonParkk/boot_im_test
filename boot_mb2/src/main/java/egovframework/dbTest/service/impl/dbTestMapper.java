package egovframework.dbTest.service.impl;

import org.apache.ibatis.annotations.Mapper;

import egovframework.dbTest.service.dbTestVO;

@Mapper
public interface dbTestMapper  {

	public dbTestVO selectTableData();
}


package com.bb.service;

import java.util.List;

import com.bb.pojo.BasicData;

public interface IBasicService {

	public List<BasicData> query(BasicData bd);
	
	public Integer addBasic(BasicData bd);
	
	public Integer deleteBasicById(Integer id);
	
	public Integer updateBasic(BasicData bd);
	
	public BasicData queryById(Integer id);

	public List<BasicData> queryParentData();

	public List<BasicData> queryBase(String typeName);
}

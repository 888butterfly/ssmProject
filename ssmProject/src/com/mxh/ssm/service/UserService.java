package com.mxh.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mxh.ssm.mapper.NuserMapper;
import com.mxh.ssm.pojo.Nuser;
@Service
public class UserService {
	@Autowired
	private NuserMapper nump;

	public Nuser getUserBuId(int i) {
		
		return nump.selectByPrimaryKey(i);
	}

}

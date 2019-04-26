package com.app.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.boot.dto.Boot;
import com.app.boot.mapper.BootMapper;

@Service
public class BootService {
	
	@Autowired
	BootMapper mapper;

	public List<Boot> select() {
		return mapper.select();
	}

}

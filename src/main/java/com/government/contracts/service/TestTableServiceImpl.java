package com.government.contracts.service;

import com.government.contracts.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestTableServiceImpl implements TestTableService {

    @Autowired
    private TestTableRepository testTableRepository;
}

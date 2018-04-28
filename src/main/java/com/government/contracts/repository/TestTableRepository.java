package com.government.contracts.repository;

import com.government.contracts.model.Contract;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TestTableRepository extends PagingAndSortingRepository<Contract, Long> {
}

package com.government.contracts.repository;

import com.government.contracts.model.Contractor;
import com.government.contracts.utils.TestEntityFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public class ContractorRepositoryTest extends AbstractRepositoryTest <Contractor, Long> {
    private static final String CONTRACTOR_NAME = "contractorName";
    private static final String INN = "testInn";

    @Autowired
    private ContractorRepository contractorRepository;

    @Override
    protected Contractor createEntity() {
        return TestEntityFactory.createContractor(INN, CONTRACTOR_NAME);
    }

    @Override
    protected CrudRepository<Contractor, Long> getRepository() {
        return contractorRepository;
    }
}

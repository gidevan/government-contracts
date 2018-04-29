package com.government.contracts.utils;

import com.government.contracts.model.Contract;
import com.government.contracts.model.Contractor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by vano on 29.4.18.
 */
public final class TestEntityFactory {
    private static final String SHORT_PREFIX = "short_";
    private static final String FULL_PREFIX = "full_";
    private static final long DATE_STEP = 2L;
    private TestEntityFactory() {


    }

    public static final Contractor createContractor(String inn, String name) {
        Contractor contractor = new Contractor();
        contractor.setInn(inn);
        contractor.setShortName(SHORT_PREFIX + name);
        contractor.setFullName(FULL_PREFIX + name);
        return contractor;
    }

    public static final Contract createContract(String contractName, String contractNumber, String contractCode) {
        Contract contract = new Contract();
        contract.setName(contractName);
        contract.setContractNumber(contractNumber);
        contract.setContractCode(contractCode);
        contract.setContractStartDate(LocalDateTime.now());
        contract.setContractEndDate(LocalDateTime.now().plusMonths(DATE_STEP));
        contract.setContractPrice(BigDecimal.TEN);
        return contract;
    }
}

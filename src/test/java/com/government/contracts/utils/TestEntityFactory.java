package com.government.contracts.utils;

import com.government.contracts.model.Contractor;

/**
 * Created by vano on 29.4.18.
 */
public final class TestEntityFactory {
    private static final String SHORT_PREFIX = "short_";
    private static final String FULL_PREFIX = "full_";
    private TestEntityFactory() {

    }

    public static final Contractor createContractor(String inn, String name) {
        Contractor contractor = new Contractor();
        contractor.setInn(inn);
        contractor.setShortName(SHORT_PREFIX + name);
        contractor.setFullName(FULL_PREFIX + name);
        return contractor;
    }
}

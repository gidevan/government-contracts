package com.government.contracts.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * Created by vano on 29.4.18.
 */
public class AdditionalAgreement implements Identifiable<Long> {

    @Id
    @GeneratedValue(generator="additional_agreement_seq")
    @SequenceGenerator(name="additional_agreement_seq",sequenceName="additional_agreement_seq")
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

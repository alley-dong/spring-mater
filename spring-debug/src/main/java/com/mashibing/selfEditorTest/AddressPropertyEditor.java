package com.mashibing.selfEditorTest;

import com.mashibing.selfEditorTest.Address;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] s = text.split("_");
        Address address = new Address();
        address.setProvince(s[0]);
        address.setCity(s[1]);
        address.setDistrict(s[2]);
        this.setValue(address);
    }
}

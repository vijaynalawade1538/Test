package com.gontuseries.restspringmvcapplication.config;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{
	
	public void setAsText(String name) throws java.lang.IllegalArgumentException {
        if (name.contains("Mr.") || name.contains("Ms.")) {
            setValue(name);
            return;
        }
        setValue("Ms."+name);
        return;
    }
}

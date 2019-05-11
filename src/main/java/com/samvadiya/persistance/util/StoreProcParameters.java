package com.samvadiya.persistance.util;

import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Rudra
 */
public class StoreProcParameters {
    private final String paramter;
    private final Object paramterValue;
    private final int dataType;
    @SuppressWarnings("rawtypes")
	private final RowMapper instanceClass;

    @SuppressWarnings("rawtypes")
	public StoreProcParameters(String paramter,Object paramterValue, int dataType, RowMapper instanceClass) {
        this.paramter = paramter;
        this.paramterValue = paramterValue;
        this.dataType = dataType;
        this.instanceClass = instanceClass;
    }

    
    public String getParamter() {
        return paramter;
    }

    public Object getParamterValue() {
        return paramterValue;
    }

    public int getDataType() {
        return dataType;
    }

    @SuppressWarnings("rawtypes")
	public RowMapper getInstanceClass() {
        return instanceClass;
    }
    
    
}

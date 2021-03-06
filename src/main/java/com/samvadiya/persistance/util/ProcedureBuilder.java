package com.samvadiya.persistance.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;

/**
 *
 * @author Pankaj
 */
public class ProcedureBuilder extends StoredProcedure {
    /**
     * @param datasource
     * @param sprocName
     * @param sqlInParam
     * @param sqlOutParam
     * @param sqlResulstParam
     * @throws Exception
     */
    public ProcedureBuilder(DataSource datasource, String sprocName, List<StoreProcParameters> sqlInParam,
	    List<StoreProcParameters> sqlOutParam, List<StoreProcParameters> sqlResulstParam) throws Exception {
	super(datasource, sprocName);

	if (sqlResulstParam != null) {
	    for (StoreProcParameters srp : sqlResulstParam) {
		declareParameter(new SqlReturnResultSet(srp.getParamter(), srp.getInstanceClass()));
	    }

	}

	if (sqlInParam != null) {
	    for (StoreProcParameters spp : sqlInParam) {
		declareParameter(new SqlParameter(spp.getParamter(), spp.getDataType())); // declaring sql in parameter
											  // to pass input
	    }
	}

	if (sqlOutParam != null && !sqlOutParam.isEmpty()) {
	    for (StoreProcParameters spp : sqlOutParam) {
		declareParameter(new SqlOutParameter(spp.getParamter(), spp.getDataType(), spp.getInstanceClass()));

		System.out.println(" OUT Param " + sprocName + "," + spp.getParamter() + "," + spp.getDataType());

	    }
	}
	compile();
    }

    /**
     * @param sqlInParam
     * @return map
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Map execute(List<StoreProcParameters> sqlInParam) {
	String str = "";
	Map inputs = new HashMap();
	if (sqlInParam != null) {
	    for (StoreProcParameters spp : sqlInParam) {
		inputs.put(spp.getParamter(), spp.getParamterValue());
		if (spp.getDataType() == 12)
		    str += "'" + spp.getParamterValue() + "',";
		else
		    str += spp.getParamterValue() + ",";
		System.out.println(
			"InParam " + spp.getParamter() + " :" + spp.getParamterValue() + ", " + spp.getDataType());
	    }
	}
	System.out.println(str);
	return super.execute(inputs);
    }
}
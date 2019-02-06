package com.cg.payroll.daoservices;

import java.util.ArrayList;
import java.util.List;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.util.PayrollDBUtil;

public class AssociateDAOImpl implements AssociateDAO {

	
	
	@Override
	public Associate save(Associate associate) {
		associate.setAssociateId(PayrollDBUtil.getASSOCIATE_ID_COUNTER());
		PayrollDBUtil.associates.put(associate.getAssociateId(),associate);
		return associate;
	}

	@Override
	public boolean update(Associate associate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Associate findOne(int associateId) {
		return PayrollDBUtil.associates.get(associateId);
		
	}

	@Override
	public List<Associate> findAll() {
		return new ArrayList<>(PayrollDBUtil.associates.values());
	}

}

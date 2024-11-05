package com.empresa.proyecto.chain;

import com.empresa.proyecto.model.PurchaseRequest;

public interface Approver {
    void approveRequest(PurchaseRequest request);

    void setNextApprover(Approver approver);
}

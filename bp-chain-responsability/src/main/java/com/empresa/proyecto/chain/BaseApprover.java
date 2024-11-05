package com.empresa.proyecto.chain;

import com.empresa.proyecto.model.PurchaseRequest;

public abstract class BaseApprover implements Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void approveRequest(PurchaseRequest request) {
        if (canApprove(request)) {
            processApproval(request);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(request);
        } else {
            System.out.println("No se pudo aprobar la solicitud de $" + request.getAmount());
        }
    }

    protected abstract boolean canApprove(PurchaseRequest request);

    protected abstract void processApproval(PurchaseRequest request);
}

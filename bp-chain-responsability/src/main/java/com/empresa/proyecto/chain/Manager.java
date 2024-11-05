package com.empresa.proyecto.chain;

import com.empresa.proyecto.model.PurchaseRequest;

public class Manager extends BaseApprover {
    @Override
    protected boolean canApprove(PurchaseRequest request) {
        return request.getAmount() <= 5000;
    }

    @Override
    protected void processApproval(PurchaseRequest request) {
        System.out.println("Department Manager aprobó la solicitud de " + request.getDescription() + " por $" + request.getAmount());
    }
}
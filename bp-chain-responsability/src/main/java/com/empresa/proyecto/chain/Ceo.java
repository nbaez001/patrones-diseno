package com.empresa.proyecto.chain;

import com.empresa.proyecto.model.PurchaseRequest;

public class Ceo extends BaseApprover {
    @Override
    protected boolean canApprove(PurchaseRequest request) {
        return request.getAmount() > 20000;
    }

    @Override
    protected void processApproval(PurchaseRequest request) {
        System.out.println("CEO aprobó la solicitud de " + request.getDescription() + " por $" + request.getAmount());
    }
}
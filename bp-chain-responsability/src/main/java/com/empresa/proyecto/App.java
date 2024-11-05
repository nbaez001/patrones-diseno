package com.empresa.proyecto;

import com.empresa.proyecto.chain.*;
import com.empresa.proyecto.model.PurchaseRequest;

public class App {
    private static Approver setupApprovalChain() {
        Approver departmentManager = new Manager();
        Approver director = new Director();
        Approver ceo = new Ceo();

        departmentManager.setNextApprover(director);
        director.setNextApprover(ceo);

        return departmentManager;
    }

    public static void main(String[] args) {
        Approver approverChain = setupApprovalChain();

        PurchaseRequest request1 = new PurchaseRequest(500, "Material de oficina");
        PurchaseRequest request2 = new PurchaseRequest(2000, "Nuevas computadoras");
        PurchaseRequest request3 = new PurchaseRequest(12000, "Mobiliario para la nueva oficina");
        PurchaseRequest request4 = new PurchaseRequest(35000, "Patrocinio para evento empresarial");

        System.out.println("Procesando solicitudes:");
        approverChain.approveRequest(request1);
        approverChain.approveRequest(request2);
        approverChain.approveRequest(request3);
        approverChain.approveRequest(request4);
    }
}

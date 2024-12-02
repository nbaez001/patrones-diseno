package com.empresa.proyecto;

import com.empresa.proyecto.model.Document;

public class App {
    public static void main(String[] args) {
        Document document = new Document();

        document.publish(); // Output: Cannot publish a draft. Send it for review first.
        document.review();  // Output: Draft is sent for review.
        document.publish(); // Output: Document is approved and published.
        document.review();  // Output: Published documents cannot be reviewed.
        document.publish(); // Output: Document is already published.
    }
}

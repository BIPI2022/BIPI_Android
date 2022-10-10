package com.example.bipi.Invoice;

public class InvoiceModel {
    String invoiceDate;
    String invoiceWeek;
    String invoiceNumber;
    String number;
    String invoiceStatus;

    public InvoiceModel(String invoiceDate, String invoiceWeek, String invoiceNumber, String number, String invoiceStatus) {
        this.invoiceDate = invoiceDate;
        this.invoiceWeek = invoiceWeek;
        this.invoiceNumber = invoiceNumber;
        this.number = number;
        this.invoiceStatus = invoiceStatus;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public String getInvoiceWeek() {
        return invoiceWeek;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getNumber() {
        return number;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }
}

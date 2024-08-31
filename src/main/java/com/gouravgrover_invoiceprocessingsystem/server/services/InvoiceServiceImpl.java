package com.gouravgrover_invoiceprocessingsystem.server.services;

import com.gouravgrover_invoiceprocessingsystem.server.dao.InvoiceDao;
import com.gouravgrover_invoiceprocessingsystem.server.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;

    @Override
    public Invoice addInvoice(Invoice invoice) {
        return invoiceDao.save(invoice);
    }

    @Override
    public List<Invoice> getInvoices() {
        return invoiceDao.findAll();
    }

    @Override
    public Invoice deleteInvoice(long id) {
        Invoice invoice = invoiceDao.findById(id).orElse(null);
        if (invoice != null) {
            invoiceDao.delete(invoice);
        }
        return invoice;
    }
}

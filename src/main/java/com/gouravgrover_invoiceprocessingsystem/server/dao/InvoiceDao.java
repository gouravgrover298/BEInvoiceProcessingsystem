
package com.gouravgrover_invoiceprocessingsystem.server.dao;

import com.gouravgrover_invoiceprocessingsystem.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {

}

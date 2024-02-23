package expense;

import invoice.Invoice;

public class Expense {

    private final Invoice invoice;

    public Expense(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}
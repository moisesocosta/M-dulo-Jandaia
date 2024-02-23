package expense;

import invoice.Invoice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class ExpenseTest {


    @Mock
    private Invoice invoice;


    @Test
    void verifyExpense(){
        MockitoAnnotations.openMocks(this);

        Expense expense = new Expense(invoice);
        when(expense.getInvoice().getTotalValue()).thenReturn(465.7F);

        Assertions.assertEquals(465.7F,expense.getInvoice().getTotalValue());
    }
}
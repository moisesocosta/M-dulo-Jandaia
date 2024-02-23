package invoice;

import java.util.Date;

public class Invoice {
    private Long id;
    private Date date;
    private float totalValue;

    public Invoice(Long id, Date date, float totalValue) {
        this.id = id;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
    }
}
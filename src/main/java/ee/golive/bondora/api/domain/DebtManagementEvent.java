package ee.golive.bondora.api.domain;

import java.util.Date;

public class DebtManagementEvent extends BondoraObject {
    private Date createdOn;
    private LoanDebtManagementEventType eventType;
    private String description;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public LoanDebtManagementEventType getEventType() {
        return eventType;
    }

    public void setEventType(LoanDebtManagementEventType eventType) {
        this.eventType = eventType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

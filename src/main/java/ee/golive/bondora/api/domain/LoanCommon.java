package ee.golive.bondora.api.domain;

import java.math.BigDecimal;
import java.util.Date;

abstract public class LoanCommon extends BondoraObject {
    private String loanPartId;
    private BigDecimal amount;
    private String auctionId;
    private String auctionName;
    private Integer auctionNumber;
    private Integer auctionBidNumber;
    private String country;
    private Integer creditScore;
    private String rating;
    private BigDecimal interest;
    private AuctionPurpose useOfLoan;
    private AuctionIncomeVerificationStatus incomeVerificationStatus;
    private Integer loanStatusCode;
    private String userName;
    private Sex gender;
    private Date dateOfBirth;
    private Date signedDate;
    private Date reScheduledOn;
    private Date debtOccuredOn;
    private Date debtOccuredOnForSecondary;
    private Integer nextPaymentNr;
    private Date nextPaymentDate;
    private Double nextPaymentSum;
    private Integer nrOfScheduledPayments;
    private Double principalRepaid;
    private Double interestRepaid;
    private BigDecimal lateAmountPaid;
    private BigDecimal principalRemaining;
    private Double principalLateAmount;
    private Double interestLateAmount;
    private Double penaltyLateAmount;
    private Double lateAmountTotal;

    public String getLoanPartId() {
        return loanPartId;
    }

    public void setLoanPartId(String loanPartId) {
        this.loanPartId = loanPartId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public String getAuctionName() {
        return auctionName;
    }

    public void setAuctionName(String auctionName) {
        this.auctionName = auctionName;
    }

    public Integer getAuctionNumber() {
        return auctionNumber;
    }

    public void setAuctionNumber(Integer auctionNumber) {
        this.auctionNumber = auctionNumber;
    }

    public Integer getAuctionBidNumber() {
        return auctionBidNumber;
    }

    public void setAuctionBidNumber(Integer auctionBidNumber) {
        this.auctionBidNumber = auctionBidNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public AuctionPurpose getUseOfLoan() {
        return useOfLoan;
    }

    public void setUseOfLoan(AuctionPurpose useOfLoan) {
        this.useOfLoan = useOfLoan;
    }

    public AuctionIncomeVerificationStatus getIncomeVerificationStatus() {
        return incomeVerificationStatus;
    }

    public void setIncomeVerificationStatus(AuctionIncomeVerificationStatus incomeVerificationStatus) {
        this.incomeVerificationStatus = incomeVerificationStatus;
    }

    public Integer getLoanStatusCode() {
        return loanStatusCode;
    }

    public void setLoanStatusCode(Integer loanStatusCode) {
        this.loanStatusCode = loanStatusCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Date signedDate) {
        this.signedDate = signedDate;
    }

    public Date getReScheduledOn() {
        return reScheduledOn;
    }

    public void setReScheduledOn(Date reScheduledOn) {
        this.reScheduledOn = reScheduledOn;
    }

    public Date getDebtOccuredOn() {
        return debtOccuredOn;
    }

    public void setDebtOccuredOn(Date debtOccuredOn) {
        this.debtOccuredOn = debtOccuredOn;
    }

    public Date getDebtOccuredOnForSecondary() {
        return debtOccuredOnForSecondary;
    }

    public void setDebtOccuredOnForSecondary(Date debtOccuredOnForSecondary) {
        this.debtOccuredOnForSecondary = debtOccuredOnForSecondary;
    }

    public Integer getNextPaymentNr() {
        return nextPaymentNr;
    }

    public void setNextPaymentNr(Integer nextPaymentNr) {
        this.nextPaymentNr = nextPaymentNr;
    }

    public Date getNextPaymentDate() {
        return nextPaymentDate;
    }

    public void setNextPaymentDate(Date nextPaymentDate) {
        this.nextPaymentDate = nextPaymentDate;
    }

    public Double getNextPaymentSum() {
        return nextPaymentSum;
    }

    public void setNextPaymentSum(Double nextPaymentSum) {
        this.nextPaymentSum = nextPaymentSum;
    }

    public Integer getNrOfScheduledPayments() {
        return nrOfScheduledPayments;
    }

    public void setNrOfScheduledPayments(Integer nrOfScheduledPayments) {
        this.nrOfScheduledPayments = nrOfScheduledPayments;
    }

    public Double getPrincipalRepaid() {
        return principalRepaid;
    }

    public void setPrincipalRepaid(Double principalRepaid) {
        this.principalRepaid = principalRepaid;
    }

    public Double getInterestRepaid() {
        return interestRepaid;
    }

    public void setInterestRepaid(Double interestRepaid) {
        this.interestRepaid = interestRepaid;
    }

    public BigDecimal getLateAmountPaid() {
        return lateAmountPaid;
    }

    public void setLateAmountPaid(BigDecimal lateAmountPaid) {
        this.lateAmountPaid = lateAmountPaid;
    }

    public BigDecimal getPrincipalRemaining() {
        return principalRemaining;
    }

    public void setPrincipalRemaining(BigDecimal principalRemaining) {
        this.principalRemaining = principalRemaining;
    }

    public Double getPrincipalLateAmount() {
        return principalLateAmount;
    }

    public void setPrincipalLateAmount(Double principalLateAmount) {
        this.principalLateAmount = principalLateAmount;
    }

    public Double getInterestLateAmount() {
        return interestLateAmount;
    }

    public void setInterestLateAmount(Double interestLateAmount) {
        this.interestLateAmount = interestLateAmount;
    }

    public Double getPenaltyLateAmount() {
        return penaltyLateAmount;
    }

    public void setPenaltyLateAmount(Double penaltyLateAmount) {
        this.penaltyLateAmount = penaltyLateAmount;
    }

    public Double getLateAmountTotal() {
        return lateAmountTotal;
    }

    public void setLateAmountTotal(Double lateAmountTotal) {
        this.lateAmountTotal = lateAmountTotal;
    }
}

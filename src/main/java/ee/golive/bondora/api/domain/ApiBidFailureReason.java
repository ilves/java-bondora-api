package ee.golive.bondora.api.domain;

public enum  ApiBidFailureReason {
    NotSet,
    AvailableAmountLowerThanMinInvestmentLimit,
    BiddingOnOwnAuction,
    BiddingOnInactiveDuplicate,
    BiddingAmountTooSmall,
    NotEnoughBalance,
    AuctionIsClosed,
    AuctionStatusNotOpen,
    NoRiskScoreForAuction,
    AuctionAlreadyFullyBidded,
    AuctionNotFound,
    NotEnoughLoanAmountForBiddingAmount,
    ApiUsageNotAllowed,
    AuctionIsCancelled,
    Unknown
}

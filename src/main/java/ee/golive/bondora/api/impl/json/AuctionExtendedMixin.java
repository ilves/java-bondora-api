package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import ee.golive.bondora.api.domain.Auction;
import ee.golive.bondora.api.domain.Debt;
import ee.golive.bondora.api.domain.Liability;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AuctionExtendedMixin extends Auction {

    @JsonProperty("Liabilities")
    private List<Liability> liabilities;

    @JsonProperty("Debts")
    private List<Debt> depts;
}

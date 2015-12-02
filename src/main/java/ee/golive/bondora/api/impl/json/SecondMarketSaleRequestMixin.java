package ee.golive.bondora.api.impl.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import ee.golive.bondora.api.domain.SecondMarketSell;

import java.util.List;

abstract class SecondMarketSaleRequestMixin extends BondoraObjectMixin {

    @JsonProperty("Items")
    private List<SecondMarketSell> itemList;
}

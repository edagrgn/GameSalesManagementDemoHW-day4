package Entities;

import java.util.Date;

public class Campaign {

    private int campaignId;
    private String campaignName;
    private String campaignDescription;
    private int discountRate;
    private Date releaseDate;
    private int amountHolder;

    public Campaign(){

    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getAmountHolder() {
        return amountHolder;
    }

    public void setAmountHolder(int amountHolder) {
        this.amountHolder = amountHolder;
    }
}

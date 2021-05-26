package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService {
    public void add(Campaign campaign){
        System.out.println("Added Campaing: "+campaign.getCampaignName()+"("+campaign.getCampaignId()+")");

    }
    public void delete(Campaign campaign){
        System.out.println("delete campaign: "+campaign.getCampaignName()+"("+campaign.getCampaignId()+")");
    }
    public void update(Campaign campaign){
        System.out.println("Updated Campaign Successfully : "+campaign.getCampaignName()+"("+campaign.getCampaignId()+")");
    }

    public void useDiscount(Game game, Campaign campaign){
     double price = (campaign.getAmountHolder()) * ( game.getPrice() - ((game.getPrice() * (campaign.getDiscountRate())/100)));
     System.out.println("The amount you have to pay with a discount : "+price);
    }
}

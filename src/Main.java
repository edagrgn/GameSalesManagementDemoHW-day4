import Adapters.MernisServiceAdapters;
import Concrete.CampaignManager;
import Concrete.IndividualCustomerManager;
import Concrete.SalesManagement;
import Entities.Campaign;
import Entities.Game;
import Entities.IndividualCustomer;

public class Main {

    public static void main(String[] args) throws Exception {
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(33);
        individualCustomer.setFirstName("Selim");
        individualCustomer.setLastName("Yılmaz");
        individualCustomer.setNationalityId("99999999999");
        individualCustomer.setDateOfBirth(1999);
        individualCustomer.setPhoneNumber(599999999);
        individualCustomer.setCardNo("1111111111111111");
        individualCustomer.setPassword(19844891);



        IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new MernisServiceAdapters());
        individualCustomerManager.save(individualCustomer);
        individualCustomerManager.passwordVerification(individualCustomer);

        Game game1 = new Game();
        game1.setId(1);
        game1.setGameName("X");
        game1.setGameDescription("Last of its kind");
        game1.setSerialNumber("1212121212121");
        game1.setPrice(400);
        game1.setReleaseDay(20/11/2021);


        Game game2 = new Game();
        game2.setId(2);
        game2.setGameName("Y");
        game2.setGameDescription("Best selling action game of 2020");
        game2.setSerialNumber("9898989898989898");
        game2.setPrice(250);
        game2.setReleaseDay(12/12/2019);


        Campaign campaign1 = new Campaign();
        campaign1.setCampaignId(1);
        campaign1.setCampaignName("First Shopping!!!");
        campaign1.setCampaignDescription("10% discount on first shopping ");
        campaign1.setDiscountRate(10);
        campaign1.setAmountHolder(1);

        Campaign campaign2 = new Campaign();
        campaign2.setCampaignId(2);
        campaign2.setCampaignName("Get 4 pay 3");
        campaign2.setCampaignDescription("Valid for products with the same price");
        campaign2.setDiscountRate(25);
        campaign2.setAmountHolder(4);

        Campaign campaign3 = new Campaign();
        campaign3.setCampaignId(3);
        campaign3.setCampaignName("Bulk Purchase opportunity!!");
        campaign3.setCampaignDescription("This campaign is only valid for corporate customers.");
        campaign3.setDiscountRate(40);
        campaign3.setAmountHolder(100);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.useDiscount(game1, campaign3);


        SalesManagement salesManagement = new SalesManagement(new MernisServiceAdapters());
        salesManagement.add(individualCustomer);
    }
}

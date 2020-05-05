package database.process;

import database.OrderData;
import database.information.Order;
import database.information.OrderList;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zzx
 */
public class PopularityData {
    String popularMemberByTimes;
    String popularMemberByMoney;
    String popularDish;
    String popularSoup;
    String popularEatType;
    int popularSpicy;
    private int[] spiciness = new int[6];
    private int[] soup = new int[3];

    public String getPopularMemberByTimes() {
        return popularMemberByTimes;
    }

    public String getPopularMemberByMoney() {
        return popularMemberByMoney;
    }

    public String getPopularDish() {
        return popularDish;
    }

    public String getPopularSoup() {
        return popularSoup;
    }

    public String getPopularEatType() {
        return popularEatType;
    }

    public int getPopularSpicy() {
        return popularSpicy;
    }

    public int getDays() {
        return days;
    }

    //0: egg 1: chashu 2: shoot 3:nori
    private int[] dishes = new int[4];
    //0: in 1: out
    private int[] types = new int[2];

    public int[] getSpiciness() {
        return spiciness;
    }

    public int[] getSoup() {
        return soup;
    }

    public int[] getDishes() {
        return dishes;
    }

    public int[] getTypes() {
        return types;
    }

    int days = 7;
    public PopularityData(int days) throws Exception{
        OrderData orderData = new OrderData();
        OrderList list = orderData.loadInfo();


        HashMap<String ,Double> memberByTimes = new HashMap<>();
        HashMap<String ,Double> memberByMoney = new HashMap<>();

        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Order each: list.getOrders()){
            int diffDay = Statistics.differentDays(format.parse(each.getDate()), today);
            if(diffDay <= days & diffDay >= 0){
                switch (each.getCuisine().getSoupType()){
                    case "Tonkotsu":
                        soup[0] += 1;
                        break;
                    case "Shoyo":
                        soup[1] += 1;
                        break;
                    default:
                        soup[2] += 1;
                }
                dishes[3] += (each.getCuisine().isNori() ? 1 : 0) + each.getCuisine().getExtraNori();
                dishes[1] += (each.getCuisine().isChashu() ? 1 : 0) + each.getCuisine().getExtraChashu();
                dishes[0] += (each.getCuisine().isEgg() ? 1 : 0) + each.getCuisine().getExtraEgg();
                dishes[2] += each.getCuisine().getExtraShoot();

                spiciness[each.getCuisine().getSpiciness()] += 1;

                if(each.getEatType() == 1){
                    types[0] += 1;
                }else {
                    types[1] += 1;
                }
                String membership = each.getMembershipId();

                if(!"NoMembership".equals(membership)){
                    if(memberByMoney.containsKey(membership)){
                        double money = memberByMoney.get(membership) + each.getAmountMoney();
                        memberByMoney.remove(membership);
                        memberByMoney.put(membership, money);
                    }else {
                        memberByMoney.put(membership, each.getAmountMoney());
                    }
                    if(memberByTimes.containsKey(membership)){
                        double times = memberByTimes.get(membership) + 1.0;
                        memberByTimes.remove(membership);
                        memberByTimes.put(membership, times);
                    }else {
                        memberByTimes.put(membership, 1.0);
                    }
                }
            }
        }

        popularSpicy = getMaxType(spiciness);
        switch (getMaxType(soup)){
            case 0:
                popularSoup = "Tonkotsu";
                break;
            case 1:
                popularSoup = "Shoyo";
                break;
            default:
                popularSoup = "Shio";
        }

        switch (getMaxType(dishes)){
            //0: egg 1: chashu 2: shoot 3:nori
            case 0:
                popularDish = "egg";
                break;
            case 1:
                popularDish = "chashu";
                break;
            case 2:
                popularDish = "shoot";
                break;
            default:
                popularDish = "nori";
        }
        if(getMaxType(types) == 0){
            popularEatType = "Eat In";
        }else {
            popularEatType = "Eat Out";
        }

        popularMemberByMoney = getBestMember(memberByMoney);
        popularMemberByTimes = getBestMember(memberByTimes);
    }

    public PopularityData() throws Exception{
        this(7);
    }

    public int getMaxType(int[] list){
        int max = -1;
        int type = -1;
        for(int i = 0; i < list.length; i++){
            if(list[i] > max){
                max = list[i];
                type = i;
            }
        }
        return type;
    }

    public <K, V> String getBestMember(HashMap<K, V> map){
        String bestMember = null;
        double maxNumber = 0.0;
        for(Map.Entry<K, V> each: map.entrySet()){
            if((Double)each.getValue() > maxNumber){
                bestMember = (String)each.getKey();
                maxNumber = (Double)each.getValue();
            }
        }
        return bestMember;
    }

    @Override
    public String toString() {
        return "PopularityData{" +
                "popularMemberByTimes='" + popularMemberByTimes + '\'' +
                ", popularMemberByMoney='" + popularMemberByMoney + '\'' +
                ", popularDish='" + popularDish + '\'' +
                ", popularSoup='" + popularSoup + '\'' +
                ", popularEatType='" + popularEatType + '\'' +
                ", popularSpicy=" + popularSpicy +
                ", days=" + days +
                '}';
    }

    public static void main(String[] args) throws Exception{
        PopularityData popularityData = new PopularityData();
        System.out.println(popularityData);
    }
}

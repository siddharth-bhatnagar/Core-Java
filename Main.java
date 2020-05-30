package lp;

import java.util.*;

class ProfitLoss{
    double costPrice, sellingPrice;

    ProfitLoss(double costPrice, double sellingPrice){
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }

    double profit(ProfitLoss pro) {
        double profit = pro.sellingPrice - pro.costPrice;
        double profitpercent = ((profit/pro.costPrice) * 100);
        return profitpercent;
    }

    double loss(ProfitLoss lo) {
        double loss = lo.costPrice - lo.sellingPrice;
        double losspercent =  ((loss/lo.costPrice) * 100);
        return losspercent;
    }
}

    public class Main {
        public static void main(String args[]) {
            double cp, sp;
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the cost price of the article: ");
            cp = sc.nextDouble();

            System.out.println("Enter the selling price of the article: ");
            sp = sc.nextDouble();

            ProfitLoss obj = new ProfitLoss(cp, sp);
            
            if(sp > cp) System.out.println("Profit = " + (sp - cp) + "\nProfit percent = " + obj.profit(obj));
            else if(cp > sp) System.out.println("Loss = " + (cp - sp) + "\nLoss percent = " + obj.loss(obj));
            else System.out.println("Neither profit nor loss!");
        }

    }



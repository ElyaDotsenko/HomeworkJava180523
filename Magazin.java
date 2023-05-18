package Lessons9.task2;

public class Magazin {
       public static void main(String[] args) {


              boolean isEdekaOpen = true;
              boolean isReweOpen = false;

              boolean canBuy = canBuy(isEdekaOpen , isReweOpen);

              System.out.println("Я могу купить еду:" + canBuy);

       }
        public static boolean canBuy(boolean isEdekaOpen , boolean isReweOpen){


               return isEdekaOpen || isReweOpen;

}

}

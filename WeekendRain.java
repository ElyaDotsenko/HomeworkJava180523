package Lessons9.task1;

public class WeekendRain {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend && !isRain;
        // Используем &&(И) для проверки условий

        if (canWalk) {
            System.out.println("Можно выйти!");
        } else {
            System.out.println("Нельзя выходить");
        }


    }
}
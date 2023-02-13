package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Mojito";
        drink1.cost = 13;
        drink1.isWithAlcohol = true;

        drink1.ingredient1 = new Ingredient();
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient3 = new Ingredient();

        drink1.ingredient1.name = "woda";
        drink1.ingredient1.volume = 160;

        drink1.ingredient2.name = "sok cytrynowy";
        drink1.ingredient2.volume = 10;

        drink1.ingredient3.name = "wódka";
        drink1.ingredient3.volume = 40;

        System.out.println("Drink: " + drink1.name);
        System.out.println("Cena: " + drink1.cost + "zł");
        System.out.println("Czy zawiera alkohol? " + drink1.isWithAlcohol);
        System.out.println("Składniki:");
        System.out.println(drink1.ingredient1.name);
        System.out.println(drink1.ingredient2.name);
        System.out.println(drink1.ingredient3.name);
        System.out.println("Pojemność:");
        System.out.println((drink1.ingredient1.volume + drink1.ingredient2.volume + drink1.ingredient3.volume) + "ml");

    }
}

package ru.mirea.task4;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                System.out.println(c.getClass().getSimpleName() + " размер " + c.size.getDescription() + ", цвет " + c.color + ", стоимость " + c.cost);
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                System.out.println(c.getClass().getSimpleName() + " размер " + c.size.getDescription() + ", цвет " + c.color + ", стоимость " + c.cost);
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(ClothingSize.S, 500, "белый");
        clothes[1] = new Pants(ClothingSize.M, 1000, "черный");
        clothes[2] = new Skirt(ClothingSize.XS, 800, "синий");
        clothes[3] = new Tie(ClothingSize.L, 600, "красный");

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
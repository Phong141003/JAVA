class Atelier {
    public void dressWomen(Clothes clothes) {
        System.out.println("Clothes for women:");
        ((WomenClothing) clothes).dressWomen();
    }

    public void dressMan(Clothes clothes) {
        System.out.println("Clothes for men:");
        ((MenClothing) clothes).dressMan();
    }
}
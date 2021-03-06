package com.example.pizzaswap;

public class Pizza {
    private String name;
    private int resourseImageId;
    private String description;

    public static final Pizza[] pizzas = {
            new Pizza("Сирийская пицца", R.drawable.diavolo,"Пицца Греческая — довольно необычное блюдо, которое отличается от традиционных рецептов итальянской кухни. Это невероятно вкусная и сочная пицца, приготовленная на плотном тесте с добавлением специального соуса, листьев шпината, свежих томатов Черри, болгарского перца и маслин. Для того чтобы она приобрела пикантный вкус также понадобятся два вида сыра - Моцарелла и традиционный греческий сыр Фета из овечьего и козьего молока."),
            new Pizza("Гавайская", R.drawable.funghi,"Любимая многими Гавайская пицца представляет собой не только вкусное, но и очень красивое блюдо. Только представьте себе: сочный желтый ананас в сочетании со светлой расплавленной моцареллой и аппетитной розовой ветчиной. Скорее всего, именно эти яркие краски и дали название пицце, ведь на Гавайских островах такой рецепт неизвестен."),
            new Pizza("Испанская пицца", R.drawable.asdas,"Пицца Греческая — довольно необычное блюдо, которое отличается от традиционных рецептов итальянской кухни. Это невероятно вкусная и сочная пицца, приготовленная на плотном тесте с добавлением специального соуса, листьев шпината, свежих томатов Черри, болгарского перца и маслин. Для того чтобы она приобрела пикантный вкус также понадобятся два вида сыра - Моцарелла и традиционный греческий сыр Фета из овечьего и козьего молока."),
            new Pizza("Мясная пицца", R.drawable.va,"Один из самых распространённых вариантов пиццы в России – это мясные пиццы. Его традиционно предпочитают мужчины, поскольку результат получается сытным и высококалорийным. Рецептов мясной пиццы ровно столько же, сколько хозяек. Каждая адаптирует стандартный рецепт под вкусы своей семьи."),
            new Pizza("Пепперони", R.drawable.ba,"Этот пикантный мясной продукт многие считают американской колбасой, так как повара из США часто добавляют его в свои блюда. Но на самом деле пепперони имеет итальянское происхождение, продукт получил свое название от итальянского слова «Pepe», что означает перец."),
            new Pizza("C баклажанами", R.drawable.ka,"ецепт пиццы с баклажанами пользуется популярностью. Пицца с баклажанами появилась в Америке: в Италии используются другие ингредиенты для приготовления традиционного блюда. Однако это не делает пиццу менее вкусной. Требования к тесту и процессу готовки сохраняется"),
            new Pizza("Гавайская", R.drawable.funghi,"Любимая многими Гавайская пицца представляет собой не только вкусное, но и очень красивое блюдо. Только представьте себе: сочный желтый ананас в сочетании со светлой расплавленной моцареллой и аппетитной розовой ветчиной. Скорее всего, именно эти яркие краски и дали название пицце, ведь на Гавайских островах такой рецепт неизвестен."),

    };

    private Pizza(String name, int resourseImageId, String description) {
        this.name = name;
        this.resourseImageId = resourseImageId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getResourseImageId() {
        return resourseImageId;
    }

    public String getDescription() {
        return description;
    }
}

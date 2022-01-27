package com.company;

public class Animal implements Sallebly
{
    private  static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private  static final Double DEFAULT_DOG_WEIGHT = 13.0;
    private  static final Double DEFAULT_CAT_WEIGHT = 2.3;

    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive =true;

    public Animal (String species)
    {
        this.species = species;
        this.alive = true;
        if ( this.species.equals("pies"))
        {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        else if (this.species.equals("kot"))
        {
            this.weight = DEFAULT_CAT_WEIGHT;
        }
        else
        {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    void feed (Double foodWeight)
    {
        if (weight <= 0)
        {
            isAlive();
        }
        else
        {
            weight += foodWeight;
            System.out.println("Ważę "+getWeight()+" kg.");
        }
    }

    public Animal(String species, String name, Integer age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    Double getWeight()
    {
        return weight;
    }
    void isAlive()
    {
        alive = false;
        System.out.println("Pancio nie ma opcji wylądowałem w raju dla modelek. Już ani nie pojem ani nie pobiegam ;(");
    }
    void takeForWalk()
    {
        if (weight<= 0)
        {
            isAlive();
        }
        else
        {
            weight -= 1.5;
            System.out.println("Spaliłem całe jedzonko! Teraz ważę "+weight+"kg");
        }
    }
    public void sell (Human seller, Human buyer ,Double price)
    {
        if (seller.pet != null)
        {
            if (buyer.getCash() >= price)
            {
                buyer.setCash(buyer.getCash()-price);
                seller.setCash(seller.getCash()+price);
                buyer.pet= seller.pet;
                seller.pet = null;
                System.out.println("Mam sierściucha !! mam sierściucha !!");
            }
            else
            {
                System.out.println("Nie stać mnie na to piękne , włochate, zaślinione, zwierzątko bueeee");
            }
        }
        else
        {
            System.out.println("Silent !!!! Nie masz zwierzaka ? , jak to nie masz ?! I will kill you");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}

package com.company;

public class Animal
{
    private  static final Double DEFAULT_ANIMAL_WEIGHT = 1.3;
    private  static final Double DEFAULT_DOG_WEIGHT = 13.0;
    private  static final Double DEFAULT_CAT_WEIGHT = 2.3;

    final String species;
    String name;
    private Double weight;
    Integer age;
    Boolean alive;

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
    void animalStat()
    {
        System.out.println(species+" o imieniu "+name+". Żyje od  "+age+" lat, a waży "+getWeight()+" kg ");
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

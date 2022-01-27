package com.company.creatures;

public class Pet extends Animal implements Edible
{
    public Pet (String species)
    {
        super(species);
    }

    @Override
    public void beEaten()
    {
        System.out.println("Nie zjesz mnie bo mnie kochasz...");
    }
}

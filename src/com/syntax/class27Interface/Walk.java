package com.syntax.class27Interface;

interface HealthAble{
    void healthy();
}
public interface Walk extends HealthAble {

    void BurnCalories();
}
interface Milk extends HealthAble{

    void giveEnergy();
}
interface Banana extends HealthAble{

    void giveEnergy();
}

class Demo implements Banana{
    @Override
    public void healthy() {
        System.out.println("banana good");
    }

    @Override
    public void giveEnergy() {
        System.out.println("gives energy");
    }
}

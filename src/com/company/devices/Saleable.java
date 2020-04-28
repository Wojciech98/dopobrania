package company.devices;

import company.creatures.Human;

public interface Saleable {
    void sell(Human seller, Human buyer, double price) throws Exception;
}

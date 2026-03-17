package fr.aimcvent.lobby.api.inventory;

import fr.aimcvent.paper.api.inventory.Inventory;

public interface MenuItem {
    String identifier();

    void execute(Inventory inventory, Context context);
}

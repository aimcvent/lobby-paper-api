package fr.aimcvent.lobby.api.inventory;

import fr.aimcvent.paper.api.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public interface MenuItem {
    String identifier();

    default ItemStack icon(ItemStack origin) {
        return origin;
    }

    void execute(Inventory inventory, Context context);
}

package fr.aimcvent.lobby.api.inventory;

import fr.aimcvent.paper.api.inventory.Inventory;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface MenuItem {
    String identifier();

    default ItemStack icon(Player player, ItemStack origin, Context context) {
        return origin;
    }

    void execute(Inventory inventory, Context context);
}
